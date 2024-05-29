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

import com.atlassian.jira.v3.model.EntityProperty;
import com.atlassian.jira.v3.model.PropertyKeys;
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
@Path("/rest/api/3/comment/{commentId}/properties")
public interface IssueCommentPropertiesApi {

	/**
	 * Delete comment property
	 *
	 * Deletes a comment property.  **[Permissions](#permissions) required:** either of:   *  *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from any comment.  *  *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from a comment created by the user.  Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group.
	 *
	 */
	@DELETE
	@Path("/{propertyKey}")
	void deleteCommentProperty(@PathParam("commentId") String commentId, @PathParam("propertyKey") String propertyKey) throws ApiException, ProcessingException;

	/**
	 * Get comment property
	 *
	 * Returns the value of a comment property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.
	 *
	 */
	@GET
	@Path("/{propertyKey}")
	@Produces({"application/json"})
	EntityProperty getCommentProperty(@PathParam("commentId") String commentId, @PathParam("propertyKey") String propertyKey) throws ApiException, ProcessingException;

	/**
	 * Get comment property keys
	 *
	 * Returns the keys of all the properties of a comment.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.
	 *
	 */
	@GET

	@Produces({"application/json"})
	PropertyKeys getCommentPropertyKeys(@PathParam("commentId") String commentId) throws ApiException, ProcessingException;

	/**
	 * Set comment property
	 *
	 * Creates or updates the value of a property for a comment. Use this resource to store custom data against a comment.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** either of:   *  *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on any comment.  *  *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on a comment created by the user.  Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group.
	 *
	 */
	@PUT
	@Path("/{propertyKey}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object setCommentProperty(@PathParam("commentId") String commentId, @PathParam("propertyKey") String propertyKey, Object body) throws ApiException, ProcessingException;
}
