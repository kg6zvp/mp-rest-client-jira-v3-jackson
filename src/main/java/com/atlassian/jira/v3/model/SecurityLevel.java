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
 * Details of an issue level security item.
 **/

public class SecurityLevel {

	/**
	 * The description of the issue level security item.
	 **/

	private String description;

	/**
	 * The ID of the issue level security item.
	 **/

	private String id;

	/**
	 * Whether the issue level security item is the default.
	 **/

	private Boolean isDefault;

	/**
	 * The ID of the issue level security scheme.
	 **/

	private String issueSecuritySchemeId;

	/**
	 * The name of the issue level security item.
	 **/

	private String name;

	/**
	 * The URL of the issue level security item.
	 **/

	private String self;

	public SecurityLevel() {
	}


	public SecurityLevel(
		String description,
		String id,
		Boolean isDefault,
		String issueSecuritySchemeId,
		String name,
		String self
	) {
		this.description = description;
		this.id = id;
		this.isDefault = isDefault;
		this.issueSecuritySchemeId = issueSecuritySchemeId;
		this.name = name;
		this.self = self;
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
	 * The description of the issue level security item.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * The ID of the issue level security item.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * Whether the issue level security item is the default.
	 * @return isDefault
	 **/
	public Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * The ID of the issue level security scheme.
	 * @return issueSecuritySchemeId
	 **/
	public String getIssueSecuritySchemeId() {
		return issueSecuritySchemeId;
	}

	/**
	 * The name of the issue level security item.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * The URL of the issue level security item.
	 * @return self
	 **/
	public String getSelf() {
		return self;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class SecurityLevel {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    isDefault: " + toIndentedString(isDefault) + "\n" +
			"    issueSecuritySchemeId: " + toIndentedString(issueSecuritySchemeId) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"}";
		return sb;
	}
}