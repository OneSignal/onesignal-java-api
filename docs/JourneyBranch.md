

# JourneyBranch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Server-assigned branch identifier. Read-only on create; echo it on update to keep the branch. |  [optional] |
|**condition** | [**JourneyCondition**](JourneyCondition.md) |  |  [optional] |
|**weight** | **BigDecimal** | Branch weight for split_range nodes. Weights across a node&#39;s branches must sum to 100. |  [optional] |
|**nodes** | [**List&lt;JourneyNode&gt;**](JourneyNode.md) | Nodes run when this branch is taken, before flow converges to the next sibling node. |  [optional] |



