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

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;

/**
 * Details of a permission and its availability to a user.
 **/

public class UserPermission extends HashMap<String, Object> {

	/**
	 * Indicate whether the permission key is deprecated. Note that deprecated keys cannot be used in the `permissions parameter of Get my permissions. Deprecated keys are not returned by Get all permissions.`
	 **/

	private Boolean deprecatedKey;

	/**
	 * The description of the permission.
	 **/

	private String description;

	/**
	 * Whether the permission is available to the user in the queried context.
	 **/

	private Boolean havePermission;

	/**
	 * The ID of the permission. Either `id` or `key` must be specified. Use [Get all permissions](#api-rest-api-3-permissions-get) to get the list of permissions.
	 **/

	private String id;

	/**
	 * The key of the permission. Either `id` or `key` must be specified. Use [Get all permissions](#api-rest-api-3-permissions-get) to get the list of permissions.
	 **/

	private String key;

	/**
	 * The name of the permission.
	 **/

	private String name;
	/**
	 * The type of the permission.
	 **/

	private TypeEnum type;

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
	 * Indicate whether the permission key is deprecated. Note that deprecated keys cannot be used in the &#x60;permissions parameter of Get my permissions. Deprecated keys are not returned by Get all permissions.&#x60;
	 * @return deprecatedKey
	 **/
	public Boolean getDeprecatedKey() {
		return deprecatedKey;
	}

	/**
	 * Set deprecatedKey
	 **/
	public void setDeprecatedKey(Boolean deprecatedKey) {
		this.deprecatedKey = deprecatedKey;
	}

	public UserPermission deprecatedKey(Boolean deprecatedKey) {
		this.deprecatedKey = deprecatedKey;
		return this;
	}

	/**
	 * The description of the permission.
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

	public UserPermission description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Whether the permission is available to the user in the queried context.
	 * @return havePermission
	 **/
	public Boolean getHavePermission() {
		return havePermission;
	}

	/**
	 * Set havePermission
	 **/
	public void setHavePermission(Boolean havePermission) {
		this.havePermission = havePermission;
	}

	public UserPermission havePermission(Boolean havePermission) {
		this.havePermission = havePermission;
		return this;
	}

	/**
	 * The ID of the permission. Either &#x60;id&#x60; or &#x60;key&#x60; must be specified. Use [Get all permissions](#api-rest-api-3-permissions-get) to get the list of permissions.
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

	public UserPermission id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The key of the permission. Either &#x60;id&#x60; or &#x60;key&#x60; must be specified. Use [Get all permissions](#api-rest-api-3-permissions-get) to get the list of permissions.
	 * @return key
	 **/
	public String getKey() {
		return key;
	}

	/**
	 * Set key
	 **/
	public void setKey(String key) {
		this.key = key;
	}

	public UserPermission key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * The name of the permission.
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

	public UserPermission name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The type of the permission.
	 * @return type
	 **/
	public TypeEnum getType() {
		return type;
	}

	/**
	 * Set type
	 **/
	public void setType(TypeEnum type) {
		this.type = type;
	}

	public UserPermission type(TypeEnum type) {
		this.type = type;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class UserPermission {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    deprecatedKey: " + toIndentedString(deprecatedKey) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    havePermission: " + toIndentedString(havePermission) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    key: " + toIndentedString(key) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}

	public enum TypeEnum {

		GLOBAL("GLOBAL"), PROJECT("PROJECT");


		String value;

		TypeEnum(String v) {
			value = v;
		}

		@JsonValue
		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}
	}
}
