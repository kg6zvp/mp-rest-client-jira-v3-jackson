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

import java.util.HashMap;

/**
 * The status of the item.
 **/

public class Status extends HashMap<String, Object> {


	private Icon icon;

	/**
	 * Whether the item is resolved. If set to \"true\", the link to the issue is displayed in a strikethrough font, otherwise the link displays in normal font.
	 **/

	private Boolean resolved;

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
	 * Get icon
	 * @return icon
	 **/
	public Icon getIcon() {
		return icon;
	}

	/**
	 * Set icon
	 **/
	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public Status icon(Icon icon) {
		this.icon = icon;
		return this;
	}

	/**
	 * Whether the item is resolved. If set to \&quot;true\&quot;, the link to the issue is displayed in a strikethrough font, otherwise the link displays in normal font.
	 * @return resolved
	 **/
	public Boolean getResolved() {
		return resolved;
	}

	/**
	 * Set resolved
	 **/
	public void setResolved(Boolean resolved) {
		this.resolved = resolved;
	}

	public Status resolved(Boolean resolved) {
		this.resolved = resolved;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class Status {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    icon: " + toIndentedString(icon) + "\n" +
			"    resolved: " + toIndentedString(resolved) + "\n" +
			"}";
		return sb;
	}
}