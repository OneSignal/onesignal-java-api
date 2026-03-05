

# TemplateResource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) |  |  [optional] |
|**content** | **Map&lt;String, Object&gt;** | Rendered content and channel/platform flags for the template. |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| PUSH | &quot;push&quot; |
| EMAIL | &quot;email&quot; |
| SMS | &quot;sms&quot; |



