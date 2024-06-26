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
import java.util.HashMap;
import java.util.List;


public class IssuesUpdateBean extends HashMap<String, Object> {


	private List<IssueUpdateDetails> issueUpdates = null;

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
	 * Get issueUpdates
	 * @return issueUpdates
	 **/
	public List<IssueUpdateDetails> getIssueUpdates() {
		return issueUpdates;
	}

	/**
	 * Set issueUpdates
	 **/
	public void setIssueUpdates(List<IssueUpdateDetails> issueUpdates) {
		this.issueUpdates = issueUpdates;
	}

	public IssuesUpdateBean issueUpdates(List<IssueUpdateDetails> issueUpdates) {
		this.issueUpdates = issueUpdates;
		return this;
	}

	public IssuesUpdateBean addIssueUpdatesItem(IssueUpdateDetails issueUpdatesItem) {
		if (this.issueUpdates == null) {
			this.issueUpdates = new ArrayList<>();
		}
		this.issueUpdates.add(issueUpdatesItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class IssuesUpdateBean {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    issueUpdates: " + toIndentedString(issueUpdates) + "\n" +
			"}";
		return sb;
	}
}
