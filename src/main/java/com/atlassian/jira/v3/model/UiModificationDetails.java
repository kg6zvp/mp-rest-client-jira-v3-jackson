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

import java.util.List;

/**
 * The details of a UI modification.
 **/

public class UiModificationDetails {

	/**
	 * List of contexts of the UI modification. The maximum number of contexts is 1000.
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
	 * The ID of the UI modification.
	 **/

	private String id;

	/**
	 * The name of the UI modification. The maximum length is 255 characters.
	 **/

	private String name;

	/**
	 * The URL of the UI modification.
	 **/

	private String self;

	public UiModificationDetails() {
	}


	public UiModificationDetails(
		List<UiModificationContextDetails> contexts,
		String data,
		String description,
		String id,
		String name,
		String self
	) {
		this.contexts = contexts;
		this.data = data;
		this.description = description;
		this.id = id;
		this.name = name;
		this.self = self;
	}

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
	 * List of contexts of the UI modification. The maximum number of contexts is 1000.
	 * @return contexts
	 **/
	public List<UiModificationContextDetails> getContexts() {
		return contexts;
	}

	/**
	 * The data of the UI modification. The maximum size of the data is 50000 characters.
	 * @return data
	 **/
	public String getData() {
		return data;
	}

	/**
	 * The description of the UI modification. The maximum length is 255 characters.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * The ID of the UI modification.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * The name of the UI modification. The maximum length is 255 characters.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * The URL of the UI modification.
	 * @return self
	 **/
	public String getSelf() {
		return self;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class UiModificationDetails {\n" +
			"    contexts: " + toIndentedString(contexts) + "\n" +
			"    data: " + toIndentedString(data) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"}";
		return sb;
	}
}