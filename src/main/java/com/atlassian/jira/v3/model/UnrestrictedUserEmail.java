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

import java.util.HashMap;


public class UnrestrictedUserEmail extends HashMap<String, Object> {

	/**
	 * The accountId of the user
	 **/

	private String accountId;

	/**
	 * The email of the user
	 **/

	private String email;

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
	 * The accountId of the user
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

	public UnrestrictedUserEmail accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The email of the user
	 * @return email
	 **/
	public String getEmail() {
		return email;
	}

	/**
	 * Set email
	 **/
	public void setEmail(String email) {
		this.email = email;
	}

	public UnrestrictedUserEmail email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class UnrestrictedUserEmail {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    accountId: " + toIndentedString(accountId) + "\n" +
			"    email: " + toIndentedString(email) + "\n" +
			"}";
		return sb;
	}
}
