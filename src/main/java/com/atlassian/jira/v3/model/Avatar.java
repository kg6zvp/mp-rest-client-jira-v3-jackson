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
import java.util.HashMap;
import java.util.Map;

/**
 * Details of an avatar.
 **/

public class Avatar extends HashMap<String, Object> {

	/**
	 * The file name of the avatar icon. Returned for system avatars.
	 **/

	private String fileName;

	/**
	 * The ID of the avatar.
	 **/

	private String id;

	/**
	 * Whether the avatar can be deleted.
	 **/

	private Boolean isDeletable;

	/**
	 * Whether the avatar is used in Jira. For example, shown as a project's avatar.
	 **/

	private Boolean isSelected;

	/**
	 * Whether the avatar is a system avatar.
	 **/

	private Boolean isSystemAvatar;

	/**
	 * The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.
	 **/

	private String owner;

	/**
	 * The list of avatar icon URLs.
	 **/

	private Map<String, URI> urls = null;

	public Avatar() {
	}


	public Avatar(
		String fileName,
		Boolean isDeletable,
		Boolean isSelected,
		Boolean isSystemAvatar,
		String owner,
		Map<String, URI> urls
	) {
		this.fileName = fileName;
		this.isDeletable = isDeletable;
		this.isSelected = isSelected;
		this.isSystemAvatar = isSystemAvatar;
		this.owner = owner;
		this.urls = urls;
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
	 * The file name of the avatar icon. Returned for system avatars.
	 * @return fileName
	 **/
	public String getFileName() {
		return fileName;
	}

	/**
	 * The ID of the avatar.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * Set id
	 **/
	public void setId(String id) {
		this.id = id;
	}

	public Avatar id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Whether the avatar can be deleted.
	 * @return isDeletable
	 **/
	public Boolean getIsDeletable() {
		return isDeletable;
	}

	/**
	 * Whether the avatar is used in Jira. For example, shown as a project&#39;s avatar.
	 * @return isSelected
	 **/
	public Boolean getIsSelected() {
		return isSelected;
	}

	/**
	 * Whether the avatar is a system avatar.
	 * @return isSystemAvatar
	 **/
	public Boolean getIsSystemAvatar() {
		return isSystemAvatar;
	}

	/**
	 * The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.
	 * @return owner
	 **/
	public String getOwner() {
		return owner;
	}

	/**
	 * The list of avatar icon URLs.
	 * @return urls
	 **/
	public Map<String, URI> getUrls() {
		return urls;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class Avatar {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    fileName: " + toIndentedString(fileName) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    isDeletable: " + toIndentedString(isDeletable) + "\n" +
			"    isSelected: " + toIndentedString(isSelected) + "\n" +
			"    isSystemAvatar: " + toIndentedString(isSystemAvatar) + "\n" +
			"    owner: " + toIndentedString(owner) + "\n" +
			"    urls: " + toIndentedString(urls) + "\n" +
			"}";
		return sb;
	}
}