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

import java.util.HashMap;

/**
 * Details of scheme and new default level.
 **/

public class DefaultLevelValue extends HashMap<String, Object> {

	/**
	 * The ID of the issue security level to set as default for the specified scheme. Providing null will reset the default level.
	 **/

	private String defaultLevelId;

	/**
	 * The ID of the issue security scheme to set default level for.
	 **/

	private String issueSecuritySchemeId;

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
	 * The ID of the issue security level to set as default for the specified scheme. Providing null will reset the default level.
	 * @return defaultLevelId
	 **/
	public String getDefaultLevelId() {
		return defaultLevelId;
	}

	/**
	 * Set defaultLevelId
	 **/
	public void setDefaultLevelId(String defaultLevelId) {
		this.defaultLevelId = defaultLevelId;
	}

	public DefaultLevelValue defaultLevelId(String defaultLevelId) {
		this.defaultLevelId = defaultLevelId;
		return this;
	}

	/**
	 * The ID of the issue security scheme to set default level for.
	 * @return issueSecuritySchemeId
	 **/
	public String getIssueSecuritySchemeId() {
		return issueSecuritySchemeId;
	}

	/**
	 * Set issueSecuritySchemeId
	 **/
	public void setIssueSecuritySchemeId(String issueSecuritySchemeId) {
		this.issueSecuritySchemeId = issueSecuritySchemeId;
	}

	public DefaultLevelValue issueSecuritySchemeId(String issueSecuritySchemeId) {
		this.issueSecuritySchemeId = issueSecuritySchemeId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class DefaultLevelValue {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    defaultLevelId: " + toIndentedString(defaultLevelId) + "\n" +
			"    issueSecuritySchemeId: " + toIndentedString(issueSecuritySchemeId) + "\n" +
			"}";
		return sb;
	}
}
