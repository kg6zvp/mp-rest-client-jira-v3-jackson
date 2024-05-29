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
 * Details of a custom field.
 **/
public class UpdateCustomFieldDetails {

	/**
	 * The description of the custom field. The maximum length is 40000 characters.
	 **/

	private String description;

	/**
	 * The name of the custom field. It doesn't have to be unique. The maximum length is 255 characters.
	 **/

	private String name;
	/**
	 * The searcher that defines the way the field is searched in Jira. It can be set to `null`, otherwise you must specify the valid searcher for the field type, as listed below (abbreviated values shown):   *  `cascadingselect`: `cascadingselectsearcher`  *  `datepicker`: `daterange`  *  `datetime`: `datetimerange`  *  `float`: `exactnumber` or `numberrange`  *  `grouppicker`: `grouppickersearcher`  *  `importid`: `exactnumber` or `numberrange`  *  `labels`: `labelsearcher`  *  `multicheckboxes`: `multiselectsearcher`  *  `multigrouppicker`: `multiselectsearcher`  *  `multiselect`: `multiselectsearcher`  *  `multiuserpicker`: `userpickergroupsearcher`  *  `multiversion`: `versionsearcher`  *  `project`: `projectsearcher`  *  `radiobuttons`: `multiselectsearcher`  *  `readonlyfield`: `textsearcher`  *  `select`: `multiselectsearcher`  *  `textarea`: `textsearcher`  *  `textfield`: `textsearcher`  *  `url`: `exacttextsearcher`  *  `userpicker`: `userpickergroupsearcher`  *  `version`: `versionsearcher`
	 **/

	private SearcherKeyEnum searcherKey;

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
	 * The description of the custom field. The maximum length is 40000 characters.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * Set description
	 **/
	public void setDescription(String description) {
		this.description = description;
	}

	public UpdateCustomFieldDetails description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The name of the custom field. It doesn&#39;t have to be unique. The maximum length is 255 characters.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * Set name
	 **/
	public void setName(String name) {
		this.name = name;
	}

	public UpdateCustomFieldDetails name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The searcher that defines the way the field is searched in Jira. It can be set to &#x60;null&#x60;, otherwise you must specify the valid searcher for the field type, as listed below (abbreviated values shown):   *  &#x60;cascadingselect&#x60;: &#x60;cascadingselectsearcher&#x60;  *  &#x60;datepicker&#x60;: &#x60;daterange&#x60;  *  &#x60;datetime&#x60;: &#x60;datetimerange&#x60;  *  &#x60;float&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;grouppicker&#x60;: &#x60;grouppickersearcher&#x60;  *  &#x60;importid&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;labels&#x60;: &#x60;labelsearcher&#x60;  *  &#x60;multicheckboxes&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multigrouppicker&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiselect&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiuserpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;multiversion&#x60;: &#x60;versionsearcher&#x60;  *  &#x60;project&#x60;: &#x60;projectsearcher&#x60;  *  &#x60;radiobuttons&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;readonlyfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;select&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;textarea&#x60;: &#x60;textsearcher&#x60;  *  &#x60;textfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;url&#x60;: &#x60;exacttextsearcher&#x60;  *  &#x60;userpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;version&#x60;: &#x60;versionsearcher&#x60;
	 * @return searcherKey
	 **/
	public SearcherKeyEnum getSearcherKey() {
		return searcherKey;
	}

	/**
	 * Set searcherKey
	 **/
	public void setSearcherKey(SearcherKeyEnum searcherKey) {
		this.searcherKey = searcherKey;
	}

	public UpdateCustomFieldDetails searcherKey(SearcherKeyEnum searcherKey) {
		this.searcherKey = searcherKey;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class UpdateCustomFieldDetails {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    searcherKey: " + toIndentedString(searcherKey) + "\n" +
			"}";
		return sb;
	}

	public enum SearcherKeyEnum {

		CASCADINGSELECTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:cascadingselectsearcher"), DATERANGE("com.atlassian.jira.plugin.system.customfieldtypes:daterange"), DATETIMERANGE("com.atlassian.jira.plugin.system.customfieldtypes:datetimerange"), EXACTNUMBER("com.atlassian.jira.plugin.system.customfieldtypes:exactnumber"), EXACTTEXTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:exacttextsearcher"), GROUPPICKERSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher"), LABELSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:labelsearcher"), MULTISELECTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:multiselectsearcher"), NUMBERRANGE("com.atlassian.jira.plugin.system.customfieldtypes:numberrange"), PROJECTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:projectsearcher"), TEXTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:textsearcher"), USERPICKERGROUPSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:userpickergroupsearcher"), VERSIONSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:versionsearcher");


		String value;

		SearcherKeyEnum(String v) {
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
