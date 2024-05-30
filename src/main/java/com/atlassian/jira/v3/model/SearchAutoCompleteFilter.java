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
 * Details of how to filter and list search auto complete information.
 **/

public class SearchAutoCompleteFilter {

	/**
	 * Include collapsed fields for fields that have non-unique names.
	 **/

	private Boolean includeCollapsedFields = false;

	/**
	 * List of project IDs used to filter the visible field details returned.
	 **/

	private List<Long> projectIds = null;

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
	 * Include collapsed fields for fields that have non-unique names.
	 * @return includeCollapsedFields
	 **/
	public Boolean getIncludeCollapsedFields() {
		return includeCollapsedFields;
	}

	/**
	 * Set includeCollapsedFields
	 **/
	public void setIncludeCollapsedFields(Boolean includeCollapsedFields) {
		this.includeCollapsedFields = includeCollapsedFields;
	}

	public SearchAutoCompleteFilter includeCollapsedFields(Boolean includeCollapsedFields) {
		this.includeCollapsedFields = includeCollapsedFields;
		return this;
	}

	/**
	 * List of project IDs used to filter the visible field details returned.
	 * @return projectIds
	 **/
	public List<Long> getProjectIds() {
		return projectIds;
	}

	/**
	 * Set projectIds
	 **/
	public void setProjectIds(List<Long> projectIds) {
		this.projectIds = projectIds;
	}

	public SearchAutoCompleteFilter projectIds(List<Long> projectIds) {
		this.projectIds = projectIds;
		return this;
	}

	public SearchAutoCompleteFilter addProjectIdsItem(Long projectIdsItem) {
		if (this.projectIds == null) {
			this.projectIds = new ArrayList<>();
		}
		this.projectIds.add(projectIdsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class SearchAutoCompleteFilter {\n" +
			"    includeCollapsedFields: " + toIndentedString(includeCollapsedFields) + "\n" +
			"    projectIds: " + toIndentedString(projectIds) + "\n" +
			"}";
		return sb;
	}
}
