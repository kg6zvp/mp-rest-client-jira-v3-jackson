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
 * Container for a list of webhook IDs.
 **/

public class ContainerForWebhookIDs {

	/**
	 * A list of webhook IDs.
	 **/

	private List<Long> webhookIds = new ArrayList<>();

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
	 * A list of webhook IDs.
	 * @return webhookIds
	 **/
	public List<Long> getWebhookIds() {
		return webhookIds;
	}

	/**
	 * Set webhookIds
	 **/
	public void setWebhookIds(List<Long> webhookIds) {
		this.webhookIds = webhookIds;
	}

	public ContainerForWebhookIDs webhookIds(List<Long> webhookIds) {
		this.webhookIds = webhookIds;
		return this;
	}

	public ContainerForWebhookIDs addWebhookIdsItem(Long webhookIdsItem) {
		if (this.webhookIds == null) {
			this.webhookIds = new ArrayList<>();
		}
		this.webhookIds.add(webhookIdsItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ContainerForWebhookIDs {\n" +
			"    webhookIds: " + toIndentedString(webhookIds) + "\n" +
			"}";
		return sb;
	}
}
