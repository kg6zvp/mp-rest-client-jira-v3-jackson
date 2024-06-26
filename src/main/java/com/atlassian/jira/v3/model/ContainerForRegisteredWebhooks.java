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

import java.util.ArrayList;
import java.util.List;

/**
 * Container for a list of registered webhooks. Webhook details are returned in the same order as the request.
 **/

public class ContainerForRegisteredWebhooks {

	/**
	 * A list of registered webhooks.
	 **/

	private List<RegisteredWebhook> webhookRegistrationResult = null;

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
	 * A list of registered webhooks.
	 * @return webhookRegistrationResult
	 **/
	public List<RegisteredWebhook> getWebhookRegistrationResult() {
		return webhookRegistrationResult;
	}

	/**
	 * Set webhookRegistrationResult
	 **/
	public void setWebhookRegistrationResult(List<RegisteredWebhook> webhookRegistrationResult) {
		this.webhookRegistrationResult = webhookRegistrationResult;
	}

	public ContainerForRegisteredWebhooks webhookRegistrationResult(List<RegisteredWebhook> webhookRegistrationResult) {
		this.webhookRegistrationResult = webhookRegistrationResult;
		return this;
	}

	public ContainerForRegisteredWebhooks addWebhookRegistrationResultItem(RegisteredWebhook webhookRegistrationResultItem) {
		if (this.webhookRegistrationResult == null) {
			this.webhookRegistrationResult = new ArrayList<>();
		}
		this.webhookRegistrationResult.add(webhookRegistrationResultItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ContainerForRegisteredWebhooks {\n" +
			"    webhookRegistrationResult: " + toIndentedString(webhookRegistrationResult) + "\n" +
			"}";
		return sb;
	}
}
