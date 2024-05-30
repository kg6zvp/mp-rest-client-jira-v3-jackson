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

import java.net.URI;
import java.util.List;

/**
 * A page of items.
 **/

public class PageBeanProjectDetails {

	/**
	 * Whether this is the last page.
	 **/

	private Boolean isLast;

	/**
	 * The maximum number of items that could be returned.
	 **/

	private Integer maxResults;

	/**
	 * If there is another page of results, the URL of the next page.
	 **/

	private URI nextPage;

	/**
	 * The URL of the page.
	 **/

	private URI self;

	/**
	 * The index of the first item returned.
	 **/

	private Long startAt;

	/**
	 * The number of items returned.
	 **/

	private Long total;

	/**
	 * The list of items.
	 **/

	private List<ProjectDetails> values = null;

	public PageBeanProjectDetails() {
	}


	public PageBeanProjectDetails(
		Boolean isLast,
		Integer maxResults,
		URI nextPage,
		URI self,
		Long startAt,
		Long total,
		List<ProjectDetails> values
	) {
		this.isLast = isLast;
		this.maxResults = maxResults;
		this.nextPage = nextPage;
		this.self = self;
		this.startAt = startAt;
		this.total = total;
		this.values = values;
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
	 * Whether this is the last page.
	 * @return isLast
	 **/
	public Boolean getIsLast() {
		return isLast;
	}

	/**
	 * The maximum number of items that could be returned.
	 * @return maxResults
	 **/
	public Integer getMaxResults() {
		return maxResults;
	}

	/**
	 * If there is another page of results, the URL of the next page.
	 * @return nextPage
	 **/
	public URI getNextPage() {
		return nextPage;
	}

	/**
	 * The URL of the page.
	 * @return self
	 **/
	public URI getSelf() {
		return self;
	}

	/**
	 * The index of the first item returned.
	 * @return startAt
	 **/
	public Long getStartAt() {
		return startAt;
	}

	/**
	 * The number of items returned.
	 * @return total
	 **/
	public Long getTotal() {
		return total;
	}

	/**
	 * The list of items.
	 * @return values
	 **/
	public List<ProjectDetails> getValues() {
		return values;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class PageBeanProjectDetails {\n" +
			"    isLast: " + toIndentedString(isLast) + "\n" +
			"    maxResults: " + toIndentedString(maxResults) + "\n" +
			"    nextPage: " + toIndentedString(nextPage) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"    startAt: " + toIndentedString(startAt) + "\n" +
			"    total: " + toIndentedString(total) + "\n" +
			"    values: " + toIndentedString(values) + "\n" +
			"}";
		return sb;
	}
}
