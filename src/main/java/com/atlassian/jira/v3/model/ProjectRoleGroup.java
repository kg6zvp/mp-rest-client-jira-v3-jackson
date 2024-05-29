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
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Details of the group associated with the role.
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectRoleGroup {

	/**
	 * The display name of the group.
	 */
	private String displayName;

	/**
	 * The ID of the group.
	 */
	private String groupId;

	/**
	 * The name of the group. As a group's name can change, use of `groupId` is recommended to identify the group.
	 */
	private String name;
}
