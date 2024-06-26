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

import java.util.HashMap;
import java.util.Map;

/**
 * The trigger configuration associated with a workflow.
 **/

public class WorkflowTrigger {

	/**
	 * The ID of the trigger.
	 **/

	private String id;

	/**
	 * The parameters of the trigger.
	 **/

	private Map<String, String> parameters = new HashMap<>();

	/**
	 * The rule key of the trigger.
	 **/

	private String ruleKey;

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
	 * The ID of the trigger.
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

	public WorkflowTrigger id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The parameters of the trigger.
	 * @return parameters
	 **/
	public Map<String, String> getParameters() {
		return parameters;
	}

	/**
	 * Set parameters
	 **/
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public WorkflowTrigger parameters(Map<String, String> parameters) {
		this.parameters = parameters;
		return this;
	}

	public WorkflowTrigger putParametersItem(String key, String parametersItem) {
		if (this.parameters == null) {
			this.parameters = new HashMap<>();
		}
		this.parameters.put(key, parametersItem);
		return this;
	}

	/**
	 * The rule key of the trigger.
	 * @return ruleKey
	 **/
	public String getRuleKey() {
		return ruleKey;
	}

	/**
	 * Set ruleKey
	 **/
	public void setRuleKey(String ruleKey) {
		this.ruleKey = ruleKey;
	}

	public WorkflowTrigger ruleKey(String ruleKey) {
		this.ruleKey = ruleKey;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowTrigger {\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    parameters: " + toIndentedString(parameters) + "\n" +
			"    ruleKey: " + toIndentedString(ruleKey) + "\n" +
			"}";
		return sb;
	}
}
