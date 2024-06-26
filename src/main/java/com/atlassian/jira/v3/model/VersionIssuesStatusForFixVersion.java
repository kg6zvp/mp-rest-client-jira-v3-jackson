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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * If the expand option `issuesstatus` is used, returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.
 **/
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class VersionIssuesStatusForFixVersion {

	/**
	 * Count of issues with status *done*.
	 **/

	private Long done;

	/**
	 * Count of issues with status *in progress*.
	 **/

	private Long inProgress;

	/**
	 * Count of issues with status *to do*.
	 **/

	private Long toDo;

	/**
	 * Count of issues with a status other than *to do*, *in progress*, and *done*.
	 **/

	private Long unmapped;

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
	 * Count of issues with status *done*.
	 * @return done
	 **/
	public Long getDone() {
		return done;
	}

	/**
	 * Count of issues with status *in progress*.
	 * @return inProgress
	 **/
	public Long getInProgress() {
		return inProgress;
	}

	/**
	 * Count of issues with status *to do*.
	 * @return toDo
	 **/
	public Long getToDo() {
		return toDo;
	}

	/**
	 * Count of issues with a status other than *to do*, *in progress*, and *done*.
	 * @return unmapped
	 **/
	public Long getUnmapped() {
		return unmapped;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class VersionIssuesStatusForFixVersion {\n" +
			"    done: " + toIndentedString(done) + "\n" +
			"    inProgress: " + toIndentedString(inProgress) + "\n" +
			"    toDo: " + toIndentedString(toDo) + "\n" +
			"    unmapped: " + toIndentedString(unmapped) + "\n" +
			"}";
		return sb;
	}
}
