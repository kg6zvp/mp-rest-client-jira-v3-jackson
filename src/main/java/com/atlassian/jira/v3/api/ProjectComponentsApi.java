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

package com.atlassian.jira.v3.api;

import com.atlassian.jira.v3.model.ComponentIssuesCount;
import com.atlassian.jira.v3.model.PageBean2ComponentJsonBean;
import com.atlassian.jira.v3.model.PageBeanComponentWithIssueCount;
import com.atlassian.jira.v3.model.ProjectComponent;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import java.util.List;

/**
 * The Jira Cloud platform REST API
 *
 * <p>Jira Cloud platform REST API documentation
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/rest/api/3")
public interface ProjectComponentsApi {

	/**
	 * Create component
	 *
	 * Creates a component. Use components to provide containers for issues within a project. Use components to provide containers for issues within a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the component is created or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST
	@Path("/component")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	ProjectComponent createComponent(ProjectComponent projectComponent) throws ApiException, ProcessingException;

	/**
	 * Delete component
	 *
	 * Deletes a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/component/{id}")
	void deleteComponent(@PathParam("id") String id, @QueryParam("moveIssuesTo") String moveIssuesTo) throws ApiException, ProcessingException;

	/**
	 * Find components for projects
	 *
	 * Returns a [paginated](#pagination) list of all components in a project, including global (Compass) components when applicable.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
	 *
	 */
	@GET
	@Path("/component")
	@Produces({"application/json"})
	PageBean2ComponentJsonBean findComponentsForProjects(@QueryParam("projectIdsOrKeys") List<String> projectIdsOrKeys, @QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("50") Integer maxResults, @QueryParam("orderBy") String orderBy, @QueryParam("query") String query) throws ApiException, ProcessingException;

	/**
	 * Get component
	 *
	 * Returns a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for project containing the component.
	 *
	 */
	@GET
	@Path("/component/{id}")
	@Produces({"application/json"})
	ProjectComponent getComponent(@PathParam("id") String id) throws ApiException, ProcessingException;

	/**
	 * Get component issues count
	 *
	 * Returns the counts of issues assigned to the component.  This operation can be accessed anonymously.  **Deprecation notice:** The required OAuth 2.0 scopes will be updated on June 15, 2024.   *  **Classic**: &#x60;read:jira-work&#x60;  *  **Granular**: &#x60;read:field:jira&#x60;, &#x60;read:project.component:jira&#x60;  **[Permissions](#permissions) required:** None.
	 *
	 */
	@GET
	@Path("/component/{id}/relatedIssueCounts")
	@Produces({"application/json"})
	ComponentIssuesCount getComponentRelatedIssues(@PathParam("id") String id) throws ApiException, ProcessingException;

	/**
	 * Get project components
	 *
	 * Returns all components in a project. See the [Get project components paginated](#api-rest-api-3-project-projectIdOrKey-component-get) resource if you want to get a full list of components with pagination.  If your project uses Compass components, this API will return a paginated list of Compass components that are linked to issues in that project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
	 *
	 */
	@GET
	@Path("/project/{projectIdOrKey}/components")
	@Produces({"application/json"})
	List<ProjectComponent> getProjectComponents(@PathParam("projectIdOrKey") String projectIdOrKey, @QueryParam("componentSource") @DefaultValue("jira") String componentSource) throws ApiException, ProcessingException;

	/**
	 * Get project components paginated
	 *
	 * Returns a [paginated](#pagination) list of all components in a project. See the [Get project components](#api-rest-api-3-project-projectIdOrKey-components-get) resource if you want to get a full list of versions without pagination.  If your project uses Compass components, this API will return a list of Compass components that are linked to issues in that project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
	 *
	 */
	@GET
	@Path("/project/{projectIdOrKey}/component")
	@Produces({"application/json"})
	PageBeanComponentWithIssueCount getProjectComponentsPaginated(@PathParam("projectIdOrKey") String projectIdOrKey, @QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("50") Integer maxResults, @QueryParam("orderBy") String orderBy, @QueryParam("componentSource") @DefaultValue("jira") String componentSource, @QueryParam("query") String query) throws ApiException, ProcessingException;

	/**
	 * Update component
	 *
	 * Updates a component. Any fields included in the request are overwritten. If &#x60;leadAccountId&#x60; is an empty string (\&quot;\&quot;) the component lead is removed.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/component/{id}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	ProjectComponent updateComponent(@PathParam("id") String id, ProjectComponent projectComponent) throws ApiException, ProcessingException;
}