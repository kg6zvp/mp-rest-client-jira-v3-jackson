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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Details of the workflow and its transition rules.
 **/

public class WorkflowRulesSearch {

	/**
	 * Use expand to include additional information in the response. This parameter accepts `transition` which, for each rule, returns information about the transition the rule is assigned to.
	 **/

	private String expand;

	/**
	 * The list of workflow rule IDs.
	 **/

	private List<UUID> ruleIds = new ArrayList<>();

	/**
	 * The workflow ID.
	 **/

	private UUID workflowEntityId;

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
	 * Use expand to include additional information in the response. This parameter accepts &#x60;transition&#x60; which, for each rule, returns information about the transition the rule is assigned to.
	 * @return expand
	 **/
	public String getExpand() {
		return expand;
	}

	/**
	 * Set expand
	 **/
	public void setExpand(String expand) {
		this.expand = expand;
	}

	public WorkflowRulesSearch expand(String expand) {
		this.expand = expand;
		return this;
	}

	/**
	 * The list of workflow rule IDs.
	 * @return ruleIds
	 **/
	public List<UUID> getRuleIds() {
		return ruleIds;
	}

	/**
	 * Set ruleIds
	 **/
	public void setRuleIds(List<UUID> ruleIds) {
		this.ruleIds = ruleIds;
	}

	public WorkflowRulesSearch ruleIds(List<UUID> ruleIds) {
		this.ruleIds = ruleIds;
		return this;
	}

	public WorkflowRulesSearch addRuleIdsItem(UUID ruleIdsItem) {
		if (this.ruleIds == null) {
			this.ruleIds = new ArrayList<>();
		}
		this.ruleIds.add(ruleIdsItem);
		return this;
	}

	/**
	 * The workflow ID.
	 * @return workflowEntityId
	 **/
	public UUID getWorkflowEntityId() {
		return workflowEntityId;
	}

	/**
	 * Set workflowEntityId
	 **/
	public void setWorkflowEntityId(UUID workflowEntityId) {
		this.workflowEntityId = workflowEntityId;
	}

	public WorkflowRulesSearch workflowEntityId(UUID workflowEntityId) {
		this.workflowEntityId = workflowEntityId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowRulesSearch {\n" +
			"    expand: " + toIndentedString(expand) + "\n" +
			"    ruleIds: " + toIndentedString(ruleIds) + "\n" +
			"    workflowEntityId: " + toIndentedString(workflowEntityId) + "\n" +
			"}";
		return sb;
	}
}