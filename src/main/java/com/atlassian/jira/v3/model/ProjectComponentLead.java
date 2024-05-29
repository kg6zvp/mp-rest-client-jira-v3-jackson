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

import java.net.URI;

/**
 * The user details for the component's lead user.
 **/

public class ProjectComponentLead {

	/**
	 * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
	 **/

	private String accountId;
	/**
	 * The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk
	 **/

	private AccountTypeEnum accountType;
	/**
	 * Whether the user is active.
	 **/

	private Boolean active;
	private UserApplicationRoles applicationRoles;
	private AvatarUrlsBean avatarUrls;
	/**
	 * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
	 **/

	private String displayName;
	/**
	 * The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
	 **/

	private String emailAddress;
	/**
	 * Expand options that include additional user details in the response.
	 **/

	private String expand;
	private UserGroups groups;
	/**
	 * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	 **/

	private String key;
	/**
	 * The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
	 **/

	private String locale;
	/**
	 * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	 **/

	private String name;
	/**
	 * The URL of the user.
	 **/

	private URI self;
	/**
	 * The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.
	 **/

	private String timeZone;

	public ProjectComponentLead() {
	}

	public ProjectComponentLead(
		AccountTypeEnum accountType,
		Boolean active,
		String displayName,
		String emailAddress,
		String expand,
		String locale,
		URI self,
		String timeZone
	) {
		this.accountType = accountType;
		this.active = active;
		this.displayName = displayName;
		this.emailAddress = emailAddress;
		this.expand = expand;
		this.locale = locale;
		this.self = self;
		this.timeZone = timeZone;
	}

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
	 * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
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

	public ProjectComponentLead accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk
	 * @return accountType
	 **/
	public AccountTypeEnum getAccountType() {
		return accountType;
	}


	/**
	 * Whether the user is active.
	 * @return active
	 **/
	public Boolean getActive() {
		return active;
	}


	/**
	 * Get applicationRoles
	 * @return applicationRoles
	 **/
	public UserApplicationRoles getApplicationRoles() {
		return applicationRoles;
	}

	/**
	 * Set applicationRoles
	 **/
	public void setApplicationRoles(UserApplicationRoles applicationRoles) {
		this.applicationRoles = applicationRoles;
	}

	public ProjectComponentLead applicationRoles(UserApplicationRoles applicationRoles) {
		this.applicationRoles = applicationRoles;
		return this;
	}

	/**
	 * Get avatarUrls
	 * @return avatarUrls
	 **/
	public AvatarUrlsBean getAvatarUrls() {
		return avatarUrls;
	}

	/**
	 * Set avatarUrls
	 **/
	public void setAvatarUrls(AvatarUrlsBean avatarUrls) {
		this.avatarUrls = avatarUrls;
	}

	public ProjectComponentLead avatarUrls(AvatarUrlsBean avatarUrls) {
		this.avatarUrls = avatarUrls;
		return this;
	}

	/**
	 * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
	 * @return displayName
	 **/
	public String getDisplayName() {
		return displayName;
	}


	/**
	 * The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
	 * @return emailAddress
	 **/
	public String getEmailAddress() {
		return emailAddress;
	}


	/**
	 * Expand options that include additional user details in the response.
	 * @return expand
	 **/
	public String getExpand() {
		return expand;
	}


	/**
	 * Get groups
	 * @return groups
	 **/
	public UserGroups getGroups() {
		return groups;
	}

	/**
	 * Set groups
	 **/
	public void setGroups(UserGroups groups) {
		this.groups = groups;
	}

	public ProjectComponentLead groups(UserGroups groups) {
		this.groups = groups;
		return this;
	}

	/**
	 * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
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

	public ProjectComponentLead key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
	 * @return locale
	 **/
	public String getLocale() {
		return locale;
	}


	/**
	 * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
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

	public ProjectComponentLead name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The URL of the user.
	 * @return self
	 **/
	public URI getSelf() {
		return self;
	}


	/**
	 * The time zone specified in the user&#39;s profile. Depending on the user’s privacy setting, this may be returned as null.
	 * @return timeZone
	 **/
	public String getTimeZone() {
		return timeZone;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ProjectComponentLead {\n" +
			"    accountId: " + toIndentedString(accountId) + "\n" +
			"    accountType: " + toIndentedString(accountType) + "\n" +
			"    active: " + toIndentedString(active) + "\n" +
			"    applicationRoles: " + toIndentedString(applicationRoles) + "\n" +
			"    avatarUrls: " + toIndentedString(avatarUrls) + "\n" +
			"    displayName: " + toIndentedString(displayName) + "\n" +
			"    emailAddress: " + toIndentedString(emailAddress) + "\n" +
			"    expand: " + toIndentedString(expand) + "\n" +
			"    groups: " + toIndentedString(groups) + "\n" +
			"    key: " + toIndentedString(key) + "\n" +
			"    locale: " + toIndentedString(locale) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"    timeZone: " + toIndentedString(timeZone) + "\n" +
			"}";
		return sb;
	}

	public enum AccountTypeEnum {

		ATLASSIAN("atlassian"), APP("app"), CUSTOMER("customer"), UNKNOWN("unknown");


		String value;

		AccountTypeEnum(String v) {
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
