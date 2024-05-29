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

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

/**
 * Details of a request to bulk edit shareable entity.
 **/

public class BulkEditShareableEntityResponse {

	/**
	 * Allowed action for bulk edit shareable entity
	 **/

	private ActionEnum action;
	/**
	 * The mapping dashboard id to errors if any.
	 **/

	private Map<String, BulkEditActionError> entityErrors = null;

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
	 * Allowed action for bulk edit shareable entity
	 * @return action
	 **/
	public ActionEnum getAction() {
		return action;
	}

	/**
	 * Set action
	 **/
	public void setAction(ActionEnum action) {
		this.action = action;
	}

	public BulkEditShareableEntityResponse action(ActionEnum action) {
		this.action = action;
		return this;
	}

	/**
	 * The mapping dashboard id to errors if any.
	 * @return entityErrors
	 **/
	public Map<String, BulkEditActionError> getEntityErrors() {
		return entityErrors;
	}

	/**
	 * Set entityErrors
	 **/
	public void setEntityErrors(Map<String, BulkEditActionError> entityErrors) {
		this.entityErrors = entityErrors;
	}

	public BulkEditShareableEntityResponse entityErrors(Map<String, BulkEditActionError> entityErrors) {
		this.entityErrors = entityErrors;
		return this;
	}

	public BulkEditShareableEntityResponse putEntityErrorsItem(String key, BulkEditActionError entityErrorsItem) {
		if (this.entityErrors == null) {
			this.entityErrors = new HashMap<>();
		}
		this.entityErrors.put(key, entityErrorsItem);
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class BulkEditShareableEntityResponse {\n" +
			"    action: " + toIndentedString(action) + "\n" +
			"    entityErrors: " + toIndentedString(entityErrors) + "\n" +
			"}";
		return sb;
	}

	public enum ActionEnum {

		CHANGEOWNER("changeOwner"), CHANGEPERMISSION("changePermission"), ADDPERMISSION("addPermission"), REMOVEPERMISSION("removePermission");


		String value;

		ActionEnum(String v) {
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