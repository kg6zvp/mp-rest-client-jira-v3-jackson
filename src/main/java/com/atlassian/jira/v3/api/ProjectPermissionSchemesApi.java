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

import com.atlassian.jira.v3.model.IdBean;
import com.atlassian.jira.v3.model.PermissionScheme;
import com.atlassian.jira.v3.model.ProjectIssueSecurityLevels;
import com.atlassian.jira.v3.model.SecurityScheme;
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
@Path("/rest/api/3/project/{projectKeyOrId}")
public interface ProjectPermissionSchemesApi {

	/**
	 * Assign permission scheme
	 *
	 * Assigns a permission scheme with a project. See [Managing project permissions](https://confluence.atlassian.com/x/yodKLg) for more information about permission schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg)
	 *
	 */
	@PUT
	@Path("/permissionscheme")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	PermissionScheme assignPermissionScheme(@PathParam("projectKeyOrId") String projectKeyOrId, IdBean idBean, @QueryParam("expand") String expand) throws ApiException, ProcessingException;

	/**
	 * Get assigned permission scheme
	 *
	 * Gets the [permission scheme](https://confluence.atlassian.com/x/yodKLg) associated with the project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
	 *
	 */
	@GET
	@Path("/permissionscheme")
	@Produces({"application/json"})
	PermissionScheme getAssignedPermissionScheme(@PathParam("projectKeyOrId") String projectKeyOrId, @QueryParam("expand") String expand) throws ApiException, ProcessingException;

	/**
	 * Get project issue security scheme
	 *
	 * Returns the [issue security scheme](https://confluence.atlassian.com/x/J4lKLg) associated with the project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or the *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
	 *
	 */
	@GET
	@Path("/issuesecuritylevelscheme")
	@Produces({"application/json"})
	SecurityScheme getProjectIssueSecurityScheme(@PathParam("projectKeyOrId") String projectKeyOrId) throws ApiException, ProcessingException;

	/**
	 * Get project issue security levels
	 *
	 * Returns all [issue security](https://confluence.atlassian.com/x/J4lKLg) levels for the project that the user has access to.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project, however, issue security levels are only returned for authenticated user with *Set Issue Security* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project.
	 *
	 */
	@GET
	@Path("/securitylevel")
	@Produces({"application/json"})
	ProjectIssueSecurityLevels getSecurityLevelsForProject(@PathParam("projectKeyOrId") String projectKeyOrId) throws ApiException, ProcessingException;
}
