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

import com.atlassian.jira.v3.model.StatusCategory;
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
@Path("/rest/api/3/statuscategory")
public interface WorkflowStatusCategoriesApi {

	/**
	 * Get all status categories
	 * <p>
	 * Returns a list of all status categories.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET

	@Produces({"application/json"})
	List<StatusCategory> getStatusCategories() throws ApiException, ProcessingException;

	/**
	 * Get status category
	 * <p>
	 * Returns a status category. Status categories provided a mechanism for categorizing [statuses](#api-rest-api-3-status-idOrName-get).  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/{idOrKey}")
	@Produces({"application/json"})
	StatusCategory getStatusCategory(@PathParam("idOrKey") String idOrKey) throws ApiException, ProcessingException;
}
