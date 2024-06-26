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

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.HashMap;

/**
 * The projects the item is associated with. Indicated for items associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO).
 **/
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Scope extends HashMap<String, Object> {


	private ScopeProject project;
	/**
	 * The type of scope.
	 **/

	private TypeEnum type;

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
	 * Get project
	 * @return project
	 **/
	public ScopeProject getProject() {
		return project;
	}

	/**
	 * Set project
	 **/
	public void setProject(ScopeProject project) {
		this.project = project;
	}

	public Scope project(ScopeProject project) {
		this.project = project;
		return this;
	}

	/**
	 * The type of scope.
	 * @return type
	 **/
	public TypeEnum getType() {
		return type;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class Scope {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    project: " + toIndentedString(project) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}

	public enum TypeEnum {

		PROJECT("PROJECT"), TEMPLATE("TEMPLATE");


		String value;

		TypeEnum(String v) {
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
