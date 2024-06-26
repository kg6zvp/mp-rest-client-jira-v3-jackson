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
 * The scope of the workflow.
 **/

public class WorkflowScope {


	private ProjectId project;
	/**
	 * The scope of the workflow. `GLOBAL` for company-managed projects and `PROJECT` for team-managed projects.
	 **/

	private TypeEnum type;

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
	 * Get project
	 * @return project
	 **/
	public ProjectId getProject() {
		return project;
	}

	/**
	 * Set project
	 **/
	public void setProject(ProjectId project) {
		this.project = project;
	}

	public WorkflowScope project(ProjectId project) {
		this.project = project;
		return this;
	}

	/**
	 * The scope of the workflow. &#x60;GLOBAL&#x60; for company-managed projects and &#x60;PROJECT&#x60; for team-managed projects.
	 * @return type
	 **/
	public TypeEnum getType() {
		return type;
	}

	/**
	 * Set type
	 **/
	public void setType(TypeEnum type) {
		this.type = type;
	}

	public WorkflowScope type(TypeEnum type) {
		this.type = type;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowScope {\n" +
			"    project: " + toIndentedString(project) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}

	public enum TypeEnum {

		PROJECT("PROJECT"), GLOBAL("GLOBAL");


		String value;

		TypeEnum(String v) {
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
