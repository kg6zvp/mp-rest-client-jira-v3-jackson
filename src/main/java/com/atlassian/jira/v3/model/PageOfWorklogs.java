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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

/**
 * Paginated list of worklog details
 **/
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class PageOfWorklogs extends HashMap<String, Object> {

	/**
	 * The maximum number of results that could be on the page.
	 **/

	private Integer maxResults;

	/**
	 * The index of the first item returned on the page.
	 **/

	private Integer startAt;

	/**
	 * The number of results on the page.
	 **/

	private Integer total;

	/**
	 * List of worklogs.
	 **/
	@Builder.Default
	private List<Worklog> worklogs = null;

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
	 * The maximum number of results that could be on the page.
	 * @return maxResults
	 **/
	public Integer getMaxResults() {
		return maxResults;
	}

	/**
	 * The index of the first item returned on the page.
	 * @return startAt
	 **/
	public Integer getStartAt() {
		return startAt;
	}

	/**
	 * The number of results on the page.
	 * @return total
	 **/
	public Integer getTotal() {
		return total;
	}

	/**
	 * List of worklogs.
	 * @return worklogs
	 **/
	public List<Worklog> getWorklogs() {
		return worklogs;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class PageOfWorklogs {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    maxResults: " + toIndentedString(maxResults) + "\n" +
			"    startAt: " + toIndentedString(startAt) + "\n" +
			"    total: " + toIndentedString(total) + "\n" +
			"    worklogs: " + toIndentedString(worklogs) + "\n" +
			"}";
		return sb;
	}
}
