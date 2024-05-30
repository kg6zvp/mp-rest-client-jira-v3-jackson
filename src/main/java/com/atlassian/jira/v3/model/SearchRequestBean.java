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


public class SearchRequestBean {

	/**
	 * Use [expand](em>#expansion) to include additional information about issues in the response. Note that, unlike the majority of instances where `expand` is specified, `expand` is defined as a list of values. The expand options are:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `operations` Returns all possible operations for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version.
	 **/

	private List<String> expand = null;

	/**
	 * A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  The default is `*navigable`.  Examples:   *  `summary,comment` Returns the summary and comments fields only.  *  `-description` Returns all navigable (default) fields except description.  *  `*all,-comment` Returns all fields except comments.  Multiple `fields` parameters can be included in a request.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields.
	 **/

	private List<String> fields = null;

	/**
	 * Reference fields by their key (rather than ID). The default is `false`.
	 **/

	private Boolean fieldsByKeys;

	/**
	 * A [JQL](https://confluence.atlassian.com/x/egORLQ) expression.
	 **/

	private String jql;

	/**
	 * The maximum number of items to return per page.
	 **/

	private Integer maxResults = 50;

	/**
	 * A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list.
	 **/

	private List<String> properties = null;

	/**
	 * The index of the first item to return in the page of results (page offset). The base index is `0`.
	 **/

	private Integer startAt;
	/**
	 * Determines how to validate the JQL query and treat the validation results. Supported values:   *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  `warn` Returns all errors as warnings.  *  `none` No validation is performed.  *  `true` *Deprecated* A legacy synonym for `strict`.  *  `false` *Deprecated* A legacy synonym for `warn`.  The default is `strict`.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.
	 **/

