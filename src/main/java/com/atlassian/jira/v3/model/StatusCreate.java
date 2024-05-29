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

/**
 * Details of the status being created.
 **/

public class StatusCreate {

	/**
	 * The description of the status.
	 **/

	private String description;

	/**
	 * The name of the status.
	 **/

	private String name;
	/**
	 * The category of the status.
	 **/

	private StatusCategoryEnum statusCategory;

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
	 * The description of the status.
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

	public StatusCreate description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The name of the status.
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

	public StatusCreate name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The category of the status.
	 * @return statusCategory
	 **/
	public StatusCategoryEnum getStatusCategory() {
		return statusCategory;
	}

	/**
	 * Set statusCategory
	 **/
	public void setStatusCategory(StatusCategoryEnum statusCategory) {
		this.statusCategory = statusCategory;
	}

	public StatusCreate statusCategory(StatusCategoryEnum statusCategory) {
		this.statusCategory = statusCategory;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class StatusCreate {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    statusCategory: " + toIndentedString(statusCategory) + "\n" +
			"}";
		return sb;
	}

	public enum StatusCategoryEnum {

		TODO("TODO"), IN_PROGRESS("IN_PROGRESS"), DONE("DONE");


		String value;

		StatusCategoryEnum(String v) {
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
