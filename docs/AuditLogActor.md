

# AuditLogActor

The user or service that performed the action. Absent if the actor is unknown.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | Email address of the actor. Absent if unavailable. |  [optional] |
|**id** | **String** | UUID of the actor. |  [optional] |
|**metadata** | **Object** | Additional actor-specific data. |  [optional] |
|**name** | **String** | Display name of the actor. Absent if unavailable. |  [optional] |
|**type** | **String** | Actor type (e.g. member, api_key, system). |  [optional] |



