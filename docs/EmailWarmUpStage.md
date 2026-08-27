

# EmailWarmUpStage

Channel: Email One stage of an Auto Warm Up campaign's sending schedule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**start** | **OffsetDateTime** | ISO 8601 timestamp for the start of this stage. Sending for this stage will not begin before this time. |  |
|**end** | **OffsetDateTime** | ISO 8601 timestamp for the end of this stage. This stage&#39;s quota is expected to be sent by this time. |  |
|**quota** | **Integer** | Number of emails to send during this stage. |  |
|**acked** | **Boolean** | Whether this stage has been picked up and acknowledged by the warm-up scheduler. Not accepted on create. This is only present when reading back a campaign. |  [optional] [readonly] |



