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

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;

/**
 * An ordered list of custom field option IDs and information on where to move them.
 **/

public class OrderOfCustomFieldOptions {

	/**
	 * The ID of the custom field option or cascading option to place the moved options after. Required if `position` isn't provided.
	 **/

	private String after;

	/**
	 * A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.
	 **/

	private List<String> customFieldOptionIds = new ArrayList<>();
	/**
	 * The position the custom field options should be moved to. Required if `after` isn't provided.
	 **/

	private PositionEnum position;

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
	 * The ID of the custom field option or cascading option to place the moved options after. Required if &#x60;position&#x60; isn&#39;t provided.
	 * @return after
	 **/
	public String getAfter() {
		return after;
	}

	/**
	 * Set after
	 **/
	public void setAfter(String after) {
		this.after = after;
	}

	public OrderOfCustomFieldOptions after(String after) {
		this.after = after;
		return this;
	}

	/**
	 * A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.
	 * @return customFieldOptionIds
	 **/
	public List<String> getCustomFieldOptionIds() {
		return customFieldOptionIds;
	}

	/**
	 * Set customFieldOptionIds
	 **/
	public void setCustomFieldOptionIds(List<String> customFieldOptionIds) {
		this.customFieldOptionIds = customFieldOptionIds;
	}

	public OrderOfCustomFieldOptions customFieldOptionIds(List<String> customFieldOptionIds) {
		this.customFieldOptionIds = customFieldOptionIds;
		return this;
	}

	public OrderOfCustomFieldOptions addCustomFieldOptionIdsItem(String customFieldOptionIdsItem) {
		if (this.customFieldOptionIds == null) {
			this.customFieldOptionIds = new ArrayList<>();
		}
		this.customFieldOptionIds.add(customFieldOptionIdsItem);
		return this;
	}

	/**
	 * The position the custom field options should be moved to. Required if &#x60;after&#x60; isn&#39;t provided.
	 * @return position
	 **/
	public PositionEnum getPosition() {
		return position;
	}

	/**
	 * Set position
	 **/
	public void setPosition(PositionEnum position) {
		this.position = position;
	}

	public OrderOfCustomFieldOptions position(PositionEnum position) {
		this.position = position;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class OrderOfCustomFieldOptions {\n" +
			"    after: " + toIndentedString(after) + "\n" +
			"    customFieldOptionIds: " + toIndentedString(customFieldOptionIds) + "\n" +
			"    position: " + toIndentedString(position) + "\n" +
			"}";
		return sb;
	}

	public enum PositionEnum {

		FIRST("First"), LAST("Last");


		String value;

		PositionEnum(String v) {
			value = v;
		}

		@JsonValue
		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}
	}
}
