

# EmailWarmUpRequest

Channel: Email Required when `kind` is \"warmup\". The gradual sending schedule for the Auto Warm Up campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stages** | [**List&lt;EmailWarmUpStage&gt;**](EmailWarmUpStage.md) | Required. The ordered stages that make up the campaign&#39;s sending schedule. |  |
|**strategy** | [**StrategyEnum**](#StrategyEnum) | How the stage schedule should be treated:   * &#x60;recommended&#x60; - (Default) OneSignal may adjust the provided stages based on past delivery volumes, scheduled Auto Warm Up emails, and the size of the current audience.   * &#x60;custom&#x60; - The stages provided are sent as-is.  |  [optional] |



## Enum: StrategyEnum

| Name | Value |
|---- | -----|
| RECOMMENDED | &quot;recommended&quot; |
| CUSTOM | &quot;custom&quot; |



