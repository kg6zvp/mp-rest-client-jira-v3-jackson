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


public class SecuritySchemeLevelBean {

	/**
	 * The description of the issue security scheme level.
	 **/

	private String description;

	/**
	 * Specifies whether the level is the default level. False by default.
	 **/

	private Boolean isDefault;

	/**
	 * The list of level members which should be added to the issue security scheme level.
	 **/

	private List<SecuritySchemeLevelMemberBean> members = null;

	/**
	 * The name of the issue security scheme level. Must be unique.
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
	 * The description of the issue security scheme level.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * Set description
	 **/
	public void setDescription(String description) {
		this.description = description;
	}

	public SecuritySchemeLevelBean description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Specifies whether the level is the default level. False by default.
	 * @return isDefault
	 **/
	public Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * Set isDefault
	 **/
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public SecuritySchemeLevelBean isDefault(Boolean isDefault) {
		this.isDefault = isDefault;
		return this;
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

	public SecuritySchemeLevelBean members(List<SecuritySchemeLevelMemberBean> members) {
		this.members = members;
		return this;
	}

	public SecuritySchemeLevelBean addMembersItem(SecuritySchemeLevelMemberBean membersItem) {
		if (this.members == null) {
			this.members = new ArrayList<>();
		}
		this.members.add(membersItem);
		return this;
	}

	/**
	 * The name of the issue security scheme level. Must be unique.
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

	public SecuritySchemeLevelBean name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class SecuritySchemeLevelBean {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    isDefault: " + toIndentedString(isDefault) + "\n" +
			"    members: " + toIndentedString(members) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"}";
		return sb;
	}
}
