# onesignal-java-client

OneSignal
- API version: 5.3.0

A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

### Maven

```xml
<dependency>
  <groupId>com.onesignal</groupId>
  <artifactId>onesignal-java-client</artifactId>
  <version>5.3.0</version>
</dependency>
```

### Gradle

```groovy
implementation "com.onesignal:onesignal-java-client:5.3.0"
```

## Configuration

Every SDK requires authentication via API keys. Two key types are available:

- **REST API Key** — required for most endpoints (sending notifications, managing users, etc.). Found in your app's **Settings > Keys & IDs**.
- **Organization API Key** — only required for organization-level endpoints like creating or listing apps. Found in **Organization Settings**.

> **Warning:** Store your API keys in environment variables or a secrets manager. Never commit them to source control.

```java
import com.onesignal.client.ApiClient;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.HttpBearerAuth;
import com.onesignal.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

HttpBearerAuth restApiAuth = (HttpBearerAuth) defaultClient
    .getAuthentication("rest_api_key");
restApiAuth.setBearerToken("YOUR_REST_API_KEY");

HttpBearerAuth orgApiAuth = (HttpBearerAuth) defaultClient
    .getAuthentication("organization_api_key");
orgApiAuth.setBearerToken("YOUR_ORGANIZATION_API_KEY");

DefaultApi client = new DefaultApi(defaultClient);
```

## Send a push notification

```java
import com.onesignal.client.model.Notification;
import com.onesignal.client.model.StringMap;

Notification notification = new Notification();
notification.setAppId("YOUR_APP_ID");

StringMap contents = new StringMap();
contents.en("Hello from OneSignal!");
notification.setContents(contents);

StringMap headings = new StringMap();
headings.en("Push Notification");
notification.setHeadings(headings);

notification.setIncludedSegments(Arrays.asList("Subscribed Users"));

var response = client.createNotification(notification);
System.out.println("Notification ID: " + response.getId());
```

## Send an email

```java
Notification notification = new Notification();
notification.setAppId("YOUR_APP_ID");
notification.setEmailSubject("Important Update");
notification.setEmailBody("<h1>Hello!</h1><p>This is an HTML email.</p>");
notification.setIncludedSegments(Arrays.asList("Subscribed Users"));
notification.setChannelForExternalUserIds("email");

var response = client.createNotification(notification);
```

## Send an SMS

```java
StringMap contents = new StringMap();
contents.en("Your SMS message content here");

Notification notification = new Notification();
notification.setAppId("YOUR_APP_ID");
notification.setContents(contents);
notification.setIncludedSegments(Arrays.asList("Subscribed Users"));
notification.setChannelForExternalUserIds("sms");
notification.setSmsFrom("+15551234567");

var response = client.createNotification(notification);
```

## Full API reference

The complete list of API endpoints and their parameters is available in the [DefaultApi documentation](https://github.com/OneSignal/onesignal-java-api/blob/main/docs/DefaultApi.md).

For the underlying REST API, see the [OneSignal API reference](https://documentation.onesignal.com/reference).
