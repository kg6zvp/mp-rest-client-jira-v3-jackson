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
 * The default text for a text area custom field.
 **/

public class CustomFieldContextDefaultValueTextArea {

	/**
	 * The default text. The maximum length is 32767 characters.
	 **/

	private String text;


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
	 * The default text. The maximum length is 32767 characters.
	 * @return text
	 **/
	public String getText() {
		return text;
	}

	/**
	 * Set text
	 **/
	public void setText(String text) {
		this.text = text;
	}

	public CustomFieldContextDefaultValueTextArea text(String text) {
		this.text = text;
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

	public CustomFieldContextDefaultValueTextArea type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldContextDefaultValueTextArea {\n" +
			"    text: " + toIndentedString(text) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}
}
