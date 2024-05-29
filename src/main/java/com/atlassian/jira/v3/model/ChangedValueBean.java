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
 * Details of names changed in the record event.
 **/

public class ChangedValueBean {

	/**
	 * The value of the field before the change.
	 **/

	private String changedFrom;

	/**
	 * The value of the field after the change.
	 **/

	private String changedTo;

	/**
	 * The name of the field changed.
	 **/

	private String fieldName;

	public ChangedValueBean() {
	}


	public ChangedValueBean(
		String changedFrom,
		String changedTo,
		String fieldName
	) {
		this.changedFrom = changedFrom;
		this.changedTo = changedTo;
		this.fieldName = fieldName;
	}

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
	 * The value of the field before the change.
	 * @return changedFrom
	 **/
	public String getChangedFrom() {
		return changedFrom;
	}

	/**
	 * The value of the field after the change.
	 * @return changedTo
	 **/
	public String getChangedTo() {
		return changedTo;
	}

	/**
	 * The name of the field changed.
	 * @return fieldName
	 **/
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ChangedValueBean {\n" +
			"    changedFrom: " + toIndentedString(changedFrom) + "\n" +
			"    changedTo: " + toIndentedString(changedTo) + "\n" +
			"    fieldName: " + toIndentedString(fieldName) + "\n" +
			"}";
		return sb;
	}
}
