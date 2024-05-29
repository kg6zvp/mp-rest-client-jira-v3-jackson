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
 * Details of an application property.
 **/

public class ApplicationProperty {

	/**
	 * The allowed values, if applicable.
	 **/

	private List<String> allowedValues = null;

	/**
	 * The default value of the application property.
	 **/

	private String defaultValue;

	/**
	 * The description of the application property.
	 **/

	private String desc;


	private String example;

	/**
	 * The ID of the application property. The ID and key are the same.
	 **/

	private String id;

	/**
	 * The key of the application property. The ID and key are the same.
	 **/

	private String key;

	/**
	 * The name of the application property.
	 **/

	private String name;

	/**
	 * The data type of the application property.
	 **/

	private String type;

	/**
	 * The new value.
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
	 * The allowed values, if applicable.
	 * @return allowedValues
	 **/
	public List<String> getAllowedValues() {
		return allowedValues;
	}

	/**
	 * Set allowedValues
	 **/
	public void setAllowedValues(List<String> allowedValues) {
		this.allowedValues = allowedValues;
	}

	public ApplicationProperty allowedValues(List<String> allowedValues) {
		this.allowedValues = allowedValues;
		return this;
	}

	public ApplicationProperty addAllowedValuesItem(String allowedValuesItem) {
		if (this.allowedValues == null) {
			this.allowedValues = new ArrayList<>();
		}
		this.allowedValues.add(allowedValuesItem);
		return this;
	}

	/**
	 * The default value of the application property.
	 * @return defaultValue
	 **/
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Set defaultValue
	 **/
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public ApplicationProperty defaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
		return this;
	}

	/**
	 * The description of the application property.
	 * @return desc
	 **/
	public String getDesc() {
		return desc;
	}

	/**
	 * Set desc
	 **/
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public ApplicationProperty desc(String desc) {
		this.desc = desc;
		return this;
	}

	/**
	 * Get example
	 * @return example
	 **/
	public String getExample() {
		return example;
	}

	/**
	 * Set example
	 **/
	public void setExample(String example) {
		this.example = example;
	}

	public ApplicationProperty example(String example) {
		this.example = example;
		return this;
	}

	/**
	 * The ID of the application property. The ID and key are the same.
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

	public ApplicationProperty id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The key of the application property. The ID and key are the same.
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

	public ApplicationProperty key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * The name of the application property.
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

	public ApplicationProperty name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The data type of the application property.
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

	public ApplicationProperty type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * The new value.
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

	public ApplicationProperty value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ApplicationProperty {\n" +
			"    allowedValues: " + toIndentedString(allowedValues) + "\n" +
			"    defaultValue: " + toIndentedString(defaultValue) + "\n" +
			"    desc: " + toIndentedString(desc) + "\n" +
			"    example: " + toIndentedString(example) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    key: " + toIndentedString(key) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"    value: " + toIndentedString(value) + "\n" +
			"}";
		return sb;
	}
}