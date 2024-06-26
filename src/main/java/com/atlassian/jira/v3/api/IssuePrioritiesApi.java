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
@Path("/rest/api/3/priority")
public interface IssuePrioritiesApi {

	/**
	 * Create priority
	 *
	 * Creates an issue priority.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST

	@Consumes({"application/json"})
	@Produces({"application/json"})
	PriorityId createPriority(CreatePriorityDetails createPriorityDetails) throws ApiException, ProcessingException;

	/**
	 * Delete priority
	 *
	 * *Deprecated: please refer to the* [changelog](https://developer.atlassian.com/changelog/#CHANGE-1066) *for more details.*  Deletes an issue priority.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 * @deprecated
	 */
	@Deprecated
	@DELETE
	@Path("/{id}")
	@Produces({"application/json"})
	void deletePriority(@PathParam("id") String id, @QueryParam("replaceWith") String replaceWith) throws ApiException, ProcessingException;

	/**
	 * Get priorities
	 * <p>
	 * Returns the list of all issue priorities.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 * @deprecated
	 */
	@Deprecated
	@GET

	@Produces({"application/json"})
	List<Priority> getPriorities() throws ApiException, ProcessingException;

	/**
	 * Get priority
	 * <p>
	 * Returns an issue priority.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({"application/json"})
	Priority getPriority(@PathParam("id") String id) throws ApiException, ProcessingException;

	/**
	 * Move priorities
	 *
	 * Changes the order of issue priorities.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/move")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object movePriorities(ReorderIssuePriorities reorderIssuePriorities) throws ApiException, ProcessingException;

	/**
	 * Search priorities
	 * <p>
	 * Returns a [paginated](#pagination) list of priorities. The list can contain all priorities or a subset determined by any combination of these criteria:   *  a list of priority IDs. Any invalid priority IDs are ignored.  *  a list of project IDs. Only priorities that are available in these projects will be returned. Any invalid project IDs are ignored.  *  whether the field configuration is a default. This returns priorities from company-managed (classic) projects only, as there is no concept of default priorities in team-managed projects.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/search")
	@Produces({"application/json"})
	PageBeanPriority searchPriorities(@QueryParam("startAt") @DefaultValue("0") String startAt, @QueryParam("maxResults") @DefaultValue("50") String maxResults, @QueryParam("id") List<String> id, @QueryParam("projectId") List<String> projectId, @QueryParam("priorityName") @DefaultValue("") String priorityName, @QueryParam("onlyDefault") @DefaultValue("false") Boolean onlyDefault, @QueryParam("expand") @DefaultValue("") String expand) throws ApiException, ProcessingException;

	/**
	 * Set default priority
	 *
	 * Sets default issue priority.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/default")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object setDefaultPriority(SetDefaultPriorityRequest setDefaultPriorityRequest) throws ApiException, ProcessingException;

	/**
	 * Update priority
	 *
	 * Updates an issue priority.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{id}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object updatePriority(@PathParam("id") String id, UpdatePriorityDetails updatePriorityDetails) throws ApiException, ProcessingException;
}
