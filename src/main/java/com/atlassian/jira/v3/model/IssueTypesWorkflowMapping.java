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
 * Details about the mapping between issue types and a workflow.
 **/

public class IssueTypesWorkflowMapping {

	/**
	 * Whether the workflow is the default workflow for the workflow scheme.
	 **/

	private Boolean defaultMapping;

	/**
	 * The list of issue type IDs.
	 **/

	private List<String> issueTypes = null;

	/**
	 * Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new workflow-issue types mapping. Defaults to `false`.
	 **/

	private Boolean updateDraftIfNeeded;

	/**
	 * The name of the workflow. Optional if updating the workflow-issue types mapping.
	 **/

	private String workflow;

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
	 * Whether the workflow is the default workflow for the workflow scheme.
	 * @return defaultMapping
	 **/
	public Boolean getDefaultMapping() {
		return defaultMapping;
	}

	/**
	 * Set defaultMapping
	 **/
	public void setDefaultMapping(Boolean defaultMapping) {
		this.defaultMapping = defaultMapping;
	}

	public IssueTypesWorkflowMapping defaultMapping(Boolean defaultMapping) {
		this.defaultMapping = defaultMapping;
		return this;
	}

	/**
	 * The list of issue type IDs.
	 * @return issueTypes
	 **/
	public List<String> getIssueTypes() {
		return issueTypes;
	}

	/**
	 * Set issueTypes
	 **/
	public void setIssueTypes(List<String> issueTypes) {
		this.issueTypes = issueTypes;
	}

	public IssueTypesWorkflowMapping issueTypes(List<String> issueTypes) {
		this.issueTypes = issueTypes;
		return this;
	}

	public IssueTypesWorkflowMapping addIssueTypesItem(String issueTypesItem) {
		if (this.issueTypes == null) {
			this.issueTypes = new ArrayList<>();
		}
		this.issueTypes.add(issueTypesItem);
		return this;
	}

	/**
	 * Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new workflow-issue types mapping. Defaults to &#x60;false&#x60;.
	 * @return updateDraftIfNeeded
	 **/
	public Boolean getUpdateDraftIfNeeded() {
		return updateDraftIfNeeded;
	}

	/**
	 * Set updateDraftIfNeeded
	 **/
	public void setUpdateDraftIfNeeded(Boolean updateDraftIfNeeded) {
		this.updateDraftIfNeeded = updateDraftIfNeeded;
	}

	public IssueTypesWorkflowMapping updateDraftIfNeeded(Boolean updateDraftIfNeeded) {
		this.updateDraftIfNeeded = updateDraftIfNeeded;
		return this;
	}

	/**
	 * The name of the workflow. Optional if updating the workflow-issue types mapping.
	 * @return workflow
	 **/
	public String getWorkflow() {
		return workflow;
	}

	/**
	 * Set workflow
	 **/
	public void setWorkflow(String workflow) {
		this.workflow = workflow;
	}

	public IssueTypesWorkflowMapping workflow(String workflow) {
		this.workflow = workflow;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueTypesWorkflowMapping {\n" +
			"    defaultMapping: " + toIndentedString(defaultMapping) + "\n" +
			"    issueTypes: " + toIndentedString(issueTypes) + "\n" +
			"    updateDraftIfNeeded: " + toIndentedString(updateDraftIfNeeded) + "\n" +
			"    workflow: " + toIndentedString(workflow) + "\n" +
			"}";
		return sb;
	}
}
