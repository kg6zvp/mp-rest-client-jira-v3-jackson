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

/**
 * A workflow with transition rules.
 **/

public class WorkflowTransitionRules {

	/**
	 * The list of conditions within the workflow.
	 **/

	private List<AppWorkflowTransitionRule> conditions = null;

	/**
	 * The list of post functions within the workflow.
	 **/

	private List<AppWorkflowTransitionRule> postFunctions = null;

	/**
	 * The list of validators within the workflow.
	 **/

	private List<AppWorkflowTransitionRule> validators = null;


	private WorkflowId workflowId;

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
	 * The list of conditions within the workflow.
	 * @return conditions
	 **/
	public List<AppWorkflowTransitionRule> getConditions() {
		return conditions;
	}

	/**
	 * Set conditions
	 **/
	public void setConditions(List<AppWorkflowTransitionRule> conditions) {
		this.conditions = conditions;
	}

	public WorkflowTransitionRules conditions(List<AppWorkflowTransitionRule> conditions) {
		this.conditions = conditions;
		return this;
	}

	public WorkflowTransitionRules addConditionsItem(AppWorkflowTransitionRule conditionsItem) {
		if (this.conditions == null) {
			this.conditions = new ArrayList<>();
		}
		this.conditions.add(conditionsItem);
		return this;
	}

	/**
	 * The list of post functions within the workflow.
	 * @return postFunctions
	 **/
	public List<AppWorkflowTransitionRule> getPostFunctions() {
		return postFunctions;
	}

	/**
	 * Set postFunctions
	 **/
	public void setPostFunctions(List<AppWorkflowTransitionRule> postFunctions) {
		this.postFunctions = postFunctions;
	}

	public WorkflowTransitionRules postFunctions(List<AppWorkflowTransitionRule> postFunctions) {
		this.postFunctions = postFunctions;
		return this;
	}

	public WorkflowTransitionRules addPostFunctionsItem(AppWorkflowTransitionRule postFunctionsItem) {
		if (this.postFunctions == null) {
			this.postFunctions = new ArrayList<>();
		}
		this.postFunctions.add(postFunctionsItem);
		return this;
	}

	/**
	 * The list of validators within the workflow.
	 * @return validators
	 **/
	public List<AppWorkflowTransitionRule> getValidators() {
		return validators;
	}

	/**
	 * Set validators
	 **/
	public void setValidators(List<AppWorkflowTransitionRule> validators) {
		this.validators = validators;
	}

	public WorkflowTransitionRules validators(List<AppWorkflowTransitionRule> validators) {
		this.validators = validators;
		return this;
	}

	public WorkflowTransitionRules addValidatorsItem(AppWorkflowTransitionRule validatorsItem) {
		if (this.validators == null) {
			this.validators = new ArrayList<>();
		}
		this.validators.add(validatorsItem);
		return this;
	}

	/**
	 * Get workflowId
	 * @return workflowId
	 **/
	public WorkflowId getWorkflowId() {
		return workflowId;
	}

	/**
	 * Set workflowId
	 **/
	public void setWorkflowId(WorkflowId workflowId) {
		this.workflowId = workflowId;
	}

	public WorkflowTransitionRules workflowId(WorkflowId workflowId) {
		this.workflowId = workflowId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowTransitionRules {\n" +
			"    conditions: " + toIndentedString(conditions) + "\n" +
			"    postFunctions: " + toIndentedString(postFunctions) + "\n" +
			"    validators: " + toIndentedString(validators) + "\n" +
			"    workflowId: " + toIndentedString(workflowId) + "\n" +
			"}";
		return sb;
	}
}