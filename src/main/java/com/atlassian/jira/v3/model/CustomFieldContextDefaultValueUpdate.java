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

import java.util.ArrayList;
import java.util.List;

/**
 * Default values to update.
 **/

public class CustomFieldContextDefaultValueUpdate {


	private List<CustomFieldContextDefaultValue> defaultValues = null;

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
	 * Get defaultValues
	 * @return defaultValues
	 **/
	public List<CustomFieldContextDefaultValue> getDefaultValues() {
		return defaultValues;
	}

	/**
	 * Set defaultValues
	 **/
	public void setDefaultValues(List<CustomFieldContextDefaultValue> defaultValues) {
		this.defaultValues = defaultValues;
	}

	public CustomFieldContextDefaultValueUpdate defaultValues(List<CustomFieldContextDefaultValue> defaultValues) {
		this.defaultValues = defaultValues;
		return this;
	}

	public CustomFieldContextDefaultValueUpdate addDefaultValuesItem(CustomFieldContextDefaultValue defaultValuesItem) {
		if (this.defaultValues == null) {
			this.defaultValues = new ArrayList<>();
		}
		this.defaultValues.add(defaultValuesItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldContextDefaultValueUpdate {\n" +
			"    defaultValues: " + toIndentedString(defaultValues) + "\n" +
			"}";
		return sb;
	}
}
