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


public class WorkflowSchemeUpdateRequiredMappingsResponse {

	/**
	 * The list of required status mappings by issue type.
	 **/

	private Set<RequiredMappingByIssueType> statusMappingsByIssueTypes = null;

	/**
	 * The list of required status mappings by workflow.
	 **/

	private Set<RequiredMappingByWorkflows> statusMappingsByWorkflows = null;

	/**
	 * The details of the statuses in the associated workflows.
	 **/

	private Set<StatusMetadata> statuses = null;

	/**
	 * The statuses associated with each workflow.
	 **/

	private Set<StatusesPerWorkflow> statusesPerWorkflow = null;

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
	 * The list of required status mappings by issue type.
	 * @return statusMappingsByIssueTypes
	 **/
	public Set<RequiredMappingByIssueType> getStatusMappingsByIssueTypes() {
		return statusMappingsByIssueTypes;
	}

	/**
	 * Set statusMappingsByIssueTypes
	 **/
	public void setStatusMappingsByIssueTypes(Set<RequiredMappingByIssueType> statusMappingsByIssueTypes) {
		this.statusMappingsByIssueTypes = statusMappingsByIssueTypes;
	}

	public WorkflowSchemeUpdateRequiredMappingsResponse statusMappingsByIssueTypes(Set<RequiredMappingByIssueType> statusMappingsByIssueTypes) {
		this.statusMappingsByIssueTypes = statusMappingsByIssueTypes;
		return this;
	}

	public WorkflowSchemeUpdateRequiredMappingsResponse addStatusMappingsByIssueTypesItem(RequiredMappingByIssueType statusMappingsByIssueTypesItem) {
		if (this.statusMappingsByIssueTypes == null) {
			this.statusMappingsByIssueTypes = new LinkedHashSet<>();
		}
		this.statusMappingsByIssueTypes.add(statusMappingsByIssueTypesItem);
		return this;
	}

	/**
	 * The list of required status mappings by workflow.
	 * @return statusMappingsByWorkflows
	 **/
	public Set<RequiredMappingByWorkflows> getStatusMappingsByWorkflows() {
		return statusMappingsByWorkflows;
	}

	/**
	 * Set statusMappingsByWorkflows
	 **/
	public void setStatusMappingsByWorkflows(Set<RequiredMappingByWorkflows> statusMappingsByWorkflows) {
		this.statusMappingsByWorkflows = statusMappingsByWorkflows;
	}

	public WorkflowSchemeUpdateRequiredMappingsResponse statusMappingsByWorkflows(Set<RequiredMappingByWorkflows> statusMappingsByWorkflows) {
		this.statusMappingsByWorkflows = statusMappingsByWorkflows;
		return this;
	}

	public WorkflowSchemeUpdateRequiredMappingsResponse addStatusMappingsByWorkflowsItem(RequiredMappingByWorkflows statusMappingsByWorkflowsItem) {
		if (this.statusMappingsByWorkflows == null) {
			this.statusMappingsByWorkflows = new LinkedHashSet<>();
		}
		this.statusMappingsByWorkflows.add(statusMappingsByWorkflowsItem);
		return this;
	}

	/**
	 * The details of the statuses in the associated workflows.
	 * @return statuses
	 **/
	public Set<StatusMetadata> getStatuses() {
		return statuses;
	}

	/**
	 * Set statuses
	 **/
	public void setStatuses(Set<StatusMetadata> statuses) {
		this.statuses = statuses;
	}

	public WorkflowSchemeUpdateRequiredMappingsResponse statuses(Set<StatusMetadata> statuses) {
		this.statuses = statuses;
		return this;
	}

	public WorkflowSchemeUpdateRequiredMappingsResponse addStatusesItem(StatusMetadata statusesItem) {
		if (this.statuses == null) {
			this.statuses = new LinkedHashSet<>();
		}
		this.statuses.add(statusesItem);
		return this;
	}

	/**
	 * The statuses associated with each workflow.
	 * @return statusesPerWorkflow
	 **/
	public Set<StatusesPerWorkflow> getStatusesPerWorkflow() {
		return statusesPerWorkflow;
	}

	/**
	 * Set statusesPerWorkflow
	 **/
	public void setStatusesPerWorkflow(Set<StatusesPerWorkflow> statusesPerWorkflow) {
		this.statusesPerWorkflow = statusesPerWorkflow;
	}

	public WorkflowSchemeUpdateRequiredMappingsResponse statusesPerWorkflow(Set<StatusesPerWorkflow> statusesPerWorkflow) {
		this.statusesPerWorkflow = statusesPerWorkflow;
		return this;
	}

	public WorkflowSchemeUpdateRequiredMappingsResponse addStatusesPerWorkflowItem(StatusesPerWorkflow statusesPerWorkflowItem) {
		if (this.statusesPerWorkflow == null) {
			this.statusesPerWorkflow = new LinkedHashSet<>();
		}
		this.statusesPerWorkflow.add(statusesPerWorkflowItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowSchemeUpdateRequiredMappingsResponse {\n" +
			"    statusMappingsByIssueTypes: " + toIndentedString(statusMappingsByIssueTypes) + "\n" +
			"    statusMappingsByWorkflows: " + toIndentedString(statusMappingsByWorkflows) + "\n" +
			"    statuses: " + toIndentedString(statuses) + "\n" +
			"    statusesPerWorkflow: " + toIndentedString(statusesPerWorkflow) + "\n" +
			"}";
		return sb;
	}
}
