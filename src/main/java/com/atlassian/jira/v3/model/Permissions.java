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

import java.util.Map;

/**
 * Details about permissions.
 **/

public class Permissions {

	/**
	 * List of permissions.
	 **/

	private Map<String, UserPermission> permissions = null;

	public Permissions() {
	}


	public Permissions(
		Map<String, UserPermission> permissions
	) {
		this.permissions = permissions;
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
	 * List of permissions.
	 * @return permissions
	 **/
	public Map<String, UserPermission> getPermissions() {
		return permissions;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class Permissions {\n" +
			"    permissions: " + toIndentedString(permissions) + "\n" +
			"}";
		return sb;
	}
}
