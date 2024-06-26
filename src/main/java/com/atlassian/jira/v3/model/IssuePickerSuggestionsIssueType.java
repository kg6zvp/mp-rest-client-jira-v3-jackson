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
 * A type of issue suggested for use in auto-completion.
 **/

public class IssuePickerSuggestionsIssueType {

	/**
	 * The ID of the type of issues suggested for use in auto-completion.
	 **/

	private String id;

	/**
	 * A list of issues suggested for use in auto-completion.
	 **/

	private List<SuggestedIssue> issues = null;

	/**
	 * The label of the type of issues suggested for use in auto-completion.
	 **/

	private String label;

	/**
	 * If no issue suggestions are found, returns a message indicating no suggestions were found,
	 **/

	private String msg;

	/**
	 * If issue suggestions are found, returns a message indicating the number of issues suggestions found and returned.
	 **/

	private String sub;

	public IssuePickerSuggestionsIssueType() {
	}


	public IssuePickerSuggestionsIssueType(
		String id,
		List<SuggestedIssue> issues,
		String label,
		String msg,
		String sub
	) {
		this.id = id;
		this.issues = issues;
		this.label = label;
		this.msg = msg;
		this.sub = sub;
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
	 * The ID of the type of issues suggested for use in auto-completion.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * A list of issues suggested for use in auto-completion.
	 * @return issues
	 **/
	public List<SuggestedIssue> getIssues() {
		return issues;
	}

	/**
	 * The label of the type of issues suggested for use in auto-completion.
	 * @return label
	 **/
	public String getLabel() {
		return label;
	}

	/**
	 * If no issue suggestions are found, returns a message indicating no suggestions were found,
	 * @return msg
	 **/
	public String getMsg() {
		return msg;
	}

	/**
	 * If issue suggestions are found, returns a message indicating the number of issues suggestions found and returned.
	 * @return sub
	 **/
	public String getSub() {
		return sub;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssuePickerSuggestionsIssueType {\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    issues: " + toIndentedString(issues) + "\n" +
			"    label: " + toIndentedString(label) + "\n" +
			"    msg: " + toIndentedString(msg) + "\n" +
			"    sub: " + toIndentedString(sub) + "\n" +
			"}";
		return sb;
	}
}
