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


public class PrioritySchemeChangesWithoutMappings {

	/**
	 * Affected entity ids.
	 **/

	private List<Long> ids = new ArrayList<>();

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
	 * Affected entity ids.
	 * @return ids
	 **/
	public List<Long> getIds() {
		return ids;
	}

	/**
	 * Set ids
	 **/
	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public PrioritySchemeChangesWithoutMappings ids(List<Long> ids) {
		this.ids = ids;
		return this;
	}

	public PrioritySchemeChangesWithoutMappings addIdsItem(Long idsItem) {
		if (this.ids == null) {
			this.ids = new ArrayList<>();
		}
		this.ids.add(idsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class PrioritySchemeChangesWithoutMappings {\n" +
			"    ids: " + toIndentedString(ids) + "\n" +
			"}";
		return sb;
	}
}
