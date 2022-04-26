

# FilterNotificationTarget


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastSession** | **String** | relation &#x3D; \&quot;&gt;\&quot; or \&quot;&lt;\&quot; hours_ago &#x3D; number of hours before or after the users last session. Example: \&quot;1.1\&quot;  |  [optional] |
|**firstSession** | **String** | relation &#x3D; \&quot;&gt;\&quot; or \&quot;&lt;\&quot; hours_ago &#x3D; number of hours before or after the users first session. Example: \&quot;1.1\&quot;  |  [optional] |
|**sessionCount** | **String** | relation &#x3D; \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;&#x3D;\&quot; or \&quot;!&#x3D;\&quot; value &#x3D; number sessions. Example: \&quot;1\&quot;  |  [optional] |
|**sessionTime** | **String** | relation &#x3D; \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;&#x3D;\&quot; or \&quot;!&#x3D;\&quot; value &#x3D; Time in seconds the user has been in your app. Example: \&quot;3600\&quot;  |  [optional] |
|**amountSpent** | **String** | relation &#x3D; \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, or \&quot;&#x3D;\&quot; value &#x3D; Amount in USD a user has spent on IAP (In App Purchases). Example: \&quot;0.99\&quot;  |  [optional] |
|**boughtSku** | **String** | relation &#x3D; \&quot;&gt;\&quot;, \&quot;&lt;\&quot; or \&quot;&#x3D;\&quot; key &#x3D; SKU purchased in your app as an IAP (In App Purchases). Example: \&quot;com.domain.100coinpack\&quot; value &#x3D; value of SKU to compare to. Example: \&quot;0.99\&quot;  |  [optional] |
|**tag** | **String** | relation &#x3D; \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;exists\&quot;, \&quot;not_exists\&quot;, \&quot;time_elapsed_gt\&quot; (paid plan only) or \&quot;time_elapsed_lt\&quot; (paid plan only) See Time Operators key &#x3D; Tag key to compare. value &#x3D; Tag value to compare. Not required for \&quot;exists\&quot; or \&quot;not_exists\&quot;. Example: See Formatting Filters  |  [optional] |
|**language** | **String** | relation &#x3D; \&quot;&#x3D;\&quot; or \&quot;!&#x3D;\&quot; value &#x3D; 2 character language code. Example: \&quot;en\&quot;. For a list of all language codes see Language &amp; Localization.  |  [optional] |
|**appVersion** | **String** | relation &#x3D; \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;&#x3D;\&quot; or \&quot;!&#x3D;\&quot; value &#x3D; app version. Example: \&quot;1.0.0\&quot;  |  [optional] |
|**location** | **String** | radius &#x3D; in meters lat &#x3D; latitude long &#x3D; longitude  |  [optional] |
|**email** | **String** | value &#x3D; email address Only for sending Push Notifications Use this for targeting push subscribers associated with an email set with all SDK setEmail methods To send emails to specific email addresses use include_email_tokens parameter  |  [optional] |
|**country** | **String** | relation &#x3D; \&quot;&#x3D;\&quot; value &#x3D; 2-digit Country code Example: \&quot;field\&quot;: \&quot;country\&quot;, \&quot;relation\&quot;: \&quot;&#x3D;\&quot;, \&quot;value\&quot;, \&quot;US\&quot;  |  [optional] |



