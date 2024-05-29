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


public class PrioritySchemeChangesWithMappings {

	/**
	 * Affected entity ids.
	 **/

	private List<Long> ids = new ArrayList<>();

	/**
	 * Instructions to migrate issues.
	 **/

	private List<PriorityMapping> mappings = null;

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

	public PrioritySchemeChangesWithMappings ids(List<Long> ids) {
		this.ids = ids;
		return this;
	}

	public PrioritySchemeChangesWithMappings addIdsItem(Long idsItem) {
		if (this.ids == null) {
			this.ids = new ArrayList<>();
		}
		this.ids.add(idsItem);
		return this;
	}

	/**
	 * Instructions to migrate issues.
	 * @return mappings
	 **/
	public List<PriorityMapping> getMappings() {
		return mappings;
	}

	/**
	 * Set mappings
	 **/
	public void setMappings(List<PriorityMapping> mappings) {
		this.mappings = mappings;
	}

	public PrioritySchemeChangesWithMappings mappings(List<PriorityMapping> mappings) {
		this.mappings = mappings;
		return this;
	}

	public PrioritySchemeChangesWithMappings addMappingsItem(PriorityMapping mappingsItem) {
		if (this.mappings == null) {
			this.mappings = new ArrayList<>();
		}
		this.mappings.add(mappingsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class PrioritySchemeChangesWithMappings {\n" +
			"    ids: " + toIndentedString(ids) + "\n" +
			"    mappings: " + toIndentedString(mappings) + "\n" +
			"}";
		return sb;
	}
}
