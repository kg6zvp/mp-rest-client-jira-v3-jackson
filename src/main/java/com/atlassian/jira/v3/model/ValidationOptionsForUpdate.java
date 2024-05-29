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

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;

/**
 * The level of validation to return from the API. If no values are provided, the default would return `WARNING` and `ERROR` level validation results.
 **/
public class ValidationOptionsForUpdate {

	private List<LevelsEnum> levels = null;

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
	 * Get levels
	 * @return levels
	 **/
	public List<LevelsEnum> getLevels() {
		return levels;
	}

	/**
	 * Set levels
	 **/
	public void setLevels(List<LevelsEnum> levels) {
		this.levels = levels;
	}

	public ValidationOptionsForUpdate levels(List<LevelsEnum> levels) {
		this.levels = levels;
		return this;
	}

	public ValidationOptionsForUpdate addLevelsItem(LevelsEnum levelsItem) {
		if (this.levels == null) {
			this.levels = new ArrayList<>();
		}
		this.levels.add(levelsItem);
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ValidationOptionsForUpdate {\n" +
			"    levels: " + toIndentedString(levels) + "\n" +
			"}";
		return sb;
	}

	public enum LevelsEnum {

		WARNING("WARNING"), ERROR("ERROR");


		String value;

		LevelsEnum(String v) {
			value = v;
		}

		@JsonValue
		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}
	}
}
