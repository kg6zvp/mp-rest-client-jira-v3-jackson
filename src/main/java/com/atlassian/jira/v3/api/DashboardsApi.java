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
import java.util.List;

/**
 * The Jira Cloud platform REST API
 *
 * <p>Jira Cloud platform REST API documentation
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/rest/api/3/dashboard")
public interface DashboardsApi {

	/**
	 * Add gadget to dashboard
	 *
	 * Adds a gadget to a dashboard.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@POST
	@Path("/{dashboardId}/gadget")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	DashboardGadget addGadget(@PathParam("dashboardId") Long dashboardId, DashboardGadgetSettings dashboardGadgetSettings) throws ApiException, ProcessingException;

	/**
	 * Bulk edit dashboards
	 *
	 * Bulk edit dashboards. Maximum number of dashboards to be edited at the same time is 100.  **[Permissions](#permissions) required:** None  The dashboards to be updated must be owned by the user, or the user must be an administrator.
	 *
	 */
	@PUT
	@Path("/bulk/edit")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	BulkEditShareableEntityResponse bulkEditDashboards(BulkEditShareableEntityRequest bulkEditShareableEntityRequest) throws ApiException, ProcessingException;

	/**
	 * Copy dashboard
	 *
	 * Copies a dashboard. Any values provided in the &#x60;dashboard&#x60; parameter replace those in the copied dashboard.  **[Permissions](#permissions) required:** None  The dashboard to be copied must be owned by or shared with the user.
	 *
	 */
	@POST
	@Path("/{id}/copy")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Dashboard copyDashboard(@PathParam("id") String id, DashboardDetails dashboardDetails) throws ApiException, ProcessingException;

	/**
	 * Create dashboard
	 *
	 * Creates a dashboard.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@POST

	@Consumes({"application/json"})
	@Produces({"application/json"})
	Dashboard createDashboard(DashboardDetails dashboardDetails) throws ApiException, ProcessingException;

	/**
	 * Delete dashboard
	 *
	 * Deletes a dashboard.  **[Permissions](#permissions) required:** None  The dashboard to be deleted must be owned by the user.
	 *
	 */
	@DELETE
	@Path("/{id}")
	@Produces({"application/json"})
	void deleteDashboard(@PathParam("id") String id) throws ApiException, ProcessingException;

	/**
	 * Delete dashboard item property
	 *
	 * Deletes a dashboard item property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.
	 *
	 */
	@DELETE
	@Path("/{dashboardId}/items/{itemId}/properties/{propertyKey}")
	@Produces({"application/json"})
	Object deleteDashboardItemProperty(@PathParam("dashboardId") String dashboardId, @PathParam("itemId") String itemId, @PathParam("propertyKey") String propertyKey) throws ApiException, ProcessingException;

	/**
	 * Get available gadgets
	 *
	 * Gets a list of all available gadgets that can be added to all dashboards.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@GET
	@Path("/gadgets")
	@Produces({"application/json"})
	AvailableDashboardGadgetsResponse getAllAvailableDashboardGadgets() throws ApiException, ProcessingException;

	/**
	 * Get all dashboards
	 *
	 * Returns a list of dashboards owned by or shared with the user. The list may be filtered to include only favorite or owned dashboards.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@GET

	@Produces({"application/json"})
	PageOfDashboards getAllDashboards(@QueryParam("filter") String filter, @QueryParam("startAt") @DefaultValue("0") Integer startAt, @QueryParam("maxResults") @DefaultValue("20") Integer maxResults) throws ApiException, ProcessingException;

	/**
	 * Get gadgets
	 *
	 * Returns a list of dashboard gadgets on a dashboard.  This operation returns:   *  Gadgets from a list of IDs, when &#x60;id&#x60; is set.  *  Gadgets with a module key, when &#x60;moduleKey&#x60; is set.  *  Gadgets from a list of URIs, when &#x60;uri&#x60; is set.  *  All gadgets, when no other parameters are set.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@GET
	@Path("/{dashboardId}/gadget")
	@Produces({"application/json"})
	DashboardGadgetResponse getAllGadgets(@PathParam("dashboardId") Long dashboardId, @QueryParam("moduleKey") List<String> moduleKey, @QueryParam("uri") List<String> uri, @QueryParam("gadgetId") List<Long> gadgetId) throws ApiException, ProcessingException;

	/**
	 * Get dashboard
	 *
	 * Returns a dashboard.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.  However, to get a dashboard, the dashboard must be shared with the user or the user must own it. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces({"application/json"})
	Dashboard getDashboard(@PathParam("id") String id) throws ApiException, ProcessingException;

	/**
	 * Get dashboard item property
	 *
	 * Returns the key and value of a dashboard item property.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#39;s content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira\\\\u2019s anonymous access is permitted.
	 *
	 */
	@GET
	@Path("/{dashboardId}/items/{itemId}/properties/{propertyKey}")
	@Produces({"application/json"})
	EntityProperty getDashboardItemProperty(@PathParam("dashboardId") String dashboardId, @PathParam("itemId") String itemId, @PathParam("propertyKey") String propertyKey) throws ApiException, ProcessingException;

	/**
	 * Get dashboard item property keys
	 *
	 * Returns the keys of all properties for a dashboard item.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira\\\\u2019s anonymous access is permitted.
	 *
	 */
	@GET
	@Path("/{dashboardId}/items/{itemId}/properties")
	@Produces({"application/json"})
	PropertyKeys getDashboardItemPropertyKeys(@PathParam("dashboardId") String dashboardId, @PathParam("itemId") String itemId) throws ApiException, ProcessingException;

	/**
	 * Search for dashboards
	 *
	 * Returns a [paginated](#pagination) list of dashboards. This operation is similar to [Get dashboards](#api-rest-api-3-dashboard-get) except that the results can be refined to include dashboards that have specific attributes. For example, dashboards with a particular name. When multiple attributes are specified only filters matching all attributes are returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The following dashboards that match the query parameters are returned:   *  Dashboards owned by the user. Not returned for anonymous users.  *  Dashboards shared with a group that the user is a member of. Not returned for anonymous users.  *  Dashboards shared with a private project that the user can browse. Not returned for anonymous users.  *  Dashboards shared with a public project.  *  Dashboards shared with the public.
	 *
	 */
	@GET
	@Path("/search")
	@Produces({"application/json"})
	PageBeanDashboard getDashboardsPaginated(@QueryParam("dashboardName") String dashboardName, @QueryParam("accountId") String accountId, @QueryParam("owner") String owner, @QueryParam("groupname") String groupname, @QueryParam("groupId") String groupId, @QueryParam("projectId") Long projectId, @QueryParam("orderBy") @DefaultValue("name") String orderBy, @QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("50") Integer maxResults, @QueryParam("status") @DefaultValue("active") String status, @QueryParam("expand") String expand) throws ApiException, ProcessingException;

	/**
	 * Remove gadget from dashboard
	 *
	 * Removes a dashboard gadget from a dashboard.  When a gadget is removed from a dashboard, other gadgets in the same column are moved up to fill the emptied position.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@DELETE
	@Path("/{dashboardId}/gadget/{gadgetId}")
	@Produces({"application/json"})
	Object removeGadget(@PathParam("dashboardId") Long dashboardId, @PathParam("gadgetId") Long gadgetId) throws ApiException, ProcessingException;

	/**
	 * Set dashboard item property
	 *
	 * Sets the value of a dashboard item property. Use this resource in apps to store custom data against a dashboard item.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#39;s content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.
	 *
	 */
	@PUT
	@Path("/{dashboardId}/items/{itemId}/properties/{propertyKey}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object setDashboardItemProperty(@PathParam("dashboardId") String dashboardId, @PathParam("itemId") String itemId, @PathParam("propertyKey") String propertyKey, Object body) throws ApiException, ProcessingException;

	/**
	 * Update dashboard
	 *
	 * Updates a dashboard, replacing all the dashboard details with those provided.  **[Permissions](#permissions) required:** None  The dashboard to be updated must be owned by the user.
	 *
	 */
	@PUT
	@Path("/{id}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Dashboard updateDashboard(@PathParam("id") String id, DashboardDetails dashboardDetails) throws ApiException, ProcessingException;

	/**
	 * Update gadget on dashboard
	 *
	 * Changes the title, position, and color of the gadget on a dashboard.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@PUT
	@Path("/{dashboardId}/gadget/{gadgetId}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object updateGadget(@PathParam("dashboardId") Long dashboardId, @PathParam("gadgetId") Long gadgetId, DashboardGadgetUpdateRequest dashboardGadgetUpdateRequest) throws ApiException, ProcessingException;
}