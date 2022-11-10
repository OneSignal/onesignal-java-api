

# Filter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** | Name of the field to use as the first operand in the filter expression. |  |
|**key** | **String** | If &#x60;field&#x60; is &#x60;tag&#x60;, this field is *required* to specify &#x60;key&#x60; inside the tags. |  [optional] |
|**value** | **String** | Constant value to use as the second operand in the filter expression. This value is *required* when the relation operator is a binary operator. |  [optional] |
|**relation** | [**RelationEnum**](#RelationEnum) | Operator of a filter expression. |  |



## Enum: RelationEnum

| Name | Value |
|---- | -----|
| GREATER_THAN | &quot;&gt;&quot; |
| LESS_THAN | &quot;&lt;&quot; |
| EQUAL | &quot;&#x3D;&quot; |
| NOT_EQUAL | &quot;!&#x3D;&quot; |
| EXISTS | &quot;exists&quot; |
| NOT_EXISTS | &quot;not_exists&quot; |
| TIME_ELAPSED_GT | &quot;time_elapsed_gt&quot; |
| TIME_ELAPSED_LT | &quot;time_elapsed_lt&quot; |



