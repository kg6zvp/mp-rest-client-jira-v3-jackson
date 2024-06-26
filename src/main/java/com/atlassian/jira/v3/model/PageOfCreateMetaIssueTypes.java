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
import java.util.HashMap;
import java.util.List;

/**
 * A page of CreateMetaIssueTypes.
 **/

public class PageOfCreateMetaIssueTypes extends HashMap<String, Object> {


	private List<IssueTypeIssueCreateMetadata> createMetaIssueType = null;

	/**
	 * The list of CreateMetaIssueType.
	 **/

	private List<IssueTypeIssueCreateMetadata> issueTypes = null;

	/**
	 * The maximum number of items to return per page.
	 **/

	private Integer maxResults;

	/**
	 * The index of the first item returned.
	 **/

	private Long startAt;

	/**
	 * The total number of items in all pages.
	 **/

	private Long total;

	public PageOfCreateMetaIssueTypes() {
	}


	public PageOfCreateMetaIssueTypes(
		List<IssueTypeIssueCreateMetadata> issueTypes,
		Integer maxResults,
		Long startAt,
		Long total
	) {
		this.issueTypes = issueTypes;
		this.maxResults = maxResults;
		this.startAt = startAt;
		this.total = total;
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
	 * Get createMetaIssueType
	 * @return createMetaIssueType
	 **/
	public List<IssueTypeIssueCreateMetadata> getCreateMetaIssueType() {
		return createMetaIssueType;
	}

	/**
	 * Set createMetaIssueType
	 **/
	public void setCreateMetaIssueType(List<IssueTypeIssueCreateMetadata> createMetaIssueType) {
		this.createMetaIssueType = createMetaIssueType;
	}

	public PageOfCreateMetaIssueTypes createMetaIssueType(List<IssueTypeIssueCreateMetadata> createMetaIssueType) {
		this.createMetaIssueType = createMetaIssueType;
		return this;
	}

	public PageOfCreateMetaIssueTypes addCreateMetaIssueTypeItem(IssueTypeIssueCreateMetadata createMetaIssueTypeItem) {
		if (this.createMetaIssueType == null) {
			this.createMetaIssueType = new ArrayList<>();
		}
		this.createMetaIssueType.add(createMetaIssueTypeItem);
		return this;
	}

	/**
	 * The list of CreateMetaIssueType.
	 * @return issueTypes
	 **/
	public List<IssueTypeIssueCreateMetadata> getIssueTypes() {
		return issueTypes;
	}

	/**
	 * The maximum number of items to return per page.
	 * @return maxResults
	 **/
	public Integer getMaxResults() {
		return maxResults;
	}

	/**
	 * The index of the first item returned.
	 * @return startAt
	 **/
	public Long getStartAt() {
		return startAt;
	}

	/**
	 * The total number of items in all pages.
	 * @return total
	 **/
	public Long getTotal() {
		return total;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class PageOfCreateMetaIssueTypes {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    createMetaIssueType: " + toIndentedString(createMetaIssueType) + "\n" +
			"    issueTypes: " + toIndentedString(issueTypes) + "\n" +
			"    maxResults: " + toIndentedString(maxResults) + "\n" +
			"    startAt: " + toIndentedString(startAt) + "\n" +
			"    total: " + toIndentedString(total) + "\n" +
			"}";
		return sb;
	}
}
