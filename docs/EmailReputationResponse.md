

# EmailReputationResponse

App-wide email bounce and spam complaint rates, broken out by time window. `last_24_hours`, `last_7_days`, and `last_30_days` each hold the bounce and complaint rates for email delivered in that window.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**last24Hours** | [**EmailReputationWindow**](EmailReputationWindow.md) |  |  [optional] |
|**last7Days** | [**EmailReputationWindow**](EmailReputationWindow.md) |  |  [optional] |
|**last30Days** | [**EmailReputationWindow**](EmailReputationWindow.md) |  |  [optional] |



