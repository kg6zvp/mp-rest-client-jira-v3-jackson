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

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * List of project permissions and the projects and issues those permissions grant access to.
 **/

public class BulkProjectPermissionGrants {

	/**
	 * IDs of the issues the user has the permission for.
	 **/

	private Set<Long> issues = new LinkedHashSet<>();

	/**
	 * A project permission,
	 **/

	private String permission;

	/**
	 * IDs of the projects the user has the permission for.
	 **/

	private Set<Long> projects = new LinkedHashSet<>();

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
	 * IDs of the issues the user has the permission for.
	 * @return issues
	 **/
	public Set<Long> getIssues() {
		return issues;
	}

	/**
	 * Set issues
	 **/
	public void setIssues(Set<Long> issues) {
		this.issues = issues;
	}

	public BulkProjectPermissionGrants issues(Set<Long> issues) {
		this.issues = issues;
		return this;
	}

	public BulkProjectPermissionGrants addIssuesItem(Long issuesItem) {
		if (this.issues == null) {
			this.issues = new LinkedHashSet<>();
		}
		this.issues.add(issuesItem);
		return this;
	}

	/**
	 * A project permission,
	 * @return permission
	 **/
	public String getPermission() {
		return permission;
	}

	/**
	 * Set permission
	 **/
	public void setPermission(String permission) {
		this.permission = permission;
	}

	public BulkProjectPermissionGrants permission(String permission) {
		this.permission = permission;
		return this;
	}

	/**
	 * IDs of the projects the user has the permission for.
	 * @return projects
	 **/
	public Set<Long> getProjects() {
		return projects;
	}

	/**
	 * Set projects
	 **/
	public void setProjects(Set<Long> projects) {
		this.projects = projects;
	}

	public BulkProjectPermissionGrants projects(Set<Long> projects) {
		this.projects = projects;
		return this;
	}

	public BulkProjectPermissionGrants addProjectsItem(Long projectsItem) {
		if (this.projects == null) {
			this.projects = new LinkedHashSet<>();
		}
		this.projects.add(projectsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class BulkProjectPermissionGrants {\n" +
			"    issues: " + toIndentedString(issues) + "\n" +
			"    permission: " + toIndentedString(permission) + "\n" +
			"    projects: " + toIndentedString(projects) + "\n" +
			"}";
		return sb;
	}
}
