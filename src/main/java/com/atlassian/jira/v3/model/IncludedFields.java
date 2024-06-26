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

import java.util.LinkedHashSet;
import java.util.Set;


public class IncludedFields {


	private Set<String> actuallyIncluded = null;


	private Set<String> excluded = null;


	private Set<String> included = null;

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
	 * Get actuallyIncluded
	 * @return actuallyIncluded
	 **/
	public Set<String> getActuallyIncluded() {
		return actuallyIncluded;
	}

	/**
	 * Set actuallyIncluded
	 **/
	public void setActuallyIncluded(Set<String> actuallyIncluded) {
		this.actuallyIncluded = actuallyIncluded;
	}

	public IncludedFields actuallyIncluded(Set<String> actuallyIncluded) {
		this.actuallyIncluded = actuallyIncluded;
		return this;
	}

	public IncludedFields addActuallyIncludedItem(String actuallyIncludedItem) {
		if (this.actuallyIncluded == null) {
			this.actuallyIncluded = new LinkedHashSet<>();
		}
		this.actuallyIncluded.add(actuallyIncludedItem);
		return this;
	}

	/**
	 * Get excluded
	 * @return excluded
	 **/
	public Set<String> getExcluded() {
		return excluded;
	}

	/**
	 * Set excluded
	 **/
	public void setExcluded(Set<String> excluded) {
		this.excluded = excluded;
	}

	public IncludedFields excluded(Set<String> excluded) {
		this.excluded = excluded;
		return this;
	}

	public IncludedFields addExcludedItem(String excludedItem) {
		if (this.excluded == null) {
			this.excluded = new LinkedHashSet<>();
		}
		this.excluded.add(excludedItem);
		return this;
	}

	/**
	 * Get included
	 * @return included
	 **/
	public Set<String> getIncluded() {
		return included;
	}

	/**
	 * Set included
	 **/
	public void setIncluded(Set<String> included) {
		this.included = included;
	}

	public IncludedFields included(Set<String> included) {
		this.included = included;
		return this;
	}

	public IncludedFields addIncludedItem(String includedItem) {
		if (this.included == null) {
			this.included = new LinkedHashSet<>();
		}
		this.included.add(includedItem);
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class IncludedFields {\n" +
			"    actuallyIncluded: " + toIndentedString(actuallyIncluded) + "\n" +
			"    excluded: " + toIndentedString(excluded) + "\n" +
			"    included: " + toIndentedString(included) + "\n" +
			"}";
		return sb;
	}
}
