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

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * The data type of the field.
 **/

public class FieldCreateMetadataSchema {

	/**
	 * If the field is a custom field, the configuration of the field.
	 **/
	@JsonProperty("configuration")
	private Map<String, Object> _configuration = null;

	/**
	 * If the field is a custom field, the URI of the field.
	 **/

	private String custom;

	/**
	 * If the field is a custom field, the custom ID of the field.
	 **/

	private Long customId;

	/**
	 * When the data type is an array, the name of the field items within the array.
	 **/

	private String items;

	/**
	 * If the field is a system field, the name of the field.
	 **/

	private String system;

	/**
	 * The data type of the field.
	 **/

	private String type;

	public FieldCreateMetadataSchema() {
	}


	public FieldCreateMetadataSchema(
		Map<String, Object> _configuration,
		String custom,
		Long customId,
		String items,
		String system,
		String type
	) {
		this._configuration = _configuration;
		this.custom = custom;
		this.customId = customId;
		this.items = items;
		this.system = system;
		this.type = type;
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
	 * If the field is a custom field, the configuration of the field.
	 * @return _configuration
	 **/
	public Map<String, Object> getConfiguration() {
		return _configuration;
	}

	/**
	 * If the field is a custom field, the URI of the field.
	 * @return custom
	 **/
	public String getCustom() {
		return custom;
	}

	/**
	 * If the field is a custom field, the custom ID of the field.
	 * @return customId
	 **/
	public Long getCustomId() {
		return customId;
	}

	/**
	 * When the data type is an array, the name of the field items within the array.
	 * @return items
	 **/
	public String getItems() {
		return items;
	}

	/**
	 * If the field is a system field, the name of the field.
	 * @return system
	 **/
	public String getSystem() {
		return system;
	}

	/**
	 * The data type of the field.
	 * @return type
	 **/
	public String getType() {
		return type;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class FieldCreateMetadataSchema {\n" +
			"    _configuration: " + toIndentedString(_configuration) + "\n" +
			"    custom: " + toIndentedString(custom) + "\n" +
			"    customId: " + toIndentedString(customId) + "\n" +
			"    items: " + toIndentedString(items) + "\n" +
			"    system: " + toIndentedString(system) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}
}
