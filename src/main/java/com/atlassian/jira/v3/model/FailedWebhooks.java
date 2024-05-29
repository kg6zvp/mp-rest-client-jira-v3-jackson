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

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * A page of failed webhooks.
 **/

public class FailedWebhooks {

	/**
	 * The maximum number of items on the page. If the list of values is shorter than this number, then there are no more pages.
	 **/

	private Integer maxResults;

	/**
	 * The URL to the next page of results. Present only if the request returned at least one result.The next page may be empty at the time of receiving the response, but new failed webhooks may appear in time. You can save the URL to the next page and query for new results periodically (for example, every hour).
	 **/

	private URI next;

	/**
	 * The list of webhooks.
	 **/

	private List<FailedWebhook> values = new ArrayList<>();

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
	 * The maximum number of items on the page. If the list of values is shorter than this number, then there are no more pages.
	 * @return maxResults
	 **/
	public Integer getMaxResults() {
		return maxResults;
	}

	/**
	 * Set maxResults
	 **/
	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public FailedWebhooks maxResults(Integer maxResults) {
		this.maxResults = maxResults;
		return this;
	}

	/**
	 * The URL to the next page of results. Present only if the request returned at least one result.The next page may be empty at the time of receiving the response, but new failed webhooks may appear in time. You can save the URL to the next page and query for new results periodically (for example, every hour).
	 * @return next
	 **/
	public URI getNext() {
		return next;
	}

	/**
	 * Set next
	 **/
	public void setNext(URI next) {
		this.next = next;
	}

	public FailedWebhooks next(URI next) {
		this.next = next;
		return this;
	}

	/**
	 * The list of webhooks.
	 * @return values
	 **/
	public List<FailedWebhook> getValues() {
		return values;
	}

	/**
	 * Set values
	 **/
	public void setValues(List<FailedWebhook> values) {
		this.values = values;
	}

	public FailedWebhooks values(List<FailedWebhook> values) {
		this.values = values;
		return this;
	}

	public FailedWebhooks addValuesItem(FailedWebhook valuesItem) {
		if (this.values == null) {
			this.values = new ArrayList<>();
		}
		this.values.add(valuesItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class FailedWebhooks {\n" +
			"    maxResults: " + toIndentedString(maxResults) + "\n" +
			"    next: " + toIndentedString(next) + "\n" +
			"    values: " + toIndentedString(values) + "\n" +
			"}";
		return sb;
	}
}
