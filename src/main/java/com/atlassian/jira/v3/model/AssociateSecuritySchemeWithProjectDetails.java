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

import java.util.ArrayList;
import java.util.List;

/**
 * Issue security scheme, project, and remapping details.
 **/

public class AssociateSecuritySchemeWithProjectDetails {

	/**
	 * The list of scheme levels which should be remapped to new levels of the issue security scheme.
	 **/

	private List<OldToNewSecurityLevelMappingsBean> oldToNewSecurityLevelMappings = null;

	/**
	 * The ID of the project.
	 **/

	private String projectId;

	/**
	 * The ID of the issue security scheme. Providing null will clear the association with the issue security scheme.
	 **/

	private String schemeId;

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
	 * The list of scheme levels which should be remapped to new levels of the issue security scheme.
	 * @return oldToNewSecurityLevelMappings
	 **/
	public List<OldToNewSecurityLevelMappingsBean> getOldToNewSecurityLevelMappings() {
		return oldToNewSecurityLevelMappings;
	}

	/**
	 * Set oldToNewSecurityLevelMappings
	 **/
	public void setOldToNewSecurityLevelMappings(List<OldToNewSecurityLevelMappingsBean> oldToNewSecurityLevelMappings) {
		this.oldToNewSecurityLevelMappings = oldToNewSecurityLevelMappings;
	}

	public AssociateSecuritySchemeWithProjectDetails oldToNewSecurityLevelMappings(List<OldToNewSecurityLevelMappingsBean> oldToNewSecurityLevelMappings) {
		this.oldToNewSecurityLevelMappings = oldToNewSecurityLevelMappings;
		return this;
	}

	public AssociateSecuritySchemeWithProjectDetails addOldToNewSecurityLevelMappingsItem(OldToNewSecurityLevelMappingsBean oldToNewSecurityLevelMappingsItem) {
		if (this.oldToNewSecurityLevelMappings == null) {
			this.oldToNewSecurityLevelMappings = new ArrayList<>();
		}
		this.oldToNewSecurityLevelMappings.add(oldToNewSecurityLevelMappingsItem);
		return this;
	}

	/**
	 * The ID of the project.
	 * @return projectId
	 **/
	public String getProjectId() {
		return projectId;
	}

	/**
	 * Set projectId
	 **/
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public AssociateSecuritySchemeWithProjectDetails projectId(String projectId) {
		this.projectId = projectId;
		return this;
	}

	/**
	 * The ID of the issue security scheme. Providing null will clear the association with the issue security scheme.
	 * @return schemeId
	 **/
	public String getSchemeId() {
		return schemeId;
	}

	/**
	 * Set schemeId
	 **/
	public void setSchemeId(String schemeId) {
		this.schemeId = schemeId;
	}

	public AssociateSecuritySchemeWithProjectDetails schemeId(String schemeId) {
		this.schemeId = schemeId;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class AssociateSecuritySchemeWithProjectDetails {\n" +
			"    oldToNewSecurityLevelMappings: " + toIndentedString(oldToNewSecurityLevelMappings) + "\n" +
			"    projectId: " + toIndentedString(projectId) + "\n" +
			"    schemeId: " + toIndentedString(schemeId) + "\n" +
			"}";
		return sb;
	}
}
