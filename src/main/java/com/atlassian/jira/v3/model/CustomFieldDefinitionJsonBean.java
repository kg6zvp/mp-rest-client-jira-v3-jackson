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


public class CustomFieldDefinitionJsonBean {

	/**
	 * The description of the custom field, which is displayed in Jira.
	 **/

	private String description;

	/**
	 * The name of the custom field, which is displayed in Jira. This is not the unique identifier.
	 **/

	private String name;
	/**
	 * The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  `cascadingselect`: `cascadingselectsearcher`  *  `datepicker`: `daterange`  *  `datetime`: `datetimerange`  *  `float`: `exactnumber` or `numberrange`  *  `grouppicker`: `grouppickersearcher`  *  `importid`: `exactnumber` or `numberrange`  *  `labels`: `labelsearcher`  *  `multicheckboxes`: `multiselectsearcher`  *  `multigrouppicker`: `multiselectsearcher`  *  `multiselect`: `multiselectsearcher`  *  `multiuserpicker`: `userpickergroupsearcher`  *  `multiversion`: `versionsearcher`  *  `project`: `projectsearcher`  *  `radiobuttons`: `multiselectsearcher`  *  `readonlyfield`: `textsearcher`  *  `select`: `multiselectsearcher`  *  `textarea`: `textsearcher`  *  `textfield`: `textsearcher`  *  `url`: `exacttextsearcher`  *  `userpicker`: `userpickergroupsearcher`  *  `version`: `versionsearcher`  If no searcher is provided, the field isn't searchable. However, [Forge custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-) have a searcher set automatically, so are always searchable.
	 **/

