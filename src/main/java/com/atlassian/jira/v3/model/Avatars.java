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

import java.util.List;

/**
 * Details about system and custom avatars.
 **/

public class Avatars {

	/**
	 * Custom avatars list.
	 **/

	private List<Avatar> custom = null;

	/**
	 * System avatars list.
	 **/

	private List<Avatar> system = null;

	public Avatars() {
	}


	public Avatars(
		List<Avatar> custom,
		List<Avatar> system
	) {
		this.custom = custom;
		this.system = system;
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
	 * Custom avatars list.
	 * @return custom
	 **/
	public List<Avatar> getCustom() {
		return custom;
	}

	/**
	 * System avatars list.
	 * @return system
	 **/
	public List<Avatar> getSystem() {
		return system;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class Avatars {\n" +
			"    custom: " + toIndentedString(custom) + "\n" +
			"    system: " + toIndentedString(system) + "\n" +
			"}";
		return sb;
	}
}