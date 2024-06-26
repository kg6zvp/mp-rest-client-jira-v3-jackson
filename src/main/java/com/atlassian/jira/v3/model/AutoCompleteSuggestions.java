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
 * The results from a JQL query.
 **/

public class AutoCompleteSuggestions {

	/**
	 * The list of suggested item.
	 **/

	private List<AutoCompleteSuggestion> results = null;

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
	 * The list of suggested item.
	 * @return results
	 **/
	public List<AutoCompleteSuggestion> getResults() {
		return results;
	}

	/**
	 * Set results
	 **/
	public void setResults(List<AutoCompleteSuggestion> results) {
		this.results = results;
	}

	public AutoCompleteSuggestions results(List<AutoCompleteSuggestion> results) {
		this.results = results;
		return this;
	}

	public AutoCompleteSuggestions addResultsItem(AutoCompleteSuggestion resultsItem) {
		if (this.results == null) {
			this.results = new ArrayList<>();
		}
		this.results.add(resultsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class AutoCompleteSuggestions {\n" +
			"    results: " + toIndentedString(results) + "\n" +
			"}";
		return sb;
	}
}
