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

import com.atlassian.jira.v3.model.CreateUiModificationDetails;
import com.atlassian.jira.v3.model.PageBeanUiModificationDetails;
import com.atlassian.jira.v3.model.UiModificationIdentifiers;
import com.atlassian.jira.v3.model.UpdateUiModificationDetails;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;

/**
 * The Jira Cloud platform REST API
 *
 * <p>Jira Cloud platform REST API documentation
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/rest/api/3/uiModifications")
public interface UiModificationsAppsApi {

	/**
	 * Create UI modification
	 *
	 * Creates a UI modification. UI modification can only be created by Forge apps.  Each app can define up to 3000 UI modifications. Each UI modification can define up to 1000 contexts. The same context can be assigned to maximum 100 UI modifications.  **[Permissions](#permissions) required:**   *  *None* if the UI modification is created without contexts.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
	 *
	 */
	@POST

	@Consumes({"application/json"})
	@Produces({"application/json"})
	UiModificationIdentifiers createUiModification(CreateUiModificationDetails createUiModificationDetails) throws ApiException, ProcessingException;

	/**
	 * Delete UI modification
	 *
	 * Deletes a UI modification. All the contexts that belong to the UI modification are deleted too. UI modification can only be deleted by Forge apps.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@DELETE
	@Path("/{uiModificationId}")
	@Produces({"application/json"})
	Object deleteUiModification(@PathParam("uiModificationId") String uiModificationId) throws ApiException, ProcessingException;

	/**
	 * Get UI modifications
	 *
	 * Gets UI modifications. UI modifications can only be retrieved by Forge apps.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@GET

	@Produces({"application/json"})
	PageBeanUiModificationDetails getUiModifications(@QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("50") Integer maxResults, @QueryParam("expand") String expand) throws ApiException, ProcessingException;

	/**
	 * Update UI modification
	 *
	 * Updates a UI modification. UI modification can only be updated by Forge apps.  Each UI modification can define up to 1000 contexts. The same context can be assigned to maximum 100 UI modifications.  **[Permissions](#permissions) required:**   *  *None* if the UI modification is created without contexts.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
	 *
	 */
	@PUT
	@Path("/{uiModificationId}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object updateUiModification(@PathParam("uiModificationId") String uiModificationId, UpdateUiModificationDetails updateUiModificationDetails) throws ApiException, ProcessingException;
}