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

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.net.URI;

@NoArgsConstructor
@AllArgsConstructor
public class Group {

	/**
	 * Expand options that include additional group details in the response.
	 **/

	private String expand;

	/**
	 * The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
	 **/

	private String groupId;

	/**
	 * The name of group.
	 **/

	private String name;

	/**
	 * The URL for these group details.
	 **/

	private URI self;


	private GroupUsers users;

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
	 * Expand options that include additional group details in the response.
	 * @return expand
	 **/
	public String getExpand() {
		return expand;
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

	public Group groupId(String groupId) {
		this.groupId = groupId;
		return this;
	}

	/**
	 * The name of group.
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

	public Group name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The URL for these group details.
	 * @return self
	 **/
	public URI getSelf() {
		return self;
	}

	/**
	 * Get users
	 * @return users
	 **/
	public GroupUsers getUsers() {
		return users;
	}

	/**
	 * Set users
	 **/
	public void setUsers(GroupUsers users) {
		this.users = users;
	}

	public Group users(GroupUsers users) {
		this.users = users;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class Group {\n" +
			"    expand: " + toIndentedString(expand) + "\n" +
			"    groupId: " + toIndentedString(groupId) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"    users: " + toIndentedString(users) + "\n" +
			"}";
		return sb;
	}
}