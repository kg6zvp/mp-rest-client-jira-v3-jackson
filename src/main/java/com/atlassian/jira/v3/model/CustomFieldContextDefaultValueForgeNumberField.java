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
 * Default value for a Forge number custom field.
 **/

public class CustomFieldContextDefaultValueForgeNumberField {

	/**
	 * The ID of the context.
	 **/

	private String contextId;

	/**
	 * The default floating-point number.
	 **/

	private Double number;


	private String type;

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
	 * The ID of the context.
	 * @return contextId
	 **/
	public String getContextId() {
		return contextId;
	}

	/**
	 * Set contextId
	 **/
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	public CustomFieldContextDefaultValueForgeNumberField contextId(String contextId) {
		this.contextId = contextId;
		return this;
	}

	/**
	 * The default floating-point number.
	 * @return number
	 **/
	public Double getNumber() {
		return number;
	}

	/**
	 * Set number
	 **/
	public void setNumber(Double number) {
		this.number = number;
	}

	public CustomFieldContextDefaultValueForgeNumberField number(Double number) {
		this.number = number;
		return this;
	}

	/**
	 * Get type
	 * @return type
	 **/
	public String getType() {
		return type;
	}

	/**
	 * Set type
	 **/
	public void setType(String type) {
		this.type = type;
	}

	public CustomFieldContextDefaultValueForgeNumberField type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldContextDefaultValueForgeNumberField {\n" +
			"    contextId: " + toIndentedString(contextId) + "\n" +
			"    number: " + toIndentedString(number) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}
}
