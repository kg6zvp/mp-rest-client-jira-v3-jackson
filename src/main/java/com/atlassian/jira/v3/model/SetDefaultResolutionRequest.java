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
 * The new default issue resolution.
 **/

public class SetDefaultResolutionRequest {

	/**
	 * The ID of the new default issue resolution. Must be an existing ID or null. Setting this to null erases the default resolution setting.
	 **/

	private String id;

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
	 * The ID of the new default issue resolution. Must be an existing ID or null. Setting this to null erases the default resolution setting.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * Set id
	 **/
	public void setId(String id) {
		this.id = id;
	}

	public SetDefaultResolutionRequest id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class SetDefaultResolutionRequest {\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"}";
		return sb;
	}
}
