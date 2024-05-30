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

public class JiraExpressionsComplexityBean {


	private JiraExpressionsComplexityValueBean beans;


	private JiraExpressionsComplexityValueBean expensiveOperations;


	private JiraExpressionsComplexityValueBean primitiveValues;


	private JiraExpressionsComplexityValueBean steps;

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
	 * Get beans
	 * @return beans
	 **/
	public JiraExpressionsComplexityValueBean getBeans() {
		return beans;
	}

	/**
	 * Set beans
	 **/
	public void setBeans(JiraExpressionsComplexityValueBean beans) {
		this.beans = beans;
	}

	public JiraExpressionsComplexityBean beans(JiraExpressionsComplexityValueBean beans) {
		this.beans = beans;
		return this;
	}

	/**
	 * Get expensiveOperations
	 * @return expensiveOperations
	 **/
	public JiraExpressionsComplexityValueBean getExpensiveOperations() {
		return expensiveOperations;
	}

	/**
	 * Set expensiveOperations
	 **/
	public void setExpensiveOperations(JiraExpressionsComplexityValueBean expensiveOperations) {
		this.expensiveOperations = expensiveOperations;
	}

	public JiraExpressionsComplexityBean expensiveOperations(JiraExpressionsComplexityValueBean expensiveOperations) {
		this.expensiveOperations = expensiveOperations;
		return this;
	}

	/**
	 * Get primitiveValues
	 * @return primitiveValues
	 **/
	public JiraExpressionsComplexityValueBean getPrimitiveValues() {
		return primitiveValues;
	}

	/**
	 * Set primitiveValues
	 **/
	public void setPrimitiveValues(JiraExpressionsComplexityValueBean primitiveValues) {
		this.primitiveValues = primitiveValues;
	}

	public JiraExpressionsComplexityBean primitiveValues(JiraExpressionsComplexityValueBean primitiveValues) {
		this.primitiveValues = primitiveValues;
		return this;
	}

	/**
	 * Get steps
	 * @return steps
	 **/
	public JiraExpressionsComplexityValueBean getSteps() {
		return steps;
	}

	/**
	 * Set steps
	 **/
	public void setSteps(JiraExpressionsComplexityValueBean steps) {
		this.steps = steps;
	}

	public JiraExpressionsComplexityBean steps(JiraExpressionsComplexityValueBean steps) {
		this.steps = steps;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class JiraExpressionsComplexityBean {\n" +
			"    beans: " + toIndentedString(beans) + "\n" +
			"    expensiveOperations: " + toIndentedString(expensiveOperations) + "\n" +
			"    primitiveValues: " + toIndentedString(primitiveValues) + "\n" +
			"    steps: " + toIndentedString(steps) + "\n" +
			"}";
		return sb;
	}
}
