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
import java.util.List;

/**
 * The Jira Cloud platform REST API
 *
 * <p>Jira Cloud platform REST API documentation
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/rest/api/3/resolution")
public interface IssueResolutionsApi {

	/**
	 * Create resolution
	 *
	 * Creates an issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST

	@Consumes({"application/json"})
	@Produces({"application/json"})
	ResolutionId createResolution(CreateResolutionDetails createResolutionDetails) throws ApiException, ProcessingException;

	/**
	 * Delete resolution
	 *
	 * Deletes an issue resolution.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/{id}")
	@Produces({"application/json"})
	void deleteResolution(@PathParam("id") String id, @QueryParam("replaceWith") @DefaultValue("") String replaceWith) throws ApiException, ProcessingException;

	/**
	 * Get resolution
	 * <p>
	 * Returns an issue resolution value.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({"application/json"})
	Resolution getResolution(@PathParam("id") String id) throws ApiException, ProcessingException;

	/**
	 * Get resolutions
	 * <p>
	 * Returns a list of all issue resolution values.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 * @deprecated
	 */
	@Deprecated
	@GET

	@Produces({"application/json"})
	List<Resolution> getResolutions() throws ApiException, ProcessingException;

	/**
	 * Move resolutions
	 *
	 * Changes the order of issue resolutions.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/move")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object moveResolutions(ReorderIssueResolutionsRequest reorderIssueResolutionsRequest) throws ApiException, ProcessingException;

	/**
	 * Search resolutions
	 * <p>
	 * Returns a [paginated](#pagination) list of resolutions. The list can contain all resolutions or a subset determined by any combination of these criteria:   *  a list of resolutions IDs.  *  whether the field configuration is a default. This returns resolutions from company-managed (classic) projects only, as there is no concept of default resolutions in team-managed projects.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/search")
	@Produces({"application/json"})
	PageBeanResolutionJsonBean searchResolutions(@QueryParam("startAt") @DefaultValue("0") String startAt, @QueryParam("maxResults") @DefaultValue("50") String maxResults, @QueryParam("id") List<String> id, @QueryParam("onlyDefault") @DefaultValue("false") Boolean onlyDefault) throws ApiException, ProcessingException;

	/**
	 * Set default resolution
	 *
	 * Sets default issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/default")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object setDefaultResolution(SetDefaultResolutionRequest setDefaultResolutionRequest) throws ApiException, ProcessingException;

	/**
	 * Update resolution
	 *
	 * Updates an issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{id}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object updateResolution(@PathParam("id") String id, UpdateResolutionDetails updateResolutionDetails) throws ApiException, ProcessingException;
}
