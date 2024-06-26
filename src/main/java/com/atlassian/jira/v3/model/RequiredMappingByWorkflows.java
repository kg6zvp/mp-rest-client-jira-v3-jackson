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
 * The list of required status mappings by workflow.
 **/

public class RequiredMappingByWorkflows {

	/**
	 * The ID of the source workflow.
	 **/

	private String sourceWorkflowId;

	/**
	 * The status IDs requiring mapping.
	 **/

	private Set<String> statusIds = null;

	/**
	 * The ID of the target workflow.
	 **/

	private String targetWorkflowId;

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
	 * The ID of the source workflow.
	 * @return sourceWorkflowId
	 **/
	public String getSourceWorkflowId() {
		return sourceWorkflowId;
	}

	/**
	 * Set sourceWorkflowId
	 **/
	public void setSourceWorkflowId(String sourceWorkflowId) {
		this.sourceWorkflowId = sourceWorkflowId;
	}

	public RequiredMappingByWorkflows sourceWorkflowId(String sourceWorkflowId) {
		this.sourceWorkflowId = sourceWorkflowId;
		return this;
	}

	/**
	 * The status IDs requiring mapping.
	 * @return statusIds
	 **/
	public Set<String> getStatusIds() {
		return statusIds;
	}

	/**
	 * Set statusIds
	 **/
	public void setStatusIds(Set<String> statusIds) {
		this.statusIds = statusIds;
	}

	public RequiredMappingByWorkflows statusIds(Set<String> statusIds) {
		this.statusIds = statusIds;
		return this;
	}

	public RequiredMappingByWorkflows addStatusIdsItem(String statusIdsItem) {
		if (this.statusIds == null) {
			this.statusIds = new LinkedHashSet<>();
		}
		this.statusIds.add(statusIdsItem);
		return this;
	}

	/**
	 * The ID of the target workflow.
	 * @return targetWorkflowId
	 **/
	public String getTargetWorkflowId() {
		return targetWorkflowId;
	}

	/**
	 * Set targetWorkflowId
	 **/
	public void setTargetWorkflowId(String targetWorkflowId) {
		this.targetWorkflowId = targetWorkflowId;
	}

	public RequiredMappingByWorkflows targetWorkflowId(String targetWorkflowId) {
		this.targetWorkflowId = targetWorkflowId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class RequiredMappingByWorkflows {\n" +
			"    sourceWorkflowId: " + toIndentedString(sourceWorkflowId) + "\n" +
			"    statusIds: " + toIndentedString(statusIds) + "\n" +
			"    targetWorkflowId: " + toIndentedString(targetWorkflowId) + "\n" +
			"}";
		return sb;
	}
}
