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

/**
 * Details of the projects the option is available in.
 **/

public class IssueFieldOptionConfiguration {

	/**
	 * DEPRECATED
	 **/
	private Set<AttributesEnum> attributes = null;
	private IssueFieldOptionScopeBean scope;

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
	 * DEPRECATED
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

	public IssueFieldOptionConfiguration attributes(Set<AttributesEnum> attributes) {
		this.attributes = attributes;
		return this;
	}

	public IssueFieldOptionConfiguration addAttributesItem(AttributesEnum attributesItem) {
		if (this.attributes == null) {
			this.attributes = new LinkedHashSet<>();
		}
		this.attributes.add(attributesItem);
		return this;
	}

	/**
	 * Get scope
	 * @return scope
	 **/
	public IssueFieldOptionScopeBean getScope() {
		return scope;
	}

	/**
	 * Set scope
	 **/
	public void setScope(IssueFieldOptionScopeBean scope) {
		this.scope = scope;
	}

	public IssueFieldOptionConfiguration scope(IssueFieldOptionScopeBean scope) {
		this.scope = scope;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueFieldOptionConfiguration {\n" +
			"    attributes: " + toIndentedString(attributes) + "\n" +
			"    scope: " + toIndentedString(scope) + "\n" +
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