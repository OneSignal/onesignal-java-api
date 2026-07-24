

# SegmentDetails

Segment details. Only included when the include-segment-detail query parameter is set to true.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for the segment (UUID v4). |  [optional] |
|**name** | **String** | The segment name. |  [optional] |
|**description** | **String** | Human-readable description for the segment. &#x60;null&#x60; when unset. Maximum 255 characters. |  [optional] |
|**createdAt** | **Integer** | Unix timestamp when the segment was created. |  [optional] |
|**source** | [**SourceEnum**](#SourceEnum) | The source of the segment. |  [optional] |
|**filters** | [**List&lt;FilterExpression&gt;**](FilterExpression.md) | Array of filter and operator objects defining the segment criteria. Uses the same format as the Create Segment API, so filters can be directly used to recreate or update the segment. |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| CUSTOM | &quot;custom&quot; |
| QUICKSTART | &quot;quickstart&quot; |



