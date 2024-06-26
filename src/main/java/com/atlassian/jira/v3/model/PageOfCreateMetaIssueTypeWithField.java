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

/**
 * A page of CreateMetaIssueType with Field.
 **/

public class PageOfCreateMetaIssueTypeWithField extends HashMap<String, Object> {

	/**
	 * The collection of FieldCreateMetaBeans.
	 **/

	private List<FieldCreateMetadata> fields = null;

	/**
	 * The maximum number of items to return per page.
	 **/

	private Integer maxResults;


	private List<FieldCreateMetadata> results = null;

	/**
	 * The index of the first item returned.
	 **/

	private Long startAt;

	/**
	 * The total number of items in all pages.
	 **/

	private Long total;

	public PageOfCreateMetaIssueTypeWithField() {
	}


	public PageOfCreateMetaIssueTypeWithField(
		List<FieldCreateMetadata> fields,
		Integer maxResults,
		Long startAt,
		Long total
	) {
		this.fields = fields;
		this.maxResults = maxResults;
		this.startAt = startAt;
		this.total = total;
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
	 * The collection of FieldCreateMetaBeans.
	 * @return fields
	 **/
	public List<FieldCreateMetadata> getFields() {
		return fields;
	}

	/**
	 * The maximum number of items to return per page.
	 * @return maxResults
	 **/
	public Integer getMaxResults() {
		return maxResults;
	}

	/**
	 * Get results
	 * @return results
	 **/
	public List<FieldCreateMetadata> getResults() {
		return results;
	}

	/**
	 * Set results
	 **/
	public void setResults(List<FieldCreateMetadata> results) {
		this.results = results;
	}

	public PageOfCreateMetaIssueTypeWithField results(List<FieldCreateMetadata> results) {
		this.results = results;
		return this;
	}

	public PageOfCreateMetaIssueTypeWithField addResultsItem(FieldCreateMetadata resultsItem) {
		if (this.results == null) {
			this.results = new ArrayList<>();
		}
		this.results.add(resultsItem);
		return this;
	}

	/**
	 * The index of the first item returned.
	 * @return startAt
	 **/
	public Long getStartAt() {
		return startAt;
	}

	/**
	 * The total number of items in all pages.
	 * @return total
	 **/
	public Long getTotal() {
		return total;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class PageOfCreateMetaIssueTypeWithField {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    fields: " + toIndentedString(fields) + "\n" +
			"    maxResults: " + toIndentedString(maxResults) + "\n" +
			"    results: " + toIndentedString(results) + "\n" +
			"    startAt: " + toIndentedString(startAt) + "\n" +
			"    total: " + toIndentedString(total) + "\n" +
			"}";
		return sb;
	}
}
