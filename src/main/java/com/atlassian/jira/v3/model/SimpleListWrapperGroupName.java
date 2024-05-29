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


public class SimpleListWrapperGroupName {


	private Object callback;


	private List<GroupName> items = null;

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

	public SimpleListWrapperGroupName callback(Object callback) {
		this.callback = callback;
		return this;
	}

	/**
	 * Get items
	 * @return items
	 **/
	public List<GroupName> getItems() {
		return items;
	}

	/**
	 * Set items
	 **/
	public void setItems(List<GroupName> items) {
		this.items = items;
	}

	public SimpleListWrapperGroupName items(List<GroupName> items) {
		this.items = items;
		return this;
	}

	public SimpleListWrapperGroupName addItemsItem(GroupName itemsItem) {
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

	public SimpleListWrapperGroupName maxResults(Integer maxResults) {
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

	public SimpleListWrapperGroupName pagingCallback(Object pagingCallback) {
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

	public SimpleListWrapperGroupName size(Integer size) {
		this.size = size;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class SimpleListWrapperGroupName {\n" +
			"    callback: " + toIndentedString(callback) + "\n" +
			"    items: " + toIndentedString(items) + "\n" +
			"    maxResults: " + toIndentedString(maxResults) + "\n" +
			"    pagingCallback: " + toIndentedString(pagingCallback) + "\n" +
			"    size: " + toIndentedString(size) + "\n" +
			"}";
		return sb;
	}
}