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


public class RemoveOptionFromIssuesResult {


	private SimpleErrorCollection errors;

	/**
	 * The IDs of the modified issues.
	 **/

	private List<Long> modifiedIssues = null;

	/**
	 * The IDs of the unchanged issues, those issues where errors prevent modification.
	 **/

	private List<Long> unmodifiedIssues = null;

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
	 * Get errors
	 * @return errors
	 **/
	public SimpleErrorCollection getErrors() {
		return errors;
	}

	/**
	 * Set errors
	 **/
	public void setErrors(SimpleErrorCollection errors) {
		this.errors = errors;
	}

	public RemoveOptionFromIssuesResult errors(SimpleErrorCollection errors) {
		this.errors = errors;
		return this;
	}

	/**
	 * The IDs of the modified issues.
	 * @return modifiedIssues
	 **/
	public List<Long> getModifiedIssues() {
		return modifiedIssues;
	}

	/**
	 * Set modifiedIssues
	 **/
	public void setModifiedIssues(List<Long> modifiedIssues) {
		this.modifiedIssues = modifiedIssues;
	}

	public RemoveOptionFromIssuesResult modifiedIssues(List<Long> modifiedIssues) {
		this.modifiedIssues = modifiedIssues;
		return this;
	}

	public RemoveOptionFromIssuesResult addModifiedIssuesItem(Long modifiedIssuesItem) {
		if (this.modifiedIssues == null) {
			this.modifiedIssues = new ArrayList<>();
		}
		this.modifiedIssues.add(modifiedIssuesItem);
		return this;
	}

	/**
	 * The IDs of the unchanged issues, those issues where errors prevent modification.
	 * @return unmodifiedIssues
	 **/
	public List<Long> getUnmodifiedIssues() {
		return unmodifiedIssues;
	}

	/**
	 * Set unmodifiedIssues
	 **/
	public void setUnmodifiedIssues(List<Long> unmodifiedIssues) {
		this.unmodifiedIssues = unmodifiedIssues;
	}

	public RemoveOptionFromIssuesResult unmodifiedIssues(List<Long> unmodifiedIssues) {
		this.unmodifiedIssues = unmodifiedIssues;
		return this;
	}

	public RemoveOptionFromIssuesResult addUnmodifiedIssuesItem(Long unmodifiedIssuesItem) {
		if (this.unmodifiedIssues == null) {
			this.unmodifiedIssues = new ArrayList<>();
		}
		this.unmodifiedIssues.add(unmodifiedIssuesItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class RemoveOptionFromIssuesResult {\n" +
			"    errors: " + toIndentedString(errors) + "\n" +
			"    modifiedIssues: " + toIndentedString(modifiedIssues) + "\n" +
			"    unmodifiedIssues: " + toIndentedString(unmodifiedIssues) + "\n" +
			"}";
		return sb;
	}
}
