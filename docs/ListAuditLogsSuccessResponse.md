

# ListAuditLogsSuccessResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditLogs** | [**List&lt;AuditLogEvent&gt;**](AuditLogEvent.md) | Array of audit log events, ordered by occurred_at ascending. |  [optional] |
|**hasMore** | **Boolean** | True if additional events exist beyond this page. Use next_cursor to fetch the next page. |  [optional] |
|**nextCursor** | **String** | Opaque cursor to pass as cursor in the next request. Only present when has_more is true. |  [optional] |



