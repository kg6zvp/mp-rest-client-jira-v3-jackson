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

import com.atlassian.jira.v3.model.ProjectCategory;
import com.atlassian.jira.v3.model.UpdatedProjectCategory;
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
@Path("/rest/api/3/projectCategory")
public interface ProjectCategoriesApi {

	/**
	 * Create project category
	 *
	 * Creates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST

	@Consumes({"application/json"})
	@Produces({"application/json"})
	ProjectCategory createProjectCategory(ProjectCategory projectCategory) throws ApiException, ProcessingException;

	/**
	 * Get all project categories
	 *
	 * Returns all project categories.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET

	@Produces({"application/json"})
	List<ProjectCategory> getAllProjectCategories() throws ApiException, ProcessingException;

	/**
	 * Get project category by ID
	 *
	 * Returns a project category.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({"application/json"})
	ProjectCategory getProjectCategoryById(@PathParam("id") Long id) throws ApiException, ProcessingException;

	/**
	 * Delete project category
	 *
	 * Deletes a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/{id}")
	void removeProjectCategory(@PathParam("id") Long id) throws ApiException, ProcessingException;

	/**
	 * Update project category
	 *
	 * Updates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{id}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	UpdatedProjectCategory updateProjectCategory(@PathParam("id") Long id, ProjectCategory projectCategory) throws ApiException, ProcessingException;
}
