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

import com.atlassian.jira.v3.model.IssueLinkType;
import com.atlassian.jira.v3.model.IssueLinkTypes;
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
@Path("/rest/api/3/issueLinkType")
public interface IssueLinkTypesApi {

	/**
	 * Create issue link type
	 *
	 * Creates an issue link type. Use this operation to create descriptions of the reasons why issues are linked. The issue link type consists of a name and descriptions for a link&#39;s inward and outward relationships.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST

	@Consumes({"application/json"})
	@Produces({"application/json"})
	IssueLinkType createIssueLinkType(IssueLinkType issueLinkType) throws ApiException, ProcessingException;

	/**
	 * Delete issue link type
	 *
	 * Deletes an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/{issueLinkTypeId}")
	void deleteIssueLinkType(@PathParam("issueLinkTypeId") String issueLinkTypeId) throws ApiException, ProcessingException;

	/**
	 * Get issue link type
	 *
	 * Returns an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.
	 *
	 */
	@GET
	@Path("/{issueLinkTypeId}")
	@Produces({"application/json"})
	IssueLinkType getIssueLinkType(@PathParam("issueLinkTypeId") String issueLinkTypeId) throws ApiException, ProcessingException;

	/**
	 * Get issue link types
	 *
	 * Returns a list of all issue link types.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.
	 *
	 */
	@GET

	@Produces({"application/json"})
	IssueLinkTypes getIssueLinkTypes() throws ApiException, ProcessingException;

	/**
	 * Update issue link type
	 *
	 * Updates an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{issueLinkTypeId}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	IssueLinkType updateIssueLinkType(@PathParam("issueLinkTypeId") String issueLinkTypeId, IssueLinkType issueLinkType) throws ApiException, ProcessingException;
}
