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
 * The project and issue type mapping with a matching custom field context.
 **/

public class ContextForProjectAndIssueType {

	/**
	 * The ID of the custom field context.
	 **/

	private String contextId;

	/**
	 * The ID of the issue type.
	 **/

	private String issueTypeId;

	/**
	 * The ID of the project.
	 **/

	private String projectId;

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
	 * The ID of the custom field context.
	 * @return contextId
	 **/
	public String getContextId() {
		return contextId;
	}

	/**
	 * Set contextId
	 **/
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	public ContextForProjectAndIssueType contextId(String contextId) {
		this.contextId = contextId;
		return this;
	}

	/**
	 * The ID of the issue type.
	 * @return issueTypeId
	 **/
	public String getIssueTypeId() {
		return issueTypeId;
	}

	/**
	 * Set issueTypeId
	 **/
	public void setIssueTypeId(String issueTypeId) {
		this.issueTypeId = issueTypeId;
	}

	public ContextForProjectAndIssueType issueTypeId(String issueTypeId) {
		this.issueTypeId = issueTypeId;
		return this;
	}

	/**
	 * The ID of the project.
	 * @return projectId
	 **/
	public String getProjectId() {
		return projectId;
	}

	/**
	 * Set projectId
	 **/
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public ContextForProjectAndIssueType projectId(String projectId) {
		this.projectId = projectId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ContextForProjectAndIssueType {\n" +
			"    contextId: " + toIndentedString(contextId) + "\n" +
			"    issueTypeId: " + toIndentedString(issueTypeId) + "\n" +
			"    projectId: " + toIndentedString(projectId) + "\n" +
			"}";
		return sb;
	}
}
