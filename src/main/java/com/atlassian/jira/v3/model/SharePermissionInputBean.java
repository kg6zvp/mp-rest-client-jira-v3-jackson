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

import com.fasterxml.jackson.annotation.JsonValue;


public class SharePermissionInputBean {

	/**
	 * The user account ID that the filter is shared with. For a request, specify the `accountId` property for the user.
	 **/

	private String accountId;

	/**
	 * The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with `groupname`.
	 **/

	private String groupId;

	/**
	 * The name of the group to share the filter with. Set `type` to `group`. Please note that the name of a group is mutable, to reliably identify a group use `groupId`.
	 **/

	private String groupname;

	/**
	 * The ID of the project to share the filter with. Set `type` to `project`.
	 **/

	private String projectId;

	/**
	 * The ID of the project role to share the filter with. Set `type` to `projectRole` and the `projectId` for the project that the role is in.
	 **/

	private String projectRoleId;

	/**
	 * The rights for the share permission.
	 **/

	private Integer rights;
	/**
	 * The type of the share permission.Specify the type as follows:   *  `user` Share with a user.  *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
	 **/

	private TypeEnum type;

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
	 * The user account ID that the filter is shared with. For a request, specify the &#x60;accountId&#x60; property for the user.
	 * @return accountId
	 **/
	public String getAccountId() {
		return accountId;
	}

	/**
	 * Set accountId
	 **/
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public SharePermissionInputBean accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with &#x60;groupname&#x60;.
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

	public SharePermissionInputBean groupId(String groupId) {
		this.groupId = groupId;
		return this;
	}

	/**
	 * The name of the group to share the filter with. Set &#x60;type&#x60; to &#x60;group&#x60;. Please note that the name of a group is mutable, to reliably identify a group use &#x60;groupId&#x60;.
	 * @return groupname
	 **/
	public String getGroupname() {
		return groupname;
	}

	/**
	 * Set groupname
	 **/
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public SharePermissionInputBean groupname(String groupname) {
		this.groupname = groupname;
		return this;
	}

	/**
	 * The ID of the project to share the filter with. Set &#x60;type&#x60; to &#x60;project&#x60;.
	 * @return projectId
	 **/
	public String getProjectId() {
		return projectId;
	}

	/**
	 * Set projectId
	 **/
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public SharePermissionInputBean projectId(String projectId) {
		this.projectId = projectId;
		return this;
	}

	/**
	 * The ID of the project role to share the filter with. Set &#x60;type&#x60; to &#x60;projectRole&#x60; and the &#x60;projectId&#x60; for the project that the role is in.
	 * @return projectRoleId
	 **/
	public String getProjectRoleId() {
		return projectRoleId;
	}

	/**
	 * Set projectRoleId
	 **/
	public void setProjectRoleId(String projectRoleId) {
		this.projectRoleId = projectRoleId;
	}

	public SharePermissionInputBean projectRoleId(String projectRoleId) {
		this.projectRoleId = projectRoleId;
		return this;
	}

	/**
	 * The rights for the share permission.
	 * @return rights
	 **/
	public Integer getRights() {
		return rights;
	}

	/**
	 * Set rights
	 **/
	public void setRights(Integer rights) {
		this.rights = rights;
	}

	public SharePermissionInputBean rights(Integer rights) {
		this.rights = rights;
		return this;
	}

	/**
	 * The type of the share permission.Specify the type as follows:   *  &#x60;user&#x60; Share with a user.  *  &#x60;group&#x60; Share with a group. Specify &#x60;groupname&#x60; as well.  *  &#x60;project&#x60; Share with a project. Specify &#x60;projectId&#x60; as well.  *  &#x60;projectRole&#x60; Share with a project role in a project. Specify &#x60;projectId&#x60; and &#x60;projectRoleId&#x60; as well.  *  &#x60;global&#x60; Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  &#x60;authenticated&#x60; Share with all logged-in users. This shows as &#x60;loggedin&#x60; in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
	 * @return type
	 **/
	public TypeEnum getType() {
		return type;
	}

	/**
	 * Set type
	 **/
	public void setType(TypeEnum type) {
		this.type = type;
	}

	public SharePermissionInputBean type(TypeEnum type) {
		this.type = type;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class SharePermissionInputBean {\n" +
			"    accountId: " + toIndentedString(accountId) + "\n" +
			"    groupId: " + toIndentedString(groupId) + "\n" +
			"    groupname: " + toIndentedString(groupname) + "\n" +
			"    projectId: " + toIndentedString(projectId) + "\n" +
			"    projectRoleId: " + toIndentedString(projectRoleId) + "\n" +
			"    rights: " + toIndentedString(rights) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}

	public enum TypeEnum {

		USER("user"), PROJECT("project"), GROUP("group"), PROJECTROLE("projectRole"), GLOBAL("global"), AUTHENTICATED("authenticated");


		String value;

		TypeEnum(String v) {
			value = v;
		}

		@JsonValue
		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}
	}
}
