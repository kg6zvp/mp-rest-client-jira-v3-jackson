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

public class JiraExpressionEvalRequestBean {


	private JiraExpressionEvalContextBean context;

	/**
	 * The Jira expression to evaluate.
	 **/

	private String expression;

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
	 * Get context
	 * @return context
	 **/
	public JiraExpressionEvalContextBean getContext() {
		return context;
	}

	/**
	 * Set context
	 **/
	public void setContext(JiraExpressionEvalContextBean context) {
		this.context = context;
	}

	public JiraExpressionEvalRequestBean context(JiraExpressionEvalContextBean context) {
		this.context = context;
		return this;
	}

	/**
	 * The Jira expression to evaluate.
	 * @return expression
	 **/
	public String getExpression() {
		return expression;
	}

	/**
	 * Set expression
	 **/
	public void setExpression(String expression) {
		this.expression = expression;
	}

	public JiraExpressionEvalRequestBean expression(String expression) {
		this.expression = expression;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class JiraExpressionEvalRequestBean {\n" +
			"    context: " + toIndentedString(context) + "\n" +
			"    expression: " + toIndentedString(expression) + "\n" +
			"}";
		return sb;
	}
}