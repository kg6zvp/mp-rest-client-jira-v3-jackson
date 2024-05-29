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
 * A screen tab field.
 **/

public class ScreenableField {

	/**
	 * The ID of the screen tab field.
	 **/

	private String id;

	/**
	 * The name of the screen tab field. Required on create and update. The maximum length is 255 characters.
	 **/

	private String name;

	public ScreenableField() {
	}


	public ScreenableField(
		String id
	) {
		this.id = id;
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
	 * The ID of the screen tab field.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * The name of the screen tab field. Required on create and update. The maximum length is 255 characters.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * Set name
	 **/
	public void setName(String name) {
		this.name = name;
	}

	public ScreenableField name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ScreenableField {\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"}";
		return sb;
	}
}
