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
import lombok.NoArgsConstructor;

import java.net.URI;
import java.util.Date;
import java.util.Map;

/**
 * Metadata for an issue attachment.
 **/
@NoArgsConstructor
@AllArgsConstructor
public class AttachmentMetadata {


	private AttachmentMetadataAuthor author;

	/**
	 * The URL of the attachment.
	 **/

	private String content;

	/**
	 * The datetime the attachment was created.
	 **/

	private Date created;

	/**
	 * The name of the attachment file.
	 **/

	private String filename;

	/**
	 * The ID of the attachment.
	 **/

	private Long id;

	/**
	 * The MIME type of the attachment.
	 **/

	private String mimeType;

	/**
	 * Additional properties of the attachment.
	 **/

	private Map<String, Object> properties = null;

	/**
	 * The URL of the attachment metadata details.
	 **/

	private URI self;

	/**
	 * The size of the attachment.
	 **/

	private Long size;

	/**
	 * The URL of a thumbnail representing the attachment.
	 **/

	private String thumbnail;

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
	 * Get author
	 * @return author
	 **/
	public AttachmentMetadataAuthor getAuthor() {
		return author;
	}

	/**
	 * Set author
	 **/
	public void setAuthor(AttachmentMetadataAuthor author) {
		this.author = author;
	}

	public AttachmentMetadata author(AttachmentMetadataAuthor author) {
		this.author = author;
		return this;
	}

	/**
	 * The URL of the attachment.
	 * @return content
	 **/
	public String getContent() {
		return content;
	}

	/**
	 * The datetime the attachment was created.
	 * @return created
	 **/
	public Date getCreated() {
		return created;
	}

	/**
	 * The name of the attachment file.
	 * @return filename
	 **/
	public String getFilename() {
		return filename;
	}

	/**
	 * The ID of the attachment.
	 * @return id
	 **/
	public Long getId() {
		return id;
	}

	/**
	 * The MIME type of the attachment.
	 * @return mimeType
	 **/
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * Additional properties of the attachment.
	 * @return properties
	 **/
	public Map<String, Object> getProperties() {
		return properties;
	}

	/**
	 * The URL of the attachment metadata details.
	 * @return self
	 **/
	public URI getSelf() {
		return self;
	}

	/**
	 * The size of the attachment.
	 * @return size
	 **/
	public Long getSize() {
		return size;
	}

	/**
	 * The URL of a thumbnail representing the attachment.
	 * @return thumbnail
	 **/
	public String getThumbnail() {
		return thumbnail;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class AttachmentMetadata {\n" +
			"    author: " + toIndentedString(author) + "\n" +
			"    content: " + toIndentedString(content) + "\n" +
			"    created: " + toIndentedString(created) + "\n" +
			"    filename: " + toIndentedString(filename) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    mimeType: " + toIndentedString(mimeType) + "\n" +
			"    properties: " + toIndentedString(properties) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"    size: " + toIndentedString(size) + "\n" +
			"    thumbnail: " + toIndentedString(thumbnail) + "\n" +
			"}";
		return sb;
	}
}
