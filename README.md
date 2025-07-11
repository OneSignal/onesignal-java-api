# onesignal-java-client

OneSignal
- API version: 5.2.0

A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com

  For more information, please visit [https://onesignal.com](https://onesignal.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>onesignal-java-client</artifactId>
  <version>5.2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'onesignal-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'onesignal-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:onesignal-java-client:5.2.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/onesignal-java-client-5.2.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  private static final String appId = "YOUR_APP_ID";
  private static final String restApiKey = "YOUR_REST_API_KEY"; // App REST API key required for most endpoints
  private static final String organizationApiKey = "YOUR_ORGANIZATION_API_KEY"; // Organization key is only required for creating new apps and other top-level endpoints

  private static Notification createNotification() {
    Notification notification = new Notification();
    notification.setAppId(appId);
    notification.setIsChrome(true);
    notification.setIsAnyWeb(true);
    notification.setIncludedSegments(Arrays.asList(new String[]{"Subscribed Users"}));
    StringMap contentStringMap = new StringMap();
    contentStringMap.en("Test");
    notification.setContents(contentStringMap);

    return notification;
  }

  public static void main(String[] args) {
    // Setting up the client
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HttpBearerAuth restApiAuth = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    restApiAuth.setBearerToken(restApiKey);
    HttpBearerAuth organizationApiAuth = (HttpBearerAuth) defaultClient.getAuthentication("organization_api_key");
    organizationApiAuth.setBearerToken(organizationApiKey);
    api = new DefaultApi(defaultClient);

    // Setting up the notification
    Notification notification = createNotification();

    // Sending the request
    CreateNotificationSuccessResponse response = api.createNotification(notification);

    // Checking the result
    System.out.print(response.getId();
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.onesignal.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**cancelNotification**](docs/DefaultApi.md#cancelNotification) | **DELETE** /notifications/{notification_id} | Stop a scheduled or currently outgoing notification
*DefaultApi* | [**createAlias**](docs/DefaultApi.md#createAlias) | **PATCH** /apps/{app_id}/users/by/{alias_label}/{alias_id}/identity | 
*DefaultApi* | [**createAliasBySubscription**](docs/DefaultApi.md#createAliasBySubscription) | **PATCH** /apps/{app_id}/subscriptions/{subscription_id}/user/identity | 
*DefaultApi* | [**createApp**](docs/DefaultApi.md#createApp) | **POST** /apps | Create an app
*DefaultApi* | [**createNotification**](docs/DefaultApi.md#createNotification) | **POST** /notifications | Create notification
*DefaultApi* | [**createSegment**](docs/DefaultApi.md#createSegment) | **POST** /apps/{app_id}/segments | Create Segment
*DefaultApi* | [**createSubscription**](docs/DefaultApi.md#createSubscription) | **POST** /apps/{app_id}/users/by/{alias_label}/{alias_id}/subscriptions | 
*DefaultApi* | [**createUser**](docs/DefaultApi.md#createUser) | **POST** /apps/{app_id}/users | 
*DefaultApi* | [**deleteAlias**](docs/DefaultApi.md#deleteAlias) | **DELETE** /apps/{app_id}/users/by/{alias_label}/{alias_id}/identity/{alias_label_to_delete} | 
*DefaultApi* | [**deleteSegment**](docs/DefaultApi.md#deleteSegment) | **DELETE** /apps/{app_id}/segments/{segment_id} | Delete Segment
*DefaultApi* | [**deleteSubscription**](docs/DefaultApi.md#deleteSubscription) | **DELETE** /apps/{app_id}/subscriptions/{subscription_id} | 
*DefaultApi* | [**deleteUser**](docs/DefaultApi.md#deleteUser) | **DELETE** /apps/{app_id}/users/by/{alias_label}/{alias_id} | 
*DefaultApi* | [**exportEvents**](docs/DefaultApi.md#exportEvents) | **POST** /notifications/{notification_id}/export_events?app_id&#x3D;{app_id} | Export CSV of Events
*DefaultApi* | [**exportSubscriptions**](docs/DefaultApi.md#exportSubscriptions) | **POST** /players/csv_export?app_id&#x3D;{app_id} | Export CSV of Subscriptions
*DefaultApi* | [**getAliases**](docs/DefaultApi.md#getAliases) | **GET** /apps/{app_id}/users/by/{alias_label}/{alias_id}/identity | 
*DefaultApi* | [**getAliasesBySubscription**](docs/DefaultApi.md#getAliasesBySubscription) | **GET** /apps/{app_id}/subscriptions/{subscription_id}/user/identity | 
*DefaultApi* | [**getApp**](docs/DefaultApi.md#getApp) | **GET** /apps/{app_id} | View an app
*DefaultApi* | [**getApps**](docs/DefaultApi.md#getApps) | **GET** /apps | View apps
*DefaultApi* | [**getNotification**](docs/DefaultApi.md#getNotification) | **GET** /notifications/{notification_id} | View notification
*DefaultApi* | [**getNotificationHistory**](docs/DefaultApi.md#getNotificationHistory) | **POST** /notifications/{notification_id}/history | Notification History
*DefaultApi* | [**getNotifications**](docs/DefaultApi.md#getNotifications) | **GET** /notifications | View notifications
*DefaultApi* | [**getOutcomes**](docs/DefaultApi.md#getOutcomes) | **GET** /apps/{app_id}/outcomes | View Outcomes
*DefaultApi* | [**getSegments**](docs/DefaultApi.md#getSegments) | **GET** /apps/{app_id}/segments | Get Segments
*DefaultApi* | [**getUser**](docs/DefaultApi.md#getUser) | **GET** /apps/{app_id}/users/by/{alias_label}/{alias_id} | 
*DefaultApi* | [**transferSubscription**](docs/DefaultApi.md#transferSubscription) | **PATCH** /apps/{app_id}/subscriptions/{subscription_id}/owner | 
*DefaultApi* | [**unsubscribeEmailWithToken**](docs/DefaultApi.md#unsubscribeEmailWithToken) | **POST** /apps/{app_id}/notifications/{notification_id}/unsubscribe | Unsubscribe with token
*DefaultApi* | [**updateApp**](docs/DefaultApi.md#updateApp) | **PUT** /apps/{app_id} | Update an app
*DefaultApi* | [**updateLiveActivity**](docs/DefaultApi.md#updateLiveActivity) | **POST** /apps/{app_id}/live_activities/{activity_id}/notifications | Update a Live Activity via Push
*DefaultApi* | [**updateSubscription**](docs/DefaultApi.md#updateSubscription) | **PATCH** /apps/{app_id}/subscriptions/{subscription_id} | 
*DefaultApi* | [**updateUser**](docs/DefaultApi.md#updateUser) | **PATCH** /apps/{app_id}/users/by/{alias_label}/{alias_id} | 


## Documentation for Models

 - [App](docs/App.md)
 - [BasicNotification](docs/BasicNotification.md)
 - [BasicNotificationAllOf](docs/BasicNotificationAllOf.md)
 - [BasicNotificationAllOfAndroidBackgroundLayout](docs/BasicNotificationAllOfAndroidBackgroundLayout.md)
 - [Button](docs/Button.md)
 - [CreateNotificationSuccessResponse](docs/CreateNotificationSuccessResponse.md)
 - [CreateSegmentConflictResponse](docs/CreateSegmentConflictResponse.md)
 - [CreateSegmentSuccessResponse](docs/CreateSegmentSuccessResponse.md)
 - [CreateUserConflictResponse](docs/CreateUserConflictResponse.md)
 - [CreateUserConflictResponseErrorsInner](docs/CreateUserConflictResponseErrorsInner.md)
 - [CreateUserConflictResponseErrorsItemsMeta](docs/CreateUserConflictResponseErrorsItemsMeta.md)
 - [DeliveryData](docs/DeliveryData.md)
 - [ExportEventsSuccessResponse](docs/ExportEventsSuccessResponse.md)
 - [ExportSubscriptionsRequestBody](docs/ExportSubscriptionsRequestBody.md)
 - [ExportSubscriptionsSuccessResponse](docs/ExportSubscriptionsSuccessResponse.md)
 - [Filter](docs/Filter.md)
 - [FilterExpression](docs/FilterExpression.md)
 - [GenericError](docs/GenericError.md)
 - [GenericSuccessBoolResponse](docs/GenericSuccessBoolResponse.md)
 - [GetNotificationHistoryRequestBody](docs/GetNotificationHistoryRequestBody.md)
 - [GetSegmentsSuccessResponse](docs/GetSegmentsSuccessResponse.md)
 - [LanguageStringMap](docs/LanguageStringMap.md)
 - [Notification](docs/Notification.md)
 - [NotificationAllOf](docs/NotificationAllOf.md)
 - [NotificationHistorySuccessResponse](docs/NotificationHistorySuccessResponse.md)
 - [NotificationSlice](docs/NotificationSlice.md)
 - [NotificationTarget](docs/NotificationTarget.md)
 - [NotificationWithMeta](docs/NotificationWithMeta.md)
 - [NotificationWithMetaAllOf](docs/NotificationWithMetaAllOf.md)
 - [Operator](docs/Operator.md)
 - [OutcomeData](docs/OutcomeData.md)
 - [OutcomesData](docs/OutcomesData.md)
 - [PlatformDeliveryData](docs/PlatformDeliveryData.md)
 - [PlatformDeliveryDataEmailAllOf](docs/PlatformDeliveryDataEmailAllOf.md)
 - [PlatformDeliveryDataSmsAllOf](docs/PlatformDeliveryDataSmsAllOf.md)
 - [PropertiesBody](docs/PropertiesBody.md)
 - [PropertiesDeltas](docs/PropertiesDeltas.md)
 - [PropertiesObject](docs/PropertiesObject.md)
 - [Purchase](docs/Purchase.md)
 - [RateLimitError](docs/RateLimitError.md)
 - [Segment](docs/Segment.md)
 - [SegmentData](docs/SegmentData.md)
 - [SegmentNotificationTarget](docs/SegmentNotificationTarget.md)
 - [Subscription](docs/Subscription.md)
 - [SubscriptionBody](docs/SubscriptionBody.md)
 - [SubscriptionNotificationTarget](docs/SubscriptionNotificationTarget.md)
 - [TransferSubscriptionRequestBody](docs/TransferSubscriptionRequestBody.md)
 - [UpdateLiveActivityRequest](docs/UpdateLiveActivityRequest.md)
 - [UpdateLiveActivitySuccessResponse](docs/UpdateLiveActivitySuccessResponse.md)
 - [UpdateUserRequest](docs/UpdateUserRequest.md)
 - [User](docs/User.md)
 - [UserIdentityBody](docs/UserIdentityBody.md)
 - [WebButton](docs/WebButton.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### organization_api_key

- **Type**: HTTP basic authentication

### rest_api_key

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

devrel@onesignal.com

