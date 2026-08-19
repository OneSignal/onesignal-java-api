

# JourneyCondition

A branch condition. The kind field selects which other fields apply.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kind** | [**KindEnum**](#KindEnum) | Condition kind. Selects which other fields apply. |  |
|**includedSegmentIds** | **List&lt;String&gt;** | segment_membership conditions: Segment UUIDs the user must belong to. |  [optional] |
|**excludedSegmentIds** | **List&lt;String&gt;** | segment_membership conditions: Segment UUIDs the user must not belong to. |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | on_notification_action conditions: the notification action to branch on. Which actions apply depends on the sending node&#39;s channel. |  [optional] |
|**sendingNodeId** | **String** | on_notification_action conditions: id of the sending node this action refers to. Returned on reads; accepted on write. |  [optional] |
|**clientNodeId** | **String** | on_notification_action conditions: write-only alternative to sending_node_id. References the sending node by its client_node_id. |  [optional] |
|**name** | **String** | event_trigger conditions: event name, up to 255 characters. |  [optional] |
|**attributes** | **List&lt;List&lt;JourneyEventAttribute&gt;&gt;** | Event attribute matchers, as a list of condition groups. Send a single group whose conditions are AND&#39;d together. More than one group is rejected. |  [optional] |
|**entryEventMatchAttributes** | **List&lt;Object&gt;** | event_trigger conditions: match incoming event properties against the journey&#39;s entry event. Only valid on event-triggered journeys. |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| SEGMENT_MEMBERSHIP | &quot;segment_membership&quot; |
| ON_NOTIFICATION_ACTION | &quot;on_notification_action&quot; |
| EVENT_TRIGGER | &quot;event_trigger&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| RECEIVED | &quot;received&quot; |
| CLICKED | &quot;clicked&quot; |
| OPENED | &quot;opened&quot; |



