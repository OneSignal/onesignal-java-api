

# GetNotificationHistoryRequestBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**events** | [**EventsEnum**](#EventsEnum) | -&gt; \&quot;sent\&quot; - All the devices by player_id that were sent the specified notification_id.  Notifications targeting under 1000 recipients will not have \&quot;sent\&quot; events recorded, but will show \&quot;clicked\&quot; events. \&quot;clicked\&quot; - All the devices by &#x60;player_id&#x60; that clicked the specified notification_id. |  [optional] |
|**email** | **String** | The email address you would like the report sent. |  [optional] |
|**appId** | **String** |  |  [optional] |



## Enum: EventsEnum

| Name | Value |
|---- | -----|
| SENT | &quot;sent&quot; |
| CLICKED | &quot;clicked&quot; |



