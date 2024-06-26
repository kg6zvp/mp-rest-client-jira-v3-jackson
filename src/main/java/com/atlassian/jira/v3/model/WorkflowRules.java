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
 * A collection of transition rules.
 **/

public class WorkflowRules {


	private WorkflowCondition conditionsTree;

	/**
	 * The workflow post functions.
	 **/

	private List<WorkflowTransitionRule> postFunctions = null;

	/**
	 * The workflow validators.
	 **/

	private List<WorkflowTransitionRule> validators = null;

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
	 * Get conditionsTree
	 * @return conditionsTree
	 **/
	public WorkflowCondition getConditionsTree() {
		return conditionsTree;
	}

	/**
	 * Set conditionsTree
	 **/
	public void setConditionsTree(WorkflowCondition conditionsTree) {
		this.conditionsTree = conditionsTree;
	}

	public WorkflowRules conditionsTree(WorkflowCondition conditionsTree) {
		this.conditionsTree = conditionsTree;
		return this;
	}

	/**
	 * The workflow post functions.
	 * @return postFunctions
	 **/
	public List<WorkflowTransitionRule> getPostFunctions() {
		return postFunctions;
	}

	/**
	 * Set postFunctions
	 **/
	public void setPostFunctions(List<WorkflowTransitionRule> postFunctions) {
		this.postFunctions = postFunctions;
	}

	public WorkflowRules postFunctions(List<WorkflowTransitionRule> postFunctions) {
		this.postFunctions = postFunctions;
		return this;
	}

	public WorkflowRules addPostFunctionsItem(WorkflowTransitionRule postFunctionsItem) {
		if (this.postFunctions == null) {
			this.postFunctions = new ArrayList<>();
		}
		this.postFunctions.add(postFunctionsItem);
		return this;
	}

	/**
	 * The workflow validators.
	 * @return validators
	 **/
	public List<WorkflowTransitionRule> getValidators() {
		return validators;
	}

	/**
	 * Set validators
	 **/
	public void setValidators(List<WorkflowTransitionRule> validators) {
		this.validators = validators;
	}

	public WorkflowRules validators(List<WorkflowTransitionRule> validators) {
		this.validators = validators;
		return this;
	}

	public WorkflowRules addValidatorsItem(WorkflowTransitionRule validatorsItem) {
		if (this.validators == null) {
			this.validators = new ArrayList<>();
		}
		this.validators.add(validatorsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowRules {\n" +
			"    conditionsTree: " + toIndentedString(conditionsTree) + "\n" +
			"    postFunctions: " + toIndentedString(postFunctions) + "\n" +
			"    validators: " + toIndentedString(validators) + "\n" +
			"}";
		return sb;
	}
}
