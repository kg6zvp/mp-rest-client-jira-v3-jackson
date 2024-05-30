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


public class UserColumnRequestBody {


	private List<String> columns = null;

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
	 * Get columns
	 * @return columns
	 **/
	public List<String> getColumns() {
		return columns;
	}

	/**
	 * Set columns
	 **/
	public void setColumns(List<String> columns) {
		this.columns = columns;
	}

	public UserColumnRequestBody columns(List<String> columns) {
		this.columns = columns;
		return this;
	}

	public UserColumnRequestBody addColumnsItem(String columnsItem) {
		if (this.columns == null) {
			this.columns = new ArrayList<>();
		}
		this.columns.add(columnsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class UserColumnRequestBody {\n" +
			"    columns: " + toIndentedString(columns) + "\n" +
			"}";
		return sb;
	}
}
