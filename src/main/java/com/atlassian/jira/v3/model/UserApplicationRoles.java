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
import java.util.List;

/**
 * The application roles the user is assigned to.
 **/

public class UserApplicationRoles {

	private Object callback;

	private List<ApplicationRole> items = null;

	@JsonProperty("max-results")
	private Integer maxResults;

	private Object pagingCallback;

	private Integer size;

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
	 * Get callback
	 * @return callback
	 **/
	public Object getCallback() {
		return callback;
	}

	/**
	 * Set callback
	 **/
	public void setCallback(Object callback) {
		this.callback = callback;
	}

	public UserApplicationRoles callback(Object callback) {
		this.callback = callback;
		return this;
	}

	/**
	 * Get items
	 * @return items
	 **/
	public List<ApplicationRole> getItems() {
		return items;
	}

	/**
	 * Set items
	 **/
	public void setItems(List<ApplicationRole> items) {
		this.items = items;
	}

	public UserApplicationRoles items(List<ApplicationRole> items) {
		this.items = items;
		return this;
	}

	public UserApplicationRoles addItemsItem(ApplicationRole itemsItem) {
		if (this.items == null) {
			this.items = new ArrayList<>();
		}
		this.items.add(itemsItem);
		return this;
	}

	/**
	 * Get maxResults
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

	public UserApplicationRoles maxResults(Integer maxResults) {
		this.maxResults = maxResults;
		return this;
	}

	/**
	 * Get pagingCallback
	 * @return pagingCallback
	 **/
	public Object getPagingCallback() {
		return pagingCallback;
	}

	/**
	 * Set pagingCallback
	 **/
	public void setPagingCallback(Object pagingCallback) {
		this.pagingCallback = pagingCallback;
	}

	public UserApplicationRoles pagingCallback(Object pagingCallback) {
		this.pagingCallback = pagingCallback;
		return this;
	}

	/**
	 * Get size
	 * @return size
	 **/
	public Integer getSize() {
		return size;
	}

	/**
	 * Set size
	 **/
	public void setSize(Integer size) {
		this.size = size;
	}

	public UserApplicationRoles size(Integer size) {
		this.size = size;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class UserApplicationRoles {\n" +
			"    callback: " + toIndentedString(callback) + "\n" +
			"    items: " + toIndentedString(items) + "\n" +
			"    maxResults: " + toIndentedString(maxResults) + "\n" +
			"    pagingCallback: " + toIndentedString(pagingCallback) + "\n" +
			"    size: " + toIndentedString(size) + "\n" +
			"}";
		return sb;
	}
}