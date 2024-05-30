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

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * A list of the issues matched to a JQL query or details of errors encountered during matching.
 **/

public class IssueMatchesForJQL {

	/**
	 * A list of errors.
	 **/

	private Set<String> errors = new LinkedHashSet<>();

	/**
	 * A list of issue IDs.
	 **/

	private Set<Long> matchedIssues = new LinkedHashSet<>();

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
	 * A list of errors.
	 * @return errors
	 **/
	public Set<String> getErrors() {
		return errors;
	}

	/**
	 * Set errors
	 **/
	public void setErrors(Set<String> errors) {
		this.errors = errors;
	}

	public IssueMatchesForJQL errors(Set<String> errors) {
		this.errors = errors;
		return this;
	}

	public IssueMatchesForJQL addErrorsItem(String errorsItem) {
		if (this.errors == null) {
			this.errors = new LinkedHashSet<>();
		}
		this.errors.add(errorsItem);
		return this;
	}

	/**
	 * A list of issue IDs.
	 * @return matchedIssues
	 **/
	public Set<Long> getMatchedIssues() {
		return matchedIssues;
	}

	/**
	 * Set matchedIssues
	 **/
	public void setMatchedIssues(Set<Long> matchedIssues) {
		this.matchedIssues = matchedIssues;
	}

	public IssueMatchesForJQL matchedIssues(Set<Long> matchedIssues) {
		this.matchedIssues = matchedIssues;
		return this;
	}

	public IssueMatchesForJQL addMatchedIssuesItem(Long matchedIssuesItem) {
		if (this.matchedIssues == null) {
			this.matchedIssues = new LinkedHashSet<>();
		}
		this.matchedIssues.add(matchedIssuesItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueMatchesForJQL {\n" +
			"    errors: " + toIndentedString(errors) + "\n" +
			"    matchedIssues: " + toIndentedString(matchedIssues) + "\n" +
			"}";
		return sb;
	}
}
