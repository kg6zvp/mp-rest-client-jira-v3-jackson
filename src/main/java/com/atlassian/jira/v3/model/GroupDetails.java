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
 * Details about a group.
 **/

public class GroupDetails {

	/**
	 * The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
	 **/

	private String groupId;

	/**
	 * The name of the group.
	 **/

	private String name;

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
	 * The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
	 * @return groupId
	 **/
	public String getGroupId() {
		return groupId;
	}

	/**
	 * Set groupId
	 **/
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public GroupDetails groupId(String groupId) {
		this.groupId = groupId;
		return this;
	}

	/**
	 * The name of the group.
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

	public GroupDetails name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class GroupDetails {\n" +
			"    groupId: " + toIndentedString(groupId) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"}";
		return sb;
	}
}
