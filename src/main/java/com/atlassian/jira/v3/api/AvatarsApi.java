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

import com.atlassian.jira.v3.model.Avatar;
import com.atlassian.jira.v3.model.Avatars;
import com.atlassian.jira.v3.model.SystemAvatars;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * The Jira Cloud platform REST API
 *
 * <p>Jira Cloud platform REST API documentation
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/rest/api/3")
public interface AvatarsApi {

	/**
	 * Delete avatar
	 *
	 * Deletes an avatar from a project or issue type.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/universal_avatar/type/{type}/owner/{owningObjectId}/avatar/{id}")
	void deleteAvatar(@PathParam("type") String type, @PathParam("owningObjectId") String owningObjectId, @PathParam("id") Long id) throws ApiException, ProcessingException;

	/**
	 * Get system avatars by type
	 * <p>
	 * Returns a list of system avatar details by owner type, where the owner types are issue type, project, or user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@GET
	@Path("/avatar/{type}/system")
	@Produces({"application/json"})
	SystemAvatars getAllSystemAvatars(@PathParam("type") String type) throws ApiException, ProcessingException;

	/**
	 * Get avatar image by ID
	 *
	 * Returns a project or issue type avatar image by ID.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  For system avatars, none.  *  For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.
	 *
	 */
	@GET
	@Path("/universal_avatar/view/type/{type}/avatar/{id}")
	@Produces({"*/*", "application/json", "image/png", "image/svg+xml"})
	Response getAvatarImageByID(@PathParam("type") String type, @PathParam("id") Long id, @QueryParam("size") String size, @QueryParam("format") String format) throws ApiException, ProcessingException;

	/**
	 * Get avatar image by owner
	 *
	 * Returns the avatar image for a project or issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  For system avatars, none.  *  For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.
	 *
	 */
	@GET
	@Path("/universal_avatar/view/type/{type}/owner/{entityId}")
	@Produces({"*/*", "application/json", "image/png", "image/svg+xml"})
	Response getAvatarImageByOwner(@PathParam("type") String type, @PathParam("entityId") String entityId, @QueryParam("size") String size, @QueryParam("format") String format) throws ApiException, ProcessingException;

	/**
	 * Get avatar image by type
	 * <p>
	 * Returns the default project or issue type avatar image.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@GET
	@Path("/universal_avatar/view/type/{type}")
	@Produces({"*/*", "application/json", "image/png", "image/svg+xml"})
	Response getAvatarImageByType(@PathParam("type") String type, @QueryParam("size") String size, @QueryParam("format") String format) throws ApiException, ProcessingException;

	/**
	 * Get avatars
	 *
	 * Returns the system and custom avatars for a project or issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  for custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  for custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.  *  for system avatars, none.
	 *
	 */
	@GET
	@Path("/universal_avatar/type/{type}/owner/{entityId}")
	@Produces({"application/json"})
	Avatars getAvatars(@PathParam("type") String type, @PathParam("entityId") String entityId) throws ApiException, ProcessingException;

	/**
	 * Load avatar
	 *
	 * Loads a custom avatar for a project or issue type.  Specify the avatar&#39;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST &#x60;  &#x60;--user email@example.com:&lt;api_token&gt; &#x60;  &#x60;--header &#39;X-Atlassian-Token: no-check&#39; &#x60;  &#x60;--header &#39;Content-Type: image/&lt; image_type&gt;&#39; &#x60;  &#x60;--data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; &#x60;  &#x60;--url &#39;https://your-domain.atlassian.net/rest/api/3/universal_avatar/type/{type}/owner/{entityId}&#39;&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#39;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use:   *  [Update issue type](#api-rest-api-3-issuetype-id-put) to set it as the issue type&#39;s displayed avatar.  *  [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project&#39;s displayed avatar.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST
	@Path("/universal_avatar/type/{type}/owner/{entityId}")
	@Produces({"application/json"})
	Avatar storeAvatar(@PathParam("type") String type, @PathParam("entityId") String entityId, @QueryParam("size") @DefaultValue("0") Integer size, Object body, @QueryParam("x") @DefaultValue("0") Integer x, @QueryParam("y") @DefaultValue("0") Integer y) throws ApiException, ProcessingException;
}
