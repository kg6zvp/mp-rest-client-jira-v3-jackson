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

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * List of issues and JQL queries.
 **/

public class IssuesAndJQLQueries {

	/**
	 * A list of issue IDs.
	 **/

	private Set<Long> issueIds = new LinkedHashSet<>();

	/**
	 * A list of JQL queries.
	 **/

	private List<String> jqls = new ArrayList<>();

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
	 * A list of issue IDs.
	 * @return issueIds
	 **/
	public Set<Long> getIssueIds() {
		return issueIds;
	}

	/**
	 * Set issueIds
	 **/
	public void setIssueIds(Set<Long> issueIds) {
		this.issueIds = issueIds;
	}

	public IssuesAndJQLQueries issueIds(Set<Long> issueIds) {
		this.issueIds = issueIds;
		return this;
	}

	public IssuesAndJQLQueries addIssueIdsItem(Long issueIdsItem) {
		if (this.issueIds == null) {
			this.issueIds = new LinkedHashSet<>();
		}
		this.issueIds.add(issueIdsItem);
		return this;
	}

	/**
	 * A list of JQL queries.
	 * @return jqls
	 **/
	public List<String> getJqls() {
		return jqls;
	}

	/**
	 * Set jqls
	 **/
	public void setJqls(List<String> jqls) {
		this.jqls = jqls;
	}

	public IssuesAndJQLQueries jqls(List<String> jqls) {
		this.jqls = jqls;
		return this;
	}

	public IssuesAndJQLQueries addJqlsItem(String jqlsItem) {
		if (this.jqls == null) {
			this.jqls = new ArrayList<>();
		}
		this.jqls.add(jqlsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssuesAndJQLQueries {\n" +
			"    issueIds: " + toIndentedString(issueIds) + "\n" +
			"    jqls: " + toIndentedString(jqls) + "\n" +
			"}";
		return sb;
	}
}