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
 * Details of issue security scheme level new members.
 **/

public class SecuritySchemeMembersRequest {

	/**
	 * The list of level members which should be added to the issue security scheme level.
	 **/

	private List<SecuritySchemeLevelMemberBean> members = null;

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
	 * The list of level members which should be added to the issue security scheme level.
	 * @return members
	 **/
	public List<SecuritySchemeLevelMemberBean> getMembers() {
		return members;
	}

	/**
	 * Set members
	 **/
	public void setMembers(List<SecuritySchemeLevelMemberBean> members) {
		this.members = members;
	}

	public SecuritySchemeMembersRequest members(List<SecuritySchemeLevelMemberBean> members) {
		this.members = members;
		return this;
	}

	public SecuritySchemeMembersRequest addMembersItem(SecuritySchemeLevelMemberBean membersItem) {
		if (this.members == null) {
			this.members = new ArrayList<>();
		}
		this.members.add(membersItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class SecuritySchemeMembersRequest {\n" +
			"    members: " + toIndentedString(members) + "\n" +
			"}";
		return sb;
	}
}
