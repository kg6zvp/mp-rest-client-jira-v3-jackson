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

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Details about the project.
 **/
public class UpdateProjectDetails {

	/**
	 * The default assignee when creating issues for this project.
	 **/

	private AssigneeTypeEnum assigneeType;
	/**
	 * An integer value for the project's avatar.
	 **/

	private Long avatarId;
	/**
	 * The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. To remove the project category from the project, set the value to `-1.`
	 **/

	private Long categoryId;
	/**
	 * A brief description of the project.
	 **/

	private String description;
	/**
	 * The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.
	 **/

	private Long issueSecurityScheme;
	/**
	 * Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
	 **/

	private String key;
	/**
	 * This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with `leadAccountId`.
	 **/

	private String lead;
	/**
	 * The account ID of the project lead. Cannot be provided with `lead`.
	 **/

	private String leadAccountId;
	/**
	 * The name of the project.
	 **/

	private String name;
	/**
	 * The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.
	 **/

	private Long notificationScheme;
	/**
	 * The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.
	 **/

	private Long permissionScheme;
	/**
	 * A link to information about this project, such as project documentation
	 **/

	private String url;

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
	 * The default assignee when creating issues for this project.
	 * @return assigneeType
	 **/
	public AssigneeTypeEnum getAssigneeType() {
		return assigneeType;
	}

	/**
	 * Set assigneeType
	 **/
	public void setAssigneeType(AssigneeTypeEnum assigneeType) {
		this.assigneeType = assigneeType;
	}

	public UpdateProjectDetails assigneeType(AssigneeTypeEnum assigneeType) {
		this.assigneeType = assigneeType;
		return this;
	}

	/**
	 * An integer value for the project&#39;s avatar.
	 * @return avatarId
	 **/
	public Long getAvatarId() {
		return avatarId;
	}

	/**
	 * Set avatarId
	 **/
	public void setAvatarId(Long avatarId) {
		this.avatarId = avatarId;
	}

	public UpdateProjectDetails avatarId(Long avatarId) {
		this.avatarId = avatarId;
		return this;
	}

	/**
	 * The ID of the project&#39;s category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. To remove the project category from the project, set the value to &#x60;-1.&#x60;
	 * @return categoryId
	 **/
	public Long getCategoryId() {
		return categoryId;
	}

	/**
	 * Set categoryId
	 **/
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public UpdateProjectDetails categoryId(Long categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	/**
	 * A brief description of the project.
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

	public UpdateProjectDetails description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.
	 * @return issueSecurityScheme
	 **/
	public Long getIssueSecurityScheme() {
		return issueSecurityScheme;
	}

	/**
	 * Set issueSecurityScheme
	 **/
	public void setIssueSecurityScheme(Long issueSecurityScheme) {
		this.issueSecurityScheme = issueSecurityScheme;
	}

	public UpdateProjectDetails issueSecurityScheme(Long issueSecurityScheme) {
		this.issueSecurityScheme = issueSecurityScheme;
		return this;
	}

	/**
	 * Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
	 * @return key
	 **/
	public String getKey() {
		return key;
	}

	/**
	 * Set key
	 **/
	public void setKey(String key) {
		this.key = key;
	}

	public UpdateProjectDetails key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * This parameter is deprecated because of privacy changes. Use &#x60;leadAccountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with &#x60;leadAccountId&#x60;.
	 * @return lead
	 **/
	public String getLead() {
		return lead;
	}

	/**
	 * Set lead
	 **/
	public void setLead(String lead) {
		this.lead = lead;
	}

	public UpdateProjectDetails lead(String lead) {
		this.lead = lead;
		return this;
	}

	/**
	 * The account ID of the project lead. Cannot be provided with &#x60;lead&#x60;.
	 * @return leadAccountId
	 **/
	public String getLeadAccountId() {
		return leadAccountId;
	}

	/**
	 * Set leadAccountId
	 **/
	public void setLeadAccountId(String leadAccountId) {
		this.leadAccountId = leadAccountId;
	}

	public UpdateProjectDetails leadAccountId(String leadAccountId) {
		this.leadAccountId = leadAccountId;
		return this;
	}

	/**
	 * The name of the project.
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

	public UpdateProjectDetails name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.
	 * @return notificationScheme
	 **/
	public Long getNotificationScheme() {
		return notificationScheme;
	}

	/**
	 * Set notificationScheme
	 **/
	public void setNotificationScheme(Long notificationScheme) {
		this.notificationScheme = notificationScheme;
	}

	public UpdateProjectDetails notificationScheme(Long notificationScheme) {
		this.notificationScheme = notificationScheme;
		return this;
	}

	/**
	 * The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.
	 * @return permissionScheme
	 **/
	public Long getPermissionScheme() {
		return permissionScheme;
	}

	/**
	 * Set permissionScheme
	 **/
	public void setPermissionScheme(Long permissionScheme) {
		this.permissionScheme = permissionScheme;
	}

	public UpdateProjectDetails permissionScheme(Long permissionScheme) {
		this.permissionScheme = permissionScheme;
		return this;
	}

	/**
	 * A link to information about this project, such as project documentation
	 * @return url
	 **/
	public String getUrl() {
		return url;
	}

	/**
	 * Set url
	 **/
	public void setUrl(String url) {
		this.url = url;
	}

	public UpdateProjectDetails url(String url) {
		this.url = url;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class UpdateProjectDetails {\n" +
			"    assigneeType: " + toIndentedString(assigneeType) + "\n" +
			"    avatarId: " + toIndentedString(avatarId) + "\n" +
			"    categoryId: " + toIndentedString(categoryId) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    issueSecurityScheme: " + toIndentedString(issueSecurityScheme) + "\n" +
			"    key: " + toIndentedString(key) + "\n" +
			"    lead: " + toIndentedString(lead) + "\n" +
			"    leadAccountId: " + toIndentedString(leadAccountId) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    notificationScheme: " + toIndentedString(notificationScheme) + "\n" +
			"    permissionScheme: " + toIndentedString(permissionScheme) + "\n" +
			"    url: " + toIndentedString(url) + "\n" +
			"}";
		return sb;
	}

	public enum AssigneeTypeEnum {

		PROJECT_LEAD("PROJECT_LEAD"), UNASSIGNED("UNASSIGNED");


		String value;

		AssigneeTypeEnum(String v) {
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
