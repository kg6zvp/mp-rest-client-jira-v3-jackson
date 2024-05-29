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

import java.net.URI;

/**
 * A user found in a search.
 **/

public class UserPickerUser {

	/**
	 * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
	 **/

	private String accountId;

	/**
	 * The avatar URL of the user.
	 **/

	private URI avatarUrl;

	/**
	 * The display name of the user. Depending on the user’s privacy setting, this may be returned as null.
	 **/

	private String displayName;

	/**
	 * The display name, email address, and key of the user with the matched query string highlighted with the HTML bold tag.
	 **/

	private String html;

	/**
	 * This property is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	 **/

	private String key;

	/**
	 * This property is no longer available . See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
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

	public UserPickerUser accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The avatar URL of the user.
	 * @return avatarUrl
	 **/
	public URI getAvatarUrl() {
		return avatarUrl;
	}

	/**
	 * Set avatarUrl
	 **/
	public void setAvatarUrl(URI avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public UserPickerUser avatarUrl(URI avatarUrl) {
		this.avatarUrl = avatarUrl;
		return this;
	}

	/**
	 * The display name of the user. Depending on the user’s privacy setting, this may be returned as null.
	 * @return displayName
	 **/
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Set displayName
	 **/
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public UserPickerUser displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * The display name, email address, and key of the user with the matched query string highlighted with the HTML bold tag.
	 * @return html
	 **/
	public String getHtml() {
		return html;
	}

	/**
	 * Set html
	 **/
	public void setHtml(String html) {
		this.html = html;
	}

	public UserPickerUser html(String html) {
		this.html = html;
		return this;
	}

	/**
	 * This property is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
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

	public UserPickerUser key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * This property is no longer available . See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
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

	public UserPickerUser name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class UserPickerUser {\n" +
			"    accountId: " + toIndentedString(accountId) + "\n" +
			"    avatarUrl: " + toIndentedString(avatarUrl) + "\n" +
			"    displayName: " + toIndentedString(displayName) + "\n" +
			"    html: " + toIndentedString(html) + "\n" +
			"    key: " + toIndentedString(key) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"}";
		return sb;
	}
}
