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

public class BulkOperationErrorResult {


	private ErrorCollection elementErrors;


	private Integer failedElementNumber;


	private Integer status;

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
	 * Get elementErrors
	 * @return elementErrors
	 **/
	public ErrorCollection getElementErrors() {
		return elementErrors;
	}

	/**
	 * Set elementErrors
	 **/
	public void setElementErrors(ErrorCollection elementErrors) {
		this.elementErrors = elementErrors;
	}

	public BulkOperationErrorResult elementErrors(ErrorCollection elementErrors) {
		this.elementErrors = elementErrors;
		return this;
	}

	/**
	 * Get failedElementNumber
	 * @return failedElementNumber
	 **/
	public Integer getFailedElementNumber() {
		return failedElementNumber;
	}

	/**
	 * Set failedElementNumber
	 **/
	public void setFailedElementNumber(Integer failedElementNumber) {
		this.failedElementNumber = failedElementNumber;
	}

	public BulkOperationErrorResult failedElementNumber(Integer failedElementNumber) {
		this.failedElementNumber = failedElementNumber;
		return this;
	}

	/**
	 * Get status
	 * @return status
	 **/
	public Integer getStatus() {
		return status;
	}

	/**
	 * Set status
	 **/
	public void setStatus(Integer status) {
		this.status = status;
	}

	public BulkOperationErrorResult status(Integer status) {
		this.status = status;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class BulkOperationErrorResult {\n" +
			"    elementErrors: " + toIndentedString(elementErrors) + "\n" +
			"    failedElementNumber: " + toIndentedString(failedElementNumber) + "\n" +
			"    status: " + toIndentedString(status) + "\n" +
			"}";
		return sb;
	}
}
