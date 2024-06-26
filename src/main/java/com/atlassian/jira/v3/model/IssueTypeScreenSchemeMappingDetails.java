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
 * A list of issue type screen scheme mappings.
 **/

public class IssueTypeScreenSchemeMappingDetails {

	/**
	 * The list of issue type to screen scheme mappings. A *default* entry cannot be specified because a default entry is added when an issue type screen scheme is created.
	 **/

	private List<IssueTypeScreenSchemeMapping> issueTypeMappings = new ArrayList<>();

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
	 * The list of issue type to screen scheme mappings. A *default* entry cannot be specified because a default entry is added when an issue type screen scheme is created.
	 * @return issueTypeMappings
	 **/
	public List<IssueTypeScreenSchemeMapping> getIssueTypeMappings() {
		return issueTypeMappings;
	}

	/**
	 * Set issueTypeMappings
	 **/
	public void setIssueTypeMappings(List<IssueTypeScreenSchemeMapping> issueTypeMappings) {
		this.issueTypeMappings = issueTypeMappings;
	}

	public IssueTypeScreenSchemeMappingDetails issueTypeMappings(List<IssueTypeScreenSchemeMapping> issueTypeMappings) {
		this.issueTypeMappings = issueTypeMappings;
		return this;
	}

	public IssueTypeScreenSchemeMappingDetails addIssueTypeMappingsItem(IssueTypeScreenSchemeMapping issueTypeMappingsItem) {
		if (this.issueTypeMappings == null) {
			this.issueTypeMappings = new ArrayList<>();
		}
		this.issueTypeMappings.add(issueTypeMappingsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueTypeScreenSchemeMappingDetails {\n" +
			"    issueTypeMappings: " + toIndentedString(issueTypeMappings) + "\n" +
			"}";
		return sb;
	}
}
