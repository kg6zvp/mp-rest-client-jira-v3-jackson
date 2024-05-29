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
 * Properties that identify a published workflow.
 **/

public class PublishedWorkflowId {

	/**
	 * The entity ID of the workflow.
	 **/

	private String entityId;

	/**
	 * The name of the workflow.
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
	 * The entity ID of the workflow.
	 * @return entityId
	 **/
	public String getEntityId() {
		return entityId;
	}

	/**
	 * Set entityId
	 **/
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public PublishedWorkflowId entityId(String entityId) {
		this.entityId = entityId;
		return this;
	}

	/**
	 * The name of the workflow.
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

	public PublishedWorkflowId name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class PublishedWorkflowId {\n" +
			"    entityId: " + toIndentedString(entityId) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"}";
		return sb;
	}
}
