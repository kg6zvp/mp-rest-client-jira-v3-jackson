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
 * List of user account IDs.
 **/

public class UserKey {

	/**
	 * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Returns *unknown* if the record is deleted and corrupted, for example, as the result of a server import.
	 **/

	private String accountId;

	/**
	 * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	 **/

	private String key;

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
	 * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Returns *unknown* if the record is deleted and corrupted, for example, as the result of a server import.
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

	public UserKey accountId(String accountId) {
		this.accountId = accountId;
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

	public UserKey key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class UserKey {\n" +
			"    accountId: " + toIndentedString(accountId) + "\n" +
			"    key: " + toIndentedString(key) + "\n" +
			"}";
		return sb;
	}
}
