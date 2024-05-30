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
 * Details of a priority scheme.
 **/

public class UpdatePrioritySchemeRequestBean {

	/**
	 * The default priority of the scheme.
	 **/

	private Long defaultPriorityId;

	/**
	 * The description of the priority scheme.
	 **/

	private String description;


	private PriorityMapping mappings;

	/**
	 * The name of the priority scheme. Must be unique.
	 **/

	private String name;


	private UpdatePrioritiesInSchemeRequestBean priorities;


	private UpdateProjectsInSchemeRequestBean projects;

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
	 * The default priority of the scheme.
	 * @return defaultPriorityId
	 **/
	public Long getDefaultPriorityId() {
		return defaultPriorityId;
	}

	/**
	 * Set defaultPriorityId
	 **/
	public void setDefaultPriorityId(Long defaultPriorityId) {
		this.defaultPriorityId = defaultPriorityId;
	}

	public UpdatePrioritySchemeRequestBean defaultPriorityId(Long defaultPriorityId) {
		this.defaultPriorityId = defaultPriorityId;
		return this;
	}

	/**
	 * The description of the priority scheme.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * Set description
	 **/
	public void setDescription(String description) {
		this.description = description;
	}

	public UpdatePrioritySchemeRequestBean description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get mappings
	 * @return mappings
	 **/
	public PriorityMapping getMappings() {
		return mappings;
	}

	/**
	 * Set mappings
	 **/
	public void setMappings(PriorityMapping mappings) {
		this.mappings = mappings;
	}

	public UpdatePrioritySchemeRequestBean mappings(PriorityMapping mappings) {
		this.mappings = mappings;
		return this;
	}

	/**
	 * The name of the priority scheme. Must be unique.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * Set name
	 **/
	public void setName(String name) {
		this.name = name;
	}

	public UpdatePrioritySchemeRequestBean name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get priorities
	 * @return priorities
	 **/
	public UpdatePrioritiesInSchemeRequestBean getPriorities() {
		return priorities;
	}

	/**
	 * Set priorities
	 **/
	public void setPriorities(UpdatePrioritiesInSchemeRequestBean priorities) {
		this.priorities = priorities;
	}

	public UpdatePrioritySchemeRequestBean priorities(UpdatePrioritiesInSchemeRequestBean priorities) {
		this.priorities = priorities;
		return this;
	}

	/**
	 * Get projects
	 * @return projects
	 **/
	public UpdateProjectsInSchemeRequestBean getProjects() {
		return projects;
	}

	/**
	 * Set projects
	 **/
	public void setProjects(UpdateProjectsInSchemeRequestBean projects) {
		this.projects = projects;
	}

	public UpdatePrioritySchemeRequestBean projects(UpdateProjectsInSchemeRequestBean projects) {
		this.projects = projects;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class UpdatePrioritySchemeRequestBean {\n" +
			"    defaultPriorityId: " + toIndentedString(defaultPriorityId) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    mappings: " + toIndentedString(mappings) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    priorities: " + toIndentedString(priorities) + "\n" +
			"    projects: " + toIndentedString(projects) + "\n" +
			"}";
		return sb;
	}
}
