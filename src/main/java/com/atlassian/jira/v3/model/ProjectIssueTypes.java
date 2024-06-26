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
 * Use the optional `workflows.usages` expand to get additional information about the projects and issue types associated with the requested workflows.
 **/

public class ProjectIssueTypes {

	/**
	 * IDs of the issue types
	 **/
	private Set<String> issueTypes = null;

	private ProjectId project;

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
	 * IDs of the issue types
	 * @return issueTypes
	 **/
	public Set<String> getIssueTypes() {
		return issueTypes;
	}

	/**
	 * Set issueTypes
	 **/
	public void setIssueTypes(Set<String> issueTypes) {
		this.issueTypes = issueTypes;
	}

	public ProjectIssueTypes issueTypes(Set<String> issueTypes) {
		this.issueTypes = issueTypes;
		return this;
	}

	public ProjectIssueTypes addIssueTypesItem(String issueTypesItem) {
		if (this.issueTypes == null) {
			this.issueTypes = new LinkedHashSet<>();
		}
		this.issueTypes.add(issueTypesItem);
		return this;
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

	public ProjectIssueTypes project(ProjectId project) {
		this.project = project;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ProjectIssueTypes {\n" +
			"    issueTypes: " + toIndentedString(issueTypes) + "\n" +
			"    project: " + toIndentedString(project) + "\n" +
			"}";
		return sb;
	}
}
