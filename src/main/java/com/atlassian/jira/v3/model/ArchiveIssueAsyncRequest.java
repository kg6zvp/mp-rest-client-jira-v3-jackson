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

public class ArchiveIssueAsyncRequest {


	private String jql;

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
	 * Get jql
	 * @return jql
	 **/
	public String getJql() {
		return jql;
	}

	/**
	 * Set jql
	 **/
	public void setJql(String jql) {
		this.jql = jql;
	}

	public ArchiveIssueAsyncRequest jql(String jql) {
		this.jql = jql;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ArchiveIssueAsyncRequest {\n" +
			"    jql: " + toIndentedString(jql) + "\n" +
			"}";
		return sb;
	}
}
