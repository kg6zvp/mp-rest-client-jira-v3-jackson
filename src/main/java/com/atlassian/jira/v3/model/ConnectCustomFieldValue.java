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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;

/**
 * A list of custom field details.
 **/

public class ConnectCustomFieldValue {

	/**
	 * The type of custom field.
	 **/
	@JsonProperty("_type")
	private TypeEnum type;
	/**
	 * The custom field ID.
	 **/

	private Integer fieldID;
	/**
	 * The issue ID.
	 **/

	private Integer issueID;
	/**
	 * The value of number type custom field when `_type` is `NumberIssueField`.
	 **/

	private BigDecimal number;
	/**
	 * The value of single select and multiselect custom field type when `_type` is `SingleSelectIssueField` or `MultiSelectIssueField`.
	 **/

	private String optionID;
	/**
	 * The value of richText type custom field when `_type` is `RichTextIssueField`.
	 **/

	private String richText;
	/**
	 * The value of string type custom field when `_type` is `StringIssueField`.
	 **/

	private String string;
	/**
	 * The value of of text custom field type when `_type` is `TextIssueField`.
	 **/

	private String text;

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
	 * The type of custom field.
	 * @return type
	 **/
	public TypeEnum getType() {
		return type;
	}

	/**
	 * Set type
	 **/
	public void setType(TypeEnum type) {
		this.type = type;
	}

	public ConnectCustomFieldValue type(TypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * The custom field ID.
	 * @return fieldID
	 **/
	public Integer getFieldID() {
		return fieldID;
	}

	/**
	 * Set fieldID
	 **/
	public void setFieldID(Integer fieldID) {
		this.fieldID = fieldID;
	}

	public ConnectCustomFieldValue fieldID(Integer fieldID) {
		this.fieldID = fieldID;
		return this;
	}

	/**
	 * The issue ID.
	 * @return issueID
	 **/
	public Integer getIssueID() {
		return issueID;
	}

	/**
	 * Set issueID
	 **/
	public void setIssueID(Integer issueID) {
		this.issueID = issueID;
	}

	public ConnectCustomFieldValue issueID(Integer issueID) {
		this.issueID = issueID;
		return this;
	}

	/**
	 * The value of number type custom field when &#x60;_type&#x60; is &#x60;NumberIssueField&#x60;.
	 * @return number
	 **/
	public BigDecimal getNumber() {
		return number;
	}

	/**
	 * Set number
	 **/
	public void setNumber(BigDecimal number) {
		this.number = number;
	}

	public ConnectCustomFieldValue number(BigDecimal number) {
		this.number = number;
		return this;
	}

	/**
	 * The value of single select and multiselect custom field type when &#x60;_type&#x60; is &#x60;SingleSelectIssueField&#x60; or &#x60;MultiSelectIssueField&#x60;.
	 * @return optionID
	 **/
	public String getOptionID() {
		return optionID;
	}

	/**
	 * Set optionID
	 **/
	public void setOptionID(String optionID) {
		this.optionID = optionID;
	}

	public ConnectCustomFieldValue optionID(String optionID) {
		this.optionID = optionID;
		return this;
	}

	/**
	 * The value of richText type custom field when &#x60;_type&#x60; is &#x60;RichTextIssueField&#x60;.
	 * @return richText
	 **/
	public String getRichText() {
		return richText;
	}

	/**
	 * Set richText
	 **/
	public void setRichText(String richText) {
		this.richText = richText;
	}

	public ConnectCustomFieldValue richText(String richText) {
		this.richText = richText;
		return this;
	}

	/**
	 * The value of string type custom field when &#x60;_type&#x60; is &#x60;StringIssueField&#x60;.
	 * @return string
	 **/
	public String getString() {
		return string;
	}

	/**
	 * Set string
	 **/
	public void setString(String string) {
		this.string = string;
	}

	public ConnectCustomFieldValue string(String string) {
		this.string = string;
		return this;
	}

	/**
	 * The value of of text custom field type when &#x60;_type&#x60; is &#x60;TextIssueField&#x60;.
	 * @return text
	 **/
	public String getText() {
		return text;
	}

	/**
	 * Set text
	 **/
	public void setText(String text) {
		this.text = text;
	}

	public ConnectCustomFieldValue text(String text) {
		this.text = text;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ConnectCustomFieldValue {\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"    fieldID: " + toIndentedString(fieldID) + "\n" +
			"    issueID: " + toIndentedString(issueID) + "\n" +
			"    number: " + toIndentedString(number) + "\n" +
			"    optionID: " + toIndentedString(optionID) + "\n" +
			"    richText: " + toIndentedString(richText) + "\n" +
			"    string: " + toIndentedString(string) + "\n" +
			"    text: " + toIndentedString(text) + "\n" +
			"}";
		return sb;
	}

	public enum TypeEnum {

		STRINGISSUEFIELD("StringIssueField"), NUMBERISSUEFIELD("NumberIssueField"), RICHTEXTISSUEFIELD("RichTextIssueField"), SINGLESELECTISSUEFIELD("SingleSelectIssueField"), MULTISELECTISSUEFIELD("MultiSelectIssueField"), TEXTISSUEFIELD("TextIssueField");


		String value;

		TypeEnum(String v) {
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
