

# VersionIssuesStatusForFixVersion

If the expand option `issuesstatus` is used, returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**done** | **Long** | Count of issues with status *done*. |  [optional] [readonly] |
|**inProgress** | **Long** | Count of issues with status *in progress*. |  [optional] [readonly] |
|**toDo** | **Long** | Count of issues with status *to do*. |  [optional] [readonly] |
|**unmapped** | **Long** | Count of issues with a status other than *to do*, *in progress*, and *done*. |  [optional] [readonly] |



