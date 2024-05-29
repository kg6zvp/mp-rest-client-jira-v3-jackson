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


public class JiraExpressionEvalContextBean {

	/**
	 * The ID of the board that is available under the `board` variable when evaluating the expression.
	 **/

	private Long board;

	/**
	 * Custom context variables and their types. These variable types are available for use in a custom context:   *  `user`: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.  *  `issue`: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.  *  `json`: A JSON object containing custom content.  *  `list`: A JSON list of `user`, `issue`, or `json` variable types.
	 **/

	private List<CustomContextVariable> custom = null;

	/**
	 * The ID of the customer request that is available under the `customerRequest` variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.
	 **/

	private Long customerRequest;


	private IdOrKeyBean issue;


	private JexpIssues issues;


	private IdOrKeyBean project;

	/**
	 * The ID of the service desk that is available under the `serviceDesk` variable when evaluating the expression.
	 **/

	private Long serviceDesk;

	/**
	 * The ID of the sprint that is available under the `sprint` variable when evaluating the expression.
	 **/

	private Long sprint;

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
	 * The ID of the board that is available under the &#x60;board&#x60; variable when evaluating the expression.
	 * @return board
	 **/
	public Long getBoard() {
		return board;
	}

	/**
	 * Set board
	 **/
	public void setBoard(Long board) {
		this.board = board;
	}

	public JiraExpressionEvalContextBean board(Long board) {
		this.board = board;
		return this;
	}

	/**
	 * Custom context variables and their types. These variable types are available for use in a custom context:   *  &#x60;user&#x60;: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.  *  &#x60;issue&#x60;: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.  *  &#x60;json&#x60;: A JSON object containing custom content.  *  &#x60;list&#x60;: A JSON list of &#x60;user&#x60;, &#x60;issue&#x60;, or &#x60;json&#x60; variable types.
	 * @return custom
	 **/
	public List<CustomContextVariable> getCustom() {
		return custom;
	}

	/**
	 * Set custom
	 **/
	public void setCustom(List<CustomContextVariable> custom) {
		this.custom = custom;
	}

	public JiraExpressionEvalContextBean custom(List<CustomContextVariable> custom) {
		this.custom = custom;
		return this;
	}

	public JiraExpressionEvalContextBean addCustomItem(CustomContextVariable customItem) {
		if (this.custom == null) {
			this.custom = new ArrayList<>();
		}
		this.custom.add(customItem);
		return this;
	}

	/**
	 * The ID of the customer request that is available under the &#x60;customerRequest&#x60; variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.
	 * @return customerRequest
	 **/
	public Long getCustomerRequest() {
		return customerRequest;
	}

	/**
	 * Set customerRequest
	 **/
	public void setCustomerRequest(Long customerRequest) {
		this.customerRequest = customerRequest;
	}

	public JiraExpressionEvalContextBean customerRequest(Long customerRequest) {
		this.customerRequest = customerRequest;
		return this;
	}

	/**
	 * Get issue
	 * @return issue
	 **/
	public IdOrKeyBean getIssue() {
		return issue;
	}

	/**
	 * Set issue
	 **/
	public void setIssue(IdOrKeyBean issue) {
		this.issue = issue;
	}

	public JiraExpressionEvalContextBean issue(IdOrKeyBean issue) {
		this.issue = issue;
		return this;
	}

	/**
	 * Get issues
	 * @return issues
	 **/
	public JexpIssues getIssues() {
		return issues;
	}

	/**
	 * Set issues
	 **/
	public void setIssues(JexpIssues issues) {
		this.issues = issues;
	}

	public JiraExpressionEvalContextBean issues(JexpIssues issues) {
		this.issues = issues;
		return this;
	}

	/**
	 * Get project
	 * @return project
	 **/
	public IdOrKeyBean getProject() {
		return project;
	}

	/**
	 * Set project
	 **/
	public void setProject(IdOrKeyBean project) {
		this.project = project;
	}

	public JiraExpressionEvalContextBean project(IdOrKeyBean project) {
		this.project = project;
		return this;
	}

	/**
	 * The ID of the service desk that is available under the &#x60;serviceDesk&#x60; variable when evaluating the expression.
	 * @return serviceDesk
	 **/
	public Long getServiceDesk() {
		return serviceDesk;
	}

	/**
	 * Set serviceDesk
	 **/
	public void setServiceDesk(Long serviceDesk) {
		this.serviceDesk = serviceDesk;
	}

	public JiraExpressionEvalContextBean serviceDesk(Long serviceDesk) {
		this.serviceDesk = serviceDesk;
		return this;
	}

	/**
	 * The ID of the sprint that is available under the &#x60;sprint&#x60; variable when evaluating the expression.
	 * @return sprint
	 **/
	public Long getSprint() {
		return sprint;
	}

	/**
	 * Set sprint
	 **/
	public void setSprint(Long sprint) {
		this.sprint = sprint;
	}

	public JiraExpressionEvalContextBean sprint(Long sprint) {
		this.sprint = sprint;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class JiraExpressionEvalContextBean {\n" +
			"    board: " + toIndentedString(board) + "\n" +
			"    custom: " + toIndentedString(custom) + "\n" +
			"    customerRequest: " + toIndentedString(customerRequest) + "\n" +
			"    issue: " + toIndentedString(issue) + "\n" +
			"    issues: " + toIndentedString(issues) + "\n" +
			"    project: " + toIndentedString(project) + "\n" +
			"    serviceDesk: " + toIndentedString(serviceDesk) + "\n" +
			"    sprint: " + toIndentedString(sprint) + "\n" +
			"}";
		return sb;
	}
}
