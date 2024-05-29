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

import java.util.List;

/**
 * List of all permission schemes.
 **/

public class PermissionSchemes {

	/**
	 * Permission schemes list.
	 **/

	private List<PermissionScheme> permissionSchemes = null;

	public PermissionSchemes() {
	}


	public PermissionSchemes(
		List<PermissionScheme> permissionSchemes
	) {
		this.permissionSchemes = permissionSchemes;
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
	 * Permission schemes list.
	 * @return permissionSchemes
	 **/
	public List<PermissionScheme> getPermissionSchemes() {
		return permissionSchemes;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class PermissionSchemes {\n" +
			"    permissionSchemes: " + toIndentedString(permissionSchemes) + "\n" +
			"}";
		return sb;
	}
}
