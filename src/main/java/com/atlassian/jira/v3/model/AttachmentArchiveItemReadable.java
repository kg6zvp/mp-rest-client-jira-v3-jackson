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
 * Metadata for an item in an attachment archive.
 **/

public class AttachmentArchiveItemReadable {

	/**
	 * The position of the item within the archive.
	 **/

	private Long index;

	/**
	 * The label for the archive item.
	 **/

	private String label;

	/**
	 * The MIME type of the archive item.
	 **/

	private String mediaType;

	/**
	 * The path of the archive item.
	 **/

	private String path;

	/**
	 * The size of the archive item.
	 **/

	private String size;

	public AttachmentArchiveItemReadable() {
	}


	public AttachmentArchiveItemReadable(
		Long index,
		String label,
		String mediaType,
		String path,
		String size
	) {
		this.index = index;
		this.label = label;
		this.mediaType = mediaType;
		this.path = path;
		this.size = size;
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
	 * The position of the item within the archive.
	 * @return index
	 **/
	public Long getIndex() {
		return index;
	}

	/**
	 * The label for the archive item.
	 * @return label
	 **/
	public String getLabel() {
		return label;
	}

	/**
	 * The MIME type of the archive item.
	 * @return mediaType
	 **/
	public String getMediaType() {
		return mediaType;
	}

	/**
	 * The path of the archive item.
	 * @return path
	 **/
	public String getPath() {
		return path;
	}

	/**
	 * The size of the archive item.
	 * @return size
	 **/
	public String getSize() {
		return size;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class AttachmentArchiveItemReadable {\n" +
			"    index: " + toIndentedString(index) + "\n" +
			"    label: " + toIndentedString(label) + "\n" +
			"    mediaType: " + toIndentedString(mediaType) + "\n" +
			"    path: " + toIndentedString(path) + "\n" +
			"    size: " + toIndentedString(size) + "\n" +
			"}";
		return sb;
	}
}