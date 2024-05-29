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

import java.util.ArrayList;
import java.util.List;

/**
 * The workflow metadata and issue type IDs which use this workflow.
 **/

public class WorkflowMetadataAndIssueTypeRestModel {

	/**
	 * The list of issue type IDs for the mapping.
	 **/

	private List<String> issueTypeIds = new ArrayList<>();


	private WorkflowMetadataRestModel workflow;

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
	 * The list of issue type IDs for the mapping.
	 * @return issueTypeIds
	 **/
	public List<String> getIssueTypeIds() {
		return issueTypeIds;
	}

	/**
	 * Set issueTypeIds
	 **/
	public void setIssueTypeIds(List<String> issueTypeIds) {
		this.issueTypeIds = issueTypeIds;
	}

	public WorkflowMetadataAndIssueTypeRestModel issueTypeIds(List<String> issueTypeIds) {
		this.issueTypeIds = issueTypeIds;
		return this;
	}

	public WorkflowMetadataAndIssueTypeRestModel addIssueTypeIdsItem(String issueTypeIdsItem) {
		if (this.issueTypeIds == null) {
			this.issueTypeIds = new ArrayList<>();
		}
		this.issueTypeIds.add(issueTypeIdsItem);
		return this;
	}

	/**
	 * Get workflow
	 * @return workflow
	 **/
	public WorkflowMetadataRestModel getWorkflow() {
		return workflow;
	}

	/**
	 * Set workflow
	 **/
	public void setWorkflow(WorkflowMetadataRestModel workflow) {
		this.workflow = workflow;
	}

	public WorkflowMetadataAndIssueTypeRestModel workflow(WorkflowMetadataRestModel workflow) {
		this.workflow = workflow;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowMetadataAndIssueTypeRestModel {\n" +
			"    issueTypeIds: " + toIndentedString(issueTypeIds) + "\n" +
			"    workflow: " + toIndentedString(workflow) + "\n" +
			"}";
		return sb;
	}
}