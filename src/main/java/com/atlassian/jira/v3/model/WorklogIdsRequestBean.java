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

import java.util.LinkedHashSet;
import java.util.Set;


public class WorklogIdsRequestBean {

	/**
	 * A list of worklog IDs.
	 **/

	private Set<Long> ids = new LinkedHashSet<>();

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
	 * A list of worklog IDs.
	 * @return ids
	 **/
	public Set<Long> getIds() {
		return ids;
	}

	/**
	 * Set ids
	 **/
	public void setIds(Set<Long> ids) {
		this.ids = ids;
	}

	public WorklogIdsRequestBean ids(Set<Long> ids) {
		this.ids = ids;
		return this;
	}

	public WorklogIdsRequestBean addIdsItem(Long idsItem) {
		if (this.ids == null) {
			this.ids = new LinkedHashSet<>();
		}
		this.ids.add(idsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorklogIdsRequestBean {\n" +
			"    ids: " + toIndentedString(ids) + "\n" +
			"}";
		return sb;
	}
}
