

# PriorityMapping

Mapping of issue priorities for changes in priority schemes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**in** | **Map&lt;String, Long&gt;** | The mapping of priorities for issues being migrated **into** this priority scheme. Key is the old priority ID, value is the new priority ID (must exist in this priority scheme). |  [optional] |
|**out** | **Map&lt;String, Long&gt;** | The mapping of priorities for issues being migrated **out of** this priority scheme. Key is the old priority ID (must exist in this priority scheme), value is the new priority ID (must exist in the default priority scheme). Required for updating an existing priority scheme. Not used when creating a new priority scheme. |  [optional] |



