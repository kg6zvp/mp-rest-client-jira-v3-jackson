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
import java.util.Map;


public class IssueFieldOptionCreateBean extends HashMap<String, Object> {


	private IssueFieldOptionConfiguration config;

	/**
	 * The properties of the option as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/) are defined in the descriptor for the issue field module.
	 **/

	private Map<String, Object> properties = null;

	/**
	 * The option's name, which is displayed in Jira.
	 **/

	private String value;

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
	 * Get config
	 * @return config
	 **/
	public IssueFieldOptionConfiguration getConfig() {
		return config;
	}

	/**
	 * Set config
	 **/
	public void setConfig(IssueFieldOptionConfiguration config) {
		this.config = config;
	}

	public IssueFieldOptionCreateBean config(IssueFieldOptionConfiguration config) {
		this.config = config;
		return this;
	}

	/**
	 * The properties of the option as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/) are defined in the descriptor for the issue field module.
	 * @return properties
	 **/
	public Map<String, Object> getProperties() {
		return properties;
	}

	/**
	 * Set properties
	 **/
	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}

	public IssueFieldOptionCreateBean properties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}

	public IssueFieldOptionCreateBean putPropertiesItem(String key, Object propertiesItem) {
		if (this.properties == null) {
			this.properties = new HashMap<>();
		}
		this.properties.put(key, propertiesItem);
		return this;
	}

	/**
	 * The option&#39;s name, which is displayed in Jira.
	 * @return value
	 **/
	public String getValue() {
		return value;
	}

	/**
	 * Set value
	 **/
	public void setValue(String value) {
		this.value = value;
	}

	public IssueFieldOptionCreateBean value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class IssueFieldOptionCreateBean {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    config: " + toIndentedString(config) + "\n" +
			"    properties: " + toIndentedString(properties) + "\n" +
			"    value: " + toIndentedString(value) + "\n" +
			"}";
		return sb;
	}
}