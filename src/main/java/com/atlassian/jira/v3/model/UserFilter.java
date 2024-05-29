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

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Filter for a User Picker (single) custom field.
 **/

public class UserFilter {

	/**
	 * Whether the filter is enabled.
	 **/

	private Boolean enabled;

	/**
	 * User groups autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 groups can be provided.
	 **/

	private Set<String> groups = null;

	/**
	 * Roles that autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 roles can be provided.
	 **/

	private Set<Long> roleIds = null;

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
	 * Whether the filter is enabled.
	 * @return enabled
	 **/
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Set enabled
	 **/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public UserFilter enabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	/**
	 * User groups autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 groups can be provided.
	 * @return groups
	 **/
	public Set<String> getGroups() {
		return groups;
	}

	/**
	 * Set groups
	 **/
	public void setGroups(Set<String> groups) {
		this.groups = groups;
	}

	public UserFilter groups(Set<String> groups) {
		this.groups = groups;
		return this;
	}

	public UserFilter addGroupsItem(String groupsItem) {
		if (this.groups == null) {
			this.groups = new LinkedHashSet<>();
		}
		this.groups.add(groupsItem);
		return this;
	}

	/**
	 * Roles that autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 roles can be provided.
	 * @return roleIds
	 **/
	public Set<Long> getRoleIds() {
		return roleIds;
	}

	/**
	 * Set roleIds
	 **/
	public void setRoleIds(Set<Long> roleIds) {
		this.roleIds = roleIds;
	}

	public UserFilter roleIds(Set<Long> roleIds) {
		this.roleIds = roleIds;
		return this;
	}

	public UserFilter addRoleIdsItem(Long roleIdsItem) {
		if (this.roleIds == null) {
			this.roleIds = new LinkedHashSet<>();
		}
		this.roleIds.add(roleIdsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class UserFilter {\n" +
			"    enabled: " + toIndentedString(enabled) + "\n" +
			"    groups: " + toIndentedString(groups) + "\n" +
			"    roleIds: " + toIndentedString(roleIds) + "\n" +
			"}";
		return sb;
	}
}
