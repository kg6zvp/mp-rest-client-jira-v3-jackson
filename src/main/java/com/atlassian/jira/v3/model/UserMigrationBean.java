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

public class UserMigrationBean {


	private String accountId;


	private String key;


	private String username;

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
	 * Get accountId
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

	public UserMigrationBean accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Get key
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

	public UserMigrationBean key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Get username
	 * @return username
	 **/
	public String getUsername() {
		return username;
	}

	/**
	 * Set username
	 **/
	public void setUsername(String username) {
		this.username = username;
	}

	public UserMigrationBean username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class UserMigrationBean {\n" +
			"    accountId: " + toIndentedString(accountId) + "\n" +
			"    key: " + toIndentedString(key) + "\n" +
			"    username: " + toIndentedString(username) + "\n" +
			"}";
		return sb;
	}
}
