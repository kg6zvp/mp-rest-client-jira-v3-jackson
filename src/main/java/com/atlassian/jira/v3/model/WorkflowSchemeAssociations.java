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

/**
 * A workflow scheme along with a list of projects that use it.
 **/

public class WorkflowSchemeAssociations {

	/**
	 * The list of projects that use the workflow scheme.
	 **/

	private List<String> projectIds = new ArrayList<>();


	private WorkflowScheme workflowScheme;

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
	 * The list of projects that use the workflow scheme.
	 * @return projectIds
	 **/
	public List<String> getProjectIds() {
		return projectIds;
	}

	/**
	 * Set projectIds
	 **/
	public void setProjectIds(List<String> projectIds) {
		this.projectIds = projectIds;
	}

	public WorkflowSchemeAssociations projectIds(List<String> projectIds) {
		this.projectIds = projectIds;
		return this;
	}

	public WorkflowSchemeAssociations addProjectIdsItem(String projectIdsItem) {
		if (this.projectIds == null) {
			this.projectIds = new ArrayList<>();
		}
		this.projectIds.add(projectIdsItem);
		return this;
	}

	/**
	 * Get workflowScheme
	 * @return workflowScheme
	 **/
	public WorkflowScheme getWorkflowScheme() {
		return workflowScheme;
	}

	/**
	 * Set workflowScheme
	 **/
	public void setWorkflowScheme(WorkflowScheme workflowScheme) {
		this.workflowScheme = workflowScheme;
	}

	public WorkflowSchemeAssociations workflowScheme(WorkflowScheme workflowScheme) {
		this.workflowScheme = workflowScheme;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowSchemeAssociations {\n" +
			"    projectIds: " + toIndentedString(projectIds) + "\n" +
			"    workflowScheme: " + toIndentedString(workflowScheme) + "\n" +
			"}";
		return sb;
	}
}
