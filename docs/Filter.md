

# Filter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** | Required. Name of the field to use as the first operand in the filter expression. |  [optional] |
|**key** | **String** | If &#x60;field&#x60; is &#x60;tag&#x60;, this field is *required* to specify &#x60;key&#x60; inside the tags. |  [optional] |
|**value** | **String** | Constant value to use as the second operand in the filter expression. This value is *required* when the relation operator is a binary operator. |  [optional] |
|**hoursAgo** | **String** | If &#x60;field&#x60; is session-related, this is *required* to specify the number of hours before or after the user&#39;s session. |  [optional] |
|**radius** | **BigDecimal** | If &#x60;field&#x60; is &#x60;location&#x60;, this will specify the radius in meters from a provided location point. Use with &#x60;lat&#x60; and &#x60;long&#x60;. |  [optional] |
|**lat** | **BigDecimal** | If &#x60;field&#x60; is &#x60;location&#x60;, this is *required* to specify the user&#39;s latitude. |  [optional] |
|**_long** | **BigDecimal** | If &#x60;field&#x60; is &#x60;location&#x60;, this is *required* to specify the user&#39;s longitude. |  [optional] |
|**relation** | [**RelationEnum**](#RelationEnum) | Required. Operator of a filter expression. |  [optional] |



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



