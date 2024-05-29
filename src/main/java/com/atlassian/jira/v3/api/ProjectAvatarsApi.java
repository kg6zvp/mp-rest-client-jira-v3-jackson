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

import com.atlassian.jira.v3.model.Avatar;
import com.atlassian.jira.v3.model.ProjectAvatars;
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
@Path("/rest/api/3/project/{projectIdOrKey}")
public interface ProjectAvatarsApi {

	/**
	 * Load project avatar
	 *
	 * Loads an avatar for a project.  Specify the avatar&#39;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST &#x60;  &#x60;--user email@example.com:&lt;api_token&gt; &#x60;  &#x60;--header &#39;X-Atlassian-Token: no-check&#39; &#x60;  &#x60;--header &#39;Content-Type: image/&lt; image_type&gt;&#39; &#x60;  &#x60;--data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; &#x60;  &#x60;--url &#39;https://your-domain.atlassian.net/rest/api/3/project/{projectIdOrKey}/avatar2&#39;&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#39;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project&#39;s displayed avatar.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
	 *
	 */
	@POST
	@Path("/avatar2")
	@Produces({"application/json"})
	Avatar createProjectAvatar(@PathParam("projectIdOrKey") String projectIdOrKey, Object body, @QueryParam("x") @DefaultValue("0") Integer x, @QueryParam("y") @DefaultValue("0") Integer y, @QueryParam("size") @DefaultValue("0") Integer size) throws ApiException, ProcessingException;

	/**
	 * Delete project avatar
	 *
	 * Deletes a custom avatar from a project. Note that system avatars cannot be deleted.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
	 *
	 */
	@DELETE
	@Path("/avatar/{id}")
	void deleteProjectAvatar(@PathParam("projectIdOrKey") String projectIdOrKey, @PathParam("id") Long id) throws ApiException, ProcessingException;

	/**
	 * Get all project avatars
	 *
	 * Returns all project avatars, grouped by system and custom avatars.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
	 *
	 */
	@GET
	@Path("/avatars")
	@Produces({"application/json"})
	ProjectAvatars getAllProjectAvatars(@PathParam("projectIdOrKey") String projectIdOrKey) throws ApiException, ProcessingException;

	/**
	 * Set project avatar
	 *
	 * Sets the avatar displayed for a project.  Use [Load project avatar](#api-rest-api-3-project-projectIdOrKey-avatar2-post) to store avatars against the project, before using this operation to set the displayed avatar.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
	 *
	 */
	@PUT
	@Path("/avatar")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object updateProjectAvatar(@PathParam("projectIdOrKey") String projectIdOrKey, Avatar avatar) throws ApiException, ProcessingException;
}
