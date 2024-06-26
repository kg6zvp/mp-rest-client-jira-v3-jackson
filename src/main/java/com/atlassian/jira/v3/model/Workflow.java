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
import java.util.Date;
import java.util.List;

/**
 * Details about a workflow.
 **/

public class Workflow {

	/**
	 * The creation date of the workflow.
	 **/

	private Date created;

	/**
	 * The description of the workflow.
	 **/

	private String description;

	/**
	 * Whether the workflow has a draft version.
	 **/

	private Boolean hasDraftWorkflow;


	private PublishedWorkflowId id;

	/**
	 * Whether this is the default workflow.
	 **/

	private Boolean isDefault;


	private WorkflowOperations operations;

	/**
	 * The projects the workflow is assigned to, through workflow schemes.
	 **/

	private List<ProjectDetails> projects = null;

	/**
	 * The workflow schemes the workflow is assigned to.
	 **/

	private List<WorkflowSchemeIdName> schemes = null;

	/**
	 * The statuses of the workflow.
	 **/

	private List<WorkflowStatus> statuses = null;

	/**
	 * The transitions of the workflow.
	 **/

	private List<Transition> transitions = null;

	/**
	 * The last edited date of the workflow.
	 **/

	private Date updated;

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
	 * The creation date of the workflow.
	 * @return created
	 **/
	public Date getCreated() {
		return created;
	}

	/**
	 * Set created
	 **/
	public void setCreated(Date created) {
		this.created = created;
	}

	public Workflow created(Date created) {
		this.created = created;
		return this;
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

	public Workflow description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Whether the workflow has a draft version.
	 * @return hasDraftWorkflow
	 **/
	public Boolean getHasDraftWorkflow() {
		return hasDraftWorkflow;
	}

	/**
	 * Set hasDraftWorkflow
	 **/
	public void setHasDraftWorkflow(Boolean hasDraftWorkflow) {
		this.hasDraftWorkflow = hasDraftWorkflow;
	}

	public Workflow hasDraftWorkflow(Boolean hasDraftWorkflow) {
		this.hasDraftWorkflow = hasDraftWorkflow;
		return this;
	}

	/**
	 * Get id
	 * @return id
	 **/
	public PublishedWorkflowId getId() {
		return id;
	}

	/**
	 * Set id
	 **/
	public void setId(PublishedWorkflowId id) {
		this.id = id;
	}

	public Workflow id(PublishedWorkflowId id) {
		this.id = id;
		return this;
	}

	/**
	 * Whether this is the default workflow.
	 * @return isDefault
	 **/
	public Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * Set isDefault
	 **/
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Workflow isDefault(Boolean isDefault) {
		this.isDefault = isDefault;
		return this;
	}

	/**
	 * Get operations
	 * @return operations
	 **/
	public WorkflowOperations getOperations() {
		return operations;
	}

	/**
	 * Set operations
	 **/
	public void setOperations(WorkflowOperations operations) {
		this.operations = operations;
	}

	public Workflow operations(WorkflowOperations operations) {
		this.operations = operations;
		return this;
	}

	/**
	 * The projects the workflow is assigned to, through workflow schemes.
	 * @return projects
	 **/
	public List<ProjectDetails> getProjects() {
		return projects;
	}

	/**
	 * Set projects
	 **/
	public void setProjects(List<ProjectDetails> projects) {
		this.projects = projects;
	}

	public Workflow projects(List<ProjectDetails> projects) {
		this.projects = projects;
		return this;
	}

	public Workflow addProjectsItem(ProjectDetails projectsItem) {
		if (this.projects == null) {
			this.projects = new ArrayList<>();
		}
		this.projects.add(projectsItem);
		return this;
	}

	/**
	 * The workflow schemes the workflow is assigned to.
	 * @return schemes
	 **/
	public List<WorkflowSchemeIdName> getSchemes() {
		return schemes;
	}

	/**
	 * Set schemes
	 **/
	public void setSchemes(List<WorkflowSchemeIdName> schemes) {
		this.schemes = schemes;
	}

	public Workflow schemes(List<WorkflowSchemeIdName> schemes) {
		this.schemes = schemes;
		return this;
	}

	public Workflow addSchemesItem(WorkflowSchemeIdName schemesItem) {
		if (this.schemes == null) {
			this.schemes = new ArrayList<>();
		}
		this.schemes.add(schemesItem);
		return this;
	}

	/**
	 * The statuses of the workflow.
	 * @return statuses
	 **/
	public List<WorkflowStatus> getStatuses() {
		return statuses;
	}

	/**
	 * Set statuses
	 **/
	public void setStatuses(List<WorkflowStatus> statuses) {
		this.statuses = statuses;
	}

	public Workflow statuses(List<WorkflowStatus> statuses) {
		this.statuses = statuses;
		return this;
	}

	public Workflow addStatusesItem(WorkflowStatus statusesItem) {
		if (this.statuses == null) {
			this.statuses = new ArrayList<>();
		}
		this.statuses.add(statusesItem);
		return this;
	}

	/**
	 * The transitions of the workflow.
	 * @return transitions
	 **/
	public List<Transition> getTransitions() {
		return transitions;
	}

	/**
	 * Set transitions
	 **/
	public void setTransitions(List<Transition> transitions) {
		this.transitions = transitions;
	}

	public Workflow transitions(List<Transition> transitions) {
		this.transitions = transitions;
		return this;
	}

	public Workflow addTransitionsItem(Transition transitionsItem) {
		if (this.transitions == null) {
			this.transitions = new ArrayList<>();
		}
		this.transitions.add(transitionsItem);
		return this;
	}

	/**
	 * The last edited date of the workflow.
	 * @return updated
	 **/
	public Date getUpdated() {
		return updated;
	}

	/**
	 * Set updated
	 **/
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Workflow updated(Date updated) {
		this.updated = updated;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class Workflow {\n" +
			"    created: " + toIndentedString(created) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    hasDraftWorkflow: " + toIndentedString(hasDraftWorkflow) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    isDefault: " + toIndentedString(isDefault) + "\n" +
			"    operations: " + toIndentedString(operations) + "\n" +
			"    projects: " + toIndentedString(projects) + "\n" +
			"    schemes: " + toIndentedString(schemes) + "\n" +
			"    statuses: " + toIndentedString(statuses) + "\n" +
			"    transitions: " + toIndentedString(transitions) + "\n" +
			"    updated: " + toIndentedString(updated) + "\n" +
			"}";
		return sb;
	}
}
