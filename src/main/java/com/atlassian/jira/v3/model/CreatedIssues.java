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

import java.util.List;

/**
 * Details about the issues created and the errors for requests that failed.
 **/

public class CreatedIssues {

	/**
	 * Error details for failed issue creation requests.
	 **/

	private List<BulkOperationErrorResult> errors = null;

	/**
	 * Details of the issues created.
	 **/

	private List<CreatedIssue> issues = null;

	public CreatedIssues() {
	}


	public CreatedIssues(
		List<BulkOperationErrorResult> errors,
		List<CreatedIssue> issues
	) {
		this.errors = errors;
		this.issues = issues;
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
	 * Error details for failed issue creation requests.
	 * @return errors
	 **/
	public List<BulkOperationErrorResult> getErrors() {
		return errors;
	}

	/**
	 * Details of the issues created.
	 * @return issues
	 **/
	public List<CreatedIssue> getIssues() {
		return issues;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CreatedIssues {\n" +
			"    errors: " + toIndentedString(errors) + "\n" +
			"    issues: " + toIndentedString(issues) + "\n" +
			"}";
		return sb;
	}
}
