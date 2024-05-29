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

public class NestedResponse {


	private ErrorCollection errorCollection;


	private Integer status;


	private WarningCollection warningCollection;

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
	 * Get errorCollection
	 * @return errorCollection
	 **/
	public ErrorCollection getErrorCollection() {
		return errorCollection;
	}

	/**
	 * Set errorCollection
	 **/
	public void setErrorCollection(ErrorCollection errorCollection) {
		this.errorCollection = errorCollection;
	}

	public NestedResponse errorCollection(ErrorCollection errorCollection) {
		this.errorCollection = errorCollection;
		return this;
	}

	/**
	 * Get status
	 * @return status
	 **/
	public Integer getStatus() {
		return status;
	}

	/**
	 * Set status
	 **/
	public void setStatus(Integer status) {
		this.status = status;
	}

	public NestedResponse status(Integer status) {
		this.status = status;
		return this;
	}

	/**
	 * Get warningCollection
	 * @return warningCollection
	 **/
	public WarningCollection getWarningCollection() {
		return warningCollection;
	}

	/**
	 * Set warningCollection
	 **/
	public void setWarningCollection(WarningCollection warningCollection) {
		this.warningCollection = warningCollection;
	}

	public NestedResponse warningCollection(WarningCollection warningCollection) {
		this.warningCollection = warningCollection;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class NestedResponse {\n" +
			"    errorCollection: " + toIndentedString(errorCollection) + "\n" +
			"    status: " + toIndentedString(status) + "\n" +
			"    warningCollection: " + toIndentedString(warningCollection) + "\n" +
			"}";
		return sb;
	}
}
