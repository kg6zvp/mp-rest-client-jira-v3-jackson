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
 * The default value for a multi-select custom field.
 **/

public class CustomFieldContextDefaultValueMultipleOption {

	/**
	 * The ID of the context.
	 **/

	private String contextId;

	/**
	 * The list of IDs of the default options.
	 **/

	private List<String> optionIds = new ArrayList<>();


	private String type;

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
	 * The ID of the context.
	 * @return contextId
	 **/
	public String getContextId() {
		return contextId;
	}

	/**
	 * Set contextId
	 **/
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	public CustomFieldContextDefaultValueMultipleOption contextId(String contextId) {
		this.contextId = contextId;
		return this;
	}

	/**
	 * The list of IDs of the default options.
	 * @return optionIds
	 **/
	public List<String> getOptionIds() {
		return optionIds;
	}

	/**
	 * Set optionIds
	 **/
	public void setOptionIds(List<String> optionIds) {
		this.optionIds = optionIds;
	}

	public CustomFieldContextDefaultValueMultipleOption optionIds(List<String> optionIds) {
		this.optionIds = optionIds;
		return this;
	}

	public CustomFieldContextDefaultValueMultipleOption addOptionIdsItem(String optionIdsItem) {
		if (this.optionIds == null) {
			this.optionIds = new ArrayList<>();
		}
		this.optionIds.add(optionIdsItem);
		return this;
	}

	/**
	 * Get type
	 * @return type
	 **/
	public String getType() {
		return type;
	}

	/**
	 * Set type
	 **/
	public void setType(String type) {
		this.type = type;
	}

	public CustomFieldContextDefaultValueMultipleOption type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldContextDefaultValueMultipleOption {\n" +
			"    contextId: " + toIndentedString(contextId) + "\n" +
			"    optionIds: " + toIndentedString(optionIds) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}
}
