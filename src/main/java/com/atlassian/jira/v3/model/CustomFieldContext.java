package com.atlassian.jira.v3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The details of a custom field context.
 */
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomFieldContext {

	/**
	 * The description of the context.
	 */
	private String description;

	/**
	 * The ID of the context.
	 */
	private String id;

	/**
	 * Whether the context apply to all issue types.
	 */
	private Boolean isAnyIssueType;

	/**
	 * Whether the context is global.
	 */
	private Boolean isGlobalContext;

	/**
	 * The name of the context.
	 */
	private String name;
}
