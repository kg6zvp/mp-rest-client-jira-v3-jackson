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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Details of a status.
 **/
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JiraStatus {

	/**
	 * The description of the status.
	 */
	private String description;

	/**
	 * The ID of the status.
	 */
	private String id;

	/**
	 * The name of the status.
	 */
	private String name;
	private StatusScope scope;
	/**
	 * The category of the status.
	 */
	private StatusCategoryEnum statusCategory;
	/**
	 * Projects and issue types where the status is used. Only available if the `usages` expand is requested.
	 */
	private Set<ProjectIssueTypes> usages = null;
	/**
	 * The workflows that use this status. Only available if the `workflowUsages` expand is requested.
	 */
	private Set<WorkflowUsages> workflowUsages = null;

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

	public JiraStatus description(String description) {
		this.description = description;
		return this;
	}

	public JiraStatus id(String id) {
		this.id = id;
		return this;
	}

	public JiraStatus name(String name) {
		this.name = name;
		return this;
	}

	public JiraStatus scope(StatusScope scope) {
		this.scope = scope;
		return this;
	}

	public JiraStatus statusCategory(StatusCategoryEnum statusCategory) {
		this.statusCategory = statusCategory;
		return this;
	}

	public JiraStatus usages(Set<ProjectIssueTypes> usages) {
		this.usages = usages;
		return this;
	}

	public JiraStatus addUsagesItem(ProjectIssueTypes usagesItem) {
		if (this.usages == null) {
			this.usages = new LinkedHashSet<>();
		}
		this.usages.add(usagesItem);
		return this;
	}

	public JiraStatus workflowUsages(Set<WorkflowUsages> workflowUsages) {
		this.workflowUsages = workflowUsages;
		return this;
	}

	public JiraStatus addWorkflowUsagesItem(WorkflowUsages workflowUsagesItem) {
		if (this.workflowUsages == null) {
			this.workflowUsages = new LinkedHashSet<>();
		}
		this.workflowUsages.add(workflowUsagesItem);
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class JiraStatus {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    scope: " + toIndentedString(scope) + "\n" +
			"    statusCategory: " + toIndentedString(statusCategory) + "\n" +
			"    usages: " + toIndentedString(usages) + "\n" +
			"    workflowUsages: " + toIndentedString(workflowUsages) + "\n" +
			"}";
		return sb;
	}

	public enum StatusCategoryEnum {

		TODO("TODO"), IN_PROGRESS("IN_PROGRESS"), DONE("DONE");


		String value;

		StatusCategoryEnum(String v) {
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
