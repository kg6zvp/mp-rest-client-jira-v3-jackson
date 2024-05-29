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
 * Details of an operation to perform on a field.
 **/

public class FieldUpdateOperation {

	/**
	 * The value to add to the field.
	 **/

	private Object add = null;

	/**
	 * The field value to copy from another issue.
	 **/

	private Object copy = null;

	/**
	 * The value to edit in the field.
	 **/

	private Object edit = null;

	/**
	 * The value to removed from the field.
	 **/

	private Object remove = null;

	/**
	 * The value to set in the field.
	 **/

	private Object set = null;

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
	 * The value to add to the field.
	 * @return add
	 **/
	public Object getAdd() {
		return add;
	}

	/**
	 * Set add
	 **/
	public void setAdd(Object add) {
		this.add = add;
	}

	public FieldUpdateOperation add(Object add) {
		this.add = add;
		return this;
	}

	/**
	 * The field value to copy from another issue.
	 * @return copy
	 **/
	public Object getCopy() {
		return copy;
	}

	/**
	 * Set copy
	 **/
	public void setCopy(Object copy) {
		this.copy = copy;
	}

	public FieldUpdateOperation copy(Object copy) {
		this.copy = copy;
		return this;
	}

	/**
	 * The value to edit in the field.
	 * @return edit
	 **/
	public Object getEdit() {
		return edit;
	}

	/**
	 * Set edit
	 **/
	public void setEdit(Object edit) {
		this.edit = edit;
	}

	public FieldUpdateOperation edit(Object edit) {
		this.edit = edit;
		return this;
	}

	/**
	 * The value to removed from the field.
	 * @return remove
	 **/
	public Object getRemove() {
		return remove;
	}

	/**
	 * Set remove
	 **/
	public void setRemove(Object remove) {
		this.remove = remove;
	}

	public FieldUpdateOperation remove(Object remove) {
		this.remove = remove;
		return this;
	}

	/**
	 * The value to set in the field.
	 * @return set
	 **/
	public Object getSet() {
		return set;
	}

	/**
	 * Set set
	 **/
	public void setSet(Object set) {
		this.set = set;
	}

	public FieldUpdateOperation set(Object set) {
		this.set = set;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class FieldUpdateOperation {\n" +
			"    add: " + toIndentedString(add) + "\n" +
			"    copy: " + toIndentedString(copy) + "\n" +
			"    edit: " + toIndentedString(edit) + "\n" +
			"    remove: " + toIndentedString(remove) + "\n" +
			"    set: " + toIndentedString(set) + "\n" +
			"}";
		return sb;
	}
}