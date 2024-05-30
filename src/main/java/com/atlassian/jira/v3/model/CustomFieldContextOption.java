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
 * Details of the custom field options for a context.
 **/

public class CustomFieldContextOption {

	/**
	 * Whether the option is disabled.
	 **/

	private Boolean disabled;

	/**
	 * The ID of the custom field option.
	 **/

	private String id;

	/**
	 * For cascading options, the ID of the custom field option containing the cascading option.
	 **/

	private String optionId;

	/**
	 * The value of the custom field option.
	 **/

	private String value;

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
	 * Whether the option is disabled.
	 * @return disabled
	 **/
	public Boolean getDisabled() {
		return disabled;
	}

	/**
	 * Set disabled
	 **/
	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public CustomFieldContextOption disabled(Boolean disabled) {
		this.disabled = disabled;
		return this;
	}

	/**
	 * The ID of the custom field option.
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

	public CustomFieldContextOption id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * For cascading options, the ID of the custom field option containing the cascading option.
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

	public CustomFieldContextOption optionId(String optionId) {
		this.optionId = optionId;
		return this;
	}

	/**
	 * The value of the custom field option.
	 * @return value
	 **/
	public String getValue() {
		return value;
	}

	/**
	 * Set value
	 **/
	public void setValue(String value) {
		this.value = value;
	}

	public CustomFieldContextOption value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldContextOption {\n" +
			"    disabled: " + toIndentedString(disabled) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    optionId: " + toIndentedString(optionId) + "\n" +
			"    value: " + toIndentedString(value) + "\n" +
			"}";
		return sb;
	}
}
