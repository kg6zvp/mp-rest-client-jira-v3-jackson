/**
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT-8b1a1ff5508af1eb786f141e37a6e5e53cbc3737
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.atlassian.jira.v3.model;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * The statuses associated with each workflow.
 **/

public class StatusesPerWorkflow {

	/**
	 * The ID of the initial status for the workflow.
	 **/

	private String initialStatusId;

	/**
	 * The status IDs associated with the workflow.
	 **/

	private Set<String> statuses = null;

	/**
	 * The ID of the workflow.
	 **/

	private String workflowId;

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
	 * The ID of the initial status for the workflow.
	 * @return initialStatusId
	 **/
	public String getInitialStatusId() {
		return initialStatusId;
	}

	/**
	 * Set initialStatusId
	 **/
	public void setInitialStatusId(String initialStatusId) {
		this.initialStatusId = initialStatusId;
	}

	public StatusesPerWorkflow initialStatusId(String initialStatusId) {
		this.initialStatusId = initialStatusId;
		return this;
	}

	/**
	 * The status IDs associated with the workflow.
	 * @return statuses
	 **/
	public Set<String> getStatuses() {
		return statuses;
	}

	/**
	 * Set statuses
	 **/
	public void setStatuses(Set<String> statuses) {
		this.statuses = statuses;
	}

	public StatusesPerWorkflow statuses(Set<String> statuses) {
		this.statuses = statuses;
		return this;
	}

	public StatusesPerWorkflow addStatusesItem(String statusesItem) {
		if (this.statuses == null) {
			this.statuses = new LinkedHashSet<>();
		}
		this.statuses.add(statusesItem);
		return this;
	}

	/**
	 * The ID of the workflow.
	 * @return workflowId
	 **/
	public String getWorkflowId() {
		return workflowId;
	}

	/**
	 * Set workflowId
	 **/
	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}

	public StatusesPerWorkflow workflowId(String workflowId) {
		this.workflowId = workflowId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class StatusesPerWorkflow {\n" +
			"    initialStatusId: " + toIndentedString(initialStatusId) + "\n" +
			"    statuses: " + toIndentedString(statuses) + "\n" +
			"    workflowId: " + toIndentedString(workflowId) + "\n" +
			"}";
		return sb;
	}
}