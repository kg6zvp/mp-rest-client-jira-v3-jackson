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

/**
 * The default value for a cascading select custom field.
 **/

public class CustomFieldContextDefaultValueCascadingOption {

	/**
	 * The ID of the default cascading option.
	 **/

	private String cascadingOptionId;

	/**
	 * The ID of the context.
	 **/

	private String contextId;

	/**
	 * The ID of the default option.
	 **/

	private String optionId;


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
	 * The ID of the default cascading option.
	 * @return cascadingOptionId
	 **/
	public String getCascadingOptionId() {
		return cascadingOptionId;
	}

	/**
	 * Set cascadingOptionId
	 **/
	public void setCascadingOptionId(String cascadingOptionId) {
		this.cascadingOptionId = cascadingOptionId;
	}

	public CustomFieldContextDefaultValueCascadingOption cascadingOptionId(String cascadingOptionId) {
		this.cascadingOptionId = cascadingOptionId;
		return this;
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

	public CustomFieldContextDefaultValueCascadingOption contextId(String contextId) {
		this.contextId = contextId;
		return this;
	}

	/**
	 * The ID of the default option.
	 * @return optionId
	 **/
	public String getOptionId() {
		return optionId;
	}

	/**
	 * Set optionId
	 **/
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	public CustomFieldContextDefaultValueCascadingOption optionId(String optionId) {
		this.optionId = optionId;
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

	public CustomFieldContextDefaultValueCascadingOption type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldContextDefaultValueCascadingOption {\n" +
			"    cascadingOptionId: " + toIndentedString(cascadingOptionId) + "\n" +
			"    contextId: " + toIndentedString(contextId) + "\n" +
			"    optionId: " + toIndentedString(optionId) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}
}
