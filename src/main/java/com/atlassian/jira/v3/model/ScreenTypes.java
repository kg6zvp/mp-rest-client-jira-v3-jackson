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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IDs of the screens for the screen types of the screen scheme.
 **/

public class ScreenTypes {

	/**
	 * The ID of the create screen.
	 **/

	private Long create;

	/**
	 * The ID of the default screen. Required when creating a screen scheme.
	 **/
	@JsonProperty("default")
	private Long _default;

	/**
	 * The ID of the edit screen.
	 **/

	private Long edit;

	/**
	 * The ID of the view screen.
	 **/

	private Long view;

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
	 * The ID of the create screen.
	 * @return create
	 **/
	public Long getCreate() {
		return create;
	}

	/**
	 * Set create
	 **/
	public void setCreate(Long create) {
		this.create = create;
	}

	public ScreenTypes create(Long create) {
		this.create = create;
		return this;
	}

	/**
	 * The ID of the default screen. Required when creating a screen scheme.
	 * @return _default
	 **/
	public Long getDefault() {
		return _default;
	}

	/**
	 * Set _default
	 **/
	public void setDefault(Long _default) {
		this._default = _default;
	}

	public ScreenTypes _default(Long _default) {
		this._default = _default;
		return this;
	}

	/**
	 * The ID of the edit screen.
	 * @return edit
	 **/
	public Long getEdit() {
		return edit;
	}

	/**
	 * Set edit
	 **/
	public void setEdit(Long edit) {
		this.edit = edit;
	}

	public ScreenTypes edit(Long edit) {
		this.edit = edit;
		return this;
	}

	/**
	 * The ID of the view screen.
	 * @return view
	 **/
	public Long getView() {
		return view;
	}

	/**
	 * Set view
	 **/
	public void setView(Long view) {
		this.view = view;
	}

	public ScreenTypes view(Long view) {
		this.view = view;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ScreenTypes {\n" +
			"    create: " + toIndentedString(create) + "\n" +
			"    _default: " + toIndentedString(_default) + "\n" +
			"    edit: " + toIndentedString(edit) + "\n" +
			"    view: " + toIndentedString(view) + "\n" +
			"}";
		return sb;
	}
}
