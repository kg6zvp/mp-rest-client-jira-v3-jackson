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
 * List issues archived within a specified date range.
 **/

public class DateRangeFilterRequest {

	/**
	 * List issues archived after a specified date, passed in the YYYY-MM-DD format.
	 **/

	private String dateAfter;

	/**
	 * List issues archived before a specified date provided in the YYYY-MM-DD format.
	 **/

	private String dateBefore;

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
	 * List issues archived after a specified date, passed in the YYYY-MM-DD format.
	 * @return dateAfter
	 **/
	public String getDateAfter() {
		return dateAfter;
	}

	/**
	 * Set dateAfter
	 **/
	public void setDateAfter(String dateAfter) {
		this.dateAfter = dateAfter;
	}

	public DateRangeFilterRequest dateAfter(String dateAfter) {
		this.dateAfter = dateAfter;
		return this;
	}

	/**
	 * List issues archived before a specified date provided in the YYYY-MM-DD format.
	 * @return dateBefore
	 **/
	public String getDateBefore() {
		return dateBefore;
	}

	/**
	 * Set dateBefore
	 **/
	public void setDateBefore(String dateBefore) {
		this.dateBefore = dateBefore;
	}

	public DateRangeFilterRequest dateBefore(String dateBefore) {
		this.dateBefore = dateBefore;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class DateRangeFilterRequest {\n" +
			"    dateAfter: " + toIndentedString(dateAfter) + "\n" +
			"    dateBefore: " + toIndentedString(dateBefore) + "\n" +
			"}";
		return sb;
	}
}
