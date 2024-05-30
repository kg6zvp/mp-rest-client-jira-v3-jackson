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

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Details of a workflow.
 **/

public class JiraWorkflow {

	/**
	 * The description of the workflow.
	 **/

	private String description;

	/**
	 * The ID of the workflow.
	 **/

	private String id;

	/**
	 * Indicates if the workflow can be edited.
	 **/

	private Boolean isEditable;

	/**
	 * The name of the workflow.
	 **/

	private String name;


	private WorkflowScope scope;


	private WorkflowLayout startPointLayout;

	/**
	 * The statuses referenced in this workflow.
	 **/

	private Set<WorkflowReferenceStatus> statuses = null;

	/**
	 * If there is a current [asynchronous task](#async-operations) operation for this workflow.
	 **/

	private String taskId;

	/**
	 * The transitions of the workflow.
	 **/

	private Set<WorkflowTransitions> transitions = null;

	/**
	 * Use the optional `workflows.usages` expand to get additional information about the projects and issue types associated with the requested workflows.
	 **/

	private Set<ProjectIssueTypes> usages = null;


	private DocumentVersion version;

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
	 * The description of the workflow.
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

	public JiraWorkflow description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The ID of the workflow.
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

	public JiraWorkflow id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Indicates if the workflow can be edited.
	 * @return isEditable
	 **/
	public Boolean getIsEditable() {
		return isEditable;
	}

	/**
	 * Set isEditable
	 **/
	public void setIsEditable(Boolean isEditable) {
		this.isEditable = isEditable;
	}

	public JiraWorkflow isEditable(Boolean isEditable) {
		this.isEditable = isEditable;
		return this;
	}

	/**
	 * The name of the workflow.
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

	public JiraWorkflow name(String name) {
		this.name = name;
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

	public JiraWorkflow scope(WorkflowScope scope) {
		this.scope = scope;
		return this;
	}

	/**
	 * Get startPointLayout
	 * @return startPointLayout
	 **/
	public WorkflowLayout getStartPointLayout() {
		return startPointLayout;
	}

	/**
	 * Set startPointLayout
	 **/
	public void setStartPointLayout(WorkflowLayout startPointLayout) {
		this.startPointLayout = startPointLayout;
	}

	public JiraWorkflow startPointLayout(WorkflowLayout startPointLayout) {
		this.startPointLayout = startPointLayout;
		return this;
	}

	/**
	 * The statuses referenced in this workflow.
	 * @return statuses
	 **/
	public Set<WorkflowReferenceStatus> getStatuses() {
		return statuses;
	}

	/**
	 * Set statuses
	 **/
	public void setStatuses(Set<WorkflowReferenceStatus> statuses) {
		this.statuses = statuses;
	}

	public JiraWorkflow statuses(Set<WorkflowReferenceStatus> statuses) {
		this.statuses = statuses;
		return this;
	}

	public JiraWorkflow addStatusesItem(WorkflowReferenceStatus statusesItem) {
		if (this.statuses == null) {
			this.statuses = new LinkedHashSet<>();
		}
		this.statuses.add(statusesItem);
		return this;
	}

	/**
	 * If there is a current [asynchronous task](#async-operations) operation for this workflow.
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

	public JiraWorkflow taskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	/**
	 * The transitions of the workflow.
	 * @return transitions
	 **/
	public Set<WorkflowTransitions> getTransitions() {
		return transitions;
	}

	/**
	 * Set transitions
	 **/
	public void setTransitions(Set<WorkflowTransitions> transitions) {
		this.transitions = transitions;
	}

	public JiraWorkflow transitions(Set<WorkflowTransitions> transitions) {
		this.transitions = transitions;
		return this;
	}

	public JiraWorkflow addTransitionsItem(WorkflowTransitions transitionsItem) {
		if (this.transitions == null) {
			this.transitions = new LinkedHashSet<>();
		}
		this.transitions.add(transitionsItem);
		return this;
	}

	/**
	 * Use the optional &#x60;workflows.usages&#x60; expand to get additional information about the projects and issue types associated with the requested workflows.
	 * @return usages
	 **/
	public Set<ProjectIssueTypes> getUsages() {
		return usages;
	}

	/**
	 * Set usages
	 **/
	public void setUsages(Set<ProjectIssueTypes> usages) {
		this.usages = usages;
	}

	public JiraWorkflow usages(Set<ProjectIssueTypes> usages) {
		this.usages = usages;
		return this;
	}

	public JiraWorkflow addUsagesItem(ProjectIssueTypes usagesItem) {
		if (this.usages == null) {
			this.usages = new LinkedHashSet<>();
		}
		this.usages.add(usagesItem);
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

	public JiraWorkflow version(DocumentVersion version) {
		this.version = version;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class JiraWorkflow {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    isEditable: " + toIndentedString(isEditable) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    scope: " + toIndentedString(scope) + "\n" +
			"    startPointLayout: " + toIndentedString(startPointLayout) + "\n" +
			"    statuses: " + toIndentedString(statuses) + "\n" +
			"    taskId: " + toIndentedString(taskId) + "\n" +
			"    transitions: " + toIndentedString(transitions) + "\n" +
			"    usages: " + toIndentedString(usages) + "\n" +
			"    version: " + toIndentedString(version) + "\n" +
			"}";
		return sb;
	}
}
