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

/**
 * An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.
 **/

public class IssueContextVariable {

	/**
	 * The issue ID.
	 **/

	private Long id;

	/**
	 * The issue key.
	 **/

	private String key;

	/**
	 * Type of custom context variable.
	 **/

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
	 * The issue ID.
	 * @return id
	 **/
	public Long getId() {
		return id;
	}

	/**
	 * Set id
	 **/
	public void setId(Long id) {
		this.id = id;
	}

	public IssueContextVariable id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The issue key.
	 * @return key
	 **/
	public String getKey() {
		return key;
	}

	/**
	 * Set key
	 **/
	public void setKey(String key) {
		this.key = key;
	}

	public IssueContextVariable key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Type of custom context variable.
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

	public IssueContextVariable type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IssueContextVariable {\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    key: " + toIndentedString(key) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}
}