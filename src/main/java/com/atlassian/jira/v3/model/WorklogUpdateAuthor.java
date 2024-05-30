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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * Details of the user who last updated the worklog.
 **/
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class WorklogUpdateAuthor {

	/**
	 * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
	 **/

	private String accountId;

	/**
	 * The type of account represented by this user. This will be one of 'atlassian' (normal users), 'app' (application user) or 'customer' (Jira Service Desk customer user)
	 **/

	private String accountType;

	/**
	 * Whether the user is active.
	 **/

	private Boolean active;


	private AvatarUrlsBean avatarUrls;

	/**
	 * The display name of the user. Depending on the user’s privacy settings, this may return an alternative value.
	 **/

	private String displayName;

	/**
	 * The email address of the user. Depending on the user’s privacy settings, this may be returned as null.
	 **/

	private String emailAddress;

	/**
	 * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	 **/

	private String key;

	/**
	 * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	 **/

	private String name;

	/**
	 * The URL of the user.
	 **/

	private String self;

	/**
	 * The time zone specified in the user's profile. Depending on the user’s privacy settings, this may be returned as null.
	 **/

	private String timeZone;

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
	 * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
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

	public WorklogUpdateAuthor accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The type of account represented by this user. This will be one of &#39;atlassian&#39; (normal users), &#39;app&#39; (application user) or &#39;customer&#39; (Jira Service Desk customer user)
	 * @return accountType
	 **/
	public String getAccountType() {
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

	public WorklogUpdateAuthor avatarUrls(AvatarUrlsBean avatarUrls) {
		this.avatarUrls = avatarUrls;
		return this;
	}

	/**
	 * The display name of the user. Depending on the user’s privacy settings, this may return an alternative value.
	 * @return displayName
	 **/
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * The email address of the user. Depending on the user’s privacy settings, this may be returned as null.
	 * @return emailAddress
	 **/
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	 * @return key
	 **/
	public String getKey() {
		return key;
	}

	/**
	 * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * The URL of the user.
	 * @return self
	 **/
	public String getSelf() {
		return self;
	}

	/**
	 * The time zone specified in the user&#39;s profile. Depending on the user’s privacy settings, this may be returned as null.
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

		String sb = "class WorklogUpdateAuthor {\n" +
			"    accountId: " + toIndentedString(accountId) + "\n" +
			"    accountType: " + toIndentedString(accountType) + "\n" +
			"    active: " + toIndentedString(active) + "\n" +
			"    avatarUrls: " + toIndentedString(avatarUrls) + "\n" +
			"    displayName: " + toIndentedString(displayName) + "\n" +
			"    emailAddress: " + toIndentedString(emailAddress) + "\n" +
			"    key: " + toIndentedString(key) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"    timeZone: " + toIndentedString(timeZone) + "\n" +
			"}";
		return sb;
	}
}
