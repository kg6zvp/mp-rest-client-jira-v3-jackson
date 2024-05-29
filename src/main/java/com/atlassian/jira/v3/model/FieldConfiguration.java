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

/**
 * Details of a field configuration.
 **/

public class FieldConfiguration {

	/**
	 * The description of the field configuration.
	 **/

	private String description;

	/**
	 * The ID of the field configuration.
	 **/

	private Long id;

	/**
	 * Whether the field configuration is the default.
	 **/

	private Boolean isDefault;

	/**
	 * The name of the field configuration.
	 **/

	private String name;

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
	 * The description of the field configuration.
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

	public FieldConfiguration description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The ID of the field configuration.
	 * @return id
	 **/
	public Long getId() {
		return id;
	}

	/**
	 * Set id
	 **/
	public void setId(Long id) {
		this.id = id;
	}

	public FieldConfiguration id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Whether the field configuration is the default.
	 * @return isDefault
	 **/
	public Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * Set isDefault
	 **/
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public FieldConfiguration isDefault(Boolean isDefault) {
		this.isDefault = isDefault;
		return this;
	}

	/**
	 * The name of the field configuration.
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

	public FieldConfiguration name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class FieldConfiguration {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    isDefault: " + toIndentedString(isDefault) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"}";
		return sb;
	}
}