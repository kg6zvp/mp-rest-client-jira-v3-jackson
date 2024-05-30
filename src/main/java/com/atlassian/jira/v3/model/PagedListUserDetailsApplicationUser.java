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

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * A paged list. To access additional details append `[start-index:end-index]` to the expand request. For example, `?expand=sharedUsers[10:40]` returns a list starting at item 10 and finishing at item 40.
 **/

public class PagedListUserDetailsApplicationUser {

	/**
	 * The index of the last item returned on the page.
	 **/
	@JsonProperty("end-index")
	private Integer endIndex;

	/**
	 * The list of items.
	 **/

	private List<UserDetails> items = null;

	/**
	 * The maximum number of results that could be on the page.
	 **/
	@JsonProperty("max-results")
	private Integer maxResults;

	/**
	 * The number of items on the page.
	 **/

	private Integer size;

	/**
	 * The index of the first item returned on the page.
	 **/
	@JsonProperty("start-index")
	private Integer startIndex;

	public PagedListUserDetailsApplicationUser() {
	}


	public PagedListUserDetailsApplicationUser(
		Integer endIndex,
		List<UserDetails> items,
		Integer maxResults,
		Integer size,
		Integer startIndex
	) {
		this.endIndex = endIndex;
		this.items = items;
		this.maxResults = maxResults;
		this.size = size;
		this.startIndex = startIndex;
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
	 * The index of the last item returned on the page.
	 * @return endIndex
	 **/
	public Integer getEndIndex() {
		return endIndex;
	}

	/**
	 * The list of items.
	 * @return items
	 **/
	public List<UserDetails> getItems() {
		return items;
	}

	/**
	 * The maximum number of results that could be on the page.
	 * @return maxResults
	 **/
	public Integer getMaxResults() {
		return maxResults;
	}

	/**
	 * The number of items on the page.
	 * @return size
	 **/
	public Integer getSize() {
		return size;
	}

	/**
	 * The index of the first item returned on the page.
	 * @return startIndex
	 **/
	public Integer getStartIndex() {
		return startIndex;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class PagedListUserDetailsApplicationUser {\n" +
			"    endIndex: " + toIndentedString(endIndex) + "\n" +
			"    items: " + toIndentedString(items) + "\n" +
			"    maxResults: " + toIndentedString(maxResults) + "\n" +
			"    size: " + toIndentedString(size) + "\n" +
			"    startIndex: " + toIndentedString(startIndex) + "\n" +
			"}";
		return sb;
	}
}
