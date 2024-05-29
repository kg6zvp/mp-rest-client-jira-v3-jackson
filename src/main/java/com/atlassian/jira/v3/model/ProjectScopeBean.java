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

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.LinkedHashSet;
import java.util.Set;


public class ProjectScopeBean {

	/**
	 * Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field's value. This is useful for archiving an option that has previously been selected but shouldn't be used anymore.If defaultValue is set, the option is selected by default.
	 **/

	private Set<AttributesEnum> attributes = null;
	/**
	 * The ID of the project that the option's behavior applies to.
	 **/

	private Long id;

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
	 * Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field&#39;s value. This is useful for archiving an option that has previously been selected but shouldn&#39;t be used anymore.If defaultValue is set, the option is selected by default.
	 * @return attributes
	 **/
	public Set<AttributesEnum> getAttributes() {
		return attributes;
	}

	/**
	 * Set attributes
	 **/
	public void setAttributes(Set<AttributesEnum> attributes) {
		this.attributes = attributes;
	}

	public ProjectScopeBean attributes(Set<AttributesEnum> attributes) {
		this.attributes = attributes;
		return this;
	}

	public ProjectScopeBean addAttributesItem(AttributesEnum attributesItem) {
		if (this.attributes == null) {
			this.attributes = new LinkedHashSet<>();
		}
		this.attributes.add(attributesItem);
		return this;
	}

	/**
	 * The ID of the project that the option&#39;s behavior applies to.
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

	public ProjectScopeBean id(Long id) {
		this.id = id;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ProjectScopeBean {\n" +
			"    attributes: " + toIndentedString(attributes) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"}";
		return sb;
	}

	public enum AttributesEnum {

		NOTSELECTABLE("notSelectable"), DEFAULTVALUE("defaultValue");


		String value;

		AttributesEnum(String v) {
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
