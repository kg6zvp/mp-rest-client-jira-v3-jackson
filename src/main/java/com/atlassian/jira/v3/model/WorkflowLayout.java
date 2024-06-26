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

/**
 * The starting point for the statuses in the workflow.
 **/

public class WorkflowLayout {

	/**
	 * The x axis location.
	 **/

	private Double x;

	/**
	 * The y axis location.
	 **/

	private Double y;

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
	 * The x axis location.
	 * @return x
	 **/
	public Double getX() {
		return x;
	}

	/**
	 * Set x
	 **/
	public void setX(Double x) {
		this.x = x;
	}

	public WorkflowLayout x(Double x) {
		this.x = x;
		return this;
	}

	/**
	 * The y axis location.
	 * @return y
	 **/
	public Double getY() {
		return y;
	}

	/**
	 * Set y
	 **/
	public void setY(Double y) {
		this.y = y;
	}

	public WorkflowLayout y(Double y) {
		this.y = y;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class WorkflowLayout {\n" +
			"    x: " + toIndentedString(x) + "\n" +
			"    y: " + toIndentedString(y) + "\n" +
			"}";
		return sb;
	}
}
