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

/**
 * The trigger rules available.
 **/

public class AvailableWorkflowTriggers {

	/**
	 * The list of available trigger types.
	 **/

	private List<AvailableWorkflowTriggerTypes> availableTypes = new ArrayList<>();

	/**
	 * The rule key of the rule.
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
	 * The list of available trigger types.
	 * @return availableTypes
	 **/
	public List<AvailableWorkflowTriggerTypes> getAvailableTypes() {
		return availableTypes;
	}

	/**
	 * Set availableTypes
	 **/
	public void setAvailableTypes(List<AvailableWorkflowTriggerTypes> availableTypes) {
		this.availableTypes = availableTypes;
	}

	public AvailableWorkflowTriggers availableTypes(List<AvailableWorkflowTriggerTypes> availableTypes) {
		this.availableTypes = availableTypes;
		return this;
	}

	public AvailableWorkflowTriggers addAvailableTypesItem(AvailableWorkflowTriggerTypes availableTypesItem) {
		if (this.availableTypes == null) {
			this.availableTypes = new ArrayList<>();
		}
		this.availableTypes.add(availableTypesItem);
		return this;
	}

	/**
	 * The rule key of the rule.
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

	public AvailableWorkflowTriggers ruleKey(String ruleKey) {
		this.ruleKey = ruleKey;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class AvailableWorkflowTriggers {\n" +
			"    availableTypes: " + toIndentedString(availableTypes) + "\n" +
			"    ruleKey: " + toIndentedString(ruleKey) + "\n" +
			"}";
		return sb;
	}
}
