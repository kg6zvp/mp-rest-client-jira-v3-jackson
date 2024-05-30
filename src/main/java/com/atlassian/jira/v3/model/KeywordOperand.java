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

/**
 * An operand that is a JQL keyword. See [Advanced searching - keywords reference](https://confluence.atlassian.com/jiracorecloud/advanced-searching-keywords-reference-765593717.html#Advancedsearching-keywordsreference-EMPTYEMPTY) for more information about operand keywords.
 **/
public class KeywordOperand {
	/**
	 * The keyword that is the operand value.
	 **/

	private KeywordEnum keyword;

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
	 * The keyword that is the operand value.
	 * @return keyword
	 **/
	public KeywordEnum getKeyword() {
		return keyword;
	}

	/**
	 * Set keyword
	 **/
	public void setKeyword(KeywordEnum keyword) {
		this.keyword = keyword;
	}

	public KeywordOperand keyword(KeywordEnum keyword) {
		this.keyword = keyword;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class KeywordOperand {\n" +
			"    keyword: " + toIndentedString(keyword) + "\n" +
			"}";
		return sb;
	}

	public enum KeywordEnum {

		EMPTY("empty");


		String value;

		KeywordEnum(String v) {
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
