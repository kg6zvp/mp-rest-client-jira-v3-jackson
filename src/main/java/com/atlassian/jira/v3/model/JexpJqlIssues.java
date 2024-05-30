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

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The JQL specifying the issues available in the evaluated Jira expression under the `issues` context variable. Not all issues returned by the JQL query are loaded, only those described by the `startAt` and `maxResults` properties. To determine whether it is necessary to iterate to ensure all the issues returned by the JQL query are evaluated, inspect `meta.issues.jql.count` in the response.
 **/
public class JexpJqlIssues {

	/**
	 * The maximum number of issues to return from the JQL query. Inspect `meta.issues.jql.maxResults` in the response to ensure the maximum value has not been exceeded.
	 **/

	private Integer maxResults;

	/**
	 * The JQL query.
	 **/

	private String query;

	/**
	 * The index of the first issue to return from the JQL query.
	 **/

	private Long startAt;
	/**
	 * Determines how to validate the JQL query and treat the validation results.
	 **/

	private ValidationEnum validation = ValidationEnum.STRICT;

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
	 * The maximum number of issues to return from the JQL query. Inspect &#x60;meta.issues.jql.maxResults&#x60; in the response to ensure the maximum value has not been exceeded.
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

	public JexpJqlIssues maxResults(Integer maxResults) {
		this.maxResults = maxResults;
		return this;
	}

	/**
	 * The JQL query.
	 * @return query
	 **/
	public String getQuery() {
		return query;
	}

	/**
	 * Set query
	 **/
	public void setQuery(String query) {
		this.query = query;
	}

	public JexpJqlIssues query(String query) {
		this.query = query;
		return this;
	}

	/**
	 * The index of the first issue to return from the JQL query.
	 * @return startAt
	 **/
	public Long getStartAt() {
		return startAt;
	}

	/**
	 * Set startAt
	 **/
	public void setStartAt(Long startAt) {
		this.startAt = startAt;
	}

	public JexpJqlIssues startAt(Long startAt) {
		this.startAt = startAt;
		return this;
	}

	/**
	 * Determines how to validate the JQL query and treat the validation results.
	 * @return validation
	 **/
	public ValidationEnum getValidation() {
		return validation;
	}

	/**
	 * Set validation
	 **/
	public void setValidation(ValidationEnum validation) {
		this.validation = validation;
	}

	public JexpJqlIssues validation(ValidationEnum validation) {
		this.validation = validation;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class JexpJqlIssues {\n" +
			"    maxResults: " + toIndentedString(maxResults) + "\n" +
			"    query: " + toIndentedString(query) + "\n" +
			"    startAt: " + toIndentedString(startAt) + "\n" +
			"    validation: " + toIndentedString(validation) + "\n" +
			"}";
		return sb;
	}

	public enum ValidationEnum {

		STRICT("strict"), WARN("warn"), NONE("none");


		String value;

		ValidationEnum(String v) {
			value = v;
		}

		@JsonValue
		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}
	}
}
