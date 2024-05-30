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

import com.atlassian.jira.v3.model.ErrorCollection;
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
@Path("/rest/api/3/projectvalidate")
public interface ProjectKeyAndNameValidationApi {

	/**
	 * Get valid project key
	 * <p>
	 * Validates a project key and, if the key is invalid or in use, generates a valid random string for the project key.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@GET
	@Path("/validProjectKey")
	@Produces({"application/json"})
	String getValidProjectKey(@QueryParam("key") String key) throws ApiException, ProcessingException;

	/**
	 * Get valid project name
	 * <p>
	 * Checks that a project name isn&#39;t in use. If the name isn&#39;t in use, the passed string is returned. If the name is in use, this operation attempts to generate a valid project name based on the one supplied, usually by adding a sequence number. If a valid project name cannot be generated, a 404 response is returned.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@GET
	@Path("/validProjectName")
	@Produces({"application/json"})
	String getValidProjectName(@QueryParam("name") String name) throws ApiException, ProcessingException;

	/**
	 * Validate project key
	 * <p>
	 * Validates a project key by confirming the key is a valid string and not in use.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@GET
	@Path("/key")
	@Produces({"application/json"})
	ErrorCollection validateProjectKey(@QueryParam("key") String key) throws ApiException, ProcessingException;
}
