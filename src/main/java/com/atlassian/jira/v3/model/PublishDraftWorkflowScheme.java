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

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Details about the status mappings for publishing a draft workflow scheme.
 **/

public class PublishDraftWorkflowScheme {

	/**
	 * Mappings of statuses to new statuses for issue types.
	 **/

	private Set<StatusMapping> statusMappings = null;

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
	 * Mappings of statuses to new statuses for issue types.
	 * @return statusMappings
	 **/
	public Set<StatusMapping> getStatusMappings() {
		return statusMappings;
	}

	/**
	 * Set statusMappings
	 **/
	public void setStatusMappings(Set<StatusMapping> statusMappings) {
		this.statusMappings = statusMappings;
	}

	public PublishDraftWorkflowScheme statusMappings(Set<StatusMapping> statusMappings) {
		this.statusMappings = statusMappings;
		return this;
	}

	public PublishDraftWorkflowScheme addStatusMappingsItem(StatusMapping statusMappingsItem) {
		if (this.statusMappings == null) {
			this.statusMappings = new LinkedHashSet<>();
		}
		this.statusMappings.add(statusMappingsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class PublishDraftWorkflowScheme {\n" +
			"    statusMappings: " + toIndentedString(statusMappings) + "\n" +
			"}";
		return sb;
	}
}