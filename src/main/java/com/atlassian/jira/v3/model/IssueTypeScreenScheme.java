package com.atlassian.jira.v3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Details of an issue type screen scheme.
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class IssueTypeScreenScheme {

	/**
	 * The description of the issue type screen scheme.
	 */
	private String description;

	/**
	 * The ID of the issue type screen scheme.
	 */
	private String id;

	/**
	 * The name of the issue type screen scheme.
	 */
	private String name;
}
