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
import java.util.Map;

/**
 * The details of a transition status.
 **/

public class CreateWorkflowStatusDetails {

	/**
	 * The ID of the status.
	 **/

	private String id;

	/**
	 * The properties of the status.
	 **/

	private Map<String, String> properties = null;

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

	public CreateWorkflowStatusDetails id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The properties of the status.
	 * @return properties
	 **/
	public Map<String, String> getProperties() {
		return properties;
	}

	/**
	 * Set properties
	 **/
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public CreateWorkflowStatusDetails properties(Map<String, String> properties) {
		this.properties = properties;
		return this;
	}

	public CreateWorkflowStatusDetails putPropertiesItem(String key, String propertiesItem) {
		if (this.properties == null) {
			this.properties = new HashMap<>();
		}
		this.properties.put(key, propertiesItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CreateWorkflowStatusDetails {\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    properties: " + toIndentedString(properties) + "\n" +
			"}";
		return sb;
	}
}
