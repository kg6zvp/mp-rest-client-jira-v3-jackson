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
 * The explicit association between issue types and a workflow in a workflow scheme.
 **/

public class WorkflowSchemeAssociation {

	/**
	 * The issue types assigned to the workflow.
	 **/

	private Set<String> issueTypeIds = new LinkedHashSet<>();

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
	 * The issue types assigned to the workflow.
	 * @return issueTypeIds
	 **/
	public Set<String> getIssueTypeIds() {
		return issueTypeIds;
	}

	/**
	 * Set issueTypeIds
	 **/
	public void setIssueTypeIds(Set<String> issueTypeIds) {
		this.issueTypeIds = issueTypeIds;
	}

	public WorkflowSchemeAssociation issueTypeIds(Set<String> issueTypeIds) {
		this.issueTypeIds = issueTypeIds;
		return this;
	}

	public WorkflowSchemeAssociation addIssueTypeIdsItem(String issueTypeIdsItem) {
		if (this.issueTypeIds == null) {
			this.issueTypeIds = new LinkedHashSet<>();
		}
		this.issueTypeIds.add(issueTypeIdsItem);
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

	public WorkflowSchemeAssociation workflowId(String workflowId) {
		this.workflowId = workflowId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowSchemeAssociation {\n" +
			"    issueTypeIds: " + toIndentedString(issueTypeIds) + "\n" +
			"    workflowId: " + toIndentedString(workflowId) + "\n" +
			"}";
		return sb;
	}
}
