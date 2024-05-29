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

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * A container for the watch status of a list of issues.
 **/
@NoArgsConstructor
@AllArgsConstructor
public class BulkIssueIsWatching {

	/**
	 * The map of issue ID to boolean watch status.
	 **/

	private Map<String, Boolean> issuesIsWatching = null;

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
	 * The map of issue ID to boolean watch status.
	 * @return issuesIsWatching
	 **/
	public Map<String, Boolean> getIssuesIsWatching() {
		return issuesIsWatching;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class BulkIssueIsWatching {\n" +
			"    issuesIsWatching: " + toIndentedString(issuesIsWatching) + "\n" +
			"}";
		return sb;
	}
}