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
@Path("/rest/api/3/priorityscheme")
public interface PrioritySchemesApi {

	/**
	 * Create priority scheme
	 *
	 * Creates a new priority scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST

	@Consumes({"application/json"})
	@Produces({"application/json"})
	PrioritySchemeId createPriorityScheme(CreatePrioritySchemeDetails createPrioritySchemeDetails) throws ApiException, ProcessingException;

	/**
	 * Delete priority scheme
	 *
	 * Deletes a priority scheme.  This operation is only available for priority schemes without any associated projects. Any associated projects must be removed from the priority scheme before this operation can be performed.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/{schemeId}")
	@Produces({"application/json"})
	Object deletePriorityScheme(@PathParam("schemeId") Long schemeId) throws ApiException, ProcessingException;

	/**
	 * Get available priorities by priority scheme
	 * <p>
	 * Returns a [paginated](#pagination) list of priorities available for adding to a priority scheme.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/priorities/available")
	@Produces({"application/json"})
	PageBeanPriorityWithSequence getAvailablePrioritiesByPriorityScheme(@QueryParam("schemeId") String schemeId, @QueryParam("startAt") @DefaultValue("0") String startAt, @QueryParam("maxResults") @DefaultValue("50") String maxResults, @QueryParam("query") @DefaultValue("") String query, @QueryParam("exclude") Set<String> exclude) throws ApiException, ProcessingException;

	/**
	 * Get priorities by priority scheme
	 * <p>
	 * Returns a [paginated](#pagination) list of priorities by scheme.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/{schemeId}/priorities")
	@Produces({"application/json"})
	PageBeanPriorityWithSequence getPrioritiesByPriorityScheme(@PathParam("schemeId") String schemeId, @QueryParam("startAt") @DefaultValue("0") String startAt, @QueryParam("maxResults") @DefaultValue("50") String maxResults) throws ApiException, ProcessingException;

	/**
	 * Get priority schemes
	 * <p>
	 * Returns a [paginated](#pagination) list of priority schemes.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET

	@Produces({"application/json"})
	PageBeanPrioritySchemeWithPaginatedPrioritiesAndProjects getPrioritySchemes(@QueryParam("startAt") @DefaultValue("0") String startAt, @QueryParam("maxResults") @DefaultValue("50") String maxResults, @QueryParam("priorityId") Set<Long> priorityId, @QueryParam("schemeId") Set<Long> schemeId, @QueryParam("schemeName") @DefaultValue("") String schemeName, @QueryParam("onlyDefault") @DefaultValue("false") Boolean onlyDefault, @QueryParam("orderBy") @DefaultValue("+name") String orderBy, @QueryParam("expand") String expand) throws ApiException, ProcessingException;

	/**
	 * Get projects by priority scheme
	 * <p>
	 * Returns a [paginated](#pagination) list of projects by scheme.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/{schemeId}/projects")
	@Produces({"application/json"})
	PageBeanProject getProjectsByPriorityScheme(@PathParam("schemeId") String schemeId, @QueryParam("startAt") @DefaultValue("0") String startAt, @QueryParam("maxResults") @DefaultValue("50") String maxResults, @QueryParam("projectId") Set<Long> projectId, @QueryParam("query") @DefaultValue("") String query) throws ApiException, ProcessingException;

	/**
	 * Suggested priorities for mappings
	 * <p>
	 * Returns a [paginated](#pagination) list of priorities that would require mapping, given a change in priorities or projects associated with a priority scheme.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@POST
	@Path("/mappings")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	PageBeanPriorityWithSequence suggestedPrioritiesForMappings(SuggestedMappingsRequestBean suggestedMappingsRequestBean) throws ApiException, ProcessingException;

	/**
	 * Update priority scheme
	 *
	 * Updates a priority scheme. This includes its details, the lists of priorities and projects in it  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{schemeId}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	UpdatePrioritySchemeResponseBean updatePriorityScheme(@PathParam("schemeId") Long schemeId, UpdatePrioritySchemeRequestBean updatePrioritySchemeRequestBean) throws ApiException, ProcessingException;
}
