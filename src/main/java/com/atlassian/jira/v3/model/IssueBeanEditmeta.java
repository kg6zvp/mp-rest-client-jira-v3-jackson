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

import java.util.Map;

/**
 * The metadata for the fields on the issue that can be amended.
 **/

public class IssueBeanEditmeta {


	private Map<String, FieldMetadata> fields = null;

	public IssueBeanEditmeta() {
	}


	public IssueBeanEditmeta(
		Map<String, FieldMetadata> fields
	) {
		this.fields = fields;
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
	 * Get fields
	 * @return fields
	 **/
	public Map<String, FieldMetadata> getFields() {
		return fields;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueBeanEditmeta {\n" +
			"    fields: " + toIndentedString(fields) + "\n" +
			"}";
		return sb;
	}
}