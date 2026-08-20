

# Journey

Full journey representation returned by the detail, create, and update endpoints.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Journey UUID. Read-only. |  [optional] |
|**appId** | **String** | UUID of the app the journey belongs to. Read-only. |  [optional] |
|**name** | **String** | Journey name, up to 300 characters. |  [optional] |
|**description** | **String** | Journey description, up to 1024 characters. Defaults to an empty string. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Journey state. New journeys are created as draft. processing is transient while activation is in progress. archived is a journey that has been stopped. Change it through the state field on Update journey. |  [optional] |
|**createdAt** | **String** | ISO 8601 creation time. Read-only. |  [optional] |
|**updatedAt** | **String** | ISO 8601 last-update time. Read-only. |  [optional] |
|**startedAt** | **String** | ISO 8601 time the journey was activated, or null. Read-only. May stay null briefly after you set state to active: activation is enqueued, and started_at populates once the journey finishes processing. |  [optional] |
|**archivedAt** | **String** | ISO 8601 time the journey was archived, or null. Read-only. |  [optional] |
|**createdSource** | **String** | Origin of the journey, for example public_api or dashboard. Read-only. |  [optional] |
|**audience** | [**JourneyAudience**](JourneyAudience.md) |  |  [optional] |
|**earlyExit** | [**JourneyEarlyExit**](JourneyEarlyExit.md) |  |  [optional] |
|**reentryRules** | [**JourneyReentryRules**](JourneyReentryRules.md) |  |  [optional] |
|**schedule** | [**JourneySchedule**](JourneySchedule.md) |  |  [optional] |
|**nodes** | [**List&lt;JourneyNode&gt;**](JourneyNode.md) | Ordered list of journey nodes. |  [optional] |
|**concurrencyKey** | **String** | Opaque optimistic-concurrency token. Read-only. Pass it back on update to guard against overwriting a concurrent change (409). Send it back exactly as read; do not construct or parse it. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| PROCESSING | &quot;processing&quot; |
| ACTIVE | &quot;active&quot; |
| ARCHIVED | &quot;archived&quot; |



