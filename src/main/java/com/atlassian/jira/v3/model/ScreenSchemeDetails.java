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

/**
 * Details of a screen scheme.
 **/

public class ScreenSchemeDetails {

	/**
	 * The description of the screen scheme. The maximum length is 255 characters.
	 **/

	private String description;

	/**
	 * The name of the screen scheme. The name must be unique. The maximum length is 255 characters.
	 **/

	private String name;


	private ScreenTypes screens;

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
	 * The description of the screen scheme. The maximum length is 255 characters.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * Set description
	 **/
	public void setDescription(String description) {
		this.description = description;
	}

	public ScreenSchemeDetails description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The name of the screen scheme. The name must be unique. The maximum length is 255 characters.
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

	public ScreenSchemeDetails name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get screens
	 * @return screens
	 **/
	public ScreenTypes getScreens() {
		return screens;
	}

	/**
	 * Set screens
	 **/
	public void setScreens(ScreenTypes screens) {
		this.screens = screens;
	}

	public ScreenSchemeDetails screens(ScreenTypes screens) {
		this.screens = screens;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ScreenSchemeDetails {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    screens: " + toIndentedString(screens) + "\n" +
			"}";
		return sb;
	}
}
