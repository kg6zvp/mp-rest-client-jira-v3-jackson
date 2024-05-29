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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Details of an issue update request.
 **/

public class IssueUpdateDetails extends HashMap<String, Object> {

	/**
	 * List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use `update`. Fields included in here cannot be included in `update`.
	 **/

	private Map<String, Object> fields = null;


	private HistoryMetadata historyMetadata;

	/**
	 * Details of issue properties to be add or update.
	 **/

	private List<EntityProperty> properties = null;


	private IssueTransition transition;

	/**
	 * A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in `fields`.
	 **/

	private Map<String, List<FieldUpdateOperation>> update = null;

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
	 * List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use &#x60;update&#x60;. Fields included in here cannot be included in &#x60;update&#x60;.
	 * @return fields
	 **/
	public Map<String, Object> getFields() {
		return fields;
	}

	/**
	 * Set fields
	 **/
	public void setFields(Map<String, Object> fields) {
		this.fields = fields;
	}

	public IssueUpdateDetails fields(Map<String, Object> fields) {
		this.fields = fields;
		return this;
	}

	public IssueUpdateDetails putFieldsItem(String key, Object fieldsItem) {
		if (this.fields == null) {
			this.fields = new HashMap<>();
		}
		this.fields.put(key, fieldsItem);
		return this;
	}

	/**
	 * Get historyMetadata
	 * @return historyMetadata
	 **/
	public HistoryMetadata getHistoryMetadata() {
		return historyMetadata;
	}

	/**
	 * Set historyMetadata
	 **/
	public void setHistoryMetadata(HistoryMetadata historyMetadata) {
		this.historyMetadata = historyMetadata;
	}

	public IssueUpdateDetails historyMetadata(HistoryMetadata historyMetadata) {
		this.historyMetadata = historyMetadata;
		return this;
	}

	/**
	 * Details of issue properties to be add or update.
	 * @return properties
	 **/
	public List<EntityProperty> getProperties() {
		return properties;
	}

	/**
	 * Set properties
	 **/
	public void setProperties(List<EntityProperty> properties) {
		this.properties = properties;
	}

	public IssueUpdateDetails properties(List<EntityProperty> properties) {
		this.properties = properties;
		return this;
	}

	public IssueUpdateDetails addPropertiesItem(EntityProperty propertiesItem) {
		if (this.properties == null) {
			this.properties = new ArrayList<>();
		}
		this.properties.add(propertiesItem);
		return this;
	}

	/**
	 * Get transition
	 * @return transition
	 **/
	public IssueTransition getTransition() {
		return transition;
	}

	/**
	 * Set transition
	 **/
	public void setTransition(IssueTransition transition) {
		this.transition = transition;
	}

	public IssueUpdateDetails transition(IssueTransition transition) {
		this.transition = transition;
		return this;
	}

	/**
	 * A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in &#x60;fields&#x60;.
	 * @return update
	 **/
	public Map<String, List<FieldUpdateOperation>> getUpdate() {
		return update;
	}

	/**
	 * Set update
	 **/
	public void setUpdate(Map<String, List<FieldUpdateOperation>> update) {
		this.update = update;
	}

	public IssueUpdateDetails update(Map<String, List<FieldUpdateOperation>> update) {
		this.update = update;
		return this;
	}

	public IssueUpdateDetails putUpdateItem(String key, List<FieldUpdateOperation> updateItem) {
		if (this.update == null) {
			this.update = new HashMap<>();
		}
		this.update.put(key, updateItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class IssueUpdateDetails {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    fields: " + toIndentedString(fields) + "\n" +
			"    historyMetadata: " + toIndentedString(historyMetadata) + "\n" +
			"    properties: " + toIndentedString(properties) + "\n" +
			"    transition: " + toIndentedString(transition) + "\n" +
			"    update: " + toIndentedString(update) + "\n" +
			"}";
		return sb;
	}
}
