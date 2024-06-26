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

/**
 * Bulk operation filter details.
 **/

public class IssueFilterForBulkPropertySet {

	/**
	 * The value of properties to perform the bulk operation on.
	 **/

	private Object currentValue = null;

	/**
	 * List of issues to perform the bulk operation on.
	 **/

	private Set<Long> entityIds = null;

	/**
	 * Whether the bulk operation occurs only when the property is present on or absent from an issue.
	 **/

	private Boolean hasProperty;

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
	 * The value of properties to perform the bulk operation on.
	 * @return currentValue
	 **/
	public Object getCurrentValue() {
		return currentValue;
	}

	/**
	 * Set currentValue
	 **/
	public void setCurrentValue(Object currentValue) {
		this.currentValue = currentValue;
	}

	public IssueFilterForBulkPropertySet currentValue(Object currentValue) {
		this.currentValue = currentValue;
		return this;
	}

	/**
	 * List of issues to perform the bulk operation on.
	 * @return entityIds
	 **/
	public Set<Long> getEntityIds() {
		return entityIds;
	}

	/**
	 * Set entityIds
	 **/
	public void setEntityIds(Set<Long> entityIds) {
		this.entityIds = entityIds;
	}

	public IssueFilterForBulkPropertySet entityIds(Set<Long> entityIds) {
		this.entityIds = entityIds;
		return this;
	}

	public IssueFilterForBulkPropertySet addEntityIdsItem(Long entityIdsItem) {
		if (this.entityIds == null) {
			this.entityIds = new LinkedHashSet<>();
		}
		this.entityIds.add(entityIdsItem);
		return this;
	}

	/**
	 * Whether the bulk operation occurs only when the property is present on or absent from an issue.
	 * @return hasProperty
	 **/
	public Boolean getHasProperty() {
		return hasProperty;
	}

	/**
	 * Set hasProperty
	 **/
	public void setHasProperty(Boolean hasProperty) {
		this.hasProperty = hasProperty;
	}

	public IssueFilterForBulkPropertySet hasProperty(Boolean hasProperty) {
		this.hasProperty = hasProperty;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueFilterForBulkPropertySet {\n" +
			"    currentValue: " + toIndentedString(currentValue) + "\n" +
			"    entityIds: " + toIndentedString(entityIds) + "\n" +
			"    hasProperty: " + toIndentedString(hasProperty) + "\n" +
			"}";
		return sb;
	}
}
