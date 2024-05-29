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

/**
 * Properties that identify a workflow.
 **/

public class WorkflowId {

	/**
	 * Whether the workflow is in the draft state.
	 **/

	private Boolean draft;

	/**
	 * The name of the workflow.
	 **/

	private String name;

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
	 * Whether the workflow is in the draft state.
	 * @return draft
	 **/
	public Boolean getDraft() {
		return draft;
	}

	/**
	 * Set draft
	 **/
	public void setDraft(Boolean draft) {
		this.draft = draft;
	}

	public WorkflowId draft(Boolean draft) {
		this.draft = draft;
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

	public WorkflowId name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowId {\n" +
			"    draft: " + toIndentedString(draft) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"}";
		return sb;
	}
}
