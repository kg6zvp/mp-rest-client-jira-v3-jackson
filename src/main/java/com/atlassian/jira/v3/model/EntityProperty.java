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
 * An entity property, for more information see [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/).
 **/

public class EntityProperty {

	/**
	 * The key of the property. Required on create and update.
	 **/

	private String key;

	/**
	 * The value of the property. Required on create and update.
	 **/

	private Object value = null;

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
	 * The key of the property. Required on create and update.
	 * @return key
	 **/
	public String getKey() {
		return key;
	}

	/**
	 * Set key
	 **/
	public void setKey(String key) {
		this.key = key;
	}

	public EntityProperty key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * The value of the property. Required on create and update.
	 * @return value
	 **/
	public Object getValue() {
		return value;
	}

	/**
	 * Set value
	 **/
	public void setValue(Object value) {
		this.value = value;
	}

	public EntityProperty value(Object value) {
		this.value = value;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class EntityProperty {\n" +
			"    key: " + toIndentedString(key) + "\n" +
			"    value: " + toIndentedString(value) + "\n" +
			"}";
		return sb;
	}
}
