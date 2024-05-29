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

/**
 * The time tracking of the linked issue.
 **/

public class FieldsTimetracking {

	/**
	 * The original estimate of time needed for this issue in readable format.
	 **/

	private String originalEstimate;

	/**
	 * The original estimate of time needed for this issue in seconds.
	 **/

	private Long originalEstimateSeconds;

	/**
	 * The remaining estimate of time needed for this issue in readable format.
	 **/

	private String remainingEstimate;

	/**
	 * The remaining estimate of time needed for this issue in seconds.
	 **/

	private Long remainingEstimateSeconds;

	/**
	 * Time worked on this issue in readable format.
	 **/

	private String timeSpent;

	/**
	 * Time worked on this issue in seconds.
	 **/

	private Long timeSpentSeconds;

	public FieldsTimetracking() {
	}


	public FieldsTimetracking(
		String originalEstimate,
		Long originalEstimateSeconds,
		String remainingEstimate,
		Long remainingEstimateSeconds,
		String timeSpent,
		Long timeSpentSeconds
	) {
		this.originalEstimate = originalEstimate;
		this.originalEstimateSeconds = originalEstimateSeconds;
		this.remainingEstimate = remainingEstimate;
		this.remainingEstimateSeconds = remainingEstimateSeconds;
		this.timeSpent = timeSpent;
		this.timeSpentSeconds = timeSpentSeconds;
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
	 * The original estimate of time needed for this issue in readable format.
	 * @return originalEstimate
	 **/
	public String getOriginalEstimate() {
		return originalEstimate;
	}

	/**
	 * The original estimate of time needed for this issue in seconds.
	 * @return originalEstimateSeconds
	 **/
	public Long getOriginalEstimateSeconds() {
		return originalEstimateSeconds;
	}

	/**
	 * The remaining estimate of time needed for this issue in readable format.
	 * @return remainingEstimate
	 **/
	public String getRemainingEstimate() {
		return remainingEstimate;
	}

	/**
	 * The remaining estimate of time needed for this issue in seconds.
	 * @return remainingEstimateSeconds
	 **/
	public Long getRemainingEstimateSeconds() {
		return remainingEstimateSeconds;
	}

	/**
	 * Time worked on this issue in readable format.
	 * @return timeSpent
	 **/
	public String getTimeSpent() {
		return timeSpent;
	}

	/**
	 * Time worked on this issue in seconds.
	 * @return timeSpentSeconds
	 **/
	public Long getTimeSpentSeconds() {
		return timeSpentSeconds;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class FieldsTimetracking {\n" +
			"    originalEstimate: " + toIndentedString(originalEstimate) + "\n" +
			"    originalEstimateSeconds: " + toIndentedString(originalEstimateSeconds) + "\n" +
			"    remainingEstimate: " + toIndentedString(remainingEstimate) + "\n" +
			"    remainingEstimateSeconds: " + toIndentedString(remainingEstimateSeconds) + "\n" +
			"    timeSpent: " + toIndentedString(timeSpent) + "\n" +
			"    timeSpentSeconds: " + toIndentedString(timeSpentSeconds) + "\n" +
			"}";
		return sb;
	}
}
