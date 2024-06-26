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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Issue security scheme and it's details
 **/

public class CreateIssueSecuritySchemeDetails extends HashMap<String, Object> {

	/**
	 * The description of the issue security scheme.
	 **/

	private String description;

	/**
	 * The list of scheme levels which should be added to the security scheme.
	 **/

	private List<SecuritySchemeLevelBean> levels = null;

	/**
	 * The name of the issue security scheme. Must be unique (case-insensitive).
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
	 * The description of the issue security scheme.
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

	public CreateIssueSecuritySchemeDetails description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The list of scheme levels which should be added to the security scheme.
	 * @return levels
	 **/
	public List<SecuritySchemeLevelBean> getLevels() {
		return levels;
	}

	/**
	 * Set levels
	 **/
	public void setLevels(List<SecuritySchemeLevelBean> levels) {
		this.levels = levels;
	}

	public CreateIssueSecuritySchemeDetails levels(List<SecuritySchemeLevelBean> levels) {
		this.levels = levels;
		return this;
	}

	public CreateIssueSecuritySchemeDetails addLevelsItem(SecuritySchemeLevelBean levelsItem) {
		if (this.levels == null) {
			this.levels = new ArrayList<>();
		}
		this.levels.add(levelsItem);
		return this;
	}

	/**
	 * The name of the issue security scheme. Must be unique (case-insensitive).
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

	public CreateIssueSecuritySchemeDetails name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class CreateIssueSecuritySchemeDetails {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    levels: " + toIndentedString(levels) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"}";
		return sb;
	}
}
