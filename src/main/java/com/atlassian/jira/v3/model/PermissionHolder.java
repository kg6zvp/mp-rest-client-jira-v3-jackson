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
 * Details of a user, group, field, or project role that holds a permission. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.
 **/

public class PermissionHolder {

	/**
	 * Expand options that include additional permission holder details in the response.
	 **/

	private String expand;

	/**
	 * As a group's name can change, use of `value` is recommended. The identifier associated withthe `type` value that defines the holder of the permission.
	 **/

	private String parameter;

	/**
	 * The type of permission holder.
	 **/

	private String type;

	/**
	 * The identifier associated with the `type` value that defines the holder of the permission.
	 **/

	private String value;

	public PermissionHolder() {
	}


	public PermissionHolder(
		String expand
	) {
		this.expand = expand;
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
	 * Expand options that include additional permission holder details in the response.
	 * @return expand
	 **/
	public String getExpand() {
		return expand;
	}

	/**
	 * As a group&#39;s name can change, use of &#x60;value&#x60; is recommended. The identifier associated withthe &#x60;type&#x60; value that defines the holder of the permission.
	 * @return parameter
	 **/
	public String getParameter() {
		return parameter;
	}

	/**
	 * Set parameter
	 **/
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public PermissionHolder parameter(String parameter) {
		this.parameter = parameter;
		return this;
	}

	/**
	 * The type of permission holder.
	 * @return type
	 **/
	public String getType() {
		return type;
	}

	/**
	 * Set type
	 **/
	public void setType(String type) {
		this.type = type;
	}

	public PermissionHolder type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * The identifier associated with the &#x60;type&#x60; value that defines the holder of the permission.
	 * @return value
	 **/
	public String getValue() {
		return value;
	}

	/**
	 * Set value
	 **/
	public void setValue(String value) {
		this.value = value;
	}

	public PermissionHolder value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class PermissionHolder {\n" +
			"    expand: " + toIndentedString(expand) + "\n" +
			"    parameter: " + toIndentedString(parameter) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"    value: " + toIndentedString(value) + "\n" +
			"}";
		return sb;
	}
}
