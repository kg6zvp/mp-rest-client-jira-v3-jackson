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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The mapping of old to new status ID for a specific project and issue type.
 **/

public class StatusMappingDTO extends HashMap<String, Object> {

	/**
	 * The issue type for the status mapping.
	 **/

	private String issueTypeId;

	/**
	 * The project for the status mapping.
	 **/

	private String projectId;

	/**
	 * The list of old and new status ID mappings for the specified project and issue type.
	 **/

	private List<StatusMigration> statusMigrations = new ArrayList<>();

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
	 * The issue type for the status mapping.
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

	public StatusMappingDTO issueTypeId(String issueTypeId) {
		this.issueTypeId = issueTypeId;
		return this;
	}

	/**
	 * The project for the status mapping.
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

	public StatusMappingDTO projectId(String projectId) {
		this.projectId = projectId;
		return this;
	}

	/**
	 * The list of old and new status ID mappings for the specified project and issue type.
	 * @return statusMigrations
	 **/
	public List<StatusMigration> getStatusMigrations() {
		return statusMigrations;
	}

	/**
	 * Set statusMigrations
	 **/
	public void setStatusMigrations(List<StatusMigration> statusMigrations) {
		this.statusMigrations = statusMigrations;
	}

	public StatusMappingDTO statusMigrations(List<StatusMigration> statusMigrations) {
		this.statusMigrations = statusMigrations;
		return this;
	}

	public StatusMappingDTO addStatusMigrationsItem(StatusMigration statusMigrationsItem) {
		if (this.statusMigrations == null) {
			this.statusMigrations = new ArrayList<>();
		}
		this.statusMigrations.add(statusMigrationsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class StatusMappingDTO {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    issueTypeId: " + toIndentedString(issueTypeId) + "\n" +
			"    projectId: " + toIndentedString(projectId) + "\n" +
			"    statusMigrations: " + toIndentedString(statusMigrations) + "\n" +
			"}";
		return sb;
	}
}
