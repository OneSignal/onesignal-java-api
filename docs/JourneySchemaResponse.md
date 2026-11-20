

# JourneySchemaResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) | The requested operation. |  |
|**document** | [**DocumentEnum**](#DocumentEnum) | The document that the schema describes. For update_node, merged_node is the complete node after applying the patch. |  |
|**schema** | **Map&lt;String, Object&gt;** | A self-contained JSON Schema Draft 6 document with local $defs references. |  |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;create&quot; |
| DUPLICATE | &quot;duplicate&quot; |
| UPDATE | &quot;update&quot; |
| UPDATE_NODE | &quot;update_node&quot; |



## Enum: DocumentEnum

| Name | Value |
|---- | -----|
| BODY | &quot;body&quot; |
| OVERRIDES | &quot;overrides&quot; |
| PATCH | &quot;patch&quot; |
| MERGED_NODE | &quot;merged_node&quot; |



