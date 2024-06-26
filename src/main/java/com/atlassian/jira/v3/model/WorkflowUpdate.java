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
import java.util.HashMap;
import java.util.List;

/**
 * The details of the workflows to update.
 **/

public class WorkflowUpdate extends HashMap<String, Object> {

	/**
	 * The mapping of old to new status ID.
	 **/

	private List<StatusMigration> defaultStatusMappings = null;

	/**
	 * The new description for this workflow.
	 **/

	private String description;

	/**
	 * The ID of this workflow.
	 **/

	private String id;


	private WorkflowLayout startPointLayout;

	/**
	 * The mapping of old to new status ID for a specific project and issue type.
	 **/

	private List<StatusMappingDTO> statusMappings = null;

	/**
	 * The statuses associated with this workflow.
	 **/

	private List<StatusLayoutUpdate> statuses = new ArrayList<>();

	/**
	 * The transitions of this workflow.
	 **/

	private List<TransitionUpdateDTO> transitions = new ArrayList<>();


	private DocumentVersion version;

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
	 * The mapping of old to new status ID.
	 * @return defaultStatusMappings
	 **/
	public List<StatusMigration> getDefaultStatusMappings() {
		return defaultStatusMappings;
	}

	/**
	 * Set defaultStatusMappings
	 **/
	public void setDefaultStatusMappings(List<StatusMigration> defaultStatusMappings) {
		this.defaultStatusMappings = defaultStatusMappings;
	}

	public WorkflowUpdate defaultStatusMappings(List<StatusMigration> defaultStatusMappings) {
		this.defaultStatusMappings = defaultStatusMappings;
		return this;
	}

	public WorkflowUpdate addDefaultStatusMappingsItem(StatusMigration defaultStatusMappingsItem) {
		if (this.defaultStatusMappings == null) {
			this.defaultStatusMappings = new ArrayList<>();
		}
		this.defaultStatusMappings.add(defaultStatusMappingsItem);
		return this;
	}

	/**
	 * The new description for this workflow.
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

	public WorkflowUpdate description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The ID of this workflow.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * Set id
	 **/
	public void setId(String id) {
		this.id = id;
	}

	public WorkflowUpdate id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get startPointLayout
	 * @return startPointLayout
	 **/
	public WorkflowLayout getStartPointLayout() {
		return startPointLayout;
	}

	/**
	 * Set startPointLayout
	 **/
	public void setStartPointLayout(WorkflowLayout startPointLayout) {
		this.startPointLayout = startPointLayout;
	}

	public WorkflowUpdate startPointLayout(WorkflowLayout startPointLayout) {
		this.startPointLayout = startPointLayout;
		return this;
	}

	/**
	 * The mapping of old to new status ID for a specific project and issue type.
	 * @return statusMappings
	 **/
	public List<StatusMappingDTO> getStatusMappings() {
		return statusMappings;
	}

	/**
	 * Set statusMappings
	 **/
	public void setStatusMappings(List<StatusMappingDTO> statusMappings) {
		this.statusMappings = statusMappings;
	}

	public WorkflowUpdate statusMappings(List<StatusMappingDTO> statusMappings) {
		this.statusMappings = statusMappings;
		return this;
	}

	public WorkflowUpdate addStatusMappingsItem(StatusMappingDTO statusMappingsItem) {
		if (this.statusMappings == null) {
			this.statusMappings = new ArrayList<>();
		}
		this.statusMappings.add(statusMappingsItem);
		return this;
	}

	/**
	 * The statuses associated with this workflow.
	 * @return statuses
	 **/
	public List<StatusLayoutUpdate> getStatuses() {
		return statuses;
	}

	/**
	 * Set statuses
	 **/
	public void setStatuses(List<StatusLayoutUpdate> statuses) {
		this.statuses = statuses;
	}

	public WorkflowUpdate statuses(List<StatusLayoutUpdate> statuses) {
		this.statuses = statuses;
		return this;
	}

	public WorkflowUpdate addStatusesItem(StatusLayoutUpdate statusesItem) {
		if (this.statuses == null) {
			this.statuses = new ArrayList<>();
		}
		this.statuses.add(statusesItem);
		return this;
	}

	/**
	 * The transitions of this workflow.
	 * @return transitions
	 **/
	public List<TransitionUpdateDTO> getTransitions() {
		return transitions;
	}

	/**
	 * Set transitions
	 **/
	public void setTransitions(List<TransitionUpdateDTO> transitions) {
		this.transitions = transitions;
	}

	public WorkflowUpdate transitions(List<TransitionUpdateDTO> transitions) {
		this.transitions = transitions;
		return this;
	}

	public WorkflowUpdate addTransitionsItem(TransitionUpdateDTO transitionsItem) {
		if (this.transitions == null) {
			this.transitions = new ArrayList<>();
		}
		this.transitions.add(transitionsItem);
		return this;
	}

	/**
	 * Get version
	 * @return version
	 **/
	public DocumentVersion getVersion() {
		return version;
	}

	/**
	 * Set version
	 **/
	public void setVersion(DocumentVersion version) {
		this.version = version;
	}

	public WorkflowUpdate version(DocumentVersion version) {
		this.version = version;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class WorkflowUpdate {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    defaultStatusMappings: " + toIndentedString(defaultStatusMappings) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    startPointLayout: " + toIndentedString(startPointLayout) + "\n" +
			"    statusMappings: " + toIndentedString(statusMappings) + "\n" +
			"    statuses: " + toIndentedString(statuses) + "\n" +
			"    transitions: " + toIndentedString(transitions) + "\n" +
			"    version: " + toIndentedString(version) + "\n" +
			"}";
		return sb;
	}
}
