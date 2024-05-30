package com.atlassian.jira.v3.api;

import com.atlassian.jira.v3.model.*;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import java.util.Set;

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/rest/api/3/issuesecurityschemes")
public interface IssueSecuritySchemesApi {

	/**
	 * Add issue security levels
	 *
	 * Adds levels and levels&#39; members to the issue security scheme. You can add up to 100 levels per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{schemeId}/level")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object addSecurityLevel(@PathParam("schemeId") String schemeId, AddSecuritySchemeLevelsRequestBean addSecuritySchemeLevelsRequestBean) throws ApiException, ProcessingException;

	/**
	 * Add issue security level members
	 *
	 * Adds members to the issue security level. You can add up to 100 members per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{schemeId}/level/{levelId}/member")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object addSecurityLevelMembers(@PathParam("schemeId") String schemeId, @PathParam("levelId") String levelId, SecuritySchemeMembersRequest securitySchemeMembersRequest) throws ApiException, ProcessingException;

	/**
	 * Associate security scheme to project
	 *
	 * Associates an issue security scheme with a project and remaps security levels of issues to the new levels, if provided.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/project")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	void associateSchemesToProjects(AssociateSecuritySchemeWithProjectDetails associateSecuritySchemeWithProjectDetails) throws ApiException, ProcessingException;

	/**
	 * Create issue security scheme
	 *
	 * Creates a security scheme with security scheme levels and levels&#39; members. You can create up to 100 security scheme levels and security scheme levels&#39; members per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST

	@Consumes({"application/json"})
	@Produces({"application/json"})
	SecuritySchemeId createIssueSecurityScheme(CreateIssueSecuritySchemeDetails createIssueSecuritySchemeDetails) throws ApiException, ProcessingException;

	/**
	 * Delete issue security scheme
	 *
	 * Deletes an issue security scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/{schemeId}")
	@Produces({"application/json"})
	Object deleteSecurityScheme(@PathParam("schemeId") String schemeId) throws ApiException, ProcessingException;

	/**
	 * Get issue security scheme
	 *
	 * Returns an issue security scheme along with its security levels.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project that uses the requested issue security scheme.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({"application/json"})
	SecurityScheme getIssueSecurityScheme(@PathParam("id") Long id) throws ApiException, ProcessingException;

	/**
	 * Get issue security schemes
	 *
	 * Returns all [issue security schemes](https://confluence.atlassian.com/x/J4lKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET

	@Produces({"application/json"})
	SecuritySchemes getIssueSecuritySchemes() throws ApiException, ProcessingException;

	/**
	 * Get issue security level members
	 *
	 * Returns a [paginated](#pagination) list of issue security level members.  Only issue security level members in the context of classic projects are returned.  Filtering using parameters is inclusive: if you specify both security scheme IDs and level IDs, the result will include all issue security level members from the specified schemes and levels.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/level/member")
	@Produces({"application/json"})
	PageBeanSecurityLevelMember getSecurityLevelMembers(@QueryParam("startAt") @DefaultValue("0") String startAt, @QueryParam("maxResults") @DefaultValue("50") String maxResults, @QueryParam("id") Set<String> id, @QueryParam("schemeId") Set<String> schemeId, @QueryParam("levelId") Set<String> levelId, @QueryParam("expand") String expand) throws ApiException, ProcessingException;

	/**
	 * Get issue security levels
	 *
	 * Returns a [paginated](#pagination) list of issue security levels.  Only issue security levels in the context of classic projects are returned.  Filtering using IDs is inclusive: if you specify both security scheme IDs and level IDs, the result will include both specified issue security levels and all issue security levels from the specified schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/level")
	@Produces({"application/json"})
	PageBeanSecurityLevel getSecurityLevels(@QueryParam("startAt") @DefaultValue("0") String startAt, @QueryParam("maxResults") @DefaultValue("50") String maxResults, @QueryParam("id") Set<String> id, @QueryParam("schemeId") Set<String> schemeId, @QueryParam("onlyDefault") @DefaultValue("false") Boolean onlyDefault) throws ApiException, ProcessingException;

	/**
	 * Remove issue security level
	 *
	 * Deletes an issue security level.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/{schemeId}/level/{levelId}")
	@Produces({"application/json"})
	void removeLevel(@PathParam("schemeId") String schemeId, @PathParam("levelId") String levelId, @QueryParam("replaceWith") String replaceWith) throws ApiException, ProcessingException;

	/**
	 * Remove member from issue security level
	 *
	 * Removes an issue security level member from an issue security scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/{schemeId}/level/{levelId}/member/{memberId}")
	@Produces({"application/json"})
	Object removeMemberFromSecurityLevel(@PathParam("schemeId") String schemeId, @PathParam("levelId") String levelId, @PathParam("memberId") String memberId) throws ApiException, ProcessingException;

	/**
	 * Get projects using issue security schemes
	 *
	 * Returns a [paginated](#pagination) mapping of projects that are using security schemes. You can provide either one or multiple security scheme IDs or project IDs to filter by. If you don&#39;t provide any, this will return a list of all mappings. Only issue security schemes in the context of classic projects are supported. **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/project")
	@Produces({"application/json"})
	PageBeanIssueSecuritySchemeToProjectMapping searchProjectsUsingSecuritySchemes(@QueryParam("startAt") @DefaultValue("0") String startAt, @QueryParam("maxResults") @DefaultValue("50") String maxResults, @QueryParam("issueSecuritySchemeId") Set<String> issueSecuritySchemeId, @QueryParam("projectId") Set<String> projectId) throws ApiException, ProcessingException;

	/**
	 * Search issue security schemes
	 *
	 * Returns a [paginated](#pagination) list of issue security schemes.   If you specify the project ID parameter, the result will contain issue security schemes and related project IDs you filter by. Use \\{@link IssueSecuritySchemeResource\\#searchProjectsUsingSecuritySchemes(String, String, Set, Set)\\} to obtain all projects related to scheme.  Only issue security schemes in the context of classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/search")
	@Produces({"application/json"})
	PageBeanSecuritySchemeWithProjects searchSecuritySchemes(@QueryParam("startAt") @DefaultValue("0") String startAt, @QueryParam("maxResults") @DefaultValue("50") String maxResults, @QueryParam("id") Set<String> id, @QueryParam("projectId") Set<String> projectId) throws ApiException, ProcessingException;

	/**
	 * Set default issue security levels
	 *
	 * Sets default issue security levels for schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/level/default")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object setDefaultLevels(SetDefaultLevelsRequest setDefaultLevelsRequest) throws ApiException, ProcessingException;

	/**
	 * Update issue security scheme
	 *
	 * Updates the issue security scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{id}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object updateIssueSecurityScheme(@PathParam("id") String id, UpdateIssueSecuritySchemeRequestBean updateIssueSecuritySchemeRequestBean) throws ApiException, ProcessingException;

	/**
	 * Update issue security level
	 *
	 * Updates the issue security level.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{schemeId}/level/{levelId}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object updateSecurityLevel(@PathParam("schemeId") String schemeId, @PathParam("levelId") String levelId, UpdateIssueSecurityLevelDetails updateIssueSecurityLevelDetails) throws ApiException, ProcessingException;
}
