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

/**
 * Details about the configuration of Jira.
 **/

public class ModelConfiguration {

	/**
	 * Whether the ability to add attachments to issues is enabled.
	 **/

	private Boolean attachmentsEnabled;

	/**
	 * Whether the ability to link issues is enabled.
	 **/

	private Boolean issueLinkingEnabled;

	/**
	 * Whether the ability to create subtasks for issues is enabled.
	 **/

	private Boolean subTasksEnabled;


	private ConfigurationTimeTrackingConfiguration timeTrackingConfiguration;

	/**
	 * Whether the ability to track time is enabled. This property is deprecated.
	 **/

	private Boolean timeTrackingEnabled;

	/**
	 * Whether the ability to create unassigned issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
	 **/

	private Boolean unassignedIssuesAllowed;

	/**
	 * Whether the ability for users to vote on issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
	 **/

	private Boolean votingEnabled;

	/**
	 * Whether the ability for users to watch issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
	 **/

	private Boolean watchingEnabled;

	public ModelConfiguration() {
	}


	public ModelConfiguration(
		Boolean attachmentsEnabled,
		Boolean issueLinkingEnabled,
		Boolean subTasksEnabled,
		Boolean timeTrackingEnabled,
		Boolean unassignedIssuesAllowed,
		Boolean votingEnabled,
		Boolean watchingEnabled
	) {
		this.attachmentsEnabled = attachmentsEnabled;
		this.issueLinkingEnabled = issueLinkingEnabled;
		this.subTasksEnabled = subTasksEnabled;
		this.timeTrackingEnabled = timeTrackingEnabled;
		this.unassignedIssuesAllowed = unassignedIssuesAllowed;
		this.votingEnabled = votingEnabled;
		this.watchingEnabled = watchingEnabled;
	}

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
	 * Whether the ability to add attachments to issues is enabled.
	 * @return attachmentsEnabled
	 **/
	public Boolean getAttachmentsEnabled() {
		return attachmentsEnabled;
	}

	/**
	 * Whether the ability to link issues is enabled.
	 * @return issueLinkingEnabled
	 **/
	public Boolean getIssueLinkingEnabled() {
		return issueLinkingEnabled;
	}

	/**
	 * Whether the ability to create subtasks for issues is enabled.
	 * @return subTasksEnabled
	 **/
	public Boolean getSubTasksEnabled() {
		return subTasksEnabled;
	}

	/**
	 * Get timeTrackingConfiguration
	 * @return timeTrackingConfiguration
	 **/
	public ConfigurationTimeTrackingConfiguration getTimeTrackingConfiguration() {
		return timeTrackingConfiguration;
	}

	/**
	 * Set timeTrackingConfiguration
	 **/
	public void setTimeTrackingConfiguration(ConfigurationTimeTrackingConfiguration timeTrackingConfiguration) {
		this.timeTrackingConfiguration = timeTrackingConfiguration;
	}

	public ModelConfiguration timeTrackingConfiguration(ConfigurationTimeTrackingConfiguration timeTrackingConfiguration) {
		this.timeTrackingConfiguration = timeTrackingConfiguration;
		return this;
	}

	/**
	 * Whether the ability to track time is enabled. This property is deprecated.
	 * @return timeTrackingEnabled
	 **/
	public Boolean getTimeTrackingEnabled() {
		return timeTrackingEnabled;
	}

	/**
	 * Whether the ability to create unassigned issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
	 * @return unassignedIssuesAllowed
	 **/
	public Boolean getUnassignedIssuesAllowed() {
		return unassignedIssuesAllowed;
	}

	/**
	 * Whether the ability for users to vote on issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
	 * @return votingEnabled
	 **/
	public Boolean getVotingEnabled() {
		return votingEnabled;
	}

	/**
	 * Whether the ability for users to watch issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
	 * @return watchingEnabled
	 **/
	public Boolean getWatchingEnabled() {
		return watchingEnabled;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ModelConfiguration {\n" +
			"    attachmentsEnabled: " + toIndentedString(attachmentsEnabled) + "\n" +
			"    issueLinkingEnabled: " + toIndentedString(issueLinkingEnabled) + "\n" +
			"    subTasksEnabled: " + toIndentedString(subTasksEnabled) + "\n" +
			"    timeTrackingConfiguration: " + toIndentedString(timeTrackingConfiguration) + "\n" +
			"    timeTrackingEnabled: " + toIndentedString(timeTrackingEnabled) + "\n" +
			"    unassignedIssuesAllowed: " + toIndentedString(unassignedIssuesAllowed) + "\n" +
			"    votingEnabled: " + toIndentedString(votingEnabled) + "\n" +
			"    watchingEnabled: " + toIndentedString(watchingEnabled) + "\n" +
			"}";
		return sb;
	}
}
