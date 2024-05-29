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
 * Details of the options to update for a custom field.
 **/

public class BulkCustomFieldOptionUpdateRequest {

	/**
	 * Details of the options to update.
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
	 * Details of the options to update.
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

	public BulkCustomFieldOptionUpdateRequest options(List<CustomFieldOptionUpdate> options) {
		this.options = options;
		return this;
	}

	public BulkCustomFieldOptionUpdateRequest addOptionsItem(CustomFieldOptionUpdate optionsItem) {
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

		String sb = "class BulkCustomFieldOptionUpdateRequest {\n" +
			"    options: " + toIndentedString(options) + "\n" +
			"}";
		return sb;
	}
}
