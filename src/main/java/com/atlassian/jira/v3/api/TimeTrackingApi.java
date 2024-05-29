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

import com.atlassian.jira.v3.model.TimeTrackingConfiguration;
import com.atlassian.jira.v3.model.TimeTrackingProvider;
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
@Path("/rest/api/3/configuration/timetracking")
public interface TimeTrackingApi {

	/**
	 * Get all time tracking providers
	 *
	 * Returns all time tracking providers. By default, Jira only has one time tracking provider: *JIRA provided time tracking*. However, you can install other time tracking providers via apps from the Atlassian Marketplace. For more information on time tracking providers, see the documentation for the [ Time Tracking Provider](https://developer.atlassian.com/cloud/jira/platform/modules/time-tracking-provider/) module.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/list")
	@Produces({"application/json"})
	List<TimeTrackingProvider> getAvailableTimeTrackingImplementations() throws ApiException, ProcessingException;

	/**
	 * Get selected time tracking provider
	 *
	 * Returns the time tracking provider that is currently selected. Note that if time tracking is disabled, then a successful but empty response is returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET

	@Produces({"application/json"})
	TimeTrackingProvider getSelectedTimeTrackingImplementation() throws ApiException, ProcessingException;

	/**
	 * Get time tracking settings
	 *
	 * Returns the time tracking settings. This includes settings such as the time format, default time unit, and others. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/options")
	@Produces({"application/json"})
	TimeTrackingConfiguration getSharedTimeTrackingConfiguration() throws ApiException, ProcessingException;

	/**
	 * Select time tracking provider
	 *
	 * Selects a time tracking provider.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT

	@Consumes({"application/json"})
	@Produces({"application/json"})
	Object selectTimeTrackingImplementation(TimeTrackingProvider timeTrackingProvider) throws ApiException, ProcessingException;

	/**
	 * Set time tracking settings
	 *
	 * Sets the time tracking settings.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@PUT
	@Path("/options")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	TimeTrackingConfiguration setSharedTimeTrackingConfiguration(TimeTrackingConfiguration timeTrackingConfiguration) throws ApiException, ProcessingException;
}