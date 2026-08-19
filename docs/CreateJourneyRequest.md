

# CreateJourneyRequest

Writable fields for Create journey. Journeys are always created in the draft state. Server-controlled fields such as state or id are rejected.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Journey name, up to 300 characters. |  |
|**description** | **String** | Optional journey description, up to 1024 characters. |  [optional] |
|**audience** | [**JourneyAudience**](JourneyAudience.md) |  |  [optional] |
|**earlyExit** | [**JourneyEarlyExit**](JourneyEarlyExit.md) |  |  [optional] |
|**reentryRules** | [**JourneyReentryRules**](JourneyReentryRules.md) |  |  [optional] |
|**schedule** | [**JourneySchedule**](JourneySchedule.md) |  |  [optional] |
|**nodes** | [**List&lt;JourneyNode&gt;**](JourneyNode.md) | Ordered list of journey nodes. Server-assigned id fields are rejected on create. |  [optional] |



