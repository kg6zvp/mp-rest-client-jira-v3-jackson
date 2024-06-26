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

import java.util.ArrayList;
import java.util.List;

/**
 * The details of a UI modification.
 **/

public class UpdateUiModificationDetails {

	/**
	 * List of contexts of the UI modification. The maximum number of contexts is 1000. If provided, replaces all existing contexts.
	 **/

	private List<UiModificationContextDetails> contexts = null;

	/**
	 * The data of the UI modification. The maximum size of the data is 50000 characters.
	 **/

	private String data;

	/**
	 * The description of the UI modification. The maximum length is 255 characters.
	 **/

	private String description;

	/**
	 * The name of the UI modification. The maximum length is 255 characters.
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
	 * List of contexts of the UI modification. The maximum number of contexts is 1000. If provided, replaces all existing contexts.
	 * @return contexts
	 **/
	public List<UiModificationContextDetails> getContexts() {
		return contexts;
	}

	/**
	 * Set contexts
	 **/
	public void setContexts(List<UiModificationContextDetails> contexts) {
		this.contexts = contexts;
	}

	public UpdateUiModificationDetails contexts(List<UiModificationContextDetails> contexts) {
		this.contexts = contexts;
		return this;
	}

	public UpdateUiModificationDetails addContextsItem(UiModificationContextDetails contextsItem) {
		if (this.contexts == null) {
			this.contexts = new ArrayList<>();
		}
		this.contexts.add(contextsItem);
		return this;
	}

	/**
	 * The data of the UI modification. The maximum size of the data is 50000 characters.
	 * @return data
	 **/
	public String getData() {
		return data;
	}

	/**
	 * Set data
	 **/
	public void setData(String data) {
		this.data = data;
	}

	public UpdateUiModificationDetails data(String data) {
		this.data = data;
		return this;
	}

	/**
	 * The description of the UI modification. The maximum length is 255 characters.
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

	public UpdateUiModificationDetails description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The name of the UI modification. The maximum length is 255 characters.
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

	public UpdateUiModificationDetails name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class UpdateUiModificationDetails {\n" +
			"    contexts: " + toIndentedString(contexts) + "\n" +
			"    data: " + toIndentedString(data) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"}";
		return sb;
	}
}
