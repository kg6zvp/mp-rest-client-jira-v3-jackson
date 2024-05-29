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

/**
 * The Jira Cloud platform REST API
 *
 * <p>Jira Cloud platform REST API documentation
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/rest/api/3/workflowscheme/{id}")
public interface WorkflowSchemeDraftsApi {

	/**
	 * Create draft workflow scheme
	 *
	 * Create a draft workflow scheme from an active workflow scheme, by copying the active workflow scheme. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST
	@Path("/createdraft")
	@Produces({"application/json"})
	WorkflowScheme createWorkflowSchemeDraftFromParent(@PathParam("id") Long id) throws ApiException, ProcessingException;

	/**
	 * Delete draft default workflow
	 *
	 * Resets the default workflow for a workflow scheme&#39;s draft. That is, the default workflow is set to Jira&#39;s system workflow (the *jira* workflow).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/draft/default")
	@Produces({"application/json"})
	WorkflowScheme deleteDraftDefaultWorkflow(@PathParam("id") Long id) throws ApiException, ProcessingException;

	/**
	 * Delete issue types for workflow in draft workflow scheme
	 *
	 * Deletes the workflow-issue type mapping for a workflow in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/draft/workflow")
	void deleteDraftWorkflowMapping(@PathParam("id") Long id, @QueryParam("workflowName") String workflowName) throws ApiException, ProcessingException;

	/**
	 * Delete draft workflow scheme
	 *
	 * Deletes a draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/draft")
	void deleteWorkflowSchemeDraft(@PathParam("id") Long id) throws ApiException, ProcessingException;

	/**
	 * Delete workflow for issue type in draft workflow scheme
	 *
	 * Deletes the issue type-workflow mapping for an issue type in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@DELETE
	@Path("/draft/issuetype/{issueType}")
	@Produces({"application/json"})
	WorkflowScheme deleteWorkflowSchemeDraftIssueType(@PathParam("id") Long id, @PathParam("issueType") String issueType) throws ApiException, ProcessingException;

	/**
	 * Get draft default workflow
	 *
	 * Returns the default workflow for a workflow scheme&#39;s draft. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/draft/default")
	@Produces({"application/json"})
	DefaultWorkflow getDraftDefaultWorkflow(@PathParam("id") Long id) throws ApiException, ProcessingException;

	/**
	 * Get issue types for workflows in draft workflow scheme
	 *
	 * Returns the workflow-issue type mappings for a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/draft/workflow")
	@Produces({"application/json"})
	IssueTypesWorkflowMapping getDraftWorkflow(@PathParam("id") Long id, @QueryParam("workflowName") String workflowName) throws ApiException, ProcessingException;

	/**
	 * Get draft workflow scheme
	 *
	 * Returns the draft workflow scheme for an active workflow scheme. Draft workflow schemes allow changes to be made to the active workflow schemes: When an active workflow scheme is updated, a draft copy is created. The draft is modified, then the changes in the draft are copied back to the active workflow scheme. See [Configuring workflow schemes](https://confluence.atlassian.com/x/tohKLg) for more information.   Note that:   *  Only active workflow schemes can have draft workflow schemes.  *  An active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/draft")
	@Produces({"application/json"})
	WorkflowScheme getWorkflowSchemeDraft(@PathParam("id") Long id) throws ApiException, ProcessingException;

	/**
	 * Get workflow for issue type in draft workflow scheme
	 *
	 * Returns the issue type-workflow mapping for an issue type in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/draft/issuetype/{issueType}")
	@Produces({"application/json"})
	IssueTypeWorkflowMapping getWorkflowSchemeDraftIssueType(@PathParam("id") Long id, @PathParam("issueType") String issueType) throws ApiException, ProcessingException;

	/**
	 * Publish draft workflow scheme
	 *
	 * Publishes a draft workflow scheme.  Where the draft workflow includes new workflow statuses for an issue type, mappings are provided to update issues with the original workflow status to the new workflow status.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@POST
	@Path("/draft/publish")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	void publishDraftWorkflowScheme(@PathParam("id") Long id, PublishDraftWorkflowScheme publishDraftWorkflowScheme, @QueryParam("validateOnly") @DefaultValue("false") Boolean validateOnly) throws ApiException, ProcessingException;

	/**
	 * Set workflow for issue type in draft workflow scheme
	 *
	 * Sets the workflow for an issue type in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/draft/issuetype/{issueType}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	WorkflowScheme setWorkflowSchemeDraftIssueType(@PathParam("id") Long id, @PathParam("issueType") String issueType, IssueTypeWorkflowMapping issueTypeWorkflowMapping) throws ApiException, ProcessingException;

	/**
	 * Update draft default workflow
	 *
	 * Sets the default workflow for a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/draft/default")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	WorkflowScheme updateDraftDefaultWorkflow(@PathParam("id") Long id, DefaultWorkflow defaultWorkflow) throws ApiException, ProcessingException;

	/**
	 * Set issue types for workflow in workflow scheme
	 *
	 * Sets the issue types for a workflow in a workflow scheme&#39;s draft. The workflow can also be set as the default workflow for the draft workflow scheme. Unmapped issues types are mapped to the default workflow.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/draft/workflow")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	WorkflowScheme updateDraftWorkflowMapping(@PathParam("id") Long id, @QueryParam("workflowName") String workflowName, IssueTypesWorkflowMapping issueTypesWorkflowMapping) throws ApiException, ProcessingException;

	/**
	 * Update draft workflow scheme
	 *
	 * Updates a draft workflow scheme. If a draft workflow scheme does not exist for the active workflow scheme, then a draft is created. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/draft")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	WorkflowScheme updateWorkflowSchemeDraft(@PathParam("id") Long id, WorkflowScheme workflowScheme) throws ApiException, ProcessingException;
}