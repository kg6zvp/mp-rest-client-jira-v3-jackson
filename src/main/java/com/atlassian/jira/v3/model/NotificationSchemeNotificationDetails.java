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

/**
 * Details of a notification within a notification scheme.
 **/

public class NotificationSchemeNotificationDetails extends HashMap<String, Object> {

	/**
	 * The notification type, e.g `CurrentAssignee`, `Group`, `EmailAddress`.
	 **/

	private String notificationType;

	/**
	 * The value corresponding to the specified notification type.
	 **/

	private String parameter;

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
	 * The notification type, e.g &#x60;CurrentAssignee&#x60;, &#x60;Group&#x60;, &#x60;EmailAddress&#x60;.
	 * @return notificationType
	 **/
	public String getNotificationType() {
		return notificationType;
	}

	/**
	 * Set notificationType
	 **/
	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public NotificationSchemeNotificationDetails notificationType(String notificationType) {
		this.notificationType = notificationType;
		return this;
	}

	/**
	 * The value corresponding to the specified notification type.
	 * @return parameter
	 **/
	public String getParameter() {
		return parameter;
	}

	/**
	 * Set parameter
	 **/
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public NotificationSchemeNotificationDetails parameter(String parameter) {
		this.parameter = parameter;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class NotificationSchemeNotificationDetails {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    notificationType: " + toIndentedString(notificationType) + "\n" +
			"    parameter: " + toIndentedString(parameter) + "\n" +
			"}";
		return sb;
	}
}
