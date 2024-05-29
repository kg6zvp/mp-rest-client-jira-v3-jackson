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
 * The details of watchers on an issue.
 **/

public class Watchers {

	/**
	 * Whether the calling user is watching this issue.
	 **/

	private Boolean isWatching;

	/**
	 * The URL of these issue watcher details.
	 **/

	private String self;

	/**
	 * The number of users watching this issue.
	 **/

	private Integer watchCount;

	/**
	 * Details of the users watching this issue.
	 **/

	private List<UserDetails> watchers = null;

	public Watchers() {
	}


	public Watchers(
		Boolean isWatching,
		String self,
		Integer watchCount,
		List<UserDetails> watchers
	) {
		this.isWatching = isWatching;
		this.self = self;
		this.watchCount = watchCount;
		this.watchers = watchers;
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
	 * Whether the calling user is watching this issue.
	 * @return isWatching
	 **/
	public Boolean getIsWatching() {
		return isWatching;
	}

	/**
	 * The URL of these issue watcher details.
	 * @return self
	 **/
	public String getSelf() {
		return self;
	}

	/**
	 * The number of users watching this issue.
	 * @return watchCount
	 **/
	public Integer getWatchCount() {
		return watchCount;
	}

	/**
	 * Details of the users watching this issue.
	 * @return watchers
	 **/
	public List<UserDetails> getWatchers() {
		return watchers;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class Watchers {\n" +
			"    isWatching: " + toIndentedString(isWatching) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"    watchCount: " + toIndentedString(watchCount) + "\n" +
			"    watchers: " + toIndentedString(watchers) + "\n" +
			"}";
		return sb;
	}
}
