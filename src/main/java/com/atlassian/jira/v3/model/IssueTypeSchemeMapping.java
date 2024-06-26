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
 * Issue type scheme item.
 **/

public class IssueTypeSchemeMapping {

	/**
	 * The ID of the issue type.
	 **/

	private String issueTypeId;

	/**
	 * The ID of the issue type scheme.
	 **/

	private String issueTypeSchemeId;

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
	 * The ID of the issue type.
	 * @return issueTypeId
	 **/
	public String getIssueTypeId() {
		return issueTypeId;
	}

	/**
	 * Set issueTypeId
	 **/
	public void setIssueTypeId(String issueTypeId) {
		this.issueTypeId = issueTypeId;
	}

	public IssueTypeSchemeMapping issueTypeId(String issueTypeId) {
		this.issueTypeId = issueTypeId;
		return this;
	}

	/**
	 * The ID of the issue type scheme.
	 * @return issueTypeSchemeId
	 **/
	public String getIssueTypeSchemeId() {
		return issueTypeSchemeId;
	}

	/**
	 * Set issueTypeSchemeId
	 **/
	public void setIssueTypeSchemeId(String issueTypeSchemeId) {
		this.issueTypeSchemeId = issueTypeSchemeId;
	}

	public IssueTypeSchemeMapping issueTypeSchemeId(String issueTypeSchemeId) {
		this.issueTypeSchemeId = issueTypeSchemeId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueTypeSchemeMapping {\n" +
			"    issueTypeId: " + toIndentedString(issueTypeId) + "\n" +
			"    issueTypeSchemeId: " + toIndentedString(issueTypeSchemeId) + "\n" +
			"}";
		return sb;
	}
}
