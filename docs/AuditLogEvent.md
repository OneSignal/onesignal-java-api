

# AuditLogEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | The action that was performed (e.g. notification.sent, segment.created, member.invited). |  [optional] |
|**actor** | [**AuditLogActor**](AuditLogActor.md) |  |  [optional] |
|**appId** | **String** | UUID of the app the event is associated with. Absent for org-level events. |  [optional] |
|**context** | [**AuditLogContext**](AuditLogContext.md) |  |  [optional] |
|**id** | **String** | UUID of the audit log event. |  [optional] |
|**metadata** | **Object** | Additional event-specific data that does not fit into the standard fields. |  [optional] |
|**occurredAt** | **String** | RFC 3339 timestamp of when the event occurred (e.g. 2026-02-18T12:34:56Z). |  [optional] |
|**organizationId** | **String** | UUID of the organization the event belongs to. |  [optional] |
|**targets** | [**List&lt;AuditLogTarget&gt;**](AuditLogTarget.md) | The resources the action was performed on. May be empty for org-level events. |  [optional] |
|**version** | **Integer** | Schema version of the event payload. |  [optional] |



