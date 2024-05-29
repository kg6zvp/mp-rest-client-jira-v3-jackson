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
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;

/**
 * The ID or key of a linked issue.
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class LinkedIssue {
	private LinkedIssueFields fields;

	/**
	 * The ID of an issue. Required if `key` isn't provided.
	 */
	private String id;

	/**
	 * The key of an issue. Required if `id` isn't provided.
	 */
	private String key;

	/**
	 * The URL of the issue.
	 */
	private URI self;
}