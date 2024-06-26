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

/**
 * The field configuration for an issue type.
 **/

public class FieldConfigurationIssueTypeItem {

	/**
	 * The ID of the field configuration.
	 **/

	private String fieldConfigurationId;

	/**
	 * The ID of the field configuration scheme.
	 **/

	private String fieldConfigurationSchemeId;

	/**
	 * The ID of the issue type or *default*. When set to *default* this field configuration issue type item applies to all issue types without a field configuration.
	 **/

	private String issueTypeId;

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
	 * The ID of the field configuration.
	 * @return fieldConfigurationId
	 **/
	public String getFieldConfigurationId() {
		return fieldConfigurationId;
	}

	/**
	 * Set fieldConfigurationId
	 **/
	public void setFieldConfigurationId(String fieldConfigurationId) {
		this.fieldConfigurationId = fieldConfigurationId;
	}

	public FieldConfigurationIssueTypeItem fieldConfigurationId(String fieldConfigurationId) {
		this.fieldConfigurationId = fieldConfigurationId;
		return this;
	}

	/**
	 * The ID of the field configuration scheme.
	 * @return fieldConfigurationSchemeId
	 **/
	public String getFieldConfigurationSchemeId() {
		return fieldConfigurationSchemeId;
	}

	/**
	 * Set fieldConfigurationSchemeId
	 **/
	public void setFieldConfigurationSchemeId(String fieldConfigurationSchemeId) {
		this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;
	}

	public FieldConfigurationIssueTypeItem fieldConfigurationSchemeId(String fieldConfigurationSchemeId) {
		this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;
		return this;
	}

	/**
	 * The ID of the issue type or *default*. When set to *default* this field configuration issue type item applies to all issue types without a field configuration.
	 * @return issueTypeId
	 **/
	public String getIssueTypeId() {
		return issueTypeId;
	}

	/**
	 * Set issueTypeId
	 **/
	public void setIssueTypeId(String issueTypeId) {
		this.issueTypeId = issueTypeId;
	}

	public FieldConfigurationIssueTypeItem issueTypeId(String issueTypeId) {
		this.issueTypeId = issueTypeId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class FieldConfigurationIssueTypeItem {\n" +
			"    fieldConfigurationId: " + toIndentedString(fieldConfigurationId) + "\n" +
			"    fieldConfigurationSchemeId: " + toIndentedString(fieldConfigurationSchemeId) + "\n" +
			"    issueTypeId: " + toIndentedString(issueTypeId) + "\n" +
			"}";
		return sb;
	}
}
