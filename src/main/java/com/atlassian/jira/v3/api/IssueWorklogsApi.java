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

import com.atlassian.jira.v3.model.ChangedWorklogs;
import com.atlassian.jira.v3.model.PageOfWorklogs;
import com.atlassian.jira.v3.model.Worklog;
import com.atlassian.jira.v3.model.WorklogIdsRequestBean;
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
@Path("/rest/api/3")
public interface IssueWorklogsApi {

	/**
	 * Add worklog
	 *
	 * Adds a worklog to an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Work on issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
	 *
	 */
	@POST
	@Path("/issue/{issueIdOrKey}/worklog")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Worklog addWorklog(@PathParam("issueIdOrKey") String issueIdOrKey, Worklog worklog, @QueryParam("notifyUsers") @DefaultValue("true") Boolean notifyUsers, @QueryParam("adjustEstimate") @DefaultValue("auto") String adjustEstimate, @QueryParam("newEstimate") String newEstimate, @QueryParam("reduceBy") String reduceBy, @QueryParam("expand") @DefaultValue("") String expand, @QueryParam("overrideEditableFlag") @DefaultValue("false") Boolean overrideEditableFlag) throws ApiException, ProcessingException;

	/**
	 * Delete worklog
	 *
	 * Deletes a worklog from an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to delete any worklog or *Delete own worklogs* to delete worklogs created by the user,  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
	 *
	 */
	@DELETE
	@Path("/issue/{issueIdOrKey}/worklog/{id}")
	void deleteWorklog(@PathParam("issueIdOrKey") String issueIdOrKey, @PathParam("id") String id, @QueryParam("notifyUsers") @DefaultValue("true") Boolean notifyUsers, @QueryParam("adjustEstimate") @DefaultValue("auto") String adjustEstimate, @QueryParam("newEstimate") String newEstimate, @QueryParam("increaseBy") String increaseBy, @QueryParam("overrideEditableFlag") @DefaultValue("false") Boolean overrideEditableFlag) throws ApiException, ProcessingException;

	/**
	 * Get IDs of deleted worklogs
	 *
	 * Returns a list of IDs and delete timestamps for worklogs deleted after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs deleted during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/worklog/deleted")
	@Produces({"application/json"})
	ChangedWorklogs getIdsOfWorklogsDeletedSince(@QueryParam("since") @DefaultValue("0") Long since) throws ApiException, ProcessingException;

	/**
	 * Get IDs of updated worklogs
	 * <p>
	 * Returns a list of IDs and update timestamps for worklogs updated after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs updated during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.
	 *
	 */
	@GET
	@Path("/worklog/updated")
	@Produces({"application/json"})
	ChangedWorklogs getIdsOfWorklogsModifiedSince(@QueryParam("since") @DefaultValue("0") Long since, @QueryParam("expand") @DefaultValue("") String expand) throws ApiException, ProcessingException;

	/**
	 * Get issue worklogs
	 *
	 * Returns worklogs for an issue, starting from the oldest worklog or from the worklog started on or after a date and time.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Workloads are only returned where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
	 *
	 */
	@GET
	@Path("/issue/{issueIdOrKey}/worklog")
	@Produces({"application/json"})
	PageOfWorklogs getIssueWorklog(@PathParam("issueIdOrKey") String issueIdOrKey, @QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("5000") Integer maxResults, @QueryParam("startedAfter") Long startedAfter, @QueryParam("startedBefore") Long startedBefore, @QueryParam("expand") @DefaultValue("") String expand) throws ApiException, ProcessingException;

	/**
	 * Get worklog
	 *
	 * Returns a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
	 *
	 */
	@GET
	@Path("/issue/{issueIdOrKey}/worklog/{id}")
	@Produces({"application/json"})
	Worklog getWorklog(@PathParam("issueIdOrKey") String issueIdOrKey, @PathParam("id") String id, @QueryParam("expand") @DefaultValue("") String expand) throws ApiException, ProcessingException;

	/**
	 * Get worklogs
	 * <p>
	 * Returns worklog details for a list of worklog IDs.  The returned list of worklogs is limited to 1000 items.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.
	 *
	 */
	@POST
	@Path("/worklog/list")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	List<Worklog> getWorklogsForIds(WorklogIdsRequestBean worklogIdsRequestBean, @QueryParam("expand") @DefaultValue("") String expand) throws ApiException, ProcessingException;

	/**
	 * Update worklog
	 *
	 * Updates a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
	 *
	 */
	@PUT
	@Path("/issue/{issueIdOrKey}/worklog/{id}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	Worklog updateWorklog(@PathParam("issueIdOrKey") String issueIdOrKey, @PathParam("id") String id, Worklog worklog, @QueryParam("notifyUsers") @DefaultValue("true") Boolean notifyUsers, @QueryParam("adjustEstimate") @DefaultValue("auto") String adjustEstimate, @QueryParam("newEstimate") String newEstimate, @QueryParam("expand") @DefaultValue("") String expand, @QueryParam("overrideEditableFlag") @DefaultValue("false") Boolean overrideEditableFlag) throws ApiException, ProcessingException;
}
