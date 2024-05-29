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
 * A list of custom field options for a context.
 **/

public class CustomFieldUpdatedContextOptionsList {

	/**
	 * The updated custom field options.
	 **/

	private List<CustomFieldOptionUpdate> options = null;

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
	 * The updated custom field options.
	 * @return options
	 **/
	public List<CustomFieldOptionUpdate> getOptions() {
		return options;
	}

	/**
	 * Set options
	 **/
	public void setOptions(List<CustomFieldOptionUpdate> options) {
		this.options = options;
	}

	public CustomFieldUpdatedContextOptionsList options(List<CustomFieldOptionUpdate> options) {
		this.options = options;
		return this;
	}

	public CustomFieldUpdatedContextOptionsList addOptionsItem(CustomFieldOptionUpdate optionsItem) {
		if (this.options == null) {
			this.options = new ArrayList<>();
		}
		this.options.add(optionsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldUpdatedContextOptionsList {\n" +
			"    options: " + toIndentedString(options) + "\n" +
			"}";
		return sb;
	}
}
