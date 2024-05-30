package com.atlassian.jira.v3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserBean {

	/**
	 * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
	 */
	private String accountId;

	/**
	 * Whether the user is active.
	 */
	private Boolean active;
	private AvatarUrlsBean avatarUrls;

	/**
	 * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
	 */
	private String displayName;

	/**
	 * This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](<a href="https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/">...</a>) for details.   The key of the user.
	 */
	private String key;

	/**
	 * This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](<a href="https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/">...</a>) for details.   The username of the user.
	 */
	private String name;

	/**
	 * The URL of the user.
	 */
	private URI self;
}
