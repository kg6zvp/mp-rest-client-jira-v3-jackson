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

import com.atlassian.jira.v3.model.*;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import java.util.List;
import java.util.Set;

/**
 * The Jira Cloud platform REST API
 *
 * <p>Jira Cloud platform REST API documentation
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/rest/api/3")
public interface ScreensApi {

	/**
	 * Add field to default screen
	 *
	 * Adds a field to the default tab of the default screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST
	@Path("/screens/addToDefault/{fieldId}")
	@Produces({"application/json"})
	Object addFieldToDefaultScreen(@PathParam("fieldId") String fieldId) throws ApiException, ProcessingException;

	/**
	 * Create screen
	 *
	 * Creates a screen with a default field tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST
	@Path("/screens")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Screen createScreen(ScreenDetails screenDetails) throws ApiException, ProcessingException;

	/**
	 * Delete screen
	 *
	 * Deletes a screen. A screen cannot be deleted if it is used in a screen scheme, workflow, or workflow draft.  Only screens used in classic projects can be deleted.
	 *
	 */
	@DELETE
	@Path("/screens/{screenId}")
	@Produces({"application/json"})
	void deleteScreen(@PathParam("screenId") Long screenId) throws ApiException, ProcessingException;

	/**
	 * Get available screen fields
	 *
	 * Returns the fields that can be added to a tab on a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/screens/{screenId}/availableFields")
	@Produces({"application/json"})
	List<ScreenableField> getAvailableScreenFields(@PathParam("screenId") Long screenId) throws ApiException, ProcessingException;

	/**
	 * Get screens
	 *
	 * Returns a [paginated](#pagination) list of all screens or those specified by one or more screen IDs.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/screens")
	@Produces({"application/json"})
	PageBeanScreen getScreens(@QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("100") Integer maxResults, @QueryParam("id") Set<Long> id, @QueryParam("queryString") @DefaultValue("") String queryString, @QueryParam("scope") Set<String> scope, @QueryParam("orderBy") String orderBy) throws ApiException, ProcessingException;

	/**
	 * Get screens for a field
	 *
	 * Returns a [paginated](#pagination) list of the screens a field is used in.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/field/{fieldId}/screens")
	@Produces({"application/json"})
	PageBeanScreenWithTab getScreensForField(@PathParam("fieldId") String fieldId, @QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("100") Integer maxResults, @QueryParam("expand") String expand) throws ApiException, ProcessingException;

	/**
	 * Update screen
	 *
	 * Updates a screen. Only screens used in classic projects can be updated.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/screens/{screenId}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Screen updateScreen(@PathParam("screenId") Long screenId, UpdateScreenDetails updateScreenDetails) throws ApiException, ProcessingException;
}