	private ValidateQueryEnum validateQuery;

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
	 * Use [expand](em&gt;#expansion) to include additional information about issues in the response. Note that, unlike the majority of instances where &#x60;expand&#x60; is specified, &#x60;expand&#x60; is defined as a list of values. The expand options are:   *  &#x60;renderedFields&#x60; Returns field values rendered in HTML format.  *  &#x60;names&#x60; Returns the display name of each field.  *  &#x60;schema&#x60; Returns the schema describing a field type.  *  &#x60;transitions&#x60; Returns all possible transitions for the issue.  *  &#x60;operations&#x60; Returns all possible operations for the issue.  *  &#x60;editmeta&#x60; Returns information about how each field can be edited.  *  &#x60;changelog&#x60; Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  &#x60;versionedRepresentations&#x60; Instead of &#x60;fields&#x60;, returns &#x60;versionedRepresentations&#x60; a JSON array containing each version of a field&#39;s value, with the highest numbered item representing the most recent version.
	 * @return expand
	 **/
	public List<String> getExpand() {
		return expand;
	}

	/**
	 * Set expand
	 **/
	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public SearchRequestBean expand(List<String> expand) {
		this.expand = expand;
		return this;
	}

	public SearchRequestBean addExpandItem(String expandItem) {
		if (this.expand == null) {
			this.expand = new ArrayList<>();
		}
		this.expand.add(expandItem);
		return this;
	}

	/**
	 * A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;*all&#x60; Returns all fields.  *  &#x60;*navigable&#x60; Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  The default is &#x60;*navigable&#x60;.  Examples:   *  &#x60;summary,comment&#x60; Returns the summary and comments fields only.  *  &#x60;-description&#x60; Returns all navigable (default) fields except description.  *  &#x60;*all,-comment&#x60; Returns all fields except comments.  Multiple &#x60;fields&#x60; parameters can be included in a request.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields.
	 * @return fields
	 **/
	public List<String> getFields() {
		return fields;
	}

	/**
	 * Set fields
	 **/
	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public SearchRequestBean fields(List<String> fields) {
		this.fields = fields;
		return this;
	}

	public SearchRequestBean addFieldsItem(String fieldsItem) {
		if (this.fields == null) {
			this.fields = new ArrayList<>();
		}
		this.fields.add(fieldsItem);
		return this;
	}

	/**
	 * Reference fields by their key (rather than ID). The default is &#x60;false&#x60;.
	 * @return fieldsByKeys
	 **/
	public Boolean getFieldsByKeys() {
		return fieldsByKeys;
	}

	/**
	 * Set fieldsByKeys
	 **/
	public void setFieldsByKeys(Boolean fieldsByKeys) {
		this.fieldsByKeys = fieldsByKeys;
	}

	public SearchRequestBean fieldsByKeys(Boolean fieldsByKeys) {
		this.fieldsByKeys = fieldsByKeys;
		return this;
	}

	/**
	 * A [JQL](https://confluence.atlassian.com/x/egORLQ) expression.
	 * @return jql
	 **/
	public String getJql() {
		return jql;
	}

	/**
	 * Set jql
	 **/
	public void setJql(String jql) {
		this.jql = jql;
	}

	public SearchRequestBean jql(String jql) {
		this.jql = jql;
		return this;
	}

	/**
	 * The maximum number of items to return per page.
	 * @return maxResults
	 **/
	public Integer getMaxResults() {
		return maxResults;
	}

	/**
	 * Set maxResults
	 **/
	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public SearchRequestBean maxResults(Integer maxResults) {
		this.maxResults = maxResults;
		return this;
	}

	/**
	 * A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list.
	 * @return properties
	 **/
	public List<String> getProperties() {
		return properties;
	}

	/**
	 * Set properties
	 **/
	public void setProperties(List<String> properties) {
		this.properties = properties;
	}

	public SearchRequestBean properties(List<String> properties) {
		this.properties = properties;
		return this;
	}

	public SearchRequestBean addPropertiesItem(String propertiesItem) {
		if (this.properties == null) {
			this.properties = new ArrayList<>();
		}
		this.properties.add(propertiesItem);
		return this;
	}

	/**
	 * The index of the first item to return in the page of results (page offset). The base index is &#x60;0&#x60;.
	 * @return startAt
	 **/
	public Integer getStartAt() {
		return startAt;
	}

	/**
	 * Set startAt
	 **/
	public void setStartAt(Integer startAt) {
		this.startAt = startAt;
	}

	public SearchRequestBean startAt(Integer startAt) {
		this.startAt = startAt;
		return this;
	}

	/**
	 * Determines how to validate the JQL query and treat the validation results. Supported values:   *  &#x60;strict&#x60; Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  &#x60;warn&#x60; Returns all errors as warnings.  *  &#x60;none&#x60; No validation is performed.  *  &#x60;true&#x60; *Deprecated* A legacy synonym for &#x60;strict&#x60;.  *  &#x60;false&#x60; *Deprecated* A legacy synonym for &#x60;warn&#x60;.  The default is &#x60;strict&#x60;.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the &#x60;validateQuery&#x60; value.
	 * @return validateQuery
	 **/
	public ValidateQueryEnum getValidateQuery() {
		return validateQuery;
	}

	/**
	 * Set validateQuery
	 **/
	public void setValidateQuery(ValidateQueryEnum validateQuery) {
		this.validateQuery = validateQuery;
	}

	public SearchRequestBean validateQuery(ValidateQueryEnum validateQuery) {
		this.validateQuery = validateQuery;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class SearchRequestBean {\n" +
			"    expand: " + toIndentedString(expand) + "\n" +
			"    fields: " + toIndentedString(fields) + "\n" +
			"    fieldsByKeys: " + toIndentedString(fieldsByKeys) + "\n" +
			"    jql: " + toIndentedString(jql) + "\n" +
			"    maxResults: " + toIndentedString(maxResults) + "\n" +
			"    properties: " + toIndentedString(properties) + "\n" +
			"    startAt: " + toIndentedString(startAt) + "\n" +
			"    validateQuery: " + toIndentedString(validateQuery) + "\n" +
			"}";
		return sb;
	}

	public enum ValidateQueryEnum {

		STRICT("strict"), WARN("warn"), NONE("none"), TRUE("true"), FALSE("false");


		String value;

		ValidateQueryEnum(String v) {
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
