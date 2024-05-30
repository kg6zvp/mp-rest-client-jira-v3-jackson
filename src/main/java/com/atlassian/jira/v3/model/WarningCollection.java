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
import java.util.List;


public class WarningCollection {


	private List<String> warnings = null;

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
	 * Get warnings
	 * @return warnings
	 **/
	public List<String> getWarnings() {
		return warnings;
	}

	/**
	 * Set warnings
	 **/
	public void setWarnings(List<String> warnings) {
		this.warnings = warnings;
	}

	public WarningCollection warnings(List<String> warnings) {
		this.warnings = warnings;
		return this;
	}

	public WarningCollection addWarningsItem(String warningsItem) {
		if (this.warnings == null) {
			this.warnings = new ArrayList<>();
		}
		this.warnings.add(warningsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WarningCollection {\n" +
			"    warnings: " + toIndentedString(warnings) + "\n" +
			"}";
		return sb;
	}
}
