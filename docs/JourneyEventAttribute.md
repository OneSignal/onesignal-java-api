

# JourneyEventAttribute


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | Event attribute key. |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | Comparison operator. |  |
|**value** | **String** | Value to compare against. Not required for exists and not_exists. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUAL | &quot;equal&quot; |
| NOT_EQUAL | &quot;not_equal&quot; |
| LESS | &quot;less&quot; |
| LESS_OR_EQUAL | &quot;less_or_equal&quot; |
| GREATER_OR_EQUAL | &quot;greater_or_equal&quot; |
| GREATER | &quot;greater&quot; |
| IS | &quot;is&quot; |
| IS_NOT | &quot;is_not&quot; |
| EXISTS | &quot;exists&quot; |
| NOT_EXISTS | &quot;not_exists&quot; |
| BEFORE | &quot;before&quot; |
| AFTER | &quot;after&quot; |



