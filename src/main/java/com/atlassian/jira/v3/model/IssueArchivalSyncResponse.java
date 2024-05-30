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

/**
 * Number of archived/unarchived issues and list of errors that occurred during the action, if any.
 **/

public class IssueArchivalSyncResponse {


	private Errors errors;


	private Long numberOfIssuesUpdated;

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
	 * Get errors
	 * @return errors
	 **/
	public Errors getErrors() {
		return errors;
	}

	/**
	 * Set errors
	 **/
	public void setErrors(Errors errors) {
		this.errors = errors;
	}

	public IssueArchivalSyncResponse errors(Errors errors) {
		this.errors = errors;
		return this;
	}

	/**
	 * Get numberOfIssuesUpdated
	 * @return numberOfIssuesUpdated
	 **/
	public Long getNumberOfIssuesUpdated() {
		return numberOfIssuesUpdated;
	}

	/**
	 * Set numberOfIssuesUpdated
	 **/
	public void setNumberOfIssuesUpdated(Long numberOfIssuesUpdated) {
		this.numberOfIssuesUpdated = numberOfIssuesUpdated;
	}

	public IssueArchivalSyncResponse numberOfIssuesUpdated(Long numberOfIssuesUpdated) {
		this.numberOfIssuesUpdated = numberOfIssuesUpdated;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueArchivalSyncResponse {\n" +
			"    errors: " + toIndentedString(errors) + "\n" +
			"    numberOfIssuesUpdated: " + toIndentedString(numberOfIssuesUpdated) + "\n" +
			"}";
		return sb;
	}
}
