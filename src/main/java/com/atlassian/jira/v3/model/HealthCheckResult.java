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
 * Jira instance health check results. Deprecated and no longer returned.
 **/

public class HealthCheckResult {

	/**
	 * The description of the Jira health check item.
	 **/
	private String description;

	/**
	 * The name of the Jira health check item.
	 **/
	private String name;

	/**
	 * Whether the Jira health check item passed or failed.
	 **/
	private Boolean passed;

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
	 * The description of the Jira health check item.
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

	public HealthCheckResult description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The name of the Jira health check item.
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

	public HealthCheckResult name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Whether the Jira health check item passed or failed.
	 * @return passed
	 **/
	public Boolean getPassed() {
		return passed;
	}

	/**
	 * Set passed
	 **/
	public void setPassed(Boolean passed) {
		this.passed = passed;
	}

	public HealthCheckResult passed(Boolean passed) {
		this.passed = passed;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class HealthCheckResult {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    passed: " + toIndentedString(passed) + "\n" +
			"}";
		return sb;
	}
}