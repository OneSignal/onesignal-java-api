package com.onesignal.client;

import com.onesignal.client.api.DefaultApi;
import com.onesignal.client.model.CreateNotificationSuccessResponse;
import com.onesignal.client.model.Notification;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Helpers for common OneSignal API usage patterns.
 */
public final class NotificationHelpers {
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final long DEFAULT_BASE_DELAY_MILLIS = 1000L;
    public static final long MIN_BASE_DELAY_MILLIS = 1000L;
    public static final long MAX_BASE_DELAY_MILLIS = 60000L;

    private NotificationHelpers() {
    }

    /**
     * Result of {@link #createNotificationWithRetry}: the create response plus
     * whether the server replayed a previously completed request
     * (Idempotent-Replayed response header).
     */
    public static final class CreateNotificationWithRetryResult {
        private final CreateNotificationSuccessResponse response;
        private final boolean wasReplayed;

        CreateNotificationWithRetryResult(CreateNotificationSuccessResponse response, boolean wasReplayed) {
            this.response = response;
            this.wasReplayed = wasReplayed;
        }

        public CreateNotificationSuccessResponse getResponse() {
            return response;
        }

        public boolean getWasReplayed() {
            return wasReplayed;
        }
    }

    /**
     * Same as {@link #createNotificationWithRetry(DefaultApi, Notification, int, long)}
     * with the default retry budget (3 retries, 1s backoff base).
     *
     * @param api the API instance to call through
     * @param notification the notification to send
     * @return the response plus the replay flag
     * @throws ApiException when the call fails with a non-retryable error or the retry budget is exhausted
     */
    public static CreateNotificationWithRetryResult createNotificationWithRetry(DefaultApi api, Notification notification) throws ApiException {
        return createNotificationWithRetry(api, notification, DEFAULT_MAX_RETRIES, DEFAULT_BASE_DELAY_MILLIS);
    }

    /**
     * Create a notification with safe, idempotent retries.
     *
     * <p>Ensures {@code notification.idempotencyKey} is set (generating a
     * UUIDv4 when absent) so the server can deduplicate, then calls
     * {@code createNotification}. Transient failures (HTTP 429, HTTP 503, or
     * IO-level errors) are retried with the SAME idempotency key, honoring the
     * {@code Retry-After} response header when present and falling back to
     * exponential backoff ({@code baseDelayMillis * 2^attempt}) otherwise.
     * Other errors are thrown immediately.
     *
     * @param api the API instance to call through
     * @param notification an existing idempotency key is respected, never overwritten
     * @param maxRetries retries after the initial attempt
     * @param baseDelayMillis backoff base in milliseconds when Retry-After is absent; clamped to [1000, 60000]
     * @return the response plus the replay flag
     * @throws ApiException when the call fails with a non-retryable error or the retry budget is exhausted
     */
    public static CreateNotificationWithRetryResult createNotificationWithRetry(DefaultApi api, Notification notification, int maxRetries, long baseDelayMillis) throws ApiException {
        if (notification.getIdempotencyKey() == null || notification.getIdempotencyKey().isEmpty()) {
            notification.setIdempotencyKey(UUID.randomUUID().toString());
        }

        // Clamp the backoff base so a stray value can neither hammer the API
        // (too small) nor stall the caller for an unbounded stretch (too large).
        long effectiveBaseDelay = Math.min(MAX_BASE_DELAY_MILLIS, Math.max(MIN_BASE_DELAY_MILLIS, baseDelayMillis));

        int attempt = 0;
        while (true) {
            try {
                ApiResponse<CreateNotificationSuccessResponse> response = api.createNotificationWithHttpInfo(notification);
                return new CreateNotificationWithRetryResult(response.getData(), isReplayed(response.getHeaders()));
            } catch (ApiException e) {
                // Code 0 with an IOException cause is a transport-level failure
                // (timeout, connection reset) that never reached the server.
                boolean retryable = e.getCode() == 429 || e.getCode() == 503
                        || (e.getCode() == 0 && e.getCause() instanceof IOException);
                if (!retryable || attempt >= maxRetries) {
                    throw e;
                }
                sleep(retryDelayMillis(e.getResponseHeaders(), attempt, effectiveBaseDelay));
                attempt++;
            }
        }
    }

    private static String headerValue(Map<String, List<String>> headers, String name) {
        if (headers == null) {
            return null;
        }
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            if (entry.getKey() != null && entry.getKey().equalsIgnoreCase(name)
                    && entry.getValue() != null && !entry.getValue().isEmpty()) {
                return entry.getValue().get(0);
            }
        }
        return null;
    }

    private static boolean isReplayed(Map<String, List<String>> headers) {
        String value = headerValue(headers, "Idempotent-Replayed");
        return value != null && value.trim().equalsIgnoreCase("true");
    }

    private static long retryDelayMillis(Map<String, List<String>> headers, int attempt, long baseDelayMillis) {
        String retryAfter = headerValue(headers, "Retry-After");
        if (retryAfter != null) {
            try {
                long seconds = Long.parseLong(retryAfter.trim());
                if (seconds >= 0) {
                    return seconds * 1000L;
                }
            } catch (NumberFormatException ignored) {
                // fall through to exponential backoff
            }
        }
        return baseDelayMillis * (1L << attempt);
    }

    private static void sleep(long millis) throws ApiException {
        if (millis <= 0) {
            return;
        }
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ApiException(e);
        }
    }
}
