

# UpdateJourneyRequest

Partial update applied with JSON Merge Patch (RFC 7396). Send only the fields you want to change. A null value clears a nullable field. Arrays such as nodes are replaced wholesale.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Journey name. |  [optional] |
|**description** | **String** | Journey description. Send null to clear it. |  [optional] |
|**audience** | [**JourneyAudience**](JourneyAudience.md) |  |  [optional] |
|**earlyExit** | [**JourneyEarlyExit**](JourneyEarlyExit.md) |  |  [optional] |
|**reentryRules** | [**JourneyReentryRules**](JourneyReentryRules.md) |  |  [optional] |
|**schedule** | [**JourneySchedule**](JourneySchedule.md) |  |  [optional] |
|**nodes** | [**List&lt;JourneyNode&gt;**](JourneyNode.md) | Full ordered list of nodes, which replaces the existing graph wholesale. Preserve each node&#39;s server-assigned id from a prior fetch to keep in-flight users on that node; omit id to add a new node. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Target state. Set active to activate a draft journey, or scheduled together with a future schedule.start_at to activate it later. Set archived to stop a running journey; archiving is permanent. Only scheduled and processing journeys can return to draft. |  [optional] |
|**concurrencyKey** | **String** | Optional optimistic-concurrency token. Pass the concurrency_key from a prior fetch to reject the update with 409 if the journey changed. Omit to skip the check. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| ACTIVE | &quot;active&quot; |
| ARCHIVED | &quot;archived&quot; |



