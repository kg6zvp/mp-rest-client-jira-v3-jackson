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

import com.atlassian.jira.v3.model.*;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import java.util.Set;

/**
 * The Jira Cloud platform REST API
 *
 * <p>Jira Cloud platform REST API documentation
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/rest/api/3/notificationscheme")
public interface IssueNotificationSchemesApi {

	/**
	 * Add notifications to notification scheme
	 *
	 * Adds notifications to a notification scheme. You can add up to 1000 notifications per request.  *Deprecated: The notification type &#x60;EmailAddress&#x60; is no longer supported in Cloud. Refer to the [changelog](https://developer.atlassian.com/cloud/jira/platform/changelog/#CHANGE-1031) for more details.*  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{id}/notification")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object addNotifications(@PathParam("id") String id, AddNotificationsDetails addNotificationsDetails) throws ApiException, ProcessingException;

	/**
	 * Create notification scheme
	 *
	 * Creates a notification scheme with notifications. You can create up to 1000 notifications per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST

	@Consumes({"application/json"})
	@Produces({"application/json"})
	NotificationSchemeId createNotificationScheme(CreateNotificationSchemeDetails createNotificationSchemeDetails) throws ApiException, ProcessingException;

	/**
	 * Delete notification scheme
	 *
	 * Deletes a notification scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/{notificationSchemeId}")
	@Produces({"application/json"})
	Object deleteNotificationScheme(@PathParam("notificationSchemeId") String notificationSchemeId) throws ApiException, ProcessingException;

	/**
	 * Get notification scheme
	 *
	 * Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.  **[Permissions](#permissions) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with the notification scheme.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({"application/json"})
	NotificationScheme getNotificationScheme(@PathParam("id") Long id, @QueryParam("expand") String expand) throws ApiException, ProcessingException;

	/**
	 * Get projects using notification schemes paginated
	 * <p>
	 * Returns a [paginated](#pagination) mapping of project that have notification scheme assigned. You can provide either one or multiple notification scheme IDs or project IDs to filter by. If you don&#39;t provide any, this will return a list of all mappings. Note that only company-managed (classic) projects are supported. This is because team-managed projects don&#39;t have a concept of a default notification scheme. The mappings are ordered by projectId.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/project")
	@Produces({"application/json"})
	PageBeanNotificationSchemeAndProjectMappingJsonBean getNotificationSchemeToProjectMappings(@QueryParam("startAt") @DefaultValue("0") String startAt, @QueryParam("maxResults") @DefaultValue("50") String maxResults, @QueryParam("notificationSchemeId") Set<String> notificationSchemeId, @QueryParam("projectId") Set<String> projectId) throws ApiException, ProcessingException;

	/**
	 * Get notification schemes paginated
	 *
	 * Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by the display name.  *Note that you should allow for events without recipients to appear in responses.*  **[Permissions](#permissions) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with a notification scheme for it to be returned.
	 *
	 */
	@GET

	@Produces({"application/json"})
	PageBeanNotificationScheme getNotificationSchemes(@QueryParam("startAt") @DefaultValue("0") String startAt, @QueryParam("maxResults") @DefaultValue("50") String maxResults, @QueryParam("id") Set<String> id, @QueryParam("projectId") Set<String> projectId, @QueryParam("onlyDefault") @DefaultValue("false") Boolean onlyDefault, @QueryParam("expand") String expand) throws ApiException, ProcessingException;

	/**
	 * Remove notification from notification scheme
	 *
	 * Removes a notification from a notification scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/{notificationSchemeId}/notification/{notificationId}")
	@Produces({"application/json"})
	Object removeNotificationFromNotificationScheme(@PathParam("notificationSchemeId") String notificationSchemeId, @PathParam("notificationId") String notificationId) throws ApiException, ProcessingException;

	/**
	 * Update notification scheme
	 *
	 * Updates a notification scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/{id}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object updateNotificationScheme(@PathParam("id") String id, UpdateNotificationSchemeDetails updateNotificationSchemeDetails) throws ApiException, ProcessingException;
}
