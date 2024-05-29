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

/**
 * Details of the instance's attachment settings.
 **/

public class AttachmentSettings {

	/**
	 * Whether the ability to add attachments is enabled.
	 **/

	private Boolean enabled;

	/**
	 * The maximum size of attachments permitted, in bytes.
	 **/

	private Long uploadLimit;

	public AttachmentSettings() {
	}


	public AttachmentSettings(
		Boolean enabled,
		Long uploadLimit
	) {
		this.enabled = enabled;
		this.uploadLimit = uploadLimit;
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
	 * Whether the ability to add attachments is enabled.
	 * @return enabled
	 **/
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * The maximum size of attachments permitted, in bytes.
	 * @return uploadLimit
	 **/
	public Long getUploadLimit() {
		return uploadLimit;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class AttachmentSettings {\n" +
			"    enabled: " + toIndentedString(enabled) + "\n" +
			"    uploadLimit: " + toIndentedString(uploadLimit) + "\n" +
			"}";
		return sb;
	}
}
