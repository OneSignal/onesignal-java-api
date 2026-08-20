

# JourneyListItem

Summary journey representation returned by the list endpoint. Excludes description, nodes, early-exit configuration, and concurrency_key.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Journey UUID. Read-only. |  [optional] |
|**appId** | **String** | UUID of the app the journey belongs to. Read-only. |  [optional] |
|**name** | **String** | Journey name, up to 300 characters. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Journey state. New journeys are created as draft. processing is transient while activation is in progress. archived is a journey that has been stopped. Change it through the state field on Update journey. |  [optional] |
|**createdAt** | **String** | ISO 8601 creation time. Read-only. |  [optional] |
|**updatedAt** | **String** | ISO 8601 last-update time. Read-only. |  [optional] |
|**startedAt** | **String** | ISO 8601 time the journey was activated, or null. Read-only. |  [optional] |
|**archivedAt** | **String** | ISO 8601 time the journey was archived, or null. Read-only. |  [optional] |
|**createdSource** | **String** | Origin of the journey, for example public_api or dashboard. Read-only. |  [optional] |
|**schedule** | [**JourneySchedule**](JourneySchedule.md) |  |  [optional] |
|**audience** | [**JourneyListAudience**](JourneyListAudience.md) |  |  [optional] |
|**reentryRules** | [**JourneyReentryRules**](JourneyReentryRules.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| PROCESSING | &quot;processing&quot; |
| ACTIVE | &quot;active&quot; |
| ARCHIVED | &quot;archived&quot; |