	private SearcherKeyEnum searcherKey;
	/**
	 * The type of the custom field. These built-in custom field types are available:   *  `cascadingselect`: Enables values to be selected from two levels of select lists (value: `com.atlassian.jira.plugin.system.customfieldtypes:cascadingselect`)  *  `datepicker`: Stores a date using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:datepicker`)  *  `datetime`: Stores a date with a time component (value: `com.atlassian.jira.plugin.system.customfieldtypes:datetime`)  *  `float`: Stores and validates a numeric (floating point) input (value: `com.atlassian.jira.plugin.system.customfieldtypes:float`)  *  `grouppicker`: Stores a user group using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:grouppicker`)  *  `importid`: A read-only field that stores the ID the issue had in the system it was imported from (value: `com.atlassian.jira.plugin.system.customfieldtypes:importid`)  *  `labels`: Stores labels (value: `com.atlassian.jira.plugin.system.customfieldtypes:labels`)  *  `multicheckboxes`: Stores multiple values using checkboxes (value: ``)  *  `multigrouppicker`: Stores multiple user groups using a picker control (value: ``)  *  `multiselect`: Stores multiple values using a select list (value: `com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes`)  *  `multiuserpicker`: Stores multiple users using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker`)  *  `multiversion`: Stores multiple versions from the versions available in a project using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:multiversion`)  *  `project`: Stores a project from a list of projects that the user is permitted to view (value: `com.atlassian.jira.plugin.system.customfieldtypes:project`)  *  `radiobuttons`: Stores a value using radio buttons (value: `com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons`)  *  `readonlyfield`: Stores a read-only text value, which can only be populated via the API (value: `com.atlassian.jira.plugin.system.customfieldtypes:readonlyfield`)  *  `select`: Stores a value from a configurable list of options (value: `com.atlassian.jira.plugin.system.customfieldtypes:select`)  *  `textarea`: Stores a long text string using a multiline text area (value: `com.atlassian.jira.plugin.system.customfieldtypes:textarea`)  *  `textfield`: Stores a text string using a single-line text box (value: `com.atlassian.jira.plugin.system.customfieldtypes:textfield`)  *  `url`: Stores a URL (value: `com.atlassian.jira.plugin.system.customfieldtypes:url`)  *  `userpicker`: Stores a user using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:userpicker`)  *  `version`: Stores a version using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:version`)  To create a field based on a [Forge custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-), use the ID of the Forge custom field type as the value. For example, `ari:cloud:ecosystem::extension/e62f20a2-4b61-4dbe-bfb9-9a88b5e3ac84/548c5df1-24aa-4f7c-bbbb-3038d947cb05/static/my-cf-type-key`.
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
	 * The description of the custom field, which is displayed in Jira.
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

	public CustomFieldDefinitionJsonBean description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The name of the custom field, which is displayed in Jira. This is not the unique identifier.
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

	public CustomFieldDefinitionJsonBean name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  &#x60;cascadingselect&#x60;: &#x60;cascadingselectsearcher&#x60;  *  &#x60;datepicker&#x60;: &#x60;daterange&#x60;  *  &#x60;datetime&#x60;: &#x60;datetimerange&#x60;  *  &#x60;float&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;grouppicker&#x60;: &#x60;grouppickersearcher&#x60;  *  &#x60;importid&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;labels&#x60;: &#x60;labelsearcher&#x60;  *  &#x60;multicheckboxes&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multigrouppicker&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiselect&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiuserpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;multiversion&#x60;: &#x60;versionsearcher&#x60;  *  &#x60;project&#x60;: &#x60;projectsearcher&#x60;  *  &#x60;radiobuttons&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;readonlyfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;select&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;textarea&#x60;: &#x60;textsearcher&#x60;  *  &#x60;textfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;url&#x60;: &#x60;exacttextsearcher&#x60;  *  &#x60;userpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;version&#x60;: &#x60;versionsearcher&#x60;  If no searcher is provided, the field isn&#39;t searchable. However, [Forge custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-) have a searcher set automatically, so are always searchable.
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

	public CustomFieldDefinitionJsonBean searcherKey(SearcherKeyEnum searcherKey) {
		this.searcherKey = searcherKey;
		return this;
	}

	/**
	 * The type of the custom field. These built-in custom field types are available:   *  &#x60;cascadingselect&#x60;: Enables values to be selected from two levels of select lists (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:cascadingselect&#x60;)  *  &#x60;datepicker&#x60;: Stores a date using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:datepicker&#x60;)  *  &#x60;datetime&#x60;: Stores a date with a time component (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:datetime&#x60;)  *  &#x60;float&#x60;: Stores and validates a numeric (floating point) input (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:float&#x60;)  *  &#x60;grouppicker&#x60;: Stores a user group using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:grouppicker&#x60;)  *  &#x60;importid&#x60;: A read-only field that stores the ID the issue had in the system it was imported from (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:importid&#x60;)  *  &#x60;labels&#x60;: Stores labels (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:labels&#x60;)  *  &#x60;multicheckboxes&#x60;: Stores multiple values using checkboxes (value: &#x60;&#x60;)  *  &#x60;multigrouppicker&#x60;: Stores multiple user groups using a picker control (value: &#x60;&#x60;)  *  &#x60;multiselect&#x60;: Stores multiple values using a select list (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes&#x60;)  *  &#x60;multiuserpicker&#x60;: Stores multiple users using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker&#x60;)  *  &#x60;multiversion&#x60;: Stores multiple versions from the versions available in a project using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:multiversion&#x60;)  *  &#x60;project&#x60;: Stores a project from a list of projects that the user is permitted to view (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:project&#x60;)  *  &#x60;radiobuttons&#x60;: Stores a value using radio buttons (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons&#x60;)  *  &#x60;readonlyfield&#x60;: Stores a read-only text value, which can only be populated via the API (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:readonlyfield&#x60;)  *  &#x60;select&#x60;: Stores a value from a configurable list of options (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:select&#x60;)  *  &#x60;textarea&#x60;: Stores a long text string using a multiline text area (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:textarea&#x60;)  *  &#x60;textfield&#x60;: Stores a text string using a single-line text box (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:textfield&#x60;)  *  &#x60;url&#x60;: Stores a URL (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:url&#x60;)  *  &#x60;userpicker&#x60;: Stores a user using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:userpicker&#x60;)  *  &#x60;version&#x60;: Stores a version using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:version&#x60;)  To create a field based on a [Forge custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-), use the ID of the Forge custom field type as the value. For example, &#x60;ari:cloud:ecosystem::extension/e62f20a2-4b61-4dbe-bfb9-9a88b5e3ac84/548c5df1-24aa-4f7c-bbbb-3038d947cb05/static/my-cf-type-key&#x60;.
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

	public CustomFieldDefinitionJsonBean type(String type) {
		this.type = type;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldDefinitionJsonBean {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    searcherKey: " + toIndentedString(searcherKey) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
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
