

# JourneyNode

A journey node. The kind field selects which other fields apply. Branching nodes (split_range, yes_no, wait_until) nest their sub-graphs inline via branches[].nodes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Server-assigned node UUID. Returned on reads. Required on update to keep an existing node. Rejected on create with a 400 validation error. |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | Node kind. Selects which other fields apply. |  |
|**clientNodeId** | **String** | Optional client-assigned identifier, unique within the journey. Use it to reference this node from elsewhere in the same request. Persisted and returned on reads. |  [optional] |
|**annotation** | **String** | Optional free-text label, up to 255 characters. Stored and returned as-is with no effect on journey behavior. |  [optional] |
|**durationSeconds** | **Integer** | wait nodes: seconds to hold the user. Minimum 60, maximum 31556952 (1 year). |  [optional] |
|**relativeTo** | [**RelativeToEnum**](#RelativeToEnum) | time_window nodes: schedule_in_timezone uses the configured windows; last_active_time holds relative to the user&#39;s last active time. |  [optional] |
|**windows** | [**List&lt;JourneyTimeWindow&gt;**](JourneyTimeWindow.md) | time_window nodes: one or more time windows. A window with no day_of_week applies to every day. Required when relative_to is schedule_in_timezone; omit when it is last_active_time. |  [optional] |
|**timeZone** | **String** | time_window nodes: IANA timezone identifier used when the user&#39;s timezone is unavailable. |  [optional] |
|**useUserTimeZone** | **Boolean** | time_window nodes: when true, uses the user&#39;s timezone if available. |  [optional] |
|**templateId** | **String** | send_push, send_email, and send_sms nodes: UUID of the template to send. |  [optional] |
|**iamId** | **String** | send_iam nodes: UUID of the in-app message to send. |  [optional] |
|**userTtlSeconds** | **Integer** | send_iam nodes: optional time-to-live for the in-app message, in seconds. |  [optional] |
|**webhookId** | **String** | send_webhook nodes: UUID of the webhook to send. |  [optional] |
|**assignments** | **Map&lt;String, String&gt;** | tag nodes: tag key-value pairs to assign. An empty string value removes the tag. Keys are limited to 255 characters and values to 1024. |  [optional] |
|**randomizeOnEntry** | **Boolean** | split_range nodes: when true, assigns each user to a branch at random on entry. Defaults to false. |  [optional] |
|**branches** | [**List&lt;JourneyBranch&gt;**](JourneyBranch.md) | Branching nodes: nested branches. split_range requires 2-20 weighted branches that sum to 100. yes_no requires exactly 2 branches. wait_until requires 1-10 condition branches. |  [optional] |
|**expiration** | [**JourneyWaitUntilExpiration**](JourneyWaitUntilExpiration.md) |  |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| WAIT | &quot;wait&quot; |
| TIME_WINDOW | &quot;time_window&quot; |
| SEND_PUSH | &quot;send_push&quot; |
| SEND_EMAIL | &quot;send_email&quot; |
| SEND_SMS | &quot;send_sms&quot; |
| SEND_IAM | &quot;send_iam&quot; |
| SEND_WEBHOOK | &quot;send_webhook&quot; |
| TAG | &quot;tag&quot; |
| SPLIT_RANGE | &quot;split_range&quot; |
| YES_NO | &quot;yes_no&quot; |
| WAIT_UNTIL | &quot;wait_until&quot; |



## Enum: RelativeToEnum

| Name | Value |
|---- | -----|
| SCHEDULE_IN_TIMEZONE | &quot;schedule_in_timezone&quot; |
| LAST_ACTIVE_TIME | &quot;last_active_time&quot; |



