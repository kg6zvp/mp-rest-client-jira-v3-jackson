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
 * The ID of an issue type screen scheme.
 **/

public class IssueTypeScreenSchemeId {

	/**
	 * The ID of the issue type screen scheme.
	 **/

	private String id;

	public IssueTypeScreenSchemeId() {
	}


	public IssueTypeScreenSchemeId(
		String id
	) {
		this.id = id;
	}

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
	 * The ID of the issue type screen scheme.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueTypeScreenSchemeId {\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"}";
		return sb;
	}
}
