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

import java.util.HashMap;

/**
 * Details of the status being updated.
 **/

public class WorkflowStatusUpdate extends HashMap<String, Object> {

	/**
	 * The description of the status.
	 **/

	private String description;

	/**
	 * The ID of the status.
	 **/

	private String id;

	/**
	 * The name of the status.
	 **/

	private String name;
	/**
	 * The category of the status.
	 **/

	private StatusCategoryEnum statusCategory;
	/**
	 * The reference of the status.
	 **/

	private String statusReference;

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

	public WorkflowStatusUpdate description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The ID of the status.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * Set id
	 **/
	public void setId(String id) {
		this.id = id;
	}

	public WorkflowStatusUpdate id(String id) {
		this.id = id;
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

	public WorkflowStatusUpdate name(String name) {
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

	public WorkflowStatusUpdate statusCategory(StatusCategoryEnum statusCategory) {
		this.statusCategory = statusCategory;
		return this;
	}

	/**
	 * The reference of the status.
	 * @return statusReference
	 **/
	public String getStatusReference() {
		return statusReference;
	}

	/**
	 * Set statusReference
	 **/
	public void setStatusReference(String statusReference) {
		this.statusReference = statusReference;
	}

	public WorkflowStatusUpdate statusReference(String statusReference) {
		this.statusReference = statusReference;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class WorkflowStatusUpdate {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    statusCategory: " + toIndentedString(statusCategory) + "\n" +
			"    statusReference: " + toIndentedString(statusReference) + "\n" +
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