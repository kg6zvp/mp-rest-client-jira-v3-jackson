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

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * The default value for a multiple group picker custom field.
 **/

public class CustomFieldContextDefaultValueMultipleGroupPicker {

	/**
	 * The ID of the context.
	 **/

	private String contextId;

	/**
	 * The IDs of the default groups.
	 **/

	private Set<String> groupIds = new LinkedHashSet<>();


	private String type;

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
	 * The ID of the context.
	 * @return contextId
	 **/
	public String getContextId() {
		return contextId;
	}

	/**
	 * Set contextId
	 **/
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	public CustomFieldContextDefaultValueMultipleGroupPicker contextId(String contextId) {
		this.contextId = contextId;
		return this;
	}

	/**
	 * The IDs of the default groups.
	 * @return groupIds
	 **/
	public Set<String> getGroupIds() {
		return groupIds;
	}

	/**
	 * Set groupIds
	 **/
	public void setGroupIds(Set<String> groupIds) {
		this.groupIds = groupIds;
	}

	public CustomFieldContextDefaultValueMultipleGroupPicker groupIds(Set<String> groupIds) {
		this.groupIds = groupIds;
		return this;
	}

	public CustomFieldContextDefaultValueMultipleGroupPicker addGroupIdsItem(String groupIdsItem) {
		if (this.groupIds == null) {
			this.groupIds = new LinkedHashSet<>();
		}
		this.groupIds.add(groupIdsItem);
		return this;
	}

	/**
	 * Get type
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

	public CustomFieldContextDefaultValueMultipleGroupPicker type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldContextDefaultValueMultipleGroupPicker {\n" +
			"    contextId: " + toIndentedString(contextId) + "\n" +
			"    groupIds: " + toIndentedString(groupIds) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}
}
