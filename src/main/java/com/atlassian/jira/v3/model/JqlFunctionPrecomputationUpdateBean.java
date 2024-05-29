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

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Precomputation id and its new value.
 **/
@NoArgsConstructor
@AllArgsConstructor
public class JqlFunctionPrecomputationUpdateBean {

	/**
	 * The error message to be displayed to the user if the given function clause is no longer valid during recalculation of the precomputation.
	 **/
	private String error;

	/**
	 * The id of the precomputation to update.
	 **/
	private String id;

	/**
	 * The new value of the precomputation.
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
	 * The error message to be displayed to the user if the given function clause is no longer valid during recalculation of the precomputation.
	 * @return error
	 **/
	public String getError() {
		return error;
	}

	/**
	 * Set error
	 **/
	public void setError(String error) {
		this.error = error;
	}

	public JqlFunctionPrecomputationUpdateBean error(String error) {
		this.error = error;
		return this;
	}

	/**
	 * The id of the precomputation to update.
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

	public JqlFunctionPrecomputationUpdateBean id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The new value of the precomputation.
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

	public JqlFunctionPrecomputationUpdateBean value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class JqlFunctionPrecomputationUpdateBean {\n" +
			"    error: " + toIndentedString(error) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    value: " + toIndentedString(value) + "\n" +
			"}";
		return sb;
	}
}