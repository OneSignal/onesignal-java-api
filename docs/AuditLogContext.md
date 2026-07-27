

# AuditLogContext

Request context at the time of the event. Absent if context was not captured.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**country** | **String** | Country code derived from the request IP. |  [optional] |
|**ip** | **String** | IP address the request originated from. |  [optional] |
|**metadata** | **Object** | Additional context-specific data. |  [optional] |
|**userAgent** | **String** | User agent of the client that made the request. |  [optional] |



