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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashMap;

/**
 * Details about an attachment.
 **/
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Attachment extends HashMap<String, Object> {
	@Setter
	private AttachmentAuthor author;
	private String content;

	/**
	 * The datetime the attachment was created.
	 */
	private Date created;

	/**
	 * The file name of the attachment.
	 */
	private String filename;

	/**
	 * The ID of the attachment.
	 */
	private String id;

	/**
	 * The MIME type of the attachment.
	 */
	private String mimeType;

	/**
	 * The URL of the attachment details response.
	 */
	private String self;

	/**
	 * The size of the attachment.
	 */
	private Long size;

	/**
	 * The URL of a thumbnail representing the attachment.
	 */
	private String thumbnail;

	public Attachment author(AttachmentAuthor author) {
		this.author = author;
		return this;
	}
}