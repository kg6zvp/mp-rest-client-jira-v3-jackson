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

import com.fasterxml.jackson.annotation.JsonValue;

import java.net.URI;


public class VersionMoveBean {

	/**
	 * The URL (self link) of the version after which to place the moved version. Cannot be used with `position`.
	 **/

	private URI after;
	/**
	 * An absolute position in which to place the moved version. Cannot be used with `after`.
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
	 * The URL (self link) of the version after which to place the moved version. Cannot be used with &#x60;position&#x60;.
	 * @return after
	 **/
	public URI getAfter() {
		return after;
	}

	/**
	 * Set after
	 **/
	public void setAfter(URI after) {
		this.after = after;
	}

	public VersionMoveBean after(URI after) {
		this.after = after;
		return this;
	}

	/**
	 * An absolute position in which to place the moved version. Cannot be used with &#x60;after&#x60;.
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

	public VersionMoveBean position(PositionEnum position) {
		this.position = position;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class VersionMoveBean {\n" +
			"    after: " + toIndentedString(after) + "\n" +
			"    position: " + toIndentedString(position) + "\n" +
			"}";
		return sb;
	}

	public enum PositionEnum {

		EARLIER("Earlier"), LATER("Later"), FIRST("First"), LAST("Last");


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