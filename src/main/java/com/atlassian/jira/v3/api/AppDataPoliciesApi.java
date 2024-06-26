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

import com.atlassian.jira.v3.model.ProjectDataPolicies;
import com.atlassian.jira.v3.model.WorkspaceDataPolicy;
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
@Path("/rest/api/3/data-policy")
public interface AppDataPoliciesApi {

	/**
	 * Get data policy for projects
	 * <p>
	 * Returns data policies for the projects specified in the request.
	 *
	 */
	@GET
	@Path("/project")
	@Produces({"application/json"})
	ProjectDataPolicies getPolicies(@QueryParam("ids") String ids) throws ApiException, ProcessingException;

	/**
	 * Get data policy for the workspace
	 * <p>
	 * Returns data policy for the workspace.
	 *
	 */
	@GET

	@Produces({"application/json"})
	WorkspaceDataPolicy getPolicy() throws ApiException, ProcessingException;
}
