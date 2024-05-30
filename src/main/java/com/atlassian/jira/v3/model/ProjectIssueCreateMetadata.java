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
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Details of the issue creation metadata for a project.
 **/
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ProjectIssueCreateMetadata {
	private AvatarUrlsBean avatarUrls;

	/**
	 * Expand options that include additional project issue create metadata details in the response.
	 */
	private String expand;

	/**
	 * The ID of the project.
	 */
	private String id;

	/**
	 * List of the issue types supported by the project.
	 */
	private List<IssueTypeIssueCreateMetadata> issuetypes = null;

	/**
	 * The key of the project.
	 */
	private String key;

	/**
	 * The name of the project.
	 */
	private String name;

	/**
	 * The URL of the project.
	 */
	private String self;
}
