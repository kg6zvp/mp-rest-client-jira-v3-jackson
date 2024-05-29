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
 * Details of updates for a custom field.
 **/

public class ConnectCustomFieldValues {

	/**
	 * The list of custom field update details.
	 **/

	private List<ConnectCustomFieldValue> updateValueList = null;

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
	 * The list of custom field update details.
	 * @return updateValueList
	 **/
	public List<ConnectCustomFieldValue> getUpdateValueList() {
		return updateValueList;
	}

	/**
	 * Set updateValueList
	 **/
	public void setUpdateValueList(List<ConnectCustomFieldValue> updateValueList) {
		this.updateValueList = updateValueList;
	}

	public ConnectCustomFieldValues updateValueList(List<ConnectCustomFieldValue> updateValueList) {
		this.updateValueList = updateValueList;
		return this;
	}

	public ConnectCustomFieldValues addUpdateValueListItem(ConnectCustomFieldValue updateValueListItem) {
		if (this.updateValueList == null) {
			this.updateValueList = new ArrayList<>();
		}
		this.updateValueList.add(updateValueListItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ConnectCustomFieldValues {\n" +
			"    updateValueList: " + toIndentedString(updateValueList) + "\n" +
			"}";
		return sb;
	}
}