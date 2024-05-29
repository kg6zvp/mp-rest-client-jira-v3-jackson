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

public class WorkflowUpdateValidateRequestBean {


	private WorkflowUpdateRequest payload;


	private ValidationOptionsForUpdate validationOptions;

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
	 * Get payload
	 * @return payload
	 **/
	public WorkflowUpdateRequest getPayload() {
		return payload;
	}

	/**
	 * Set payload
	 **/
	public void setPayload(WorkflowUpdateRequest payload) {
		this.payload = payload;
	}

	public WorkflowUpdateValidateRequestBean payload(WorkflowUpdateRequest payload) {
		this.payload = payload;
		return this;
	}

	/**
	 * Get validationOptions
	 * @return validationOptions
	 **/
	public ValidationOptionsForUpdate getValidationOptions() {
		return validationOptions;
	}

	/**
	 * Set validationOptions
	 **/
	public void setValidationOptions(ValidationOptionsForUpdate validationOptions) {
		this.validationOptions = validationOptions;
	}

	public WorkflowUpdateValidateRequestBean validationOptions(ValidationOptionsForUpdate validationOptions) {
		this.validationOptions = validationOptions;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowUpdateValidateRequestBean {\n" +
			"    payload: " + toIndentedString(payload) + "\n" +
			"    validationOptions: " + toIndentedString(validationOptions) + "\n" +
			"}";
		return sb;
	}
}