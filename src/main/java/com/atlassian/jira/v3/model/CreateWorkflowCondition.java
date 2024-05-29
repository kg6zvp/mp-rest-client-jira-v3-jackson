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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A workflow transition condition.
 **/

public class CreateWorkflowCondition {

	/**
	 * The list of workflow conditions.
	 **/

	private List<CreateWorkflowCondition> conditions = null;

	/**
	 * EXPERIMENTAL. The configuration of the transition rule.
	 **/
	@JsonProperty("configuration")
	private Map<String, Object> _configuration = null;
	/**
	 * The compound condition operator.
	 **/

	private OperatorEnum operator;
	/**
	 * The type of the transition rule.
	 **/

	private String type;

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
	 * The list of workflow conditions.
	 * @return conditions
	 **/
	public List<CreateWorkflowCondition> getConditions() {
		return conditions;
	}

	/**
	 * Set conditions
	 **/
	public void setConditions(List<CreateWorkflowCondition> conditions) {
		this.conditions = conditions;
	}

	public CreateWorkflowCondition conditions(List<CreateWorkflowCondition> conditions) {
		this.conditions = conditions;
		return this;
	}

	public CreateWorkflowCondition addConditionsItem(CreateWorkflowCondition conditionsItem) {
		if (this.conditions == null) {
			this.conditions = new ArrayList<>();
		}
		this.conditions.add(conditionsItem);
		return this;
	}

	/**
	 * EXPERIMENTAL. The configuration of the transition rule.
	 * @return _configuration
	 **/
	public Map<String, Object> getConfiguration() {
		return _configuration;
	}

	/**
	 * Set _configuration
	 **/
	public void setConfiguration(Map<String, Object> _configuration) {
		this._configuration = _configuration;
	}

	public CreateWorkflowCondition _configuration(Map<String, Object> _configuration) {
		this._configuration = _configuration;
		return this;
	}

	public CreateWorkflowCondition putConfigurationItem(String key, Object _configurationItem) {
		if (this._configuration == null) {
			this._configuration = new HashMap<>();
		}
		this._configuration.put(key, _configurationItem);
		return this;
	}

	/**
	 * The compound condition operator.
	 * @return operator
	 **/
	public OperatorEnum getOperator() {
		return operator;
	}

	/**
	 * Set operator
	 **/
	public void setOperator(OperatorEnum operator) {
		this.operator = operator;
	}

	public CreateWorkflowCondition operator(OperatorEnum operator) {
		this.operator = operator;
		return this;
	}

	/**
	 * The type of the transition rule.
	 * @return type
	 **/
	public String getType() {
		return type;
	}

	/**
	 * Set type
	 **/
	public void setType(String type) {
		this.type = type;
	}

	public CreateWorkflowCondition type(String type) {
		this.type = type;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CreateWorkflowCondition {\n" +
			"    conditions: " + toIndentedString(conditions) + "\n" +
			"    _configuration: " + toIndentedString(_configuration) + "\n" +
			"    operator: " + toIndentedString(operator) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}

	public enum OperatorEnum {

		AND("AND"), OR("OR");


		String value;

		OperatorEnum(String v) {
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
