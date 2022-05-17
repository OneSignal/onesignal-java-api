

# NotificationWithMetaAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**remaining** | **Integer** | Number of notifications that have not been sent out yet. This can mean either our system is still processing the notification or you have delayed options set. |  [optional] |
|**successful** | **Integer** | Number of notifications that were successfully delivered. |  [optional] |
|**failed** | **Integer** | Number of notifications that could not be delivered due to those devices being unsubscribed. |  [optional] |
|**errored** | **Integer** | Number of notifications that could not be delivered due to an error. You can find more information by viewing the notification in the dashboard. |  [optional] |
|**converted** | **Integer** | Number of users who have clicked / tapped on your notification. |  [optional] |
|**queuedAt** | **Long** | Unix timestamp indicating when the notification was created. |  [optional] |
|**sendAfter** | **Long** | Unix timestamp indicating when notification delivery should begin. |  [optional] |
|**completedAt** | **Long** | Unix timestamp indicating when notification delivery completed. The delivery duration from start to finish can be calculated with completed_at - send_after. |  [optional] |
|**platformDeliveryStats** | [**PlatformDeliveryData**](PlatformDeliveryData.md) |  |  [optional] |
|**received** | **Integer** | Confirmed Deliveries number of devices that received the push notification. Paid Feature Only. Free accounts will see 0. |  [optional] |
|**throttleRatePerMinute** | **Integer** | number of push notifications sent per minute. Paid Feature Only. If throttling is not enabled for the app or the notification, and for free accounts, null is returned. Refer to Throttling for more details. |  [optional] |



