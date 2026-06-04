

# UpdateLiveActivityRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | An internal name to assist with your campaign organization. This does not get displayed in the message itself. |  |
|**event** | [**EventEnum**](#EventEnum) |  |  |
|**eventUpdates** | **Object** | This must match the ContentState interface you have defined within your Live Activity in your app. |  |
|**contents** | [**LanguageStringMap**](LanguageStringMap.md) |  |  [optional] |
|**headings** | [**LanguageStringMap**](LanguageStringMap.md) |  |  [optional] |
|**sound** | **String** | Sound file that is included in your app to play instead of the default device notification sound. Omit to disable vibration and sound for the notification. |  [optional] |
|**staleDate** | **Integer** | Accepts Unix timestamp in seconds. When time reaches the configured stale date, the system considers the Live Activity out of date, and the ActivityState of the Live Activity changes to ActivityState.stale. |  [optional] |
|**dismissalDate** | **Integer** | Accepts Unix timestamp in seconds; only allowed if event is \&quot;end\&quot; |  [optional] |
|**priority** | **Integer** | Delivery priority through the the push provider (APNs). Pass 10 for higher priority notifications, or 5 for lower priority notifications. Lower priority notifications are sent based on the power considerations of the end user&#39;s device. If not set, defaults to 10. Some providers (APNs) allow for a limited budget of high priority notifications per hour, and if that budget is exceeded, the provider may throttle notification delivery. |  [optional] |



## Enum: EventEnum

| Name | Value |
|---- | -----|
| UPDATE | &quot;update&quot; |
| END | &quot;end&quot; |



