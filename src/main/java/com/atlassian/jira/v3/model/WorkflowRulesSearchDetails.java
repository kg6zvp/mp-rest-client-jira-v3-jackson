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
import java.util.UUID;

/**
 * Details of workflow transition rules.
 **/

public class WorkflowRulesSearchDetails {

	/**
	 * List of workflow rule IDs that do not belong to the workflow or can not be found.
	 **/

	private List<UUID> invalidRules = null;

	/**
	 * List of valid workflow transition rules.
	 **/

	private List<WorkflowTransitionRules> validRules = null;

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
	 * List of workflow rule IDs that do not belong to the workflow or can not be found.
	 * @return invalidRules
	 **/
	public List<UUID> getInvalidRules() {
		return invalidRules;
	}

	/**
	 * Set invalidRules
	 **/
	public void setInvalidRules(List<UUID> invalidRules) {
		this.invalidRules = invalidRules;
	}

	public WorkflowRulesSearchDetails invalidRules(List<UUID> invalidRules) {
		this.invalidRules = invalidRules;
		return this;
	}

	public WorkflowRulesSearchDetails addInvalidRulesItem(UUID invalidRulesItem) {
		if (this.invalidRules == null) {
			this.invalidRules = new ArrayList<>();
		}
		this.invalidRules.add(invalidRulesItem);
		return this;
	}

	/**
	 * List of valid workflow transition rules.
	 * @return validRules
	 **/
	public List<WorkflowTransitionRules> getValidRules() {
		return validRules;
	}

	/**
	 * Set validRules
	 **/
	public void setValidRules(List<WorkflowTransitionRules> validRules) {
		this.validRules = validRules;
	}

	public WorkflowRulesSearchDetails validRules(List<WorkflowTransitionRules> validRules) {
		this.validRules = validRules;
		return this;
	}

	public WorkflowRulesSearchDetails addValidRulesItem(WorkflowTransitionRules validRulesItem) {
		if (this.validRules == null) {
			this.validRules = new ArrayList<>();
		}
		this.validRules.add(validRulesItem);
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

	public WorkflowRulesSearchDetails workflowEntityId(UUID workflowEntityId) {
		this.workflowEntityId = workflowEntityId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowRulesSearchDetails {\n" +
			"    invalidRules: " + toIndentedString(invalidRules) + "\n" +
			"    validRules: " + toIndentedString(validRules) + "\n" +
			"    workflowEntityId: " + toIndentedString(workflowEntityId) + "\n" +
			"}";
		return sb;
	}
}
