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

import java.util.ArrayList;
import java.util.List;

/**
 * A project's sender email address.
 **/

public class ProjectEmailAddress {

	/**
	 * The email address.
	 **/

	private String emailAddress;

	/**
	 * When using a custom domain, the status of the email address.
	 **/

	private List<String> emailAddressStatus = null;

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
	 * The email address.
	 * @return emailAddress
	 **/
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Set emailAddress
	 **/
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public ProjectEmailAddress emailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	/**
	 * When using a custom domain, the status of the email address.
	 * @return emailAddressStatus
	 **/
	public List<String> getEmailAddressStatus() {
		return emailAddressStatus;
	}

	/**
	 * Set emailAddressStatus
	 **/
	public void setEmailAddressStatus(List<String> emailAddressStatus) {
		this.emailAddressStatus = emailAddressStatus;
	}

	public ProjectEmailAddress emailAddressStatus(List<String> emailAddressStatus) {
		this.emailAddressStatus = emailAddressStatus;
		return this;
	}

	public ProjectEmailAddress addEmailAddressStatusItem(String emailAddressStatusItem) {
		if (this.emailAddressStatus == null) {
			this.emailAddressStatus = new ArrayList<>();
		}
		this.emailAddressStatus.add(emailAddressStatusItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ProjectEmailAddress {\n" +
			"    emailAddress: " + toIndentedString(emailAddress) + "\n" +
			"    emailAddressStatus: " + toIndentedString(emailAddressStatus) + "\n" +
			"}";
		return sb;
	}
}