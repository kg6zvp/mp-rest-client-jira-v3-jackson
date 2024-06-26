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
 * The list of statuses that will be updated.
 **/

public class StatusUpdateRequest {

	/**
	 * The list of statuses that will be updated.
	 **/

	private List<StatusUpdate> statuses = new ArrayList<>();

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
	 * The list of statuses that will be updated.
	 * @return statuses
	 **/
	public List<StatusUpdate> getStatuses() {
		return statuses;
	}

	/**
	 * Set statuses
	 **/
	public void setStatuses(List<StatusUpdate> statuses) {
		this.statuses = statuses;
	}

	public StatusUpdateRequest statuses(List<StatusUpdate> statuses) {
		this.statuses = statuses;
		return this;
	}

	public StatusUpdateRequest addStatusesItem(StatusUpdate statusesItem) {
		if (this.statuses == null) {
			this.statuses = new ArrayList<>();
		}
		this.statuses.add(statusesItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class StatusUpdateRequest {\n" +
			"    statuses: " + toIndentedString(statuses) + "\n" +
			"}";
		return sb;
	}
}
