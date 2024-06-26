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

/**
 * List of users and groups found in a search.
 **/

public class FoundUsersAndGroups {


	private FoundGroups groups;


	private FoundUsers users;

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
	 * Get groups
	 * @return groups
	 **/
	public FoundGroups getGroups() {
		return groups;
	}

	/**
	 * Set groups
	 **/
	public void setGroups(FoundGroups groups) {
		this.groups = groups;
	}

	public FoundUsersAndGroups groups(FoundGroups groups) {
		this.groups = groups;
		return this;
	}

	/**
	 * Get users
	 * @return users
	 **/
	public FoundUsers getUsers() {
		return users;
	}

	/**
	 * Set users
	 **/
	public void setUsers(FoundUsers users) {
		this.users = users;
	}

	public FoundUsersAndGroups users(FoundUsers users) {
		this.users = users;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class FoundUsersAndGroups {\n" +
			"    groups: " + toIndentedString(groups) + "\n" +
			"    users: " + toIndentedString(users) + "\n" +
			"}";
		return sb;
	}
}
