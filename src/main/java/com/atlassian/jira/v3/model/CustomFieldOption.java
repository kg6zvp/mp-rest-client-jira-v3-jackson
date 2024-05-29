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

import java.net.URI;

/**
 * Details of a custom option for a field.
 **/

public class CustomFieldOption {

	/**
	 * The URL of these custom field option details.
	 **/

	private URI self;

	/**
	 * The value of the custom field option.
	 **/

	private String value;

	public CustomFieldOption() {
	}


	public CustomFieldOption(
		URI self,
		String value
	) {
		this.self = self;
		this.value = value;
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
	 * The URL of these custom field option details.
	 * @return self
	 **/
	public URI getSelf() {
		return self;
	}

	/**
	 * The value of the custom field option.
	 * @return value
	 **/
	public String getValue() {
		return value;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldOption {\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"    value: " + toIndentedString(value) + "\n" +
			"}";
		return sb;
	}
}