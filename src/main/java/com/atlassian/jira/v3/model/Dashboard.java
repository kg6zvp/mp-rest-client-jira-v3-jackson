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

import java.net.URI;
import java.util.List;

/**
 * Details of a dashboard.
 **/

public class Dashboard {

	/**
	 * The automatic refresh interval for the dashboard in milliseconds.
	 **/

	private Integer automaticRefreshMs;


	private String description;

	/**
	 * The details of any edit share permissions for the dashboard.
	 **/

	private List<SharePermission> editPermissions = null;

	/**
	 * The ID of the dashboard.
	 **/

	private String id;

	/**
	 * Whether the dashboard is selected as a favorite by the user.
	 **/

	private Boolean isFavourite;

	/**
	 * Whether the current user has permission to edit the dashboard.
	 **/

	private Boolean isWritable;

	/**
	 * The name of the dashboard.
	 **/

	private String name;


	private DashboardOwner owner;

	/**
	 * The number of users who have this dashboard as a favorite.
	 **/

	private Long popularity;

	/**
	 * The rank of this dashboard.
	 **/

	private Integer rank;

	/**
	 * The URL of these dashboard details.
	 **/

	private URI self;

	/**
	 * The details of any view share permissions for the dashboard.
	 **/

	private List<SharePermission> sharePermissions = null;

	/**
	 * Whether the current dashboard is system dashboard.
	 **/

	private Boolean systemDashboard;

	/**
	 * The URL of the dashboard.
	 **/

	private String view;

	public Dashboard() {
	}


	public Dashboard(
		Integer automaticRefreshMs,
		List<SharePermission> editPermissions,
		String id,
		Boolean isFavourite,
		Boolean isWritable,
		String name,
		Long popularity,
		Integer rank,
		URI self,
		List<SharePermission> sharePermissions,
		Boolean systemDashboard,
		String view
	) {
		this.automaticRefreshMs = automaticRefreshMs;
		this.editPermissions = editPermissions;
		this.id = id;
		this.isFavourite = isFavourite;
		this.isWritable = isWritable;
		this.name = name;
		this.popularity = popularity;
		this.rank = rank;
		this.self = self;
		this.sharePermissions = sharePermissions;
		this.systemDashboard = systemDashboard;
		this.view = view;
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
	 * The automatic refresh interval for the dashboard in milliseconds.
	 * @return automaticRefreshMs
	 **/
	public Integer getAutomaticRefreshMs() {
		return automaticRefreshMs;
	}

	/**
	 * Get description
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

	public Dashboard description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The details of any edit share permissions for the dashboard.
	 * @return editPermissions
	 **/
	public List<SharePermission> getEditPermissions() {
		return editPermissions;
	}

	/**
	 * The ID of the dashboard.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * Whether the dashboard is selected as a favorite by the user.
	 * @return isFavourite
	 **/
	public Boolean getIsFavourite() {
		return isFavourite;
	}

	/**
	 * Whether the current user has permission to edit the dashboard.
	 * @return isWritable
	 **/
	public Boolean getIsWritable() {
		return isWritable;
	}

	/**
	 * The name of the dashboard.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * Get owner
	 * @return owner
	 **/
	public DashboardOwner getOwner() {
		return owner;
	}

	/**
	 * Set owner
	 **/
	public void setOwner(DashboardOwner owner) {
		this.owner = owner;
	}

	public Dashboard owner(DashboardOwner owner) {
		this.owner = owner;
		return this;
	}

	/**
	 * The number of users who have this dashboard as a favorite.
	 * @return popularity
	 **/
	public Long getPopularity() {
		return popularity;
	}

	/**
	 * The rank of this dashboard.
	 * @return rank
	 **/
	public Integer getRank() {
		return rank;
	}

	/**
	 * The URL of these dashboard details.
	 * @return self
	 **/
	public URI getSelf() {
		return self;
	}

	/**
	 * The details of any view share permissions for the dashboard.
	 * @return sharePermissions
	 **/
	public List<SharePermission> getSharePermissions() {
		return sharePermissions;
	}

	/**
	 * Whether the current dashboard is system dashboard.
	 * @return systemDashboard
	 **/
	public Boolean getSystemDashboard() {
		return systemDashboard;
	}

	/**
	 * The URL of the dashboard.
	 * @return view
	 **/
	public String getView() {
		return view;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class Dashboard {\n" +
			"    automaticRefreshMs: " + toIndentedString(automaticRefreshMs) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    editPermissions: " + toIndentedString(editPermissions) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    isFavourite: " + toIndentedString(isFavourite) + "\n" +
			"    isWritable: " + toIndentedString(isWritable) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    owner: " + toIndentedString(owner) + "\n" +
			"    popularity: " + toIndentedString(popularity) + "\n" +
			"    rank: " + toIndentedString(rank) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"    sharePermissions: " + toIndentedString(sharePermissions) + "\n" +
			"    systemDashboard: " + toIndentedString(systemDashboard) + "\n" +
			"    view: " + toIndentedString(view) + "\n" +
			"}";
		return sb;
	}
}
