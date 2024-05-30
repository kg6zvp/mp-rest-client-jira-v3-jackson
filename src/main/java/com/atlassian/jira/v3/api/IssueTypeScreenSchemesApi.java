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

package com.atlassian.jira.v3.api;

import com.atlassian.jira.v3.model.*;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import java.util.Set;

/**
 * The Jira Cloud platform REST API
 *
 * <p>Jira Cloud platform REST API documentation
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/rest/api/3/issuetypescreenscheme")
public interface IssueTypeScreenSchemesApi {

	/**
	 * Append mappings to issue type screen scheme
	 *
	 * Appends issue type to screen scheme mappings to an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{issueTypeScreenSchemeId}/mapping")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object appendMappingsForIssueTypeScreenScheme(@PathParam("issueTypeScreenSchemeId") String issueTypeScreenSchemeId, IssueTypeScreenSchemeMappingDetails issueTypeScreenSchemeMappingDetails) throws ApiException, ProcessingException;

	/**
	 * Assign issue type screen scheme to project
	 *
	 * Assigns an issue type screen scheme to a project.  Issue type screen schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/project")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object assignIssueTypeScreenSchemeToProject(IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeProjectAssociation) throws ApiException, ProcessingException;

	/**
	 * Create issue type screen scheme
	 *
	 * Creates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST

	@Consumes({"application/json"})
	@Produces({"application/json"})
	IssueTypeScreenSchemeId createIssueTypeScreenScheme(IssueTypeScreenSchemeDetails issueTypeScreenSchemeDetails) throws ApiException, ProcessingException;

	/**
	 * Delete issue type screen scheme
	 *
	 * Deletes an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/{issueTypeScreenSchemeId}")
	@Produces({"application/json"})
	Object deleteIssueTypeScreenScheme(@PathParam("issueTypeScreenSchemeId") String issueTypeScreenSchemeId) throws ApiException, ProcessingException;

	/**
	 * Get issue type screen scheme items
	 *
	 * Returns a [paginated](#pagination) list of issue type screen scheme items.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/mapping")
	@Produces({"application/json"})
	PageBeanIssueTypeScreenSchemeItem getIssueTypeScreenSchemeMappings(@QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("50") Integer maxResults, @QueryParam("issueTypeScreenSchemeId") Set<Long> issueTypeScreenSchemeId) throws ApiException, ProcessingException;

	/**
	 * Get issue type screen schemes for projects
	 *
	 * Returns a [paginated](#pagination) list of issue type screen schemes and, for each issue type screen scheme, a list of the projects that use it.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/project")
	@Produces({"application/json"})
	PageBeanIssueTypeScreenSchemesProjects getIssueTypeScreenSchemeProjectAssociations(@QueryParam("projectId") Set<Long> projectId, @QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("50") Integer maxResults) throws ApiException, ProcessingException;

	/**
	 * Get issue type screen schemes
	 *
	 * Returns a [paginated](#pagination) list of issue type screen schemes.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET

	@Produces({"application/json"})
	PageBeanIssueTypeScreenScheme getIssueTypeScreenSchemes(@QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("50") Integer maxResults, @QueryParam("id") Set<Long> id, @QueryParam("queryString") @DefaultValue("") String queryString, @QueryParam("orderBy") @DefaultValue("id") String orderBy, @QueryParam("expand") @DefaultValue("") String expand) throws ApiException, ProcessingException;

	/**
	 * Get issue type screen scheme projects
	 *
	 * Returns a [paginated](#pagination) list of projects associated with an issue type screen scheme.  Only company-managed projects associated with an issue type screen scheme are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/{issueTypeScreenSchemeId}/project")
	@Produces({"application/json"})
	PageBeanProjectDetails getProjectsForIssueTypeScreenScheme(@PathParam("issueTypeScreenSchemeId") Long issueTypeScreenSchemeId, @QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("50") Integer maxResults, @QueryParam("query") @DefaultValue("") String query) throws ApiException, ProcessingException;

	/**
	 * Remove mappings from issue type screen scheme
	 *
	 * Removes issue type to screen scheme mappings from an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST
	@Path("/{issueTypeScreenSchemeId}/mapping/remove")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object removeMappingsFromIssueTypeScreenScheme(@PathParam("issueTypeScreenSchemeId") String issueTypeScreenSchemeId, IssueTypeIds issueTypeIds) throws ApiException, ProcessingException;

	/**
	 * Update issue type screen scheme default screen scheme
	 *
	 * Updates the default screen scheme of an issue type screen scheme. The default screen scheme is used for all unmapped issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{issueTypeScreenSchemeId}/mapping/default")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object updateDefaultScreenScheme(@PathParam("issueTypeScreenSchemeId") String issueTypeScreenSchemeId, UpdateDefaultScreenScheme updateDefaultScreenScheme) throws ApiException, ProcessingException;

	/**
	 * Update issue type screen scheme
	 *
	 * Updates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{issueTypeScreenSchemeId}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object updateIssueTypeScreenScheme(@PathParam("issueTypeScreenSchemeId") String issueTypeScreenSchemeId, IssueTypeScreenSchemeUpdateDetails issueTypeScreenSchemeUpdateDetails) throws ApiException, ProcessingException;
}
