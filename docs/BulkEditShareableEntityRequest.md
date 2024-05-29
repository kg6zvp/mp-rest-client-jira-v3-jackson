

# BulkEditShareableEntityRequest

Details of a request to bulk edit shareable entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Allowed action for bulk edit shareable entity |  |
|**changeOwnerDetails** | [**BulkChangeOwnerDetails**](BulkChangeOwnerDetails.md) |  |  [optional] |
|**entityIds** | **Set&lt;Long&gt;** | The id list of shareable entities to be changed. |  |
|**extendAdminPermissions** | **Boolean** | Whether the actions are executed by users with Administer Jira global permission. |  [optional] |
|**permissionDetails** | [**PermissionDetails**](PermissionDetails.md) |  |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| CHANGEOWNER | &quot;changeOwner&quot; |
| CHANGEPERMISSION | &quot;changePermission&quot; |
| ADDPERMISSION | &quot;addPermission&quot; |
| REMOVEPERMISSION | &quot;removePermission&quot; |



