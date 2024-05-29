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
import java.util.Map;


public class IssueLimitReportRequest {

	/**
	 * A list of fields and their respective approaching limit threshold. Required for querying issues approaching limits. Optional for querying issues breaching limits. Accepted fields are: `comment`, `worklog`, `attachment`, `remoteIssueLinks`, and `issuelinks`. Example: `{\"issuesApproachingLimitParams\": {\"comment\": 4500, \"attachment\": 1800}}`
	 **/

	private Map<String, Integer> issuesApproachingLimitParams = null;

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
	 * A list of fields and their respective approaching limit threshold. Required for querying issues approaching limits. Optional for querying issues breaching limits. Accepted fields are: &#x60;comment&#x60;, &#x60;worklog&#x60;, &#x60;attachment&#x60;, &#x60;remoteIssueLinks&#x60;, and &#x60;issuelinks&#x60;. Example: &#x60;{\&quot;issuesApproachingLimitParams\&quot;: {\&quot;comment\&quot;: 4500, \&quot;attachment\&quot;: 1800}}&#x60;
	 * @return issuesApproachingLimitParams
	 **/
	public Map<String, Integer> getIssuesApproachingLimitParams() {
		return issuesApproachingLimitParams;
	}

	/**
	 * Set issuesApproachingLimitParams
	 **/
	public void setIssuesApproachingLimitParams(Map<String, Integer> issuesApproachingLimitParams) {
		this.issuesApproachingLimitParams = issuesApproachingLimitParams;
	}

	public IssueLimitReportRequest issuesApproachingLimitParams(Map<String, Integer> issuesApproachingLimitParams) {
		this.issuesApproachingLimitParams = issuesApproachingLimitParams;
		return this;
	}

	public IssueLimitReportRequest putIssuesApproachingLimitParamsItem(String key, Integer issuesApproachingLimitParamsItem) {
		if (this.issuesApproachingLimitParams == null) {
			this.issuesApproachingLimitParams = new HashMap<>();
		}
		this.issuesApproachingLimitParams.put(key, issuesApproachingLimitParamsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueLimitReportRequest {\n" +
			"    issuesApproachingLimitParams: " + toIndentedString(issuesApproachingLimitParams) + "\n" +
			"}";
		return sb;
	}
}
