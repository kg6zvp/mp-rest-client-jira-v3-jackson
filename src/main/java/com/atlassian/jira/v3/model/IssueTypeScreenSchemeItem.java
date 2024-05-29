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
 * The screen scheme for an issue type.
 **/

public class IssueTypeScreenSchemeItem {

	/**
	 * The ID of the issue type or *default*. Only issue types used in classic projects are accepted. When creating an issue screen scheme, an entry for *default* must be provided and defines the mapping for all issue types without a screen scheme. Otherwise, a *default* entry can't be provided.
	 **/

	private String issueTypeId;

	/**
	 * The ID of the issue type screen scheme.
	 **/

	private String issueTypeScreenSchemeId;

	/**
	 * The ID of the screen scheme.
	 **/

	private String screenSchemeId;

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
	 * The ID of the issue type or *default*. Only issue types used in classic projects are accepted. When creating an issue screen scheme, an entry for *default* must be provided and defines the mapping for all issue types without a screen scheme. Otherwise, a *default* entry can&#39;t be provided.
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

	public IssueTypeScreenSchemeItem issueTypeId(String issueTypeId) {
		this.issueTypeId = issueTypeId;
		return this;
	}

	/**
	 * The ID of the issue type screen scheme.
	 * @return issueTypeScreenSchemeId
	 **/
	public String getIssueTypeScreenSchemeId() {
		return issueTypeScreenSchemeId;
	}

	/**
	 * Set issueTypeScreenSchemeId
	 **/
	public void setIssueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
		this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
	}

	public IssueTypeScreenSchemeItem issueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
		this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
		return this;
	}

	/**
	 * The ID of the screen scheme.
	 * @return screenSchemeId
	 **/
	public String getScreenSchemeId() {
		return screenSchemeId;
	}

	/**
	 * Set screenSchemeId
	 **/
	public void setScreenSchemeId(String screenSchemeId) {
		this.screenSchemeId = screenSchemeId;
	}

	public IssueTypeScreenSchemeItem screenSchemeId(String screenSchemeId) {
		this.screenSchemeId = screenSchemeId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueTypeScreenSchemeItem {\n" +
			"    issueTypeId: " + toIndentedString(issueTypeId) + "\n" +
			"    issueTypeScreenSchemeId: " + toIndentedString(issueTypeScreenSchemeId) + "\n" +
			"    screenSchemeId: " + toIndentedString(screenSchemeId) + "\n" +
			"}";
		return sb;
	}
}