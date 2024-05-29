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
 * A container for a list of workflow schemes together with the projects they are associated with.
 **/

public class ContainerOfWorkflowSchemeAssociations {

	/**
	 * A list of workflow schemes together with projects they are associated with.
	 **/

	private List<WorkflowSchemeAssociations> values = new ArrayList<>();

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
	 * A list of workflow schemes together with projects they are associated with.
	 * @return values
	 **/
	public List<WorkflowSchemeAssociations> getValues() {
		return values;
	}

	/**
	 * Set values
	 **/
	public void setValues(List<WorkflowSchemeAssociations> values) {
		this.values = values;
	}

	public ContainerOfWorkflowSchemeAssociations values(List<WorkflowSchemeAssociations> values) {
		this.values = values;
		return this;
	}

	public ContainerOfWorkflowSchemeAssociations addValuesItem(WorkflowSchemeAssociations valuesItem) {
		if (this.values == null) {
			this.values = new ArrayList<>();
		}
		this.values.add(valuesItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class ContainerOfWorkflowSchemeAssociations {\n" +
			"    values: " + toIndentedString(values) + "\n" +
			"}";
		return sb;
	}
}