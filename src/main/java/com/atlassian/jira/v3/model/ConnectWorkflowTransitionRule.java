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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A workflow transition rule.
 **/

public class ConnectWorkflowTransitionRule {

	@JsonProperty("configuration")
	private RuleConfiguration _configuration;

	/**
	 * The ID of the transition rule.
	 **/

	private String id;

	/**
	 * The key of the rule, as defined in the Connect app descriptor.
	 **/

	private String key;


	private WorkflowTransition transition;

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
	 * Get _configuration
	 * @return _configuration
	 **/
	public RuleConfiguration getConfiguration() {
		return _configuration;
	}

	/**
	 * Set _configuration
	 **/
	public void setConfiguration(RuleConfiguration _configuration) {
		this._configuration = _configuration;
	}

	public ConnectWorkflowTransitionRule _configuration(RuleConfiguration _configuration) {
		this._configuration = _configuration;
		return this;
	}

	/**
	 * The ID of the transition rule.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * Set id
	 **/
	public void setId(String id) {
		this.id = id;
	}

	public ConnectWorkflowTransitionRule id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The key of the rule, as defined in the Connect app descriptor.
	 * @return key
	 **/
	public String getKey() {
		return key;
	}

	/**
	 * Set key
	 **/
	public void setKey(String key) {
		this.key = key;
	}

	public ConnectWorkflowTransitionRule key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Get transition
	 * @return transition
	 **/
	public WorkflowTransition getTransition() {
		return transition;
	}

	/**
	 * Set transition
	 **/
	public void setTransition(WorkflowTransition transition) {
		this.transition = transition;
	}

	public ConnectWorkflowTransitionRule transition(WorkflowTransition transition) {
		this.transition = transition;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ConnectWorkflowTransitionRule {\n" +
			"    _configuration: " + toIndentedString(_configuration) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    key: " + toIndentedString(key) + "\n" +
			"    transition: " + toIndentedString(transition) + "\n" +
			"}";
		return sb;
	}
}
