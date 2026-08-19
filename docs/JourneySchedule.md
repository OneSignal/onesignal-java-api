

# JourneySchedule

Optional future start and/or stop time. null means no scheduled activation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startAt** | **String** | ISO 8601 start time. Use UTC (Z or +00:00). Must be at least 5 minutes in the future. |  [optional] |
|**stopAt** | **String** | ISO 8601 stop time. Use UTC (Z or +00:00). Must be in the future and later than start_at. |  [optional] |
|**error** | **String** | Read-only. Present when a scheduling error occurred. |  [optional] |



