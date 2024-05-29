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

import java.util.ArrayList;
import java.util.List;

/**
 * Details of a field that can be used in advanced searches.
 **/

public class FieldReferenceData {

	/**
	 * Whether the field provide auto-complete suggestions.
	 **/

	private AutoEnum auto;
	/**
	 * If the item is a custom field, the ID of the custom field.
	 **/

	private String cfid;
	/**
	 * Whether this field has been deprecated.
	 **/

	private DeprecatedEnum deprecated;
	/**
	 * The searcher key of the field, only passed when the field is deprecated.
	 **/

	private String deprecatedSearcherKey;
	/**
	 * The display name contains the following:   *  for system fields, the field name. For example, `Summary`.  *  for collapsed custom fields, the field name followed by a hyphen and then the field name and field type. For example, `Component - Component[Dropdown]`.  *  for other custom fields, the field name followed by a hyphen and then the custom field ID. For example, `Component - cf[10061]`.
	 **/

	private String displayName;
	/**
	 * The valid search operators for the field.
	 **/

	private List<String> operators = null;
	/**
	 * Whether the field can be used in a query's `ORDER BY` clause.
	 **/

	private OrderableEnum orderable;
	/**
	 * Whether the content of this field can be searched.
	 **/

	private SearchableEnum searchable;
	/**
	 * The data types of items in the field.
	 **/

	private List<String> types = null;
	/**
	 * The field identifier.
	 **/

	private String value;

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
	 * Whether the field provide auto-complete suggestions.
	 * @return auto
	 **/
	public AutoEnum getAuto() {
		return auto;
	}

	/**
	 * Set auto
	 **/
	public void setAuto(AutoEnum auto) {
		this.auto = auto;
	}

	public FieldReferenceData auto(AutoEnum auto) {
		this.auto = auto;
		return this;
	}

	/**
	 * If the item is a custom field, the ID of the custom field.
	 * @return cfid
	 **/
	public String getCfid() {
		return cfid;
	}

	/**
	 * Set cfid
	 **/
	public void setCfid(String cfid) {
		this.cfid = cfid;
	}

	public FieldReferenceData cfid(String cfid) {
		this.cfid = cfid;
		return this;
	}

	/**
	 * Whether this field has been deprecated.
	 * @return deprecated
	 **/
	public DeprecatedEnum getDeprecated() {
		return deprecated;
	}

	/**
	 * Set deprecated
	 **/
	public void setDeprecated(DeprecatedEnum deprecated) {
		this.deprecated = deprecated;
	}

	public FieldReferenceData deprecated(DeprecatedEnum deprecated) {
		this.deprecated = deprecated;
		return this;
	}

	/**
	 * The searcher key of the field, only passed when the field is deprecated.
	 * @return deprecatedSearcherKey
	 **/
	public String getDeprecatedSearcherKey() {
		return deprecatedSearcherKey;
	}

	/**
	 * Set deprecatedSearcherKey
	 **/
	public void setDeprecatedSearcherKey(String deprecatedSearcherKey) {
		this.deprecatedSearcherKey = deprecatedSearcherKey;
	}

	public FieldReferenceData deprecatedSearcherKey(String deprecatedSearcherKey) {
		this.deprecatedSearcherKey = deprecatedSearcherKey;
		return this;
	}

	/**
	 * The display name contains the following:   *  for system fields, the field name. For example, &#x60;Summary&#x60;.  *  for collapsed custom fields, the field name followed by a hyphen and then the field name and field type. For example, &#x60;Component - Component[Dropdown]&#x60;.  *  for other custom fields, the field name followed by a hyphen and then the custom field ID. For example, &#x60;Component - cf[10061]&#x60;.
	 * @return displayName
	 **/
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Set displayName
	 **/
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public FieldReferenceData displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * The valid search operators for the field.
	 * @return operators
	 **/
	public List<String> getOperators() {
		return operators;
	}

	/**
	 * Set operators
	 **/
	public void setOperators(List<String> operators) {
		this.operators = operators;
	}

	public FieldReferenceData operators(List<String> operators) {
		this.operators = operators;
		return this;
	}

	public FieldReferenceData addOperatorsItem(String operatorsItem) {
		if (this.operators == null) {
			this.operators = new ArrayList<>();
		}
		this.operators.add(operatorsItem);
		return this;
	}

	/**
	 * Whether the field can be used in a query&#39;s &#x60;ORDER BY&#x60; clause.
	 * @return orderable
	 **/
	public OrderableEnum getOrderable() {
		return orderable;
	}

	/**
	 * Set orderable
	 **/
	public void setOrderable(OrderableEnum orderable) {
		this.orderable = orderable;
	}

	public FieldReferenceData orderable(OrderableEnum orderable) {
		this.orderable = orderable;
		return this;
	}

	/**
	 * Whether the content of this field can be searched.
	 * @return searchable
	 **/
	public SearchableEnum getSearchable() {
		return searchable;
	}

	/**
	 * Set searchable
	 **/
	public void setSearchable(SearchableEnum searchable) {
		this.searchable = searchable;
	}

	public FieldReferenceData searchable(SearchableEnum searchable) {
		this.searchable = searchable;
		return this;
	}

	/**
	 * The data types of items in the field.
	 * @return types
	 **/
	public List<String> getTypes() {
		return types;
	}

	/**
	 * Set types
	 **/
	public void setTypes(List<String> types) {
		this.types = types;
	}

	public FieldReferenceData types(List<String> types) {
		this.types = types;
		return this;
	}

	public FieldReferenceData addTypesItem(String typesItem) {
		if (this.types == null) {
			this.types = new ArrayList<>();
		}
		this.types.add(typesItem);
		return this;
	}

	/**
	 * The field identifier.
	 * @return value
	 **/
	public String getValue() {
		return value;
	}

	/**
	 * Set value
	 **/
	public void setValue(String value) {
		this.value = value;
	}

	public FieldReferenceData value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class FieldReferenceData {\n" +
			"    auto: " + toIndentedString(auto) + "\n" +
			"    cfid: " + toIndentedString(cfid) + "\n" +
			"    deprecated: " + toIndentedString(deprecated) + "\n" +
			"    deprecatedSearcherKey: " + toIndentedString(deprecatedSearcherKey) + "\n" +
			"    displayName: " + toIndentedString(displayName) + "\n" +
			"    operators: " + toIndentedString(operators) + "\n" +
			"    orderable: " + toIndentedString(orderable) + "\n" +
			"    searchable: " + toIndentedString(searchable) + "\n" +
			"    types: " + toIndentedString(types) + "\n" +
			"    value: " + toIndentedString(value) + "\n" +
			"}";
		return sb;
	}

	public enum AutoEnum {

		TRUE("true"), FALSE("false");


		String value;

		AutoEnum(String v) {
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

	public enum DeprecatedEnum {

		TRUE("true"), FALSE("false");


		String value;

		DeprecatedEnum(String v) {
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


	public enum OrderableEnum {

		TRUE("true"), FALSE("false");


		String value;

		OrderableEnum(String v) {
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

	public enum SearchableEnum {

		TRUE("true"), FALSE("false");


		String value;

		SearchableEnum(String v) {
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