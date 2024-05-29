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

import java.util.ArrayList;
import java.util.List;

/**
 * A group found in a search.
 **/

public class FoundGroup {

	/**
	 * The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
	 **/

	private String groupId;

	/**
	 * The group name with the matched query string highlighted with the HTML bold tag.
	 **/

	private String html;


	private List<GroupLabel> labels = null;

	/**
	 * The name of the group. The name of a group is mutable, to reliably identify a group use ``groupId`.`
	 **/

	private String name;

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
	 * The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
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

	public FoundGroup groupId(String groupId) {
		this.groupId = groupId;
		return this;
	}

	/**
	 * The group name with the matched query string highlighted with the HTML bold tag.
	 * @return html
	 **/
	public String getHtml() {
		return html;
	}

	/**
	 * Set html
	 **/
	public void setHtml(String html) {
		this.html = html;
	}

	public FoundGroup html(String html) {
		this.html = html;
		return this;
	}

	/**
	 * Get labels
	 * @return labels
	 **/
	public List<GroupLabel> getLabels() {
		return labels;
	}

	/**
	 * Set labels
	 **/
	public void setLabels(List<GroupLabel> labels) {
		this.labels = labels;
	}

	public FoundGroup labels(List<GroupLabel> labels) {
		this.labels = labels;
		return this;
	}

	public FoundGroup addLabelsItem(GroupLabel labelsItem) {
		if (this.labels == null) {
			this.labels = new ArrayList<>();
		}
		this.labels.add(labelsItem);
		return this;
	}

	/**
	 * The name of the group. The name of a group is mutable, to reliably identify a group use &#x60;&#x60;groupId&#x60;.&#x60;
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

	public FoundGroup name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class FoundGroup {\n" +
			"    groupId: " + toIndentedString(groupId) + "\n" +
			"    html: " + toIndentedString(html) + "\n" +
			"    labels: " + toIndentedString(labels) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"}";
		return sb;
	}
}