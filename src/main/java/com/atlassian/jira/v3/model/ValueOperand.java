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
 * An operand that is a user-provided value.
 **/

public class ValueOperand {

	/**
	 * Encoded value, which can be used directly in a JQL query.
	 **/

	private String encodedValue;

	/**
	 * The operand value.
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
	 * Encoded value, which can be used directly in a JQL query.
	 * @return encodedValue
	 **/
	public String getEncodedValue() {
		return encodedValue;
	}

	/**
	 * Set encodedValue
	 **/
	public void setEncodedValue(String encodedValue) {
		this.encodedValue = encodedValue;
	}

	public ValueOperand encodedValue(String encodedValue) {
		this.encodedValue = encodedValue;
		return this;
	}

	/**
	 * The operand value.
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

	public ValueOperand value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ValueOperand {\n" +
			"    encodedValue: " + toIndentedString(encodedValue) + "\n" +
			"    value: " + toIndentedString(value) + "\n" +
			"}";
		return sb;
	}
}
