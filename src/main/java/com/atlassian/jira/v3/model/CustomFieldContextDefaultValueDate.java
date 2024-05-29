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
 * The default value for a Date custom field.
 **/

public class CustomFieldContextDefaultValueDate {

	/**
	 * The default date in ISO format. Ignored if `useCurrent` is true.
	 **/

	private String date;


	private String type;

	/**
	 * Whether to use the current date.
	 **/

	private Boolean useCurrent = false;

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
	 * The default date in ISO format. Ignored if &#x60;useCurrent&#x60; is true.
	 * @return date
	 **/
	public String getDate() {
		return date;
	}

	/**
	 * Set date
	 **/
	public void setDate(String date) {
		this.date = date;
	}

	public CustomFieldContextDefaultValueDate date(String date) {
		this.date = date;
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

	public CustomFieldContextDefaultValueDate type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Whether to use the current date.
	 * @return useCurrent
	 **/
	public Boolean getUseCurrent() {
		return useCurrent;
	}

	/**
	 * Set useCurrent
	 **/
	public void setUseCurrent(Boolean useCurrent) {
		this.useCurrent = useCurrent;
	}

	public CustomFieldContextDefaultValueDate useCurrent(Boolean useCurrent) {
		this.useCurrent = useCurrent;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldContextDefaultValueDate {\n" +
			"    date: " + toIndentedString(date) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"    useCurrent: " + toIndentedString(useCurrent) + "\n" +
			"}";
		return sb;
	}
}