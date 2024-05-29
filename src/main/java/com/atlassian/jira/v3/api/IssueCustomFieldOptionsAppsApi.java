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

import com.atlassian.jira.v3.model.IssueFieldOption;
import com.atlassian.jira.v3.model.IssueFieldOptionCreateBean;
import com.atlassian.jira.v3.model.PageBeanIssueFieldOption;
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
@Path("/rest/api/3/field/{fieldKey}/option")
public interface IssueCustomFieldOptionsAppsApi {

	/**
	 * Create issue field option
	 *
	 * Creates an option for a select list issue field.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  Each field can have a maximum of 10000 options, and each option can have a maximum of 10000 scopes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
	 *
	 */
	@POST

	@Consumes({"application/json"})
	@Produces({"application/json"})
	IssueFieldOption createIssueFieldOption(@PathParam("fieldKey") String fieldKey, IssueFieldOptionCreateBean issueFieldOptionCreateBean) throws ApiException, ProcessingException;

	/**
	 * Delete issue field option
	 *
	 * Deletes an option from a select list issue field.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
	 *
	 */
	@DELETE
	@Path("/{optionId}")
	@Produces({"application/json"})
	Object deleteIssueFieldOption(@PathParam("fieldKey") String fieldKey, @PathParam("optionId") Long optionId) throws ApiException, ProcessingException;

	/**
	 * Get all issue field options
	 *
	 * Returns a [paginated](#pagination) list of all the options of a select list issue field. A select list issue field is a type of [issue field](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field/) that enables a user to select a value from a list of options.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
	 *
	 */
	@GET

	@Produces({"application/json"})
	PageBeanIssueFieldOption getAllIssueFieldOptions(@PathParam("fieldKey") String fieldKey, @QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("50") Integer maxResults) throws ApiException, ProcessingException;

	/**
	 * Get issue field option
	 *
	 * Returns an option from a select list issue field.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
	 *
	 */
	@GET
	@Path("/{optionId}")
	@Produces({"application/json"})
	IssueFieldOption getIssueFieldOption(@PathParam("fieldKey") String fieldKey, @PathParam("optionId") Long optionId) throws ApiException, ProcessingException;

	/**
	 * Get selectable issue field options
	 *
	 * Returns a [paginated](#pagination) list of options for a select list issue field that can be viewed and selected by the user.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/suggestions/edit")
	@Produces({"application/json"})
	PageBeanIssueFieldOption getSelectableIssueFieldOptions(@PathParam("fieldKey") String fieldKey, @QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("50") Integer maxResults, @QueryParam("projectId") Long projectId) throws ApiException, ProcessingException;

	/**
	 * Get visible issue field options
	 *
	 * Returns a [paginated](#pagination) list of options for a select list issue field that can be viewed by the user.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** Permission to access Jira.
	 *
	 */
	@GET
	@Path("/suggestions/search")
	@Produces({"application/json"})
	PageBeanIssueFieldOption getVisibleIssueFieldOptions(@PathParam("fieldKey") String fieldKey, @QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("50") Integer maxResults, @QueryParam("projectId") Long projectId) throws ApiException, ProcessingException;

	/**
	 * Replace issue field option
	 *
	 * Deselects an issue-field select-list option from all issues where it is selected. A different option can be selected to replace the deselected option. The update can also be limited to a smaller set of issues by using a JQL query.  Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can override the screen security configuration using &#x60;overrideScreenSecurity&#x60; and &#x60;overrideEditableFlag&#x60;.  This is an [asynchronous operation](#async). The response object contains a link to the long-running task.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
	 *
	 */
	@DELETE
	@Path("/{optionId}/issue")
	@Produces({"application/json"})
	void replaceIssueFieldOption(@PathParam("fieldKey") String fieldKey, @PathParam("optionId") Long optionId, @QueryParam("replaceWith") Long replaceWith, @QueryParam("jql") String jql, @QueryParam("overrideScreenSecurity") @DefaultValue("false") Boolean overrideScreenSecurity, @QueryParam("overrideEditableFlag") @DefaultValue("false") Boolean overrideEditableFlag) throws ApiException, ProcessingException;

	/**
	 * Update issue field option
	 *
	 * Updates or creates an option for a select list issue field. This operation requires that the option ID is provided when creating an option, therefore, the option ID needs to be specified as a path and body parameter. The option ID provided in the path and body must be identical.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
	 *
	 */
	@PUT
	@Path("/{optionId}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	IssueFieldOption updateIssueFieldOption(@PathParam("fieldKey") String fieldKey, @PathParam("optionId") Long optionId, IssueFieldOption issueFieldOption) throws ApiException, ProcessingException;
}
