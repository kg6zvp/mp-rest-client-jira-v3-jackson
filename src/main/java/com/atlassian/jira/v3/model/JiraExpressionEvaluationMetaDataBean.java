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

public class JiraExpressionEvaluationMetaDataBean {


	private JiraExpressionsComplexityBean complexity;


	private IssuesMetaBean issues;

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
	 * Get complexity
	 * @return complexity
	 **/
	public JiraExpressionsComplexityBean getComplexity() {
		return complexity;
	}

	/**
	 * Set complexity
	 **/
	public void setComplexity(JiraExpressionsComplexityBean complexity) {
		this.complexity = complexity;
	}

	public JiraExpressionEvaluationMetaDataBean complexity(JiraExpressionsComplexityBean complexity) {
		this.complexity = complexity;
		return this;
	}

	/**
	 * Get issues
	 * @return issues
	 **/
	public IssuesMetaBean getIssues() {
		return issues;
	}

	/**
	 * Set issues
	 **/
	public void setIssues(IssuesMetaBean issues) {
		this.issues = issues;
	}

	public JiraExpressionEvaluationMetaDataBean issues(IssuesMetaBean issues) {
		this.issues = issues;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class JiraExpressionEvaluationMetaDataBean {\n" +
			"    complexity: " + toIndentedString(complexity) + "\n" +
			"    issues: " + toIndentedString(issues) + "\n" +
			"}";
		return sb;
	}
}
