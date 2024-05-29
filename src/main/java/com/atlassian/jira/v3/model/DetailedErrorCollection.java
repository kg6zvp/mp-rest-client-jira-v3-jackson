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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DetailedErrorCollection {

	/**
	 * Map of objects representing additional details for an error
	 **/

	private Map<String, Object> details = null;

	/**
	 * The list of error messages produced by this operation. For example, \"input parameter 'key' must be provided\"
	 **/

	private List<String> errorMessages = null;

	/**
	 * The list of errors by parameter returned by the operation. For example,\"projectKey\": \"Project keys must start with an uppercase letter, followed by one or more uppercase alphanumeric characters.\"
	 **/

	private Map<String, String> errors = null;

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
	 * Map of objects representing additional details for an error
	 * @return details
	 **/
	public Map<String, Object> getDetails() {
		return details;
	}

	/**
	 * Set details
	 **/
	public void setDetails(Map<String, Object> details) {
		this.details = details;
	}

	public DetailedErrorCollection details(Map<String, Object> details) {
		this.details = details;
		return this;
	}

	public DetailedErrorCollection putDetailsItem(String key, Object detailsItem) {
		if (this.details == null) {
			this.details = new HashMap<>();
		}
		this.details.put(key, detailsItem);
		return this;
	}

	/**
	 * The list of error messages produced by this operation. For example, \&quot;input parameter &#39;key&#39; must be provided\&quot;
	 * @return errorMessages
	 **/
	public List<String> getErrorMessages() {
		return errorMessages;
	}

	/**
	 * Set errorMessages
	 **/
	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public DetailedErrorCollection errorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
		return this;
	}

	public DetailedErrorCollection addErrorMessagesItem(String errorMessagesItem) {
		if (this.errorMessages == null) {
			this.errorMessages = new ArrayList<>();
		}
		this.errorMessages.add(errorMessagesItem);
		return this;
	}

	/**
	 * The list of errors by parameter returned by the operation. For example,\&quot;projectKey\&quot;: \&quot;Project keys must start with an uppercase letter, followed by one or more uppercase alphanumeric characters.\&quot;
	 * @return errors
	 **/
	public Map<String, String> getErrors() {
		return errors;
	}

	/**
	 * Set errors
	 **/
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

	public DetailedErrorCollection errors(Map<String, String> errors) {
		this.errors = errors;
		return this;
	}

	public DetailedErrorCollection putErrorsItem(String key, String errorsItem) {
		if (this.errors == null) {
			this.errors = new HashMap<>();
		}
		this.errors.put(key, errorsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class DetailedErrorCollection {\n" +
			"    details: " + toIndentedString(details) + "\n" +
			"    errorMessages: " + toIndentedString(errorMessages) + "\n" +
			"    errors: " + toIndentedString(errors) + "\n" +
			"}";
		return sb;
	}
}
