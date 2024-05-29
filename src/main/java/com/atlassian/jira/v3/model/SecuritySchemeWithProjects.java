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
import java.util.Set;

/**
 * Details about an issue security scheme.
 **/

public class SecuritySchemeWithProjects extends HashMap<String, Object> {

	/**
	 * The default level ID of the issue security scheme.
	 **/

	private Long defaultLevel;

	/**
	 * The description of the issue security scheme.
	 **/

	private String description;

	/**
	 * The ID of the issue security scheme.
	 **/

	private Long id;

	/**
	 * The name of the issue security scheme.
	 **/

	private String name;

	/**
	 * The list of project IDs associated with the issue security scheme.
	 **/

	private Set<Long> projectIds = null;

	/**
	 * The URL of the issue security scheme.
	 **/

	private String self;

	public SecuritySchemeWithProjects() {
	}


	public SecuritySchemeWithProjects(
		Long defaultLevel,
		String description,
		Long id,
		String name,
		Set<Long> projectIds,
		String self
	) {
		this.defaultLevel = defaultLevel;
		this.description = description;
		this.id = id;
		this.name = name;
		this.projectIds = projectIds;
		this.self = self;
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
	 * The default level ID of the issue security scheme.
	 * @return defaultLevel
	 **/
	public Long getDefaultLevel() {
		return defaultLevel;
	}

	/**
	 * The description of the issue security scheme.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * The ID of the issue security scheme.
	 * @return id
	 **/
	public Long getId() {
		return id;
	}

	/**
	 * The name of the issue security scheme.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * The list of project IDs associated with the issue security scheme.
	 * @return projectIds
	 **/
	public Set<Long> getProjectIds() {
		return projectIds;
	}

	/**
	 * The URL of the issue security scheme.
	 * @return self
	 **/
	public String getSelf() {
		return self;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class SecuritySchemeWithProjects {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    defaultLevel: " + toIndentedString(defaultLevel) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    projectIds: " + toIndentedString(projectIds) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"}";
		return sb;
	}
}