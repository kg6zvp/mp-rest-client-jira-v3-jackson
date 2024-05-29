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
 * The Atlassian provided system rules available.
 **/

public class AvailableWorkflowSystemRule {

	/**
	 * The rule description.
	 **/

	private String description;

	/**
	 * List of rules that conflict with this one.
	 **/

	private List<String> incompatibleRuleKeys = new ArrayList<>();

	/**
	 * Whether the rule can be added added to an initial transition.
	 **/

	private Boolean isAvailableForInitialTransition;

	/**
	 * Whether the rule is visible.
	 **/

	private Boolean isVisible;

	/**
	 * The rule name.
	 **/

	private String name;

	/**
	 * The rule key.
	 **/

	private String ruleKey;
	/**
	 * The rule type.
	 **/

	private RuleTypeEnum ruleType;

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
	 * The rule description.
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

	public AvailableWorkflowSystemRule description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * List of rules that conflict with this one.
	 * @return incompatibleRuleKeys
	 **/
	public List<String> getIncompatibleRuleKeys() {
		return incompatibleRuleKeys;
	}

	/**
	 * Set incompatibleRuleKeys
	 **/
	public void setIncompatibleRuleKeys(List<String> incompatibleRuleKeys) {
		this.incompatibleRuleKeys = incompatibleRuleKeys;
	}

	public AvailableWorkflowSystemRule incompatibleRuleKeys(List<String> incompatibleRuleKeys) {
		this.incompatibleRuleKeys = incompatibleRuleKeys;
		return this;
	}

	public AvailableWorkflowSystemRule addIncompatibleRuleKeysItem(String incompatibleRuleKeysItem) {
		if (this.incompatibleRuleKeys == null) {
			this.incompatibleRuleKeys = new ArrayList<>();
		}
		this.incompatibleRuleKeys.add(incompatibleRuleKeysItem);
		return this;
	}

	/**
	 * Whether the rule can be added added to an initial transition.
	 * @return isAvailableForInitialTransition
	 **/
	public Boolean getIsAvailableForInitialTransition() {
		return isAvailableForInitialTransition;
	}

	/**
	 * Set isAvailableForInitialTransition
	 **/
	public void setIsAvailableForInitialTransition(Boolean isAvailableForInitialTransition) {
		this.isAvailableForInitialTransition = isAvailableForInitialTransition;
	}

	public AvailableWorkflowSystemRule isAvailableForInitialTransition(Boolean isAvailableForInitialTransition) {
		this.isAvailableForInitialTransition = isAvailableForInitialTransition;
		return this;
	}

	/**
	 * Whether the rule is visible.
	 * @return isVisible
	 **/
	public Boolean getIsVisible() {
		return isVisible;
	}

	/**
	 * Set isVisible
	 **/
	public void setIsVisible(Boolean isVisible) {
		this.isVisible = isVisible;
	}

	public AvailableWorkflowSystemRule isVisible(Boolean isVisible) {
		this.isVisible = isVisible;
		return this;
	}

	/**
	 * The rule name.
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

	public AvailableWorkflowSystemRule name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The rule key.
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

	public AvailableWorkflowSystemRule ruleKey(String ruleKey) {
		this.ruleKey = ruleKey;
		return this;
	}

	/**
	 * The rule type.
	 * @return ruleType
	 **/
	public RuleTypeEnum getRuleType() {
		return ruleType;
	}

	/**
	 * Set ruleType
	 **/
	public void setRuleType(RuleTypeEnum ruleType) {
		this.ruleType = ruleType;
	}

	public AvailableWorkflowSystemRule ruleType(RuleTypeEnum ruleType) {
		this.ruleType = ruleType;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class AvailableWorkflowSystemRule {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    incompatibleRuleKeys: " + toIndentedString(incompatibleRuleKeys) + "\n" +
			"    isAvailableForInitialTransition: " + toIndentedString(isAvailableForInitialTransition) + "\n" +
			"    isVisible: " + toIndentedString(isVisible) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    ruleKey: " + toIndentedString(ruleKey) + "\n" +
			"    ruleType: " + toIndentedString(ruleType) + "\n" +
			"}";
		return sb;
	}

	public enum RuleTypeEnum {

		CONDITION("Condition"), VALIDATOR("Validator"), FUNCTION("Function"), SCREEN("Screen");


		String value;

		RuleTypeEnum(String v) {
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
