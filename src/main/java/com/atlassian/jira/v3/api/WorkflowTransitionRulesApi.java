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

import com.atlassian.jira.v3.model.PageBeanWorkflowTransitionRules;
import com.atlassian.jira.v3.model.WorkflowTransitionRulesUpdate;
import com.atlassian.jira.v3.model.WorkflowTransitionRulesUpdateErrors;
import com.atlassian.jira.v3.model.WorkflowsWithTransitionRulesDetails;
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
@Path("/rest/api/3/workflow/rule/config")
public interface WorkflowTransitionRulesApi {

	/**
	 * Delete workflow transition rule configurations
	 *
	 * Deletes workflow transition rules from one or more workflows. These rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling Connect app can be deleted.  **[Permissions](#permissions) required:** Only Connect apps can use this operation.
	 *
	 */
	@PUT
	@Path("/delete")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	WorkflowTransitionRulesUpdateErrors deleteWorkflowTransitionRuleConfigurations(WorkflowsWithTransitionRulesDetails workflowsWithTransitionRulesDetails) throws ApiException, ProcessingException;

	/**
	 * Get workflow transition rule configurations
	 *
	 * Returns a [paginated](#pagination) list of workflows with transition rules. The workflows can be filtered to return only those containing workflow transition rules:   *  of one or more transition rule types, such as [workflow post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/).  *  matching one or more transition rule keys.  Only workflows containing transition rules created by the calling [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) app are returned.  Due to server-side optimizations, workflows with an empty list of rules may be returned; these workflows can be ignored.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) apps can use this operation.
	 *
	 */
	@GET

	@Produces({"application/json"})
	PageBeanWorkflowTransitionRules getWorkflowTransitionRuleConfigurations(@QueryParam("types") Set<String> types, @QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("10") Integer maxResults, @QueryParam("keys") Set<String> keys, @QueryParam("workflowNames") Set<String> workflowNames, @QueryParam("withTags") Set<String> withTags, @QueryParam("draft") Boolean draft, @QueryParam("expand") String expand) throws ApiException, ProcessingException;

	/**
	 * Update workflow transition rule configurations
	 *
	 * Updates configuration of workflow transition rules. The following rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) app can be updated.  To assist with app migration, this operation can be used to:   *  Disable a rule.  *  Add a &#x60;tag&#x60;. Use this to filter rules in the [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).  Rules are enabled if the &#x60;disabled&#x60; parameter is not provided.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) apps can use this operation.
	 *
	 */
	@PUT

	@Consumes({"application/json"})
	@Produces({"application/json"})
	WorkflowTransitionRulesUpdateErrors updateWorkflowTransitionRuleConfigurations(WorkflowTransitionRulesUpdate workflowTransitionRulesUpdate) throws ApiException, ProcessingException;
}
