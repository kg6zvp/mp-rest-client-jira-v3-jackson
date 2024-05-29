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

import java.net.URI;

/**
 * Associated related work to a version
 **/

public class VersionRelatedWork {

	/**
	 * The category of the related work
	 **/

	private String category;

	/**
	 * The ID of the issue associated with the related work (if there is one). Cannot be updated via the Rest API.
	 **/

	private Long issueId;

	/**
	 * The id of the related work. For the native release note related work item, this will be null, and Rest API does not support updating it.
	 **/

	private String relatedWorkId;

	/**
	 * The title of the related work
	 **/

	private String title;

	/**
	 * The URL of the related work. Will be null for the native release note related work item, but is otherwise required.
	 **/

	private URI url;

	public VersionRelatedWork() {
	}


	public VersionRelatedWork(
		Long issueId,
		String relatedWorkId
	) {
		this.issueId = issueId;
		this.relatedWorkId = relatedWorkId;
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
	 * The category of the related work
	 * @return category
	 **/
	public String getCategory() {
		return category;
	}

	/**
	 * Set category
	 **/
	public void setCategory(String category) {
		this.category = category;
	}

	public VersionRelatedWork category(String category) {
		this.category = category;
		return this;
	}

	/**
	 * The ID of the issue associated with the related work (if there is one). Cannot be updated via the Rest API.
	 * @return issueId
	 **/
	public Long getIssueId() {
		return issueId;
	}

	/**
	 * The id of the related work. For the native release note related work item, this will be null, and Rest API does not support updating it.
	 * @return relatedWorkId
	 **/
	public String getRelatedWorkId() {
		return relatedWorkId;
	}

	/**
	 * The title of the related work
	 * @return title
	 **/
	public String getTitle() {
		return title;
	}

	/**
	 * Set title
	 **/
	public void setTitle(String title) {
		this.title = title;
	}

	public VersionRelatedWork title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * The URL of the related work. Will be null for the native release note related work item, but is otherwise required.
	 * @return url
	 **/
	public URI getUrl() {
		return url;
	}

	/**
	 * Set url
	 **/
	public void setUrl(URI url) {
		this.url = url;
	}

	public VersionRelatedWork url(URI url) {
		this.url = url;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class VersionRelatedWork {\n" +
			"    category: " + toIndentedString(category) + "\n" +
			"    issueId: " + toIndentedString(issueId) + "\n" +
			"    relatedWorkId: " + toIndentedString(relatedWorkId) + "\n" +
			"    title: " + toIndentedString(title) + "\n" +
			"    url: " + toIndentedString(url) + "\n" +
			"}";
		return sb;
	}
}
