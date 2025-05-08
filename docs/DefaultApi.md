# DefaultApi

All URIs are relative to *https://api.onesignal.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelNotification**](DefaultApi.md#cancelNotification) | **DELETE** /notifications/{notification_id} | Stop a scheduled or currently outgoing notification |
| [**createAlias**](DefaultApi.md#createAlias) | **PATCH** /apps/{app_id}/users/by/{alias_label}/{alias_id}/identity |  |
| [**createAliasBySubscription**](DefaultApi.md#createAliasBySubscription) | **PATCH** /apps/{app_id}/subscriptions/{subscription_id}/user/identity |  |
| [**createApp**](DefaultApi.md#createApp) | **POST** /apps | Create an app |
| [**createNotification**](DefaultApi.md#createNotification) | **POST** /notifications | Create notification |
| [**createSegment**](DefaultApi.md#createSegment) | **POST** /apps/{app_id}/segments | Create Segment |
| [**createSubscription**](DefaultApi.md#createSubscription) | **POST** /apps/{app_id}/users/by/{alias_label}/{alias_id}/subscriptions |  |
| [**createUser**](DefaultApi.md#createUser) | **POST** /apps/{app_id}/users |  |
| [**deleteAlias**](DefaultApi.md#deleteAlias) | **DELETE** /apps/{app_id}/users/by/{alias_label}/{alias_id}/identity/{alias_label_to_delete} |  |
| [**deleteSegment**](DefaultApi.md#deleteSegment) | **DELETE** /apps/{app_id}/segments/{segment_id} | Delete Segment |
| [**deleteSubscription**](DefaultApi.md#deleteSubscription) | **DELETE** /apps/{app_id}/subscriptions/{subscription_id} |  |
| [**deleteUser**](DefaultApi.md#deleteUser) | **DELETE** /apps/{app_id}/users/by/{alias_label}/{alias_id} |  |
| [**exportEvents**](DefaultApi.md#exportEvents) | **POST** /notifications/{notification_id}/export_events?app_id&#x3D;{app_id} | Export CSV of Events |
| [**exportSubscriptions**](DefaultApi.md#exportSubscriptions) | **POST** /players/csv_export?app_id&#x3D;{app_id} | Export CSV of Subscriptions |
| [**getAliases**](DefaultApi.md#getAliases) | **GET** /apps/{app_id}/users/by/{alias_label}/{alias_id}/identity |  |
| [**getAliasesBySubscription**](DefaultApi.md#getAliasesBySubscription) | **GET** /apps/{app_id}/subscriptions/{subscription_id}/user/identity |  |
| [**getApp**](DefaultApi.md#getApp) | **GET** /apps/{app_id} | View an app |
| [**getApps**](DefaultApi.md#getApps) | **GET** /apps | View apps |
| [**getNotification**](DefaultApi.md#getNotification) | **GET** /notifications/{notification_id} | View notification |
| [**getNotificationHistory**](DefaultApi.md#getNotificationHistory) | **POST** /notifications/{notification_id}/history | Notification History |
| [**getNotifications**](DefaultApi.md#getNotifications) | **GET** /notifications | View notifications |
| [**getOutcomes**](DefaultApi.md#getOutcomes) | **GET** /apps/{app_id}/outcomes | View Outcomes |
| [**getSegments**](DefaultApi.md#getSegments) | **GET** /apps/{app_id}/segments | Get Segments |
| [**getUser**](DefaultApi.md#getUser) | **GET** /apps/{app_id}/users/by/{alias_label}/{alias_id} |  |
| [**transferSubscription**](DefaultApi.md#transferSubscription) | **PATCH** /apps/{app_id}/subscriptions/{subscription_id}/owner |  |
| [**unsubscribeEmailWithToken**](DefaultApi.md#unsubscribeEmailWithToken) | **POST** /apps/{app_id}/notifications/{notification_id}/unsubscribe | Unsubscribe with token |
| [**updateApp**](DefaultApi.md#updateApp) | **PUT** /apps/{app_id} | Update an app |
| [**updateLiveActivity**](DefaultApi.md#updateLiveActivity) | **POST** /apps/{app_id}/live_activities/{activity_id}/notifications | Update a Live Activity via Push |
| [**updateSubscription**](DefaultApi.md#updateSubscription) | **PATCH** /apps/{app_id}/subscriptions/{subscription_id} |  |
| [**updateUser**](DefaultApi.md#updateUser) | **PATCH** /apps/{app_id}/users/by/{alias_label}/{alias_id} |  |


<a name="cancelNotification"></a>
# **cancelNotification**
> GenericSuccessBoolResponse cancelNotification(appId, notificationId)

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String notificationId = "notificationId_example"; // String | 
    try {
      GenericSuccessBoolResponse result = apiInstance.cancelNotification(appId, notificationId);
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

[**GenericSuccessBoolResponse**](GenericSuccessBoolResponse.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="createAlias"></a>
# **createAlias**
> UserIdentityBody createAlias(appId, aliasLabel, aliasId, userIdentityBody)



Upserts one or more Aliases to an existing User identified by (:alias_label, :alias_id).

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String aliasLabel = "aliasLabel_example"; // String | 
    String aliasId = "aliasId_example"; // String | 
    UserIdentityBody userIdentityBody = new UserIdentityBody(); // UserIdentityBody | 
    try {
      UserIdentityBody result = apiInstance.createAlias(appId, aliasLabel, aliasId, userIdentityBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createAlias");
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
| **aliasLabel** | **String**|  | |
| **aliasId** | **String**|  | |
| **userIdentityBody** | [**UserIdentityBody**](UserIdentityBody.md)|  | |

### Return type

[**UserIdentityBody**](UserIdentityBody.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="createAliasBySubscription"></a>
# **createAliasBySubscription**
> UserIdentityBody createAliasBySubscription(appId, subscriptionId, userIdentityBody)



Upserts one or more Aliases for the User identified by :subscription_id.

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String subscriptionId = "subscriptionId_example"; // String | 
    UserIdentityBody userIdentityBody = new UserIdentityBody(); // UserIdentityBody | 
    try {
      UserIdentityBody result = apiInstance.createAliasBySubscription(appId, subscriptionId, userIdentityBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createAliasBySubscription");
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
| **subscriptionId** | **String**|  | |
| **userIdentityBody** | [**UserIdentityBody**](UserIdentityBody.md)|  | |

### Return type

[**UserIdentityBody**](UserIdentityBody.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **429** | Rate Limit Exceeded |  -  |

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: user_auth_key
    HttpBearerAuth user_auth_key = (HttpBearerAuth) defaultClient.getAuthentication("user_auth_key");
    user_auth_key.setBearerToken("BEARER TOKEN");

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

[user_auth_key](../README.md#user_auth_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Rate Limit Exceeded |  -  |

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

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

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK, invalid_aliases, or No Subscribed Players If a message was successfully created, you will get a 200 response and an id for the notification. If the 200 response contains \&quot;invalid_aliases\&quot; this will mark devices that exist in the provided app_id but are no longer subscribed. If no id is returned, then a message was not created and the targeted User IDs do not exist under the provided app_id. Any User IDs sent in the request that do not exist under the specified app_id will be ignored.  |  -  |
| **400** | Bad Request |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="createSegment"></a>
# **createSegment**
> CreateSegmentSuccessResponse createSegment(appId, segment)

Create Segment

Create a segment visible and usable in the dashboard and API - Required: OneSignal Paid Plan The Create Segment method is used when you want your server to programmatically create a segment instead of using the OneSignal Dashboard UI. Just like creating Segments from the dashboard you can pass in filters with multiple \&quot;AND\&quot; or \&quot;OR\&quot; operator&#39;s. &amp;#x1F6A7; Does Not Update Segments This endpoint will only create segments, it does not edit or update currently created Segments. You will need to use the Delete Segment endpoint and re-create it with this endpoint to edit. 

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The OneSignal App ID for your app.  Available in Keys & IDs.
    Segment segment = new Segment(); // Segment | 
    try {
      CreateSegmentSuccessResponse result = apiInstance.createSegment(appId, segment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createSegment");
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

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="createSubscription"></a>
# **createSubscription**
> SubscriptionBody createSubscription(appId, aliasLabel, aliasId, subscriptionBody)



Creates a new Subscription under the User provided. Useful to add email addresses and SMS numbers to the User.

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String aliasLabel = "aliasLabel_example"; // String | 
    String aliasId = "aliasId_example"; // String | 
    SubscriptionBody subscriptionBody = new SubscriptionBody(); // SubscriptionBody | 
    try {
      SubscriptionBody result = apiInstance.createSubscription(appId, aliasLabel, aliasId, subscriptionBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createSubscription");
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
| **aliasLabel** | **String**|  | |
| **aliasId** | **String**|  | |
| **subscriptionBody** | [**SubscriptionBody**](SubscriptionBody.md)|  | |

### Return type

[**SubscriptionBody**](SubscriptionBody.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | CREATED |  -  |
| **202** | ACCEPTED |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **409** | Operation is not permitted due to user having the maximum number of subscriptions assigned |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="createUser"></a>
# **createUser**
> User createUser(appId, user)



Creates a User, optionally Subscriptions owned by the User as well as Aliases. Aliases provided in the payload will be used to look up an existing User.

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    User user = new User(); // User | 
    try {
      User result = apiInstance.createUser(appId, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createUser");
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
| **user** | [**User**](User.md)|  | |

### Return type

[**User**](User.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CREATED |  -  |
| **201** | CREATED |  -  |
| **202** | ACCEPTED |  -  |
| **400** | Bad Request |  -  |
| **409** | Multiple User Identity Conflict |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="deleteAlias"></a>
# **deleteAlias**
> UserIdentityBody deleteAlias(appId, aliasLabel, aliasId, aliasLabelToDelete)



Deletes an alias by alias label

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String aliasLabel = "aliasLabel_example"; // String | 
    String aliasId = "aliasId_example"; // String | 
    String aliasLabelToDelete = "aliasLabelToDelete_example"; // String | 
    try {
      UserIdentityBody result = apiInstance.deleteAlias(appId, aliasLabel, aliasId, aliasLabelToDelete);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteAlias");
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
| **aliasLabel** | **String**|  | |
| **aliasId** | **String**|  | |
| **aliasLabelToDelete** | **String**|  | |

### Return type

[**UserIdentityBody**](UserIdentityBody.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="deleteSegment"></a>
# **deleteSegment**
> GenericSuccessBoolResponse deleteSegment(appId, segmentId)

Delete Segment

Delete a segment (not user devices) - Required: OneSignal Paid Plan You can delete a segment under your app by calling this API. You must provide an API key in the Authorization header that has admin access on the app. The segment_id can be found in the URL of the segment when viewing it in the dashboard. 

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The OneSignal App ID for your app.  Available in Keys & IDs.
    String segmentId = "segmentId_example"; // String | The segment_id can be found in the URL of the segment when viewing it in the dashboard.
    try {
      GenericSuccessBoolResponse result = apiInstance.deleteSegment(appId, segmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteSegment");
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

[**GenericSuccessBoolResponse**](GenericSuccessBoolResponse.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="deleteSubscription"></a>
# **deleteSubscription**
> deleteSubscription(appId, subscriptionId)



Deletes the Subscription.

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String subscriptionId = "subscriptionId_example"; // String | 
    try {
      apiInstance.deleteSubscription(appId, subscriptionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteSubscription");
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
| **subscriptionId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | ACCEPTED |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(appId, aliasLabel, aliasId)



Removes the User identified by (:alias_label, :alias_id), and all Subscriptions and Aliases

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String aliasLabel = "aliasLabel_example"; // String | 
    String aliasId = "aliasId_example"; // String | 
    try {
      apiInstance.deleteUser(appId, aliasLabel, aliasId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteUser");
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
| **aliasLabel** | **String**|  | |
| **aliasId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="exportEvents"></a>
# **exportEvents**
> ExportEventsSuccessResponse exportEvents(notificationId, appId)

Export CSV of Events

Generate a compressed CSV report of all of the events data for a notification. This will return a URL immediately upon success but it may take several minutes for the CSV to become available at that URL depending on the volume of data. Only one export can be in-progress per OneSignal account at any given time.

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String notificationId = "notificationId_example"; // String | The ID of the notification to export events from.
    String appId = "appId_example"; // String | The ID of the app that the notification belongs to.
    try {
      ExportEventsSuccessResponse result = apiInstance.exportEvents(notificationId, appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#exportEvents");
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
| **notificationId** | **String**| The ID of the notification to export events from. | |
| **appId** | **String**| The ID of the app that the notification belongs to. | |

### Return type

[**ExportEventsSuccessResponse**](ExportEventsSuccessResponse.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="exportSubscriptions"></a>
# **exportSubscriptions**
> ExportSubscriptionsSuccessResponse exportSubscriptions(appId, exportSubscriptionsRequestBody)

Export CSV of Subscriptions

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The app ID that you want to export devices from
    ExportSubscriptionsRequestBody exportSubscriptionsRequestBody = new ExportSubscriptionsRequestBody(); // ExportSubscriptionsRequestBody | 
    try {
      ExportSubscriptionsSuccessResponse result = apiInstance.exportSubscriptions(appId, exportSubscriptionsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#exportSubscriptions");
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
| **exportSubscriptionsRequestBody** | [**ExportSubscriptionsRequestBody**](ExportSubscriptionsRequestBody.md)|  | [optional] |

### Return type

[**ExportSubscriptionsSuccessResponse**](ExportSubscriptionsSuccessResponse.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="getAliases"></a>
# **getAliases**
> UserIdentityBody getAliases(appId, aliasLabel, aliasId)



Lists all Aliases for the User identified by (:alias_label, :alias_id).

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String aliasLabel = "aliasLabel_example"; // String | 
    String aliasId = "aliasId_example"; // String | 
    try {
      UserIdentityBody result = apiInstance.getAliases(appId, aliasLabel, aliasId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAliases");
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
| **aliasLabel** | **String**|  | |
| **aliasId** | **String**|  | |

### Return type

[**UserIdentityBody**](UserIdentityBody.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="getAliasesBySubscription"></a>
# **getAliasesBySubscription**
> UserIdentityBody getAliasesBySubscription(appId, subscriptionId)



Lists all Aliases for the User identified by :subscription_id.

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String subscriptionId = "subscriptionId_example"; // String | 
    try {
      UserIdentityBody result = apiInstance.getAliasesBySubscription(appId, subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAliasesBySubscription");
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
| **subscriptionId** | **String**|  | |

### Return type

[**UserIdentityBody**](UserIdentityBody.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: user_auth_key
    HttpBearerAuth user_auth_key = (HttpBearerAuth) defaultClient.getAuthentication("user_auth_key");
    user_auth_key.setBearerToken("BEARER TOKEN");

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

[user_auth_key](../README.md#user_auth_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Rate Limit Exceeded |  -  |

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: user_auth_key
    HttpBearerAuth user_auth_key = (HttpBearerAuth) defaultClient.getAuthentication("user_auth_key");
    user_auth_key.setBearerToken("BEARER TOKEN");

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

[user_auth_key](../README.md#user_auth_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Rate Limit Exceeded |  -  |

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

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

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="getNotificationHistory"></a>
# **getNotificationHistory**
> NotificationHistorySuccessResponse getNotificationHistory(notificationId, getNotificationHistoryRequestBody)

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String notificationId = "notificationId_example"; // String | The \"id\" of the message found in the Notification object
    GetNotificationHistoryRequestBody getNotificationHistoryRequestBody = new GetNotificationHistoryRequestBody(); // GetNotificationHistoryRequestBody | 
    try {
      NotificationHistorySuccessResponse result = apiInstance.getNotificationHistory(notificationId, getNotificationHistoryRequestBody);
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
| **getNotificationHistoryRequestBody** | [**GetNotificationHistoryRequestBody**](GetNotificationHistoryRequestBody.md)|  | |

### Return type

[**NotificationHistorySuccessResponse**](NotificationHistorySuccessResponse.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **429** | Rate Limit Exceeded |  -  |

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

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

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Rate Limit Exceeded |  -  |

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

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

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="getSegments"></a>
# **getSegments**
> GetSegmentsSuccessResponse getSegments(appId, offset, limit)

Get Segments

Returns an array of segments from an app.

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The OneSignal App ID for your app.  Available in Keys & IDs.
    Integer offset = 56; // Integer | Segments are listed in ascending order of created_at date. offset will omit that number of segments from the beginning of the list. Eg offset 5, will remove the 5 earliest created Segments.
    Integer limit = 56; // Integer | The amount of Segments in the response. Maximum 300.
    try {
      GetSegmentsSuccessResponse result = apiInstance.getSegments(appId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getSegments");
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
| **offset** | **Integer**| Segments are listed in ascending order of created_at date. offset will omit that number of segments from the beginning of the list. Eg offset 5, will remove the 5 earliest created Segments. | [optional] |
| **limit** | **Integer**| The amount of Segments in the response. Maximum 300. | [optional] |

### Return type

[**GetSegmentsSuccessResponse**](GetSegmentsSuccessResponse.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="getUser"></a>
# **getUser**
> User getUser(appId, aliasLabel, aliasId)



Returns the User’s properties, Aliases, and Subscriptions.

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String aliasLabel = "aliasLabel_example"; // String | 
    String aliasId = "aliasId_example"; // String | 
    try {
      User result = apiInstance.getUser(appId, aliasLabel, aliasId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getUser");
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
| **aliasLabel** | **String**|  | |
| **aliasId** | **String**|  | |

### Return type

[**User**](User.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="transferSubscription"></a>
# **transferSubscription**
> UserIdentityBody transferSubscription(appId, subscriptionId, transferSubscriptionRequestBody)



Transfers this Subscription to the User identified by the identity in the payload.

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String subscriptionId = "subscriptionId_example"; // String | 
    TransferSubscriptionRequestBody transferSubscriptionRequestBody = new TransferSubscriptionRequestBody(); // TransferSubscriptionRequestBody | 
    try {
      UserIdentityBody result = apiInstance.transferSubscription(appId, subscriptionId, transferSubscriptionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#transferSubscription");
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
| **subscriptionId** | **String**|  | |
| **transferSubscriptionRequestBody** | [**TransferSubscriptionRequestBody**](TransferSubscriptionRequestBody.md)|  | |

### Return type

[**UserIdentityBody**](UserIdentityBody.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="unsubscribeEmailWithToken"></a>
# **unsubscribeEmailWithToken**
> GenericSuccessBoolResponse unsubscribeEmailWithToken(appId, notificationId, token)

Unsubscribe with token

Unsubscribe an email with a token when using your own custom email unsubscribe landing page

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | The OneSignal App ID for your app.  Available in Keys & IDs.
    String notificationId = "notificationId_example"; // String | The id of the message found in the creation notification POST response, View Notifications GET response, or URL within the Message Report.
    String token = "token_example"; // String | The unsubscribe token that is generated via liquid syntax in {{subscription.unsubscribe_token}} when personalizing an email.
    try {
      GenericSuccessBoolResponse result = apiInstance.unsubscribeEmailWithToken(appId, notificationId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#unsubscribeEmailWithToken");
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
| **notificationId** | **String**| The id of the message found in the creation notification POST response, View Notifications GET response, or URL within the Message Report. | |
| **token** | **String**| The unsubscribe token that is generated via liquid syntax in {{subscription.unsubscribe_token}} when personalizing an email. | |

### Return type

[**GenericSuccessBoolResponse**](GenericSuccessBoolResponse.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Rate Limit Exceeded |  -  |

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: user_auth_key
    HttpBearerAuth user_auth_key = (HttpBearerAuth) defaultClient.getAuthentication("user_auth_key");
    user_auth_key.setBearerToken("BEARER TOKEN");

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

[user_auth_key](../README.md#user_auth_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Rate Limit Exceeded |  -  |

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

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

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="updateSubscription"></a>
# **updateSubscription**
> updateSubscription(appId, subscriptionId, subscriptionBody)



Updates an existing Subscription’s properties.

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String subscriptionId = "subscriptionId_example"; // String | 
    SubscriptionBody subscriptionBody = new SubscriptionBody(); // SubscriptionBody | 
    try {
      apiInstance.updateSubscription(appId, subscriptionId, subscriptionBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateSubscription");
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
| **subscriptionId** | **String**|  | |
| **subscriptionBody** | [**SubscriptionBody**](SubscriptionBody.md)|  | |

### Return type

null (empty response body)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **429** | Rate Limit Exceeded |  -  |

<a name="updateUser"></a>
# **updateUser**
> PropertiesBody updateUser(appId, aliasLabel, aliasId, updateUserRequest)



Updates an existing User’s properties.

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
    defaultClient.setBasePath("https://api.onesignal.com");
    
    // Configure HTTP bearer authorization: rest_api_key
    HttpBearerAuth rest_api_key = (HttpBearerAuth) defaultClient.getAuthentication("rest_api_key");
    rest_api_key.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String appId = "appId_example"; // String | 
    String aliasLabel = "aliasLabel_example"; // String | 
    String aliasId = "aliasId_example"; // String | 
    UpdateUserRequest updateUserRequest = new UpdateUserRequest(); // UpdateUserRequest | 
    try {
      PropertiesBody result = apiInstance.updateUser(appId, aliasLabel, aliasId, updateUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateUser");
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
| **aliasLabel** | **String**|  | |
| **aliasId** | **String**|  | |
| **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)|  | |

### Return type

[**PropertiesBody**](PropertiesBody.md)

### Authorization

[rest_api_key](../README.md#rest_api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | ACCEPTED |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |
| **429** | Rate Limit Exceeded |  -  |

