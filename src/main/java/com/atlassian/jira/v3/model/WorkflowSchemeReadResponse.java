/**
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 * <p>
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT-8b1a1ff5508af1eb786f141e37a6e5e53cbc3737
 * Contact: ecosystem@atlassian.com
 * <p>
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.atlassian.jira.v3.model;

import java.util.ArrayList;
import java.util.List;


public class WorkflowSchemeReadResponse {


	private WorkflowMetadataRestModel defaultWorkflow;

	/**
	 * The description of the workflow scheme.
	 **/

	private String description;

	/**
	 * The ID of the workflow scheme.
	 **/

	private String id;

	/**
	 * The name of the workflow scheme.
	 **/

	private String name;

	/**
	 * The IDs of projects using the workflow scheme.
	 **/

	private List<String> projectIdsUsingScheme = new ArrayList<>();


	private WorkflowScope scope;

	/**
	 * Indicates if there's an [asynchronous task](#async-operations) for this workflow scheme.
	 **/

	private String taskId;


	private DocumentVersion version;

	/**
	 * Mappings from workflows to issue types.
	 **/

	private List<WorkflowMetadataAndIssueTypeRestModel> workflowsForIssueTypes = new ArrayList<>();

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private static String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	/**
	 * Get defaultWorkflow
	 * @return defaultWorkflow
	 **/
	public WorkflowMetadataRestModel getDefaultWorkflow() {
		return defaultWorkflow;
	}

	/**
	 * Set defaultWorkflow
	 **/
	public void setDefaultWorkflow(WorkflowMetadataRestModel defaultWorkflow) {
		this.defaultWorkflow = defaultWorkflow;
	}

	public WorkflowSchemeReadResponse defaultWorkflow(WorkflowMetadataRestModel defaultWorkflow) {
		this.defaultWorkflow = defaultWorkflow;
		return this;
	}

	/**
	 * The description of the workflow scheme.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * Set description
	 **/
	public void setDescription(String description) {
		this.description = description;
	}

	public WorkflowSchemeReadResponse description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The ID of the workflow scheme.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * Set id
	 **/
	public void setId(String id) {
		this.id = id;
	}

	public WorkflowSchemeReadResponse id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The name of the workflow scheme.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * Set name
	 **/
	public void setName(String name) {
		this.name = name;
	}

	public WorkflowSchemeReadResponse name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The IDs of projects using the workflow scheme.
	 * @return projectIdsUsingScheme
	 **/
	public List<String> getProjectIdsUsingScheme() {
		return projectIdsUsingScheme;
	}

	/**
	 * Set projectIdsUsingScheme
	 **/
	public void setProjectIdsUsingScheme(List<String> projectIdsUsingScheme) {
		this.projectIdsUsingScheme = projectIdsUsingScheme;
	}

	public WorkflowSchemeReadResponse projectIdsUsingScheme(List<String> projectIdsUsingScheme) {
		this.projectIdsUsingScheme = projectIdsUsingScheme;
		return this;
	}

	public WorkflowSchemeReadResponse addProjectIdsUsingSchemeItem(String projectIdsUsingSchemeItem) {
		if (this.projectIdsUsingScheme == null) {
			this.projectIdsUsingScheme = new ArrayList<>();
		}
		this.projectIdsUsingScheme.add(projectIdsUsingSchemeItem);
		return this;
	}

	/**
	 * Get scope
	 * @return scope
	 **/
	public WorkflowScope getScope() {
		return scope;
	}

	/**
	 * Set scope
	 **/
	public void setScope(WorkflowScope scope) {
		this.scope = scope;
	}

	public WorkflowSchemeReadResponse scope(WorkflowScope scope) {
		this.scope = scope;
		return this;
	}

	/**
	 * Indicates if there&#39;s an [asynchronous task](#async-operations) for this workflow scheme.
	 * @return taskId
	 **/
	public String getTaskId() {
		return taskId;
	}

	/**
	 * Set taskId
	 **/
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public WorkflowSchemeReadResponse taskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	/**
	 * Get version
	 * @return version
	 **/
	public DocumentVersion getVersion() {
		return version;
	}

	/**
	 * Set version
	 **/
	public void setVersion(DocumentVersion version) {
		this.version = version;
	}

	public WorkflowSchemeReadResponse version(DocumentVersion version) {
		this.version = version;
		return this;
	}

	/**
	 * Mappings from workflows to issue types.
	 * @return workflowsForIssueTypes
	 **/
	public List<WorkflowMetadataAndIssueTypeRestModel> getWorkflowsForIssueTypes() {
		return workflowsForIssueTypes;
	}

	/**
	 * Set workflowsForIssueTypes
	 **/
	public void setWorkflowsForIssueTypes(List<WorkflowMetadataAndIssueTypeRestModel> workflowsForIssueTypes) {
		this.workflowsForIssueTypes = workflowsForIssueTypes;
	}

	public WorkflowSchemeReadResponse workflowsForIssueTypes(List<WorkflowMetadataAndIssueTypeRestModel> workflowsForIssueTypes) {
		this.workflowsForIssueTypes = workflowsForIssueTypes;
		return this;
	}

	public WorkflowSchemeReadResponse addWorkflowsForIssueTypesItem(WorkflowMetadataAndIssueTypeRestModel workflowsForIssueTypesItem) {
		if (this.workflowsForIssueTypes == null) {
			this.workflowsForIssueTypes = new ArrayList<>();
		}
		this.workflowsForIssueTypes.add(workflowsForIssueTypesItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowSchemeReadResponse {\n" +
			"    defaultWorkflow: " + toIndentedString(defaultWorkflow) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    projectIdsUsingScheme: " + toIndentedString(projectIdsUsingScheme) + "\n" +
			"    scope: " + toIndentedString(scope) + "\n" +
			"    taskId: " + toIndentedString(taskId) + "\n" +
			"    version: " + toIndentedString(version) + "\n" +
			"    workflowsForIssueTypes: " + toIndentedString(workflowsForIssueTypes) + "\n" +
			"}";
		return sb;
	}
}
