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

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Details of a filter.
 **/
@NoArgsConstructor
@AllArgsConstructor
public class FilterDetails {

	/**
	 * \\[Experimental\\] Approximate last used time. Returns the date and time when the filter was last used. Returns `null` if the filter hasn't been used after tracking was enabled. For performance reasons, timestamps aren't updated in real time and therefore may not be exactly accurate.
	 **/

	private Date approximateLastUsed;

	/**
	 * The description of the filter.
	 **/

	private String description;

	/**
	 * The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.
	 **/

	private List<SharePermission> editPermissions = null;

	/**
	 * Expand options that include additional filter details in the response.
	 **/

	private String expand;

	/**
	 * Whether the filter is selected as a favorite by any users, not including the filter owner.
	 **/

	private Boolean favourite;

	/**
	 * The count of how many users have selected this filter as a favorite, including the filter owner.
	 **/

	private Long favouritedCount;

	/**
	 * The unique identifier for the filter.
	 **/

	private String id;

	/**
	 * The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.
	 **/

	private String jql;

	/**
	 * The name of the filter.
	 **/

	private String name;


	private FilterDetailsOwner owner;

	/**
	 * A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.
	 **/

	private URI searchUrl;

	/**
	 * The URL of the filter.
	 **/

	private URI self;

	/**
	 * The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.
	 **/

	private List<SharePermission> sharePermissions = null;

	/**
	 * The users that are subscribed to the filter.
	 **/

	private List<FilterSubscription> subscriptions = null;

	/**
	 * A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.
	 **/

	private URI viewUrl;

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
	 * \\[Experimental\\] Approximate last used time. Returns the date and time when the filter was last used. Returns &#x60;null&#x60; if the filter hasn&#39;t been used after tracking was enabled. For performance reasons, timestamps aren&#39;t updated in real time and therefore may not be exactly accurate.
	 * @return approximateLastUsed
	 **/
	public Date getApproximateLastUsed() {
		return approximateLastUsed;
	}

	/**
	 * The description of the filter.
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

	public FilterDetails description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.
	 * @return editPermissions
	 **/
	public List<SharePermission> getEditPermissions() {
		return editPermissions;
	}

	/**
	 * Set editPermissions
	 **/
	public void setEditPermissions(List<SharePermission> editPermissions) {
		this.editPermissions = editPermissions;
	}

	public FilterDetails editPermissions(List<SharePermission> editPermissions) {
		this.editPermissions = editPermissions;
		return this;
	}

	public FilterDetails addEditPermissionsItem(SharePermission editPermissionsItem) {
		if (this.editPermissions == null) {
			this.editPermissions = new ArrayList<>();
		}
		this.editPermissions.add(editPermissionsItem);
		return this;
	}

	/**
	 * Expand options that include additional filter details in the response.
	 * @return expand
	 **/
	public String getExpand() {
		return expand;
	}

	/**
	 * Whether the filter is selected as a favorite by any users, not including the filter owner.
	 * @return favourite
	 **/
	public Boolean getFavourite() {
		return favourite;
	}

	/**
	 * The count of how many users have selected this filter as a favorite, including the filter owner.
	 * @return favouritedCount
	 **/
	public Long getFavouritedCount() {
		return favouritedCount;
	}

	/**
	 * The unique identifier for the filter.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*.
	 * @return jql
	 **/
	public String getJql() {
		return jql;
	}

	/**
	 * The name of the filter.
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

	public FilterDetails name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get owner
	 * @return owner
	 **/
	public FilterDetailsOwner getOwner() {
		return owner;
	}

	/**
	 * Set owner
	 **/
	public void setOwner(FilterDetailsOwner owner) {
		this.owner = owner;
	}

	public FilterDetails owner(FilterDetailsOwner owner) {
		this.owner = owner;
		return this;
	}

	/**
	 * A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter&#39;s JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql&#x3D;project+%3D+SSP+AND+issuetype+%3D+Bug*.
	 * @return searchUrl
	 **/
	public URI getSearchUrl() {
		return searchUrl;
	}

	/**
	 * The URL of the filter.
	 * @return self
	 **/
	public URI getSelf() {
		return self;
	}

	/**
	 * The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.
	 * @return sharePermissions
	 **/
	public List<SharePermission> getSharePermissions() {
		return sharePermissions;
	}

	/**
	 * Set sharePermissions
	 **/
	public void setSharePermissions(List<SharePermission> sharePermissions) {
		this.sharePermissions = sharePermissions;
	}

	public FilterDetails sharePermissions(List<SharePermission> sharePermissions) {
		this.sharePermissions = sharePermissions;
		return this;
	}

	public FilterDetails addSharePermissionsItem(SharePermission sharePermissionsItem) {
		if (this.sharePermissions == null) {
			this.sharePermissions = new ArrayList<>();
		}
		this.sharePermissions.add(sharePermissionsItem);
		return this;
	}

	/**
	 * The users that are subscribed to the filter.
	 * @return subscriptions
	 **/
	public List<FilterSubscription> getSubscriptions() {
		return subscriptions;
	}

	/**
	 * A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter&#x3D;10100*.
	 * @return viewUrl
	 **/
	public URI getViewUrl() {
		return viewUrl;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class FilterDetails {\n" +
			"    approximateLastUsed: " + toIndentedString(approximateLastUsed) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    editPermissions: " + toIndentedString(editPermissions) + "\n" +
			"    expand: " + toIndentedString(expand) + "\n" +
			"    favourite: " + toIndentedString(favourite) + "\n" +
			"    favouritedCount: " + toIndentedString(favouritedCount) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    jql: " + toIndentedString(jql) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    owner: " + toIndentedString(owner) + "\n" +
			"    searchUrl: " + toIndentedString(searchUrl) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"    sharePermissions: " + toIndentedString(sharePermissions) + "\n" +
			"    subscriptions: " + toIndentedString(subscriptions) + "\n" +
			"    viewUrl: " + toIndentedString(viewUrl) + "\n" +
			"}";
		return sb;
	}
}
