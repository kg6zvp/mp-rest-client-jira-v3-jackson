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

/**
 * Configuration of the announcement banner.
 **/

public class AnnouncementBannerConfigurationUpdate {

	/**
	 * Flag indicating if the announcement banner can be dismissed by the user.
	 **/

	private Boolean isDismissible;

	/**
	 * Flag indicating if the announcement banner is enabled or not.
	 **/

	private Boolean isEnabled;

	/**
	 * The text on the announcement banner.
	 **/

	private String message;

	/**
	 * Visibility of the announcement banner. Can be public or private.
	 **/

	private String visibility;

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
	 * Flag indicating if the announcement banner can be dismissed by the user.
	 * @return isDismissible
	 **/
	public Boolean getIsDismissible() {
		return isDismissible;
	}

	/**
	 * Set isDismissible
	 **/
	public void setIsDismissible(Boolean isDismissible) {
		this.isDismissible = isDismissible;
	}

	public AnnouncementBannerConfigurationUpdate isDismissible(Boolean isDismissible) {
		this.isDismissible = isDismissible;
		return this;
	}

	/**
	 * Flag indicating if the announcement banner is enabled or not.
	 * @return isEnabled
	 **/
	public Boolean getIsEnabled() {
		return isEnabled;
	}

	/**
	 * Set isEnabled
	 **/
	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public AnnouncementBannerConfigurationUpdate isEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
		return this;
	}

	/**
	 * The text on the announcement banner.
	 * @return message
	 **/
	public String getMessage() {
		return message;
	}

	/**
	 * Set message
	 **/
	public void setMessage(String message) {
		this.message = message;
	}

	public AnnouncementBannerConfigurationUpdate message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Visibility of the announcement banner. Can be public or private.
	 * @return visibility
	 **/
	public String getVisibility() {
		return visibility;
	}

	/**
	 * Set visibility
	 **/
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public AnnouncementBannerConfigurationUpdate visibility(String visibility) {
		this.visibility = visibility;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class AnnouncementBannerConfigurationUpdate {\n" +
			"    isDismissible: " + toIndentedString(isDismissible) + "\n" +
			"    isEnabled: " + toIndentedString(isEnabled) + "\n" +
			"    message: " + toIndentedString(message) + "\n" +
			"    visibility: " + toIndentedString(visibility) + "\n" +
			"}";
		return sb;
	}
}
