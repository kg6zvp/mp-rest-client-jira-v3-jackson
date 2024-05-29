

# Project

Details about a project.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**archived** | **Boolean** | Whether the project is archived. |  [optional] [readonly] |
|**archivedBy** | [**ProjectArchivedBy**](ProjectArchivedBy.md) |  |  [optional] |
|**archivedDate** | **Date** | The date when the project was archived. |  [optional] [readonly] |
|**assigneeType** | [**AssigneeTypeEnum**](#AssigneeTypeEnum) | The default assignee when creating issues for this project. |  [optional] [readonly] |
|**avatarUrls** | [**ProjectAvatarUrls**](ProjectAvatarUrls.md) |  |  [optional] |
|**components** | [**List&lt;ProjectComponent&gt;**](ProjectComponent.md) | List of the components contained in the project. |  [optional] [readonly] |
|**deleted** | **Boolean** | Whether the project is marked as deleted. |  [optional] [readonly] |
|**deletedBy** | [**ProjectDeletedBy**](ProjectDeletedBy.md) |  |  [optional] |
|**deletedDate** | **Date** | The date when the project was marked as deleted. |  [optional] [readonly] |
|**description** | **String** | A brief description of the project. |  [optional] [readonly] |
|**email** | **String** | An email address associated with the project. |  [optional] |
|**expand** | **String** | Expand options that include additional project details in the response. |  [optional] [readonly] |
|**favourite** | **Boolean** | Whether the project is selected as a favorite. |  [optional] |
|**id** | **String** | The ID of the project. |  [optional] |
|**insight** | [**ProjectInsight**](ProjectInsight.md) |  |  [optional] |
|**isPrivate** | **Boolean** | Whether the project is private from the user&#39;s perspective. This means the user can&#39;t see the project or any associated issues. |  [optional] [readonly] |
|**issueTypeHierarchy** | [**ProjectIssueTypeHierarchy**](ProjectIssueTypeHierarchy.md) |  |  [optional] |
|**issueTypes** | [**List&lt;IssueTypeDetails&gt;**](IssueTypeDetails.md) | List of the issue types available in the project. |  [optional] [readonly] |
|**key** | **String** | The key of the project. |  [optional] [readonly] |
|**landingPageInfo** | [**ProjectLandingPageInfo**](ProjectLandingPageInfo.md) |  |  [optional] |
|**lead** | [**ProjectLead**](ProjectLead.md) |  |  [optional] |
|**name** | **String** | The name of the project. |  [optional] [readonly] |
|**permissions** | [**ProjectPermissions**](ProjectPermissions.md) |  |  [optional] |
|**projectCategory** | [**ProjectProjectCategory**](ProjectProjectCategory.md) |  |  [optional] |
|**projectTypeKey** | [**ProjectTypeKeyEnum**](#ProjectTypeKeyEnum) | The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project. |  [optional] [readonly] |
|**properties** | **Map&lt;String, Object&gt;** | Map of project properties |  [optional] [readonly] |
|**retentionTillDate** | **Date** | The date when the project is deleted permanently. |  [optional] [readonly] |
|**roles** | **Map&lt;String, URI&gt;** | The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post). |  [optional] [readonly] |
|**self** | **URI** | The URL of the project details. |  [optional] [readonly] |
|**simplified** | **Boolean** | Whether the project is simplified. |  [optional] [readonly] |
|**style** | [**StyleEnum**](#StyleEnum) | The type of the project. |  [optional] [readonly] |
|**url** | **String** | A link to information about this project, such as project documentation. |  [optional] [readonly] |
|**uuid** | **UUID** | Unique ID for next-gen projects. |  [optional] [readonly] |
|**versions** | [**List&lt;Version&gt;**](Version.md) | The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post). |  [optional] [readonly] |



## Enum: AssigneeTypeEnum

| Name | Value |
|---- | -----|
| PROJECT_LEAD | &quot;PROJECT_LEAD&quot; |
| UNASSIGNED | &quot;UNASSIGNED&quot; |



## Enum: ProjectTypeKeyEnum

| Name | Value |
|---- | -----|
| SOFTWARE | &quot;software&quot; |
| SERVICE_DESK | &quot;service_desk&quot; |
| BUSINESS | &quot;business&quot; |



## Enum: StyleEnum

| Name | Value |
|---- | -----|
| CLASSIC | &quot;classic&quot; |
| NEXT_GEN | &quot;next-gen&quot; |



