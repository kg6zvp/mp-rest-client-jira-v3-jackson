

# ServerInformation

Details about the Jira instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseUrl** | **String** | The base URL of the Jira instance. |  [optional] |
|**buildDate** | **Date** | The timestamp when the Jira version was built. |  [optional] |
|**buildNumber** | **Integer** | The build number of the Jira version. |  [optional] |
|**deploymentType** | **String** | The type of server deployment. This is always returned as *Cloud*. |  [optional] |
|**displayUrl** | **String** | The display URL of the Jira instance. |  [optional] |
|**displayUrlServicedeskHelpCenter** | **String** | The display URL of the Servicedesk Help Center. |  [optional] |
|**healthChecks** | [**List&lt;HealthCheckResult&gt;**](HealthCheckResult.md) | Jira instance health check results. Deprecated and no longer returned. |  [optional] |
|**scmInfo** | **String** | The unique identifier of the Jira version. |  [optional] |
|**serverTime** | **Date** | The time in Jira when this request was responded to. |  [optional] |
|**serverTimeZone** | [**ServerInformationServerTimeZone**](ServerInformationServerTimeZone.md) |  |  [optional] |
|**serverTitle** | **String** | The name of the Jira instance. |  [optional] |
|**version** | **String** | The version of Jira. |  [optional] |
|**versionNumbers** | **List&lt;Integer&gt;** | The major, minor, and revision version numbers of the Jira version. |  [optional] |



