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
 * A screen with tab details.
 **/

public class ScreenWithTab {

	/**
	 * The description of the screen.
	 **/

	private String description;

	/**
	 * The ID of the screen.
	 **/

	private Long id;

	/**
	 * The name of the screen.
	 **/

	private String name;


	private Scope scope;


	private ScreenableTab tab;

	public ScreenWithTab() {
	}


	public ScreenWithTab(
		String description,
		Long id,
		String name
	) {
		this.description = description;
		this.id = id;
		this.name = name;
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
	 * The description of the screen.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * The ID of the screen.
	 * @return id
	 **/
	public Long getId() {
		return id;
	}

	/**
	 * The name of the screen.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * Get scope
	 * @return scope
	 **/
	public Scope getScope() {
		return scope;
	}

	/**
	 * Set scope
	 **/
	public void setScope(Scope scope) {
		this.scope = scope;
	}

	public ScreenWithTab scope(Scope scope) {
		this.scope = scope;
		return this;
	}

	/**
	 * Get tab
	 * @return tab
	 **/
	public ScreenableTab getTab() {
		return tab;
	}

	/**
	 * Set tab
	 **/
	public void setTab(ScreenableTab tab) {
		this.tab = tab;
	}

	public ScreenWithTab tab(ScreenableTab tab) {
		this.tab = tab;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ScreenWithTab {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    scope: " + toIndentedString(scope) + "\n" +
			"    tab: " + toIndentedString(tab) + "\n" +
			"}";
		return sb;
	}
}
