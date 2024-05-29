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

/**
 * Details of the scope of the default sharing for new filters and dashboards.
 **/

public class DefaultShareScope {

	/**
	 * The scope of the default sharing for new filters and dashboards:   *  `AUTHENTICATED` Shared with all logged-in users.  *  `GLOBAL` Shared with all logged-in users. This shows as `AUTHENTICATED` in the response.  *  `PRIVATE` Not shared with any users.
	 **/

	private ScopeEnum scope;

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
	 * The scope of the default sharing for new filters and dashboards:   *  &#x60;AUTHENTICATED&#x60; Shared with all logged-in users.  *  &#x60;GLOBAL&#x60; Shared with all logged-in users. This shows as &#x60;AUTHENTICATED&#x60; in the response.  *  &#x60;PRIVATE&#x60; Not shared with any users.
	 * @return scope
	 **/
	public ScopeEnum getScope() {
		return scope;
	}

	/**
	 * Set scope
	 **/
	public void setScope(ScopeEnum scope) {
		this.scope = scope;
	}

	public DefaultShareScope scope(ScopeEnum scope) {
		this.scope = scope;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class DefaultShareScope {\n" +
			"    scope: " + toIndentedString(scope) + "\n" +
			"}";
		return sb;
	}

	public enum ScopeEnum {

		GLOBAL("GLOBAL"), AUTHENTICATED("AUTHENTICATED"), PRIVATE("PRIVATE");


		String value;

		ScopeEnum(String v) {
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