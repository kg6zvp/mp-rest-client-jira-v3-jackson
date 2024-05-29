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
 * Details of changes to a priority scheme that require suggested priority mappings.
 **/

public class SuggestedMappingsRequestBean {

	/**
	 * The maximum number of results that could be on the page.
	 **/

	private Integer maxResults;


	private SuggestedMappingsForPrioritiesRequestBean priorities;


	private SuggestedMappingsForProjectsRequestBean projects;

	/**
	 * The id of the priority scheme.
	 **/

	private Long schemeId;

	/**
	 * The index of the first item returned on the page.
	 **/

	private Long startAt;

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
	 * The maximum number of results that could be on the page.
	 * @return maxResults
	 **/
	public Integer getMaxResults() {
		return maxResults;
	}

	/**
	 * Set maxResults
	 **/
	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public SuggestedMappingsRequestBean maxResults(Integer maxResults) {
		this.maxResults = maxResults;
		return this;
	}

	/**
	 * Get priorities
	 * @return priorities
	 **/
	public SuggestedMappingsForPrioritiesRequestBean getPriorities() {
		return priorities;
	}

	/**
	 * Set priorities
	 **/
	public void setPriorities(SuggestedMappingsForPrioritiesRequestBean priorities) {
		this.priorities = priorities;
	}

	public SuggestedMappingsRequestBean priorities(SuggestedMappingsForPrioritiesRequestBean priorities) {
		this.priorities = priorities;
		return this;
	}

	/**
	 * Get projects
	 * @return projects
	 **/
	public SuggestedMappingsForProjectsRequestBean getProjects() {
		return projects;
	}

	/**
	 * Set projects
	 **/
	public void setProjects(SuggestedMappingsForProjectsRequestBean projects) {
		this.projects = projects;
	}

	public SuggestedMappingsRequestBean projects(SuggestedMappingsForProjectsRequestBean projects) {
		this.projects = projects;
		return this;
	}

	/**
	 * The id of the priority scheme.
	 * @return schemeId
	 **/
	public Long getSchemeId() {
		return schemeId;
	}

	/**
	 * Set schemeId
	 **/
	public void setSchemeId(Long schemeId) {
		this.schemeId = schemeId;
	}

	public SuggestedMappingsRequestBean schemeId(Long schemeId) {
		this.schemeId = schemeId;
		return this;
	}

	/**
	 * The index of the first item returned on the page.
	 * @return startAt
	 **/
	public Long getStartAt() {
		return startAt;
	}

	/**
	 * Set startAt
	 **/
	public void setStartAt(Long startAt) {
		this.startAt = startAt;
	}

	public SuggestedMappingsRequestBean startAt(Long startAt) {
		this.startAt = startAt;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class SuggestedMappingsRequestBean {\n" +
			"    maxResults: " + toIndentedString(maxResults) + "\n" +
			"    priorities: " + toIndentedString(priorities) + "\n" +
			"    projects: " + toIndentedString(projects) + "\n" +
			"    schemeId: " + toIndentedString(schemeId) + "\n" +
			"    startAt: " + toIndentedString(startAt) + "\n" +
			"}";
		return sb;
	}
}
