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


public class AttachmentArchiveImpl {

	/**
	 * The list of the items included in the archive.
	 **/

	private List<AttachmentArchiveEntry> entries = null;

	/**
	 * The number of items in the archive.
	 **/

	private Integer totalEntryCount;

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
	 * The list of the items included in the archive.
	 * @return entries
	 **/
	public List<AttachmentArchiveEntry> getEntries() {
		return entries;
	}

	/**
	 * Set entries
	 **/
	public void setEntries(List<AttachmentArchiveEntry> entries) {
		this.entries = entries;
	}

	public AttachmentArchiveImpl entries(List<AttachmentArchiveEntry> entries) {
		this.entries = entries;
		return this;
	}

	public AttachmentArchiveImpl addEntriesItem(AttachmentArchiveEntry entriesItem) {
		if (this.entries == null) {
			this.entries = new ArrayList<>();
		}
		this.entries.add(entriesItem);
		return this;
	}

	/**
	 * The number of items in the archive.
	 * @return totalEntryCount
	 **/
	public Integer getTotalEntryCount() {
		return totalEntryCount;
	}

	/**
	 * Set totalEntryCount
	 **/
	public void setTotalEntryCount(Integer totalEntryCount) {
		this.totalEntryCount = totalEntryCount;
	}

	public AttachmentArchiveImpl totalEntryCount(Integer totalEntryCount) {
		this.totalEntryCount = totalEntryCount;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class AttachmentArchiveImpl {\n" +
			"    entries: " + toIndentedString(entries) + "\n" +
			"    totalEntryCount: " + toIndentedString(totalEntryCount) + "\n" +
			"}";
		return sb;
	}
}
