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

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;

/**
 * Details about a project role.
 **/

public class ProjectRoleDetails {

	/**
	 * Whether this role is the admin role for the project.
	 **/

	private Boolean admin;

	/**
	 * Whether this role is the default role for the project.
	 **/
	@JsonProperty("default")
	private Boolean _default;

	/**
	 * The description of the project role.
	 **/

	private String description;

	/**
	 * The ID of the project role.
	 **/

	private Long id;

	/**
	 * The name of the project role.
	 **/

	private String name;

	/**
	 * Whether the roles are configurable for this project.
	 **/

	private Boolean roleConfigurable;


	private ProjectRoleScope scope;

	/**
	 * The URL the project role details.
	 **/

	private URI self;

	/**
	 * The translated name of the project role.
	 **/

	private String translatedName;

	public ProjectRoleDetails() {
	}


	public ProjectRoleDetails(
		Boolean admin,
		Boolean _default,
		String description,
		Long id,
		Boolean roleConfigurable,
		URI self
	) {
		this.admin = admin;
		this._default = _default;
		this.description = description;
		this.id = id;
		this.roleConfigurable = roleConfigurable;
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
	 * Whether this role is the admin role for the project.
	 * @return admin
	 **/
	public Boolean getAdmin() {
		return admin;
	}

	/**
	 * Whether this role is the default role for the project.
	 * @return _default
	 **/
	public Boolean getDefault() {
		return _default;
	}

	/**
	 * The description of the project role.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * The ID of the project role.
	 * @return id
	 **/
	public Long getId() {
		return id;
	}

	/**
	 * The name of the project role.
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

	public ProjectRoleDetails name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Whether the roles are configurable for this project.
	 * @return roleConfigurable
	 **/
	public Boolean getRoleConfigurable() {
		return roleConfigurable;
	}

	/**
	 * Get scope
	 * @return scope
	 **/
	public ProjectRoleScope getScope() {
		return scope;
	}

	/**
	 * Set scope
	 **/
	public void setScope(ProjectRoleScope scope) {
		this.scope = scope;
	}

	public ProjectRoleDetails scope(ProjectRoleScope scope) {
		this.scope = scope;
		return this;
	}

	/**
	 * The URL the project role details.
	 * @return self
	 **/
	public URI getSelf() {
		return self;
	}

	/**
	 * The translated name of the project role.
	 * @return translatedName
	 **/
	public String getTranslatedName() {
		return translatedName;
	}

	/**
	 * Set translatedName
	 **/
	public void setTranslatedName(String translatedName) {
		this.translatedName = translatedName;
	}

	public ProjectRoleDetails translatedName(String translatedName) {
		this.translatedName = translatedName;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ProjectRoleDetails {\n" +
			"    admin: " + toIndentedString(admin) + "\n" +
			"    _default: " + toIndentedString(_default) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    roleConfigurable: " + toIndentedString(roleConfigurable) + "\n" +
			"    scope: " + toIndentedString(scope) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"    translatedName: " + toIndentedString(translatedName) + "\n" +
			"}";
		return sb;
	}
}
