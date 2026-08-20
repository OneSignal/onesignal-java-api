

# JourneyMessageStats

Delivery stats for a message-sending node. Present only on send_push, send_email, send_sms, send_iam, and send_webhook nodes. The keys inside totals depend on the node's channel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totals** | **Map&lt;String, BigDecimal&gt;** | All-time totals for this node, keyed by channel-specific stat name. |  [optional] |



