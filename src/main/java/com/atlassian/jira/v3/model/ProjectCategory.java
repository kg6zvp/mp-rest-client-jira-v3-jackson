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

import java.net.URI;

/**
 * A project category.
 **/

public class ProjectCategory {

	/**
	 * The description of the project category.
	 **/

	private String description;

	/**
	 * The ID of the project category.
	 **/

	private String id;

	/**
	 * The name of the project category. Required on create, optional on update.
	 **/

	private String name;

	/**
	 * The URL of the project category.
	 **/

	private URI self;

	public ProjectCategory() {
	}


	public ProjectCategory(
		String id,
		URI self
	) {
		this.id = id;
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
	 * The description of the project category.
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

	public ProjectCategory description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The ID of the project category.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * The name of the project category. Required on create, optional on update.
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

	public ProjectCategory name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The URL of the project category.
	 * @return self
	 **/
	public URI getSelf() {
		return self;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ProjectCategory {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"}";
		return sb;
	}
}