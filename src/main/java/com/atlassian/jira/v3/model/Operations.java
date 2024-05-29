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

import java.util.HashMap;
import java.util.List;

/**
 * Details of the operations that can be performed on the issue.
 **/

public class Operations extends HashMap<String, Object> {

	/**
	 * Details of the link groups defining issue operations.
	 **/

	private List<LinkGroup> linkGroups = null;

	public Operations() {
	}


	public Operations(
		List<LinkGroup> linkGroups
	) {
		this.linkGroups = linkGroups;
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
	 * Details of the link groups defining issue operations.
	 * @return linkGroups
	 **/
	public List<LinkGroup> getLinkGroups() {
		return linkGroups;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class Operations {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    linkGroups: " + toIndentedString(linkGroups) + "\n" +
			"}";
		return sb;
	}
}
