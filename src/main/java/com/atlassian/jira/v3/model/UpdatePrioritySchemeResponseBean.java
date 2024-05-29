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

import java.util.HashMap;

/**
 * Details of the updated priority scheme.
 **/

public class UpdatePrioritySchemeResponseBean extends HashMap<String, Object> {


	private PrioritySchemeWithPaginatedPrioritiesAndProjects priorityScheme;


	private PrioritySchemeIdTask task;

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
	 * Get priorityScheme
	 * @return priorityScheme
	 **/
	public PrioritySchemeWithPaginatedPrioritiesAndProjects getPriorityScheme() {
		return priorityScheme;
	}

	/**
	 * Set priorityScheme
	 **/
	public void setPriorityScheme(PrioritySchemeWithPaginatedPrioritiesAndProjects priorityScheme) {
		this.priorityScheme = priorityScheme;
	}

	public UpdatePrioritySchemeResponseBean priorityScheme(PrioritySchemeWithPaginatedPrioritiesAndProjects priorityScheme) {
		this.priorityScheme = priorityScheme;
		return this;
	}

	/**
	 * Get task
	 * @return task
	 **/
	public PrioritySchemeIdTask getTask() {
		return task;
	}

	/**
	 * Set task
	 **/
	public void setTask(PrioritySchemeIdTask task) {
		this.task = task;
	}

	public UpdatePrioritySchemeResponseBean task(PrioritySchemeIdTask task) {
		this.task = task;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class UpdatePrioritySchemeResponseBean {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    priorityScheme: " + toIndentedString(priorityScheme) + "\n" +
			"    task: " + toIndentedString(task) + "\n" +
			"}";
		return sb;
	}
}