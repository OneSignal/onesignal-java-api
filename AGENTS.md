# AGENTS.md — OneSignal Java SDK

Integration guide for AI agents and LLMs using the OneSignal server SDK for Java. Human-oriented docs are in the [README](./README.md).

## What this SDK does

Server-side access to the OneSignal REST API: send push / email / SMS, manage users, subscriptions, segments, templates and live activities, and administer apps & API keys.

- Maven coordinates: `com.onesignal:onesignal-java-client` (see the [README](./README.md) for the current version and Gradle setup)
- Repository: https://github.com/OneSignal/onesignal-java-api

## Authentication — two key types

OneSignal uses two bearer credentials; each endpoint requires a specific one. Both are registered on the `ApiClient` as named bearer-auth schemes:

- **REST API key** (`rest_api_key`) — used by almost every endpoint (notifications, users, subscriptions, segments, templates, live activities, custom events). Found in **App Settings → Keys & IDs**.
- **Organization API key** (`organization_api_key`) — required *only* for organization-level endpoints: app management (list / create / get / update apps), API-key management (view / create / update / rotate / delete API keys), and copying a template to another app. Found in **Organization Settings**.

Set both; the SDK sends the correct credential per endpoint. Never hard-code keys — read them from environment variables or a secrets manager.

```java
import com.onesignal.client.ApiClient;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.HttpBearerAuth;
import com.onesignal.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

HttpBearerAuth restApiKey = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
restApiKey.setBearerToken(System.getenv("ONESIGNAL_REST_API_KEY"));

HttpBearerAuth orgApiKey = (HttpBearerAuth) defaultClient.getAuthentication("organization_api_key");
orgApiKey.setBearerToken(System.getenv("ONESIGNAL_ORGANIZATION_API_KEY"));

DefaultApi client = new DefaultApi(defaultClient);
```

## Calling convention

Methods take **positional arguments**. Build the model object and pass it directly — do **not** wrap arguments in a request/options object.

```java
Notification notification = new Notification();
notification.setAppId("YOUR_APP_ID");
LanguageStringMap contents = new LanguageStringMap();
contents.setEn("Hello from OneSignal!");
notification.setContents(contents);
Map<String, List<String>> aliases = new HashMap<>();
aliases.put("external_id", Arrays.asList("YOUR_USER_EXTERNAL_ID"));
notification.setIncludeAliases(aliases);
notification.setTargetChannel(Notification.TargetChannelEnum.PUSH);

CreateNotificationSuccessResponse response = client.createNotification(notification);
```

## Idempotent sends & retries

Set `idempotency_key` (a UUID) so a create-notification request can be safely retried — the server returns the original result instead of sending twice. The `createNotificationWithRetry` helper handles this for you: it generates an `idempotency_key` when absent, retries `429` / `503` / transport errors with the **same** key (honoring `Retry-After`), and reports via `getWasReplayed()` whether the server answered from a previously completed request.

```java
NotificationHelpers.CreateNotificationWithRetryResult result =
    client.createNotificationWithRetry(notification, 5, 1000L);
System.out.println("id: " + result.getResponse().getId() + " replayed: " + result.getWasReplayed());
```

> The notification-level `external_id` field is the **deprecated** idempotency mechanism — prefer `idempotency_key`. Don't confuse it with the `external_id` **alias label** (under `include_aliases`) used to target users.

## Full API reference

- [DefaultApi.md](https://github.com/OneSignal/onesignal-java-api/blob/main/docs/DefaultApi.md) — every endpoint, parameter, and model, with runnable examples.
- [OneSignal REST API reference](https://documentation.onesignal.com/reference)
