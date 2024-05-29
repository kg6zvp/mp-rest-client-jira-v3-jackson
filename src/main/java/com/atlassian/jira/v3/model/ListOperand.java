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

import java.util.ArrayList;
import java.util.List;

/**
 * An operand that is a list of values.
 **/

public class ListOperand {

	/**
	 * Encoded operand, which can be used directly in a JQL query.
	 **/

	private String encodedOperand;

	/**
	 * The list of operand values.
	 **/

	private List<JqlQueryUnitaryOperand> values = new ArrayList<>();

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
	 * Encoded operand, which can be used directly in a JQL query.
	 * @return encodedOperand
	 **/
	public String getEncodedOperand() {
		return encodedOperand;
	}

	/**
	 * Set encodedOperand
	 **/
	public void setEncodedOperand(String encodedOperand) {
		this.encodedOperand = encodedOperand;
	}

	public ListOperand encodedOperand(String encodedOperand) {
		this.encodedOperand = encodedOperand;
		return this;
	}

	/**
	 * The list of operand values.
	 * @return values
	 **/
	public List<JqlQueryUnitaryOperand> getValues() {
		return values;
	}

	/**
	 * Set values
	 **/
	public void setValues(List<JqlQueryUnitaryOperand> values) {
		this.values = values;
	}

	public ListOperand values(List<JqlQueryUnitaryOperand> values) {
		this.values = values;
		return this;
	}

	public ListOperand addValuesItem(JqlQueryUnitaryOperand valuesItem) {
		if (this.values == null) {
			this.values = new ArrayList<>();
		}
		this.values.add(valuesItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ListOperand {\n" +
			"    encodedOperand: " + toIndentedString(encodedOperand) + "\n" +
			"    values: " + toIndentedString(values) + "\n" +
			"}";
		return sb;
	}
}
