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
 * Details of a context to project association.
 **/

public class CustomFieldContextProjectMapping {

	/**
	 * The ID of the context.
	 **/

	private String contextId;

	/**
	 * Whether context is global.
	 **/

	private Boolean isGlobalContext;

	/**
	 * The ID of the project.
	 **/

	private String projectId;

	public CustomFieldContextProjectMapping() {
	}


	public CustomFieldContextProjectMapping(
		String contextId,
		Boolean isGlobalContext,
		String projectId
	) {
		this.contextId = contextId;
		this.isGlobalContext = isGlobalContext;
		this.projectId = projectId;
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
	 * The ID of the context.
	 * @return contextId
	 **/
	public String getContextId() {
		return contextId;
	}

	/**
	 * Whether context is global.
	 * @return isGlobalContext
	 **/
	public Boolean getIsGlobalContext() {
		return isGlobalContext;
	}

	/**
	 * The ID of the project.
	 * @return projectId
	 **/
	public String getProjectId() {
		return projectId;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldContextProjectMapping {\n" +
			"    contextId: " + toIndentedString(contextId) + "\n" +
			"    isGlobalContext: " + toIndentedString(isGlobalContext) + "\n" +
			"    projectId: " + toIndentedString(projectId) + "\n" +
			"}";
		return sb;
	}
}
