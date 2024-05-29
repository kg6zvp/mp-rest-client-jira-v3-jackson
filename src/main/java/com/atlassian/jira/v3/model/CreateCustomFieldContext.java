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

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * The details of a created custom field context.
 **/
@NoArgsConstructor
@AllArgsConstructor
public class CreateCustomFieldContext {

	/**
	 * The description of the context.
	 **/

	private String description;

	/**
	 * The ID of the context.
	 **/

	private String id;

	/**
	 * The list of issue types IDs for the context. If the list is empty, the context refers to all issue types.
	 **/

	private List<String> issueTypeIds = null;

	/**
	 * The name of the context.
	 **/

	private String name;

	/**
	 * The list of project IDs associated with the context. If the list is empty, the context is global.
	 **/

	private List<String> projectIds = null;

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
	 * The description of the context.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * Set description
	 **/
	public void setDescription(String description) {
		this.description = description;
	}

	public CreateCustomFieldContext description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The ID of the context.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * The list of issue types IDs for the context. If the list is empty, the context refers to all issue types.
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

	public CreateCustomFieldContext issueTypeIds(List<String> issueTypeIds) {
		this.issueTypeIds = issueTypeIds;
		return this;
	}

	public CreateCustomFieldContext addIssueTypeIdsItem(String issueTypeIdsItem) {
		if (this.issueTypeIds == null) {
			this.issueTypeIds = new ArrayList<>();
		}
		this.issueTypeIds.add(issueTypeIdsItem);
		return this;
	}

	/**
	 * The name of the context.
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

	public CreateCustomFieldContext name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The list of project IDs associated with the context. If the list is empty, the context is global.
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

	public CreateCustomFieldContext projectIds(List<String> projectIds) {
		this.projectIds = projectIds;
		return this;
	}

	public CreateCustomFieldContext addProjectIdsItem(String projectIdsItem) {
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

		String sb = "class CreateCustomFieldContext {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    issueTypeIds: " + toIndentedString(issueTypeIds) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    projectIds: " + toIndentedString(projectIds) + "\n" +
			"}";
		return sb;
	}
}
