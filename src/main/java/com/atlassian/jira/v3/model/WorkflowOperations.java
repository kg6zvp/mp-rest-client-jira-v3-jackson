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

/**
 * Operations allowed on a workflow
 **/

public class WorkflowOperations {

	/**
	 * Whether the workflow can be deleted.
	 **/

	private Boolean canDelete;

	/**
	 * Whether the workflow can be updated.
	 **/

	private Boolean canEdit;

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
	 * Whether the workflow can be deleted.
	 * @return canDelete
	 **/
	public Boolean getCanDelete() {
		return canDelete;
	}

	/**
	 * Set canDelete
	 **/
	public void setCanDelete(Boolean canDelete) {
		this.canDelete = canDelete;
	}

	public WorkflowOperations canDelete(Boolean canDelete) {
		this.canDelete = canDelete;
		return this;
	}

	/**
	 * Whether the workflow can be updated.
	 * @return canEdit
	 **/
	public Boolean getCanEdit() {
		return canEdit;
	}

	/**
	 * Set canEdit
	 **/
	public void setCanEdit(Boolean canEdit) {
		this.canEdit = canEdit;
	}

	public WorkflowOperations canEdit(Boolean canEdit) {
		this.canEdit = canEdit;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowOperations {\n" +
			"    canDelete: " + toIndentedString(canDelete) + "\n" +
			"    canEdit: " + toIndentedString(canEdit) + "\n" +
			"}";
		return sb;
	}
}
