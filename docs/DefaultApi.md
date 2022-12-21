# DefaultApi

All URIs are relative to *https://onesignal.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**beginLiveActivity**](DefaultApi.md#beginLiveActivity) | **POST** /apps/{app_id}/live_activities/{activity_id}/token | Start Live Activity |
| [**cancelNotification**](DefaultApi.md#cancelNotification) | **DELETE** /notifications/{notification_id} | Stop a scheduled or currently outgoing notification |
| [**createApp**](DefaultApi.md#createApp) | **POST** /apps | Create an app |
| [**createNotification**](DefaultApi.md#createNotification) | **POST** /notifications | Create notification |
| [**createPlayer**](DefaultApi.md#createPlayer) | **POST** /players | Add a device |
| [**createSegments**](DefaultApi.md#createSegments) | **POST** /apps/{app_id}/segments | Create Segments |
| [**deletePlayer**](DefaultApi.md#deletePlayer) | **DELETE** /players/{player_id} | Delete a user record |
| [**deleteSegments**](DefaultApi.md#deleteSegments) | **DELETE** /apps/{app_id}/segments/{segment_id} | Delete Segments |
| [**endLiveActivity**](DefaultApi.md#endLiveActivity) | **DELETE** /apps/{app_id}/live_activities/{activity_id}/token/{subscription_id} | Stop Live Activity |
| [**exportPlayers**](DefaultApi.md#exportPlayers) | **POST** /players/csv_export?app_id&#x3D;{app_id} | CSV export |
| [**getApp**](DefaultApi.md#getApp) | **GET** /apps/{app_id} | View an app |
| [**getApps**](DefaultApi.md#getApps) | **GET** /apps | View apps |
| [**getNotification**](DefaultApi.md#getNotification) | **GET** /notifications/{notification_id} | View notification |
| [**getNotificationHistory**](DefaultApi.md#getNotificationHistory) | **POST** /notifications/{notification_id}/history | Notification History |
| [**getNotifications**](DefaultApi.md#getNotifications) | **GET** /notifications | View notifications |
| [**getOutcomes**](DefaultApi.md#getOutcomes) | **GET** /apps/{app_id}/outcomes | View Outcomes |
| [**getPlayer**](DefaultApi.md#getPlayer) | **GET** /players/{player_id} | View device |
| [**getPlayers**](DefaultApi.md#getPlayers) | **GET** /players | View devices |
| [**updateApp**](DefaultApi.md#updateApp) | **PUT** /apps/{app_id} | Update an app |
| [**updateLiveActivity**](DefaultApi.md#updateLiveActivity) | **POST** /apps/{app_id}/live_activities/{activity_id}/notifications | Update a Live Activity via Push |
| [**updatePlayer**](DefaultApi.md#updatePlayer) | **PUT** /players/{player_id} | Edit device |
| [**updatePlayerTags**](DefaultApi.md#updatePlayerTags) | **PUT** /apps/{app_id}/users/{external_user_id} | Edit tags with external user id |


<a name="beginLiveActivity"></a>
# **beginLiveActivity**
> beginLiveActivity(appId, activityId, beginLiveActivityRequest)

Start Live Activity

Starts a Live Activity

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The OneSignal App ID for your app.  Available in Keys & IDs.
    String activityId = "activityId_example"; // String | Live Activity record ID
    BeginLiveActivityRequest beginLiveActivityRequest = new BeginLiveActivityRequest(); // BeginLiveActivityRequest | 
    try {
      apiInstance.beginLiveActivity(appId, activityId, beginLiveActivityRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#beginLiveActivity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| The OneSignal App ID for your app.  Available in Keys &amp; IDs. | |
| **activityId** | **String**| Live Activity record ID | |
| **beginLiveActivityRequest** | [**BeginLiveActivityRequest**](BeginLiveActivityRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="cancelNotification"></a>
# **cancelNotification**
> CancelNotificationSuccessResponse cancelNotification(appId, notificationId)

Stop a scheduled or currently outgoing notification

Used to stop a scheduled or currently outgoing notification

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String notificationId = "notificationId_example"; // String | 
    try {
      CancelNotificationSuccessResponse result = apiInstance.cancelNotification(appId, notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#cancelNotification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **notificationId** | **String**|  | |

### Return type

[**CancelNotificationSuccessResponse**](CancelNotificationSuccessResponse.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="createApp"></a>
# **createApp**
> App createApp(app)

Create an app

Creates a new OneSignal app

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: user_key
    HttpBearerAuth user_key = (HttpBearerAuth) defaultClient.getAuthentication("user_key");
    user_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    App app = new App(); // App | 
    try {
      App result = apiInstance.createApp(app);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **app** | [**App**](App.md)|  | |

### Return type

[**App**](App.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="createNotification"></a>
# **createNotification**
> CreateNotificationSuccessResponse createNotification(notification)

Create notification

Sends notifications to your users 

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Notification notification = new Notification(); // Notification | 
    try {
      CreateNotificationSuccessResponse result = apiInstance.createNotification(notification);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createNotification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notification** | [**Notification**](Notification.md)|  | |

### Return type

[**CreateNotificationSuccessResponse**](CreateNotificationSuccessResponse.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK, invalid_player_ids, invalid_external_user_ids or No Subscribed Players If a message was successfully created, you will get a 200 response and an id for the notification. If the 200 response contains \&quot;invalid_player_ids\&quot; or \&quot;invalid_external_user_ids\&quot; this will mark devices that exist in the provided app_id but are no longer subscribed. If no id is returned, then a message was not created and the targeted User IDs do not exist under the provided app_id. Any User IDs sent in the request that do not exist under the specified app_id will be ignored.  |  -  |
| **400** | Bad Request |  -  |

<a name="createPlayer"></a>
# **createPlayer**
> CreatePlayerSuccessResponse createPlayer(player)

Add a device

Register a new device to one of your OneSignal apps &amp;#x1F6A7; Don&#39;t use this This API endpoint is designed to be used from our open source Mobile and Web Push SDKs. It is not designed for developers to use it directly, unless instructed to do so by OneSignal support. If you use this method instead of our SDKs, many OneSignal features such as conversion tracking, timezone tracking, language detection, and rich-push won&#39;t work out of the box. It will also make it harder to identify possible setup issues. This method is used to register a new device with OneSignal. If a device is already registered with the specified identifier, then this will update the existing device record instead of creating a new one. The returned player is a player / user ID. Use the returned ID to send push notifications to this specific user later, or to include this player when sending to a set of users. &amp;#x1F6A7; iOS Must set test_type to 1 when building your iOS app as development. Omit this field in your production app builds. 

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Player player = new Player(); // Player | 
    try {
      CreatePlayerSuccessResponse result = apiInstance.createPlayer(player);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createPlayer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **player** | [**Player**](Player.md)|  | |

### Return type

[**CreatePlayerSuccessResponse**](CreatePlayerSuccessResponse.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="createSegments"></a>
# **createSegments**
> CreateSegmentSuccessResponse createSegments(appId, segment)

Create Segments

Create segments visible and usable in the dashboard and API - Required: OneSignal Paid Plan The Create Segment method is used when you want your server to programmatically create a segment instead of using the OneSignal Dashboard UI. Just like creating Segments from the dashboard you can pass in filters with multiple \&quot;AND\&quot; or \&quot;OR\&quot; operator&#39;s. &amp;#x1F6A7; Does Not Update Segments This endpoint will only create segments, it does not edit or update currently created Segments. You will need to use the Delete Segments endpoint and re-create it with this endpoint to edit. 

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The OneSignal App ID for your app.  Available in Keys & IDs.
    Segment segment = new Segment(); // Segment | 
    try {
      CreateSegmentSuccessResponse result = apiInstance.createSegments(appId, segment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createSegments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| The OneSignal App ID for your app.  Available in Keys &amp; IDs. | |
| **segment** | [**Segment**](Segment.md)|  | [optional] |

### Return type

[**CreateSegmentSuccessResponse**](CreateSegmentSuccessResponse.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |

<a name="deletePlayer"></a>
# **deletePlayer**
> DeletePlayerSuccessResponse deletePlayer(appId, playerId)

Delete a user record

Delete player - Required: Used to delete a single, specific Player ID record from a specific OneSignal app. 

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The OneSignal App ID for your app.  Available in Keys & IDs.
    String playerId = "playerId_example"; // String | The OneSignal player_id
    try {
      DeletePlayerSuccessResponse result = apiInstance.deletePlayer(appId, playerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deletePlayer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| The OneSignal App ID for your app.  Available in Keys &amp; IDs. | |
| **playerId** | **String**| The OneSignal player_id | |

### Return type

[**DeletePlayerSuccessResponse**](DeletePlayerSuccessResponse.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="deleteSegments"></a>
# **deleteSegments**
> DeleteSegmentSuccessResponse deleteSegments(appId, segmentId)

Delete Segments

Delete segments (not user devices) - Required: OneSignal Paid Plan You can delete a segment under your app by calling this API. You must provide an API key in the Authorization header that has admin access on the app. The segment_id can be found in the URL of the segment when viewing it in the dashboard. 

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The OneSignal App ID for your app.  Available in Keys & IDs.
    String segmentId = "segmentId_example"; // String | The segment_id can be found in the URL of the segment when viewing it in the dashboard.
    try {
      DeleteSegmentSuccessResponse result = apiInstance.deleteSegments(appId, segmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteSegments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| The OneSignal App ID for your app.  Available in Keys &amp; IDs. | |
| **segmentId** | **String**| The segment_id can be found in the URL of the segment when viewing it in the dashboard. | |

### Return type

[**DeleteSegmentSuccessResponse**](DeleteSegmentSuccessResponse.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="endLiveActivity"></a>
# **endLiveActivity**
> endLiveActivity(appId, activityId, subscriptionId)

Stop Live Activity

Stops a Live Activity

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The OneSignal App ID for your app.  Available in Keys & IDs.
    String activityId = "activityId_example"; // String | Live Activity record ID
    String subscriptionId = "subscriptionId_example"; // String | Subscription ID
    try {
      apiInstance.endLiveActivity(appId, activityId, subscriptionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#endLiveActivity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| The OneSignal App ID for your app.  Available in Keys &amp; IDs. | |
| **activityId** | **String**| Live Activity record ID | |
| **subscriptionId** | **String**| Subscription ID | |

### Return type

null (empty response body)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="exportPlayers"></a>
# **exportPlayers**
> ExportPlayersSuccessResponse exportPlayers(appId, exportPlayersRequestBody)

CSV export

Generate a compressed CSV export of all of your current user data This method can be used to generate a compressed CSV export of all of your current user data. It is a much faster alternative than retrieving this data using the /players API endpoint. The file will be compressed using GZip. The file may take several minutes to generate depending on the number of users in your app. The URL generated will be available for 3 days and includes random v4 uuid as part of the resource name to be unguessable. &amp;#x1F6A7; 403 Error Responses          You can test if it is complete by making a GET request to the csv_file_url value. This file may take time to generate depending on how many device records are being pulled. If the file is not ready, a 403 error will be returned. Otherwise the file itself will be returned. &amp;#x1F6A7; Requires Authentication Key Requires your OneSignal App&#39;s REST API Key, available in Keys &amp; IDs. &amp;#x1F6A7; Concurrent Exports Only one concurrent export is allowed per OneSignal account. Please ensure you have successfully downloaded the .csv.gz file before exporting another app. CSV File Format: - Default Columns:   | Field | Details |   | --- | --- |   | id | OneSignal Player Id |   | identifier | Push Token |   | session_count | Number of times they visited the app or site   | language | Device language code |   | timezone | Number of seconds away from UTC. Example: -28800 |   | game_version | Version of your mobile app gathered from Android Studio versionCode in your App/build.gradle and iOS uses kCFBundleVersionKey in Xcode. |   | device_os | Device Operating System Version. Example: 80 &#x3D; Chrome 80, 9 &#x3D; Android 9 |   | device_type | Device Operating System Type |   | device_model | Device Hardware String Code. Example: Mobile Web Subscribers will have &#x60;Linux armv&#x60; |   | ad_id | Based on the Google Advertising Id for Android, identifierForVendor for iOS. OptedOut means user turned off Advertising tracking on the device. |   | tags | Current OneSignal Data Tags on the device. |   | last_active | Date and time the user last opened the mobile app or visited the site. |   | playtime | Total amount of time in seconds the user had the mobile app open. |   | amount_spent |  Mobile only - amount spent in USD on In-App Purchases. |    | created_at | Date and time the device record was created in OneSignal. Mobile - first time they opened the app with OneSignal SDK. Web - first time the user subscribed to the site. |   | invalid_identifier | t &#x3D; unsubscribed, f &#x3D; subscibed |   | badge_count | Current number of badges on the device | - Extra Columns:   | Field | Details |   | --- | --- |   | external_user_id | Your User Id set on the device |   | notification_types | Notification types |   | location | Location points (Latitude and Longitude) set on the device. |   | country | Country code |   | rooted | Android device rooted or not |   | ip | IP Address of the device if being tracked. See Handling Personal Data. |   | web_auth | Web Only authorization key. |   | web_p256 | Web Only p256 key. | 

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The app ID that you want to export devices from
    ExportPlayersRequestBody exportPlayersRequestBody = new ExportPlayersRequestBody(); // ExportPlayersRequestBody | 
    try {
      ExportPlayersSuccessResponse result = apiInstance.exportPlayers(appId, exportPlayersRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#exportPlayers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| The app ID that you want to export devices from | |
| **exportPlayersRequestBody** | [**ExportPlayersRequestBody**](ExportPlayersRequestBody.md)|  | [optional] |

### Return type

[**ExportPlayersSuccessResponse**](ExportPlayersSuccessResponse.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="getApp"></a>
# **getApp**
> App getApp(appId)

View an app

View the details of a single OneSignal app

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: user_key
    HttpBearerAuth user_key = (HttpBearerAuth) defaultClient.getAuthentication("user_key");
    user_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | An app id
    try {
      App result = apiInstance.getApp(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| An app id | |

### Return type

[**App**](App.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="getApps"></a>
# **getApps**
> List&lt;App&gt; getApps()

View apps

View the details of all of your current OneSignal apps

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: user_key
    HttpBearerAuth user_key = (HttpBearerAuth) defaultClient.getAuthentication("user_key");
    user_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<App> result = apiInstance.getApps();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getApps");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;App&gt;**](App.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="getNotification"></a>
# **getNotification**
> NotificationWithMeta getNotification(appId, notificationId)

View notification

View the details of a single notification and outcomes associated with it

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String notificationId = "notificationId_example"; // String | 
    try {
      NotificationWithMeta result = apiInstance.getNotification(appId, notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getNotification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **notificationId** | **String**|  | |

### Return type

[**NotificationWithMeta**](NotificationWithMeta.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="getNotificationHistory"></a>
# **getNotificationHistory**
> NotificationHistorySuccessResponse getNotificationHistory(notificationId, getNotificationRequestBody)

Notification History

-&gt; View the devices sent a message - OneSignal Paid Plan Required This method will return all devices that were sent the given notification_id of an Email or Push Notification if used within 7 days of the date sent. After 7 days of the sending date, the message history data will be unavailable. After a successful response is received, the destination url may be polled until the file becomes available. Most exports are done in ~1-3 minutes, so setting a poll interval of 10 seconds should be adequate. For use cases that are not meant to be consumed by a script, an email will be sent to the supplied email address. &amp;#x1F6A7; Requirements A OneSignal Paid Plan. Turn on Send History via OneSignal API in Settings -&gt; Analytics. Cannot get data before this was turned on. Must be called within 7 days after sending the message. Messages targeting under 1000 recipients will not have \&quot;sent\&quot; events recorded, but will show \&quot;clicked\&quot; events. Requires your OneSignal App&#39;s REST API Key, available in Keys &amp; IDs.

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String notificationId = "notificationId_example"; // String | The \"id\" of the message found in the Notification object
    GetNotificationRequestBody getNotificationRequestBody = new GetNotificationRequestBody(); // GetNotificationRequestBody | 
    try {
      NotificationHistorySuccessResponse result = apiInstance.getNotificationHistory(notificationId, getNotificationRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getNotificationHistory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationId** | **String**| The \&quot;id\&quot; of the message found in the Notification object | |
| **getNotificationRequestBody** | [**GetNotificationRequestBody**](GetNotificationRequestBody.md)|  | |

### Return type

[**NotificationHistorySuccessResponse**](NotificationHistorySuccessResponse.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="getNotifications"></a>
# **getNotifications**
> NotificationSlice getNotifications(appId, limit, offset, kind)

View notifications

View the details of multiple notifications

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The app ID that you want to view notifications from
    Integer limit = 56; // Integer | How many notifications to return.  Max is 50.  Default is 50.
    Integer offset = 56; // Integer | Page offset.  Default is 0.  Results are sorted by queued_at in descending order.  queued_at is a representation of the time that the notification was queued at.
    Integer kind = 0; // Integer | Kind of notifications returned:   * unset - All notification types (default)   * `0` - Dashboard only   * `1` - API only   * `3` - Automated only 
    try {
      NotificationSlice result = apiInstance.getNotifications(appId, limit, offset, kind);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getNotifications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| The app ID that you want to view notifications from | |
| **limit** | **Integer**| How many notifications to return.  Max is 50.  Default is 50. | [optional] |
| **offset** | **Integer**| Page offset.  Default is 0.  Results are sorted by queued_at in descending order.  queued_at is a representation of the time that the notification was queued at. | [optional] |
| **kind** | **Integer**| Kind of notifications returned:   * unset - All notification types (default)   * &#x60;0&#x60; - Dashboard only   * &#x60;1&#x60; - API only   * &#x60;3&#x60; - Automated only  | [optional] [enum: 0, 1, 3] |

### Return type

[**NotificationSlice**](NotificationSlice.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="getOutcomes"></a>
# **getOutcomes**
> OutcomesData getOutcomes(appId, outcomeNames, outcomeNames2, outcomeTimeRange, outcomePlatforms, outcomeAttribution)

View Outcomes

View the details of all the outcomes associated with your app  &amp;#x1F6A7; Requires Authentication Key Requires your OneSignal App&#39;s REST API Key, available in Keys &amp; IDs.  &amp;#x1F6A7; Outcome Data Limitations Outcomes are only accessible for around 30 days before deleted from our servers. You will need to export this data every month if you want to keep it. 

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The OneSignal App ID for your app.  Available in Keys & IDs.
    String outcomeNames = "outcomeNames_example"; // String | Required Comma-separated list of names and the value (sum/count) for the returned outcome data. Note: Clicks only support count aggregation. For out-of-the-box OneSignal outcomes such as click and session duration, please use the \"os\" prefix with two underscores. For other outcomes, please use the name specified by the user. Example:os__session_duration.count,os__click.count,CustomOutcomeName.sum 
    String outcomeNames2 = "outcomeNames_example"; // String | Optional If outcome names contain any commas, then please specify only one value at a time. Example: outcome_names[]=os__click.count&outcome_names[]=Sales, Purchase.count where \"Sales, Purchase\" is the custom outcomes with a comma in the name. 
    String outcomeTimeRange = "outcomeTimeRange_example"; // String | Optional Time range for the returned data. The values can be 1h (for the last 1 hour data), 1d (for the last 1 day data), or 1mo (for the last 1 month data). Default is 1h if the parameter is omitted. 
    String outcomePlatforms = "outcomePlatforms_example"; // String | Optional Platform id. Refer device's platform ids for values. Example: outcome_platform=0 for iOS outcome_platform=7,8 for Safari and Firefox Default is data from all platforms if the parameter is omitted. 
    String outcomeAttribution = "outcomeAttribution_example"; // String | Optional Attribution type for the outcomes. The values can be direct or influenced or unattributed. Example: outcome_attribution=direct Default is total (returns direct+influenced+unattributed) if the parameter is omitted. 
    try {
      OutcomesData result = apiInstance.getOutcomes(appId, outcomeNames, outcomeNames2, outcomeTimeRange, outcomePlatforms, outcomeAttribution);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getOutcomes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| The OneSignal App ID for your app.  Available in Keys &amp; IDs. | |
| **outcomeNames** | **String**| Required Comma-separated list of names and the value (sum/count) for the returned outcome data. Note: Clicks only support count aggregation. For out-of-the-box OneSignal outcomes such as click and session duration, please use the \&quot;os\&quot; prefix with two underscores. For other outcomes, please use the name specified by the user. Example:os__session_duration.count,os__click.count,CustomOutcomeName.sum  | |
| **outcomeNames2** | **String**| Optional If outcome names contain any commas, then please specify only one value at a time. Example: outcome_names[]&#x3D;os__click.count&amp;outcome_names[]&#x3D;Sales, Purchase.count where \&quot;Sales, Purchase\&quot; is the custom outcomes with a comma in the name.  | [optional] |
| **outcomeTimeRange** | **String**| Optional Time range for the returned data. The values can be 1h (for the last 1 hour data), 1d (for the last 1 day data), or 1mo (for the last 1 month data). Default is 1h if the parameter is omitted.  | [optional] |
| **outcomePlatforms** | **String**| Optional Platform id. Refer device&#39;s platform ids for values. Example: outcome_platform&#x3D;0 for iOS outcome_platform&#x3D;7,8 for Safari and Firefox Default is data from all platforms if the parameter is omitted.  | [optional] |
| **outcomeAttribution** | **String**| Optional Attribution type for the outcomes. The values can be direct or influenced or unattributed. Example: outcome_attribution&#x3D;direct Default is total (returns direct+influenced+unattributed) if the parameter is omitted.  | [optional] |

### Return type

[**OutcomesData**](OutcomesData.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="getPlayer"></a>
# **getPlayer**
> Player getPlayer(appId, playerId, emailAuthHash)

View device

View the details of an existing device in one of your OneSignal apps

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | Your app_id for this device
    String playerId = "playerId_example"; // String | Player's OneSignal ID
    String emailAuthHash = "emailAuthHash_example"; // String | Email - Only required if you have enabled Identity Verification and device_type is email (11).
    try {
      Player result = apiInstance.getPlayer(appId, playerId, emailAuthHash);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getPlayer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| Your app_id for this device | |
| **playerId** | **String**| Player&#39;s OneSignal ID | |
| **emailAuthHash** | **String**| Email - Only required if you have enabled Identity Verification and device_type is email (11). | [optional] |

### Return type

[**Player**](Player.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="getPlayers"></a>
# **getPlayers**
> PlayerSlice getPlayers(appId, limit, offset)

View devices

View the details of multiple devices in one of your OneSignal apps Unavailable for Apps Over 80,000 Users For performance reasons, this method is not available for larger apps. Larger apps should use the CSV export API endpoint, which is much more performant. 

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The app ID that you want to view players from
    Integer limit = 56; // Integer | How many devices to return. Max is 300. Default is 300
    Integer offset = 56; // Integer | Result offset. Default is 0. Results are sorted by id;
    try {
      PlayerSlice result = apiInstance.getPlayers(appId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getPlayers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| The app ID that you want to view players from | |
| **limit** | **Integer**| How many devices to return. Max is 300. Default is 300 | [optional] |
| **offset** | **Integer**| Result offset. Default is 0. Results are sorted by id; | [optional] |

### Return type

[**PlayerSlice**](PlayerSlice.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="updateApp"></a>
# **updateApp**
> App updateApp(appId, app)

Update an app

Updates the name or configuration settings of an existing OneSignal app

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: user_key
    HttpBearerAuth user_key = (HttpBearerAuth) defaultClient.getAuthentication("user_key");
    user_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | An app id
    App app = new App(); // App | 
    try {
      App result = apiInstance.updateApp(appId, app);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| An app id | |
| **app** | [**App**](App.md)|  | |

### Return type

[**App**](App.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="updateLiveActivity"></a>
# **updateLiveActivity**
> UpdateLiveActivitySuccessResponse updateLiveActivity(appId, activityId, updateLiveActivityRequest)

Update a Live Activity via Push

Updates a specified live activity.

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The OneSignal App ID for your app.  Available in Keys & IDs.
    String activityId = "activityId_example"; // String | Live Activity record ID
    UpdateLiveActivityRequest updateLiveActivityRequest = new UpdateLiveActivityRequest(); // UpdateLiveActivityRequest | 
    try {
      UpdateLiveActivitySuccessResponse result = apiInstance.updateLiveActivity(appId, activityId, updateLiveActivityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateLiveActivity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| The OneSignal App ID for your app.  Available in Keys &amp; IDs. | |
| **activityId** | **String**| Live Activity record ID | |
| **updateLiveActivityRequest** | [**UpdateLiveActivityRequest**](UpdateLiveActivityRequest.md)|  | |

### Return type

[**UpdateLiveActivitySuccessResponse**](UpdateLiveActivitySuccessResponse.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="updatePlayer"></a>
# **updatePlayer**
> UpdatePlayerSuccessResponse updatePlayer(playerId, player)

Edit device

Update an existing device in one of your OneSignal apps

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String playerId = "playerId_example"; // String | Player's OneSignal ID
    Player player = new Player(); // Player | 
    try {
      UpdatePlayerSuccessResponse result = apiInstance.updatePlayer(playerId, player);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updatePlayer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playerId** | **String**| Player&#39;s OneSignal ID | |
| **player** | [**Player**](Player.md)|  | |

### Return type

[**UpdatePlayerSuccessResponse**](UpdatePlayerSuccessResponse.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a name="updatePlayerTags"></a>
# **updatePlayerTags**
> UpdatePlayerTagsSuccessResponse updatePlayerTags(appId, externalUserId, updatePlayerTagsRequestBody)

Edit tags with external user id

Update an existing device&#39;s tags in one of your OneSignal apps using the External User ID. Warning - Android SDK Data Synchronization Tags added through the Android SDK tagging methods may not update if using the API to change or update the same tag. For example, if you use SDK method sendTag(\&quot;key\&quot;, \&quot;value1\&quot;) then update the tag value to \&quot;value2\&quot; with this API endpoint. You will not be able to set the value back to \&quot;value1\&quot; through the SDK, you will need to change it to something different through the SDK to be reset. Recommendations if using this Endpoint on Android Mobile Apps: 1 - Do not use the same tag keys for SDK and API updates 2 - If you want to use the same key for both SDK and API updates, call the SDK getTags method first to update the device&#39;s tags. This is only applicable on the Android Mobile App SDKs. &amp;#128216; Deleting Tags To delete a tag, include its key and set its value to blank. Omitting a key/value will not delete it. For example, if I wanted to delete two existing tags rank and category while simultaneously adding a new tag class, the tags JSON would look like the following: \&quot;tags\&quot;: {    \&quot;rank\&quot;: \&quot;\&quot;,    \&quot;category\&quot;: \&quot;\&quot;,    \&quot;class\&quot;: \&quot;my_new_value\&quot; } 

### Example
```java
// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onesignal.com/api/v1");
    
    // Configure HTTP bearer authorization: app_key
    HttpBearerAuth app_key = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    app_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The OneSignal App ID the user record is found under.
    String externalUserId = "externalUserId_example"; // String | The External User ID mapped to teh device record in OneSignal.  Must be actively set on the device to be updated.
    UpdatePlayerTagsRequestBody updatePlayerTagsRequestBody = new UpdatePlayerTagsRequestBody(); // UpdatePlayerTagsRequestBody | 
    try {
      UpdatePlayerTagsSuccessResponse result = apiInstance.updatePlayerTags(appId, externalUserId, updatePlayerTagsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updatePlayerTags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| The OneSignal App ID the user record is found under. | |
| **externalUserId** | **String**| The External User ID mapped to teh device record in OneSignal.  Must be actively set on the device to be updated. | |
| **updatePlayerTagsRequestBody** | [**UpdatePlayerTagsRequestBody**](UpdatePlayerTagsRequestBody.md)|  | [optional] |

### Return type

[**UpdatePlayerTagsSuccessResponse**](UpdatePlayerTagsSuccessResponse.md)

### Authorization

[app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

