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

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class CustomFieldContextDefaultValue {

	/**
	 * The ID of the default cascading option.
	 **/

	private String cascadingOptionId;

	/**
	 * The ID of the context.
	 **/

	private String contextId;

	/**
	 * The ID of the default option.
	 **/

	private String optionId;


	private String type;

	/**
	 * The list of IDs of the default options.
	 **/

	private List<String> optionIds = new ArrayList<>();

	/**
	 * The ID of the default user.
	 **/

	private String accountId;


	private UserFilter userFilter;

	/**
	 * The IDs of the default users.
	 **/

	private List<String> accountIds = new ArrayList<>();

	/**
	 * The ID of the the default group.
	 **/

	private String groupId;

	/**
	 * The IDs of the default groups.
	 **/

	private Set<String> groupIds = new LinkedHashSet<>();

	/**
	 * The default date in ISO format. Ignored if `useCurrent` is true.
	 **/

	private String date;

	/**
	 * Whether to use the current date.
	 **/

	private Boolean useCurrent = false;

	/**
	 * The default date-time in ISO format. Ignored if `useCurrent` is true.
	 **/

	private String dateTime;

	/**
	 * The default URL.
	 **/

	private String url;

	/**
	 * The ID of the default project.
	 **/

	private String projectId;

	/**
	 * The default floating-point number.
	 **/

	private Double number;

	/**
	 * The default labels value.
	 **/

	private List<String> labels = new ArrayList<>();

	/**
	 * The default text. The maximum length is 254 characters.
	 **/

	private String text;

	/**
	 * The ID of the default version.
	 **/

	private String versionId;

	/**
	 * The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are `\"releasedFirst\"` and `\"unreleasedFirst\"`.
	 **/

	private String versionOrder;

	/**
	 * The IDs of the default versions.
	 **/

	private Set<String> versionIds = new LinkedHashSet<>();

	/**
	 * List of string values. The maximum length for a value is 254 characters.
	 **/

	private List<String> values = null;

	/**
	 * The default JSON object.
	 **/
	@JsonProperty("object")
	private Object _object;

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
	 * The ID of the default cascading option.
	 * @return cascadingOptionId
	 **/
	public String getCascadingOptionId() {
		return cascadingOptionId;
	}

	/**
	 * Set cascadingOptionId
	 **/
	public void setCascadingOptionId(String cascadingOptionId) {
		this.cascadingOptionId = cascadingOptionId;
	}

	public CustomFieldContextDefaultValue cascadingOptionId(String cascadingOptionId) {
		this.cascadingOptionId = cascadingOptionId;
		return this;
	}

	/**
	 * The ID of the context.
	 * @return contextId
	 **/
	public String getContextId() {
		return contextId;
	}

	/**
	 * Set contextId
	 **/
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	public CustomFieldContextDefaultValue contextId(String contextId) {
		this.contextId = contextId;
		return this;
	}

	/**
	 * The ID of the default option.
	 * @return optionId
	 **/
	public String getOptionId() {
		return optionId;
	}

	/**
	 * Set optionId
	 **/
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	public CustomFieldContextDefaultValue optionId(String optionId) {
		this.optionId = optionId;
		return this;
	}

	/**
	 * Get type
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

	public CustomFieldContextDefaultValue type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * The list of IDs of the default options.
	 * @return optionIds
	 **/
	public List<String> getOptionIds() {
		return optionIds;
	}

	/**
	 * Set optionIds
	 **/
	public void setOptionIds(List<String> optionIds) {
		this.optionIds = optionIds;
	}

	public CustomFieldContextDefaultValue optionIds(List<String> optionIds) {
		this.optionIds = optionIds;
		return this;
	}

	public CustomFieldContextDefaultValue addOptionIdsItem(String optionIdsItem) {
		if (this.optionIds == null) {
			this.optionIds = new ArrayList<>();
		}
		this.optionIds.add(optionIdsItem);
		return this;
	}

	/**
	 * The ID of the default user.
	 * @return accountId
	 **/
	public String getAccountId() {
		return accountId;
	}

	/**
	 * Set accountId
	 **/
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public CustomFieldContextDefaultValue accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Get userFilter
	 * @return userFilter
	 **/
	public UserFilter getUserFilter() {
		return userFilter;
	}

	/**
	 * Set userFilter
	 **/
	public void setUserFilter(UserFilter userFilter) {
		this.userFilter = userFilter;
	}

	public CustomFieldContextDefaultValue userFilter(UserFilter userFilter) {
		this.userFilter = userFilter;
		return this;
	}

	/**
	 * The IDs of the default users.
	 * @return accountIds
	 **/
	public List<String> getAccountIds() {
		return accountIds;
	}

	/**
	 * Set accountIds
	 **/
	public void setAccountIds(List<String> accountIds) {
		this.accountIds = accountIds;
	}

	public CustomFieldContextDefaultValue accountIds(List<String> accountIds) {
		this.accountIds = accountIds;
		return this;
	}

	public CustomFieldContextDefaultValue addAccountIdsItem(String accountIdsItem) {
		if (this.accountIds == null) {
			this.accountIds = new ArrayList<>();
		}
		this.accountIds.add(accountIdsItem);
		return this;
	}

	/**
	 * The ID of the the default group.
	 * @return groupId
	 **/
	public String getGroupId() {
		return groupId;
	}

	/**
	 * Set groupId
	 **/
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public CustomFieldContextDefaultValue groupId(String groupId) {
		this.groupId = groupId;
		return this;
	}

	/**
	 * The IDs of the default groups.
	 * @return groupIds
	 **/
	public Set<String> getGroupIds() {
		return groupIds;
	}

	/**
	 * Set groupIds
	 **/
	public void setGroupIds(Set<String> groupIds) {
		this.groupIds = groupIds;
	}

	public CustomFieldContextDefaultValue groupIds(Set<String> groupIds) {
		this.groupIds = groupIds;
		return this;
	}

	public CustomFieldContextDefaultValue addGroupIdsItem(String groupIdsItem) {
		if (this.groupIds == null) {
			this.groupIds = new LinkedHashSet<>();
		}
		this.groupIds.add(groupIdsItem);
		return this;
	}

	/**
	 * The default date in ISO format. Ignored if &#x60;useCurrent&#x60; is true.
	 * @return date
	 **/
	public String getDate() {
		return date;
	}

	/**
	 * Set date
	 **/
	public void setDate(String date) {
		this.date = date;
	}

	public CustomFieldContextDefaultValue date(String date) {
		this.date = date;
		return this;
	}

	/**
	 * Whether to use the current date.
	 * @return useCurrent
	 **/
	public Boolean getUseCurrent() {
		return useCurrent;
	}

	/**
	 * Set useCurrent
	 **/
	public void setUseCurrent(Boolean useCurrent) {
		this.useCurrent = useCurrent;
	}

	public CustomFieldContextDefaultValue useCurrent(Boolean useCurrent) {
		this.useCurrent = useCurrent;
		return this;
	}

	/**
	 * The default date-time in ISO format. Ignored if &#x60;useCurrent&#x60; is true.
	 * @return dateTime
	 **/
	public String getDateTime() {
		return dateTime;
	}

	/**
	 * Set dateTime
	 **/
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public CustomFieldContextDefaultValue dateTime(String dateTime) {
		this.dateTime = dateTime;
		return this;
	}

	/**
	 * The default URL.
	 * @return url
	 **/
	public String getUrl() {
		return url;
	}

	/**
	 * Set url
	 **/
	public void setUrl(String url) {
		this.url = url;
	}

	public CustomFieldContextDefaultValue url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * The ID of the default project.
	 * @return projectId
	 **/
	public String getProjectId() {
		return projectId;
	}

	/**
	 * Set projectId
	 **/
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public CustomFieldContextDefaultValue projectId(String projectId) {
		this.projectId = projectId;
		return this;
	}

	/**
	 * The default floating-point number.
	 * @return number
	 **/
	public Double getNumber() {
		return number;
	}

	/**
	 * Set number
	 **/
	public void setNumber(Double number) {
		this.number = number;
	}

	public CustomFieldContextDefaultValue number(Double number) {
		this.number = number;
		return this;
	}

	/**
	 * The default labels value.
	 * @return labels
	 **/
	public List<String> getLabels() {
		return labels;
	}

	/**
	 * Set labels
	 **/
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public CustomFieldContextDefaultValue labels(List<String> labels) {
		this.labels = labels;
		return this;
	}

	public CustomFieldContextDefaultValue addLabelsItem(String labelsItem) {
		if (this.labels == null) {
			this.labels = new ArrayList<>();
		}
		this.labels.add(labelsItem);
		return this;
	}

	/**
	 * The default text. The maximum length is 254 characters.
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

	public CustomFieldContextDefaultValue text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * The ID of the default version.
	 * @return versionId
	 **/
	public String getVersionId() {
		return versionId;
	}

	/**
	 * Set versionId
	 **/
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public CustomFieldContextDefaultValue versionId(String versionId) {
		this.versionId = versionId;
		return this;
	}

	/**
	 * The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are &#x60;\&quot;releasedFirst\&quot;&#x60; and &#x60;\&quot;unreleasedFirst\&quot;&#x60;.
	 * @return versionOrder
	 **/
	public String getVersionOrder() {
		return versionOrder;
	}

	/**
	 * Set versionOrder
	 **/
	public void setVersionOrder(String versionOrder) {
		this.versionOrder = versionOrder;
	}

	public CustomFieldContextDefaultValue versionOrder(String versionOrder) {
		this.versionOrder = versionOrder;
		return this;
	}

	/**
	 * The IDs of the default versions.
	 * @return versionIds
	 **/
	public Set<String> getVersionIds() {
		return versionIds;
	}

	/**
	 * Set versionIds
	 **/
	public void setVersionIds(Set<String> versionIds) {
		this.versionIds = versionIds;
	}

	public CustomFieldContextDefaultValue versionIds(Set<String> versionIds) {
		this.versionIds = versionIds;
		return this;
	}

	public CustomFieldContextDefaultValue addVersionIdsItem(String versionIdsItem) {
		if (this.versionIds == null) {
			this.versionIds = new LinkedHashSet<>();
		}
		this.versionIds.add(versionIdsItem);
		return this;
	}

	/**
	 * List of string values. The maximum length for a value is 254 characters.
	 * @return values
	 **/
	public List<String> getValues() {
		return values;
	}

	/**
	 * Set values
	 **/
	public void setValues(List<String> values) {
		this.values = values;
	}

	public CustomFieldContextDefaultValue values(List<String> values) {
		this.values = values;
		return this;
	}

	public CustomFieldContextDefaultValue addValuesItem(String valuesItem) {
		if (this.values == null) {
			this.values = new ArrayList<>();
		}
		this.values.add(valuesItem);
		return this;
	}

	/**
	 * The default JSON object.
	 * @return _object
	 **/
	public Object getObject() {
		return _object;
	}

	/**
	 * Set _object
	 **/
	public void setObject(Object _object) {
		this._object = _object;
	}

	public CustomFieldContextDefaultValue _object(Object _object) {
		this._object = _object;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class CustomFieldContextDefaultValue {\n" +
			"    cascadingOptionId: " + toIndentedString(cascadingOptionId) + "\n" +
			"    contextId: " + toIndentedString(contextId) + "\n" +
			"    optionId: " + toIndentedString(optionId) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"    optionIds: " + toIndentedString(optionIds) + "\n" +
			"    accountId: " + toIndentedString(accountId) + "\n" +
			"    userFilter: " + toIndentedString(userFilter) + "\n" +
			"    accountIds: " + toIndentedString(accountIds) + "\n" +
			"    groupId: " + toIndentedString(groupId) + "\n" +
			"    groupIds: " + toIndentedString(groupIds) + "\n" +
			"    date: " + toIndentedString(date) + "\n" +
			"    useCurrent: " + toIndentedString(useCurrent) + "\n" +
			"    dateTime: " + toIndentedString(dateTime) + "\n" +
			"    url: " + toIndentedString(url) + "\n" +
			"    projectId: " + toIndentedString(projectId) + "\n" +
			"    number: " + toIndentedString(number) + "\n" +
			"    labels: " + toIndentedString(labels) + "\n" +
			"    text: " + toIndentedString(text) + "\n" +
			"    versionId: " + toIndentedString(versionId) + "\n" +
			"    versionOrder: " + toIndentedString(versionOrder) + "\n" +
			"    versionIds: " + toIndentedString(versionIds) + "\n" +
			"    values: " + toIndentedString(values) + "\n" +
			"    _object: " + toIndentedString(_object) + "\n" +
			"}";
		return sb;
	}
}