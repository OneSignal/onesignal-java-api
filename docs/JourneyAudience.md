

# JourneyAudience

The journey entry audience. The kind field selects which other fields apply.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kind** | [**KindEnum**](#KindEnum) | Audience kind. Selects which other fields apply. |  |
|**includedSegmentIds** | **List&lt;String&gt;** | segment audiences: Segment UUIDs whose users enter the journey. |  [optional] |
|**excludedSegmentIds** | **List&lt;String&gt;** | segment audiences: Segment UUIDs whose users are excluded. |  [optional] |
|**futureAdditionsOnly** | **Boolean** | segment audiences: when true, only users who newly match the segment after activation enter the journey. Defaults to false. |  [optional] |
|**name** | **String** | event_trigger audiences: event name that triggers entry, up to 255 characters. |  [optional] |
|**attributes** | **List&lt;List&lt;JourneyEventAttribute&gt;&gt;** | Event attribute matchers, as a list of condition groups. Send a single group whose conditions are AND&#39;d together. More than one group is rejected. |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| SEGMENT | &quot;segment&quot; |
| EVENT_TRIGGER | &quot;event_trigger&quot; |



