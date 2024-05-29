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
 * The IDs of the screen schemes for the issue type IDs.
 **/

public class IssueTypeScreenSchemeMapping {

	/**
	 * The ID of the issue type or *default*. Only issue types used in classic projects are accepted. An entry for *default* must be provided and defines the mapping for all issue types without a screen scheme.
	 **/

	private String issueTypeId;

	/**
	 * The ID of the screen scheme. Only screen schemes used in classic projects are accepted.
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
	 * The ID of the issue type or *default*. Only issue types used in classic projects are accepted. An entry for *default* must be provided and defines the mapping for all issue types without a screen scheme.
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

	public IssueTypeScreenSchemeMapping issueTypeId(String issueTypeId) {
		this.issueTypeId = issueTypeId;
		return this;
	}

	/**
	 * The ID of the screen scheme. Only screen schemes used in classic projects are accepted.
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

	public IssueTypeScreenSchemeMapping screenSchemeId(String screenSchemeId) {
		this.screenSchemeId = screenSchemeId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueTypeScreenSchemeMapping {\n" +
			"    issueTypeId: " + toIndentedString(issueTypeId) + "\n" +
			"    screenSchemeId: " + toIndentedString(screenSchemeId) + "\n" +
			"}";
		return sb;
	}
}
