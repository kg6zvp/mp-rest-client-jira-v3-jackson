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
import java.util.List;

/**
 * The list of available gadgets.
 **/

public class AvailableDashboardGadgetsResponse {

	/**
	 * The list of available gadgets.
	 **/

	private List<AvailableDashboardGadget> gadgets = new ArrayList<>();

	public AvailableDashboardGadgetsResponse() {
	}


	public AvailableDashboardGadgetsResponse(
		List<AvailableDashboardGadget> gadgets
	) {
		this.gadgets = gadgets;
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
	 * The list of available gadgets.
	 * @return gadgets
	 **/
	public List<AvailableDashboardGadget> getGadgets() {
		return gadgets;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class AvailableDashboardGadgetsResponse {\n" +
			"    gadgets: " + toIndentedString(gadgets) + "\n" +
			"}";
		return sb;
	}
}
