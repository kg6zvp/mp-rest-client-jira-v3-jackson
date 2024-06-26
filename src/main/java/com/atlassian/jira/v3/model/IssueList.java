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

import java.util.ArrayList;
import java.util.List;

/**
 * A list of issue IDs.
 **/

public class IssueList {

	/**
	 * The list of issue IDs.
	 **/

	private List<String> issueIds = new ArrayList<>();

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
	 * The list of issue IDs.
	 * @return issueIds
	 **/
	public List<String> getIssueIds() {
		return issueIds;
	}

	/**
	 * Set issueIds
	 **/
	public void setIssueIds(List<String> issueIds) {
		this.issueIds = issueIds;
	}

	public IssueList issueIds(List<String> issueIds) {
		this.issueIds = issueIds;
		return this;
	}

	public IssueList addIssueIdsItem(String issueIdsItem) {
		if (this.issueIds == null) {
			this.issueIds = new ArrayList<>();
		}
		this.issueIds.add(issueIdsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueList {\n" +
			"    issueIds: " + toIndentedString(issueIds) + "\n" +
			"}";
		return sb;
	}
}
