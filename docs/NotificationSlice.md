

# NotificationSlice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalCount** | **Integer** |  |  [optional] |
|**offset** | **Integer** |  |  [optional] |
|**limit** | **Integer** |  |  [optional] |
|**timeOffset** | **String** | The time_offset cursor specified in the request, if any. |  [optional] |
|**nextTimeOffset** | **String** | An opaque Base64 cursor token representing the next page of messages to fetch.  Present when time_offset was provided in the request.  Pass this value as time_offset on the next request to continue paginating. |  [optional] |
|**notifications** | [**List&lt;NotificationWithMeta&gt;**](NotificationWithMeta.md) |  |  [optional] |



