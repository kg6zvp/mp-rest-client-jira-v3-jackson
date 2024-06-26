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
import java.util.Set;

/**
 * Details of an application role.
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationRole {

	/**
	 * The groups that are granted default access for this application role. As a group's name can change, use of `defaultGroupsDetails` is recommended to identify a groups.
	 */
	private Set<String> defaultGroups = null;

	/**
	 * The groups that are granted default access for this application role.
	 */
	private List<GroupName> defaultGroupsDetails = null;

	/**
	 * Deprecated.
	 */
	private Boolean defined;

	/**
	 * The groups associated with the application role.
	 */
	private List<GroupName> groupDetails = null;

	/**
	 * The groups associated with the application role. As a group's name can change, use of `groupDetails` is recommended to identify a groups.
	 */
	private Set<String> groups = null;
	private Boolean hasUnlimitedSeats;

	/**
	 * The key of the application role.
	 */
	private String key;

	/**
	 * The display name of the application role.
	 */
	private String name;

	/**
	 * The maximum count of users on your license.
	 */
	private Integer numberOfSeats;

	/**
	 * Indicates if the application role belongs to Jira platform (`jira-core`).
	 */
	private Boolean platform;

	/**
	 * The count of users remaining on your license.
	 */
	private Integer remainingSeats;

	/**
	 * Determines whether this application role should be selected by default on user creation.
	 */
	private Boolean selectedByDefault;

	/**
	 * The number of users counting against your license.
	 */
	private Integer userCount;

	/**
	 * The <a href="https://confluence.atlassian.com/x/lRW3Ng">type of users</a> being counted against your license.
	 */
	private String userCountDescription;
}
