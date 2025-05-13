

# ExportSubscriptionsRequestBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extraFields** | **List&lt;String&gt;** | Additional fields that you wish to include. Currently supports location, country, rooted, notification_types, ip, external_user_id, web_auth, and web_p256. |  [optional] |
|**lastActiveSince** | **String** | Export all devices with a last_active timestamp greater than this time.  Unixtime in seconds. |  [optional] |
|**segmentName** | **String** | Export all devices belonging to the segment. |  [optional] |



