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

import java.util.HashMap;
import java.util.Map;

/**
 * The statuses referenced in the workflow.
 **/

public class WorkflowReferenceStatus {

	/**
	 * Indicates if the status is deprecated.
	 **/

	private Boolean deprecated;


	private WorkflowStatusLayout layout;

	/**
	 * The properties associated with the status.
	 **/

	private Map<String, String> properties = null;

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
	 * Indicates if the status is deprecated.
	 * @return deprecated
	 **/
	public Boolean getDeprecated() {
		return deprecated;
	}

	/**
	 * Set deprecated
	 **/
	public void setDeprecated(Boolean deprecated) {
		this.deprecated = deprecated;
	}

	public WorkflowReferenceStatus deprecated(Boolean deprecated) {
		this.deprecated = deprecated;
		return this;
	}

	/**
	 * Get layout
	 * @return layout
	 **/
	public WorkflowStatusLayout getLayout() {
		return layout;
	}

	/**
	 * Set layout
	 **/
	public void setLayout(WorkflowStatusLayout layout) {
		this.layout = layout;
	}

	public WorkflowReferenceStatus layout(WorkflowStatusLayout layout) {
		this.layout = layout;
		return this;
	}

	/**
	 * The properties associated with the status.
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

	public WorkflowReferenceStatus properties(Map<String, String> properties) {
		this.properties = properties;
		return this;
	}

	public WorkflowReferenceStatus putPropertiesItem(String key, String propertiesItem) {
		if (this.properties == null) {
			this.properties = new HashMap<>();
		}
		this.properties.put(key, propertiesItem);
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

	public WorkflowReferenceStatus statusReference(String statusReference) {
		this.statusReference = statusReference;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowReferenceStatus {\n" +
			"    deprecated: " + toIndentedString(deprecated) + "\n" +
			"    layout: " + toIndentedString(layout) + "\n" +
			"    properties: " + toIndentedString(properties) + "\n" +
			"    statusReference: " + toIndentedString(statusReference) + "\n" +
			"}";
		return sb;
	}
}
