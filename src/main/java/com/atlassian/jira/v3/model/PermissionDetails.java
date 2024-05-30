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

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Details for permissions of shareable entities
 **/
@Data
public class PermissionDetails {

	/**
	 * The edit permissions for the shareable entities.
	 */
	private List<SharePermission> editPermissions = new ArrayList<>();

	/**
	 * The share permissions for the shareable entities.
	 */
	private List<SharePermission> sharePermissions = new ArrayList<>();

	public PermissionDetails editPermissions(List<SharePermission> editPermissions) {
		this.editPermissions = editPermissions;
		return this;
	}

	public PermissionDetails addEditPermissionsItem(SharePermission editPermissionsItem) {
		if (this.editPermissions == null) {
			this.editPermissions = new ArrayList<>();
		}
		this.editPermissions.add(editPermissionsItem);
		return this;
	}

	public PermissionDetails sharePermissions(List<SharePermission> sharePermissions) {
		this.sharePermissions = sharePermissions;
		return this;
	}

	public PermissionDetails addSharePermissionsItem(SharePermission sharePermissionsItem) {
		if (this.sharePermissions == null) {
			this.sharePermissions = new ArrayList<>();
		}
		this.sharePermissions.add(sharePermissionsItem);
		return this;
	}
}
