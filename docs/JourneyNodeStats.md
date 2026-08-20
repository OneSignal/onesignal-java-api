

# JourneyNodeStats

Stats for a single node. Keyed in the response by the node's server-assigned id.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kind** | [**KindEnum**](#KindEnum) | Node kind, repeated here so stats can be read without joining against the journey definition. |  [optional] |
|**waiting** | **Integer** | Users currently held at this node. |  [optional] |
|**completed** | **Integer** | Users who advanced past this node normally. |  [optional] |
|**exitedEarly** | **Integer** | Users who left the journey from this node through an early exit rule. |  [optional] |
|**messageStats** | [**JourneyMessageStats**](JourneyMessageStats.md) |  |  [optional] |



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



