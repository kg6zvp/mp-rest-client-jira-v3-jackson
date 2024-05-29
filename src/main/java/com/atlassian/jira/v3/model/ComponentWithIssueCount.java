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

import java.net.URI;

/**
 * Details about a component with a count of the issues it contains.
 **/

public class ComponentWithIssueCount {


	private User assignee;
	/**
	 * The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
	 **/

	private AssigneeTypeEnum assigneeType;
	/**
	 * The description for the component.
	 **/

	private String description;
	/**
	 * The unique identifier for the component.
	 **/

	private String id;
	/**
	 * Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.
	 **/

	private Boolean isAssigneeTypeValid;
	/**
	 * Count of issues for the component.
	 **/

	private Long issueCount;
	private User lead;
	/**
	 * The name for the component.
	 **/

	private String name;
	/**
	 * The key of the project to which the component is assigned.
	 **/

	private String project;
	/**
	 * Not used.
	 **/

	private Long projectId;
	private User realAssignee;
	/**
	 * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.
	 **/

	private RealAssigneeTypeEnum realAssigneeType;
	/**
	 * The URL for this count of the issues contained in the component.
	 **/

	private URI self;

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
	 * Get assignee
	 * @return assignee
	 **/
	public User getAssignee() {
		return assignee;
	}

	/**
	 * Set assignee
	 **/
	public void setAssignee(User assignee) {
		this.assignee = assignee;
	}

	public ComponentWithIssueCount assignee(User assignee) {
		this.assignee = assignee;
		return this;
	}

	/**
	 * The nominal user type used to determine the assignee for issues created with this component. See &#x60;realAssigneeType&#x60; for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  &#x60;PROJECT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  &#x60;COMPONENT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the component.  *  &#x60;UNASSIGNED&#x60; an assignee is not set for issues created with this component.  *  &#x60;PROJECT_DEFAULT&#x60; the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
	 * @return assigneeType
	 **/
	public AssigneeTypeEnum getAssigneeType() {
		return assigneeType;
	}

	/**
	 * The description for the component.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * The unique identifier for the component.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * Whether a user is associated with &#x60;assigneeType&#x60;. For example, if the &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but the component lead is not set, then &#x60;false&#x60; is returned.
	 * @return isAssigneeTypeValid
	 **/
	public Boolean getIsAssigneeTypeValid() {
		return isAssigneeTypeValid;
	}

	/**
	 * Count of issues for the component.
	 * @return issueCount
	 **/
	public Long getIssueCount() {
		return issueCount;
	}

	/**
	 * Get lead
	 * @return lead
	 **/
	public User getLead() {
		return lead;
	}

	/**
	 * Set lead
	 **/
	public void setLead(User lead) {
		this.lead = lead;
	}

	public ComponentWithIssueCount lead(User lead) {
		this.lead = lead;
		return this;
	}

	/**
	 * The name for the component.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * The key of the project to which the component is assigned.
	 * @return project
	 **/
	public String getProject() {
		return project;
	}

	/**
	 * Not used.
	 * @return projectId
	 **/
	public Long getProjectId() {
		return projectId;
	}

	/**
	 * Get realAssignee
	 * @return realAssignee
	 **/
	public User getRealAssignee() {
		return realAssignee;
	}

	/**
	 * Set realAssignee
	 **/
	public void setRealAssignee(User realAssignee) {
		this.realAssignee = realAssignee;
	}

	public ComponentWithIssueCount realAssignee(User realAssignee) {
		this.realAssignee = realAssignee;
		return this;
	}

	/**
	 * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the &#x60;assigneeType&#x60;. For example, &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but no component lead is set. This property is set to one of the following values:   *  &#x60;PROJECT_LEAD&#x60; when &#x60;assigneeType&#x60; is &#x60;PROJECT_LEAD&#x60; and the project lead has permission to be assigned issues in the project that the component is in.  *  &#x60;COMPONENT_LEAD&#x60; when &#x60;assignee&#x60;Type is &#x60;COMPONENT_LEAD&#x60; and the component lead has permission to be assigned issues in the project that the component is in.  *  &#x60;UNASSIGNED&#x60; when &#x60;assigneeType&#x60; is &#x60;UNASSIGNED&#x60; and Jira is configured to allow unassigned issues.  *  &#x60;PROJECT_DEFAULT&#x60; when none of the preceding cases are true.
	 * @return realAssigneeType
	 **/
	public RealAssigneeTypeEnum getRealAssigneeType() {
		return realAssigneeType;
	}

	/**
	 * The URL for this count of the issues contained in the component.
	 * @return self
	 **/
	public URI getSelf() {
		return self;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ComponentWithIssueCount {\n" +
			"    assignee: " + toIndentedString(assignee) + "\n" +
			"    assigneeType: " + toIndentedString(assigneeType) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    isAssigneeTypeValid: " + toIndentedString(isAssigneeTypeValid) + "\n" +
			"    issueCount: " + toIndentedString(issueCount) + "\n" +
			"    lead: " + toIndentedString(lead) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    project: " + toIndentedString(project) + "\n" +
			"    projectId: " + toIndentedString(projectId) + "\n" +
			"    realAssignee: " + toIndentedString(realAssignee) + "\n" +
			"    realAssigneeType: " + toIndentedString(realAssigneeType) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"}";
		return sb;
	}


	public enum AssigneeTypeEnum {

		PROJECT_DEFAULT("PROJECT_DEFAULT"), COMPONENT_LEAD("COMPONENT_LEAD"), PROJECT_LEAD("PROJECT_LEAD"), UNASSIGNED("UNASSIGNED");


		String value;

		AssigneeTypeEnum(String v) {
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

	public enum RealAssigneeTypeEnum {

		PROJECT_DEFAULT("PROJECT_DEFAULT"), COMPONENT_LEAD("COMPONENT_LEAD"), PROJECT_LEAD("PROJECT_LEAD"), UNASSIGNED("UNASSIGNED");


		String value;

		RealAssigneeTypeEnum(String v) {
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