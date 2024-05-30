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
 * Details of an issue type scheme and its associated issue types.
 **/

public class IssueTypeSchemeDetails {

	/**
	 * The ID of the default issue type of the issue type scheme. This ID must be included in `issueTypeIds`.
	 **/

	private String defaultIssueTypeId;

	/**
	 * The description of the issue type scheme. The maximum length is 4000 characters.
	 **/

	private String description;

	/**
	 * The list of issue types IDs of the issue type scheme. At least one standard issue type ID is required.
	 **/

	private List<String> issueTypeIds = new ArrayList<>();

	/**
	 * The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
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
	 * The ID of the default issue type of the issue type scheme. This ID must be included in &#x60;issueTypeIds&#x60;.
	 * @return defaultIssueTypeId
	 **/
	public String getDefaultIssueTypeId() {
		return defaultIssueTypeId;
	}

	/**
	 * Set defaultIssueTypeId
	 **/
	public void setDefaultIssueTypeId(String defaultIssueTypeId) {
		this.defaultIssueTypeId = defaultIssueTypeId;
	}

	public IssueTypeSchemeDetails defaultIssueTypeId(String defaultIssueTypeId) {
		this.defaultIssueTypeId = defaultIssueTypeId;
		return this;
	}

	/**
	 * The description of the issue type scheme. The maximum length is 4000 characters.
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

	public IssueTypeSchemeDetails description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The list of issue types IDs of the issue type scheme. At least one standard issue type ID is required.
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

	public IssueTypeSchemeDetails issueTypeIds(List<String> issueTypeIds) {
		this.issueTypeIds = issueTypeIds;
		return this;
	}

	public IssueTypeSchemeDetails addIssueTypeIdsItem(String issueTypeIdsItem) {
		if (this.issueTypeIds == null) {
			this.issueTypeIds = new ArrayList<>();
		}
		this.issueTypeIds.add(issueTypeIdsItem);
		return this;
	}

	/**
	 * The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
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

	public IssueTypeSchemeDetails name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueTypeSchemeDetails {\n" +
			"    defaultIssueTypeId: " + toIndentedString(defaultIssueTypeId) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    issueTypeIds: " + toIndentedString(issueTypeIds) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"}";
		return sb;
	}
}
