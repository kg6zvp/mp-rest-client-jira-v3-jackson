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

import com.atlassian.jira.v3.model.License;
import com.atlassian.jira.v3.model.LicenseMetric;
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
@Path("/rest/api/3")
public interface LicenseMetricsApi {

	/**
	 * Get approximate application license count
	 *
	 * Returns the total approximate number of user accounts for a single Jira license. Note that this information is cached with a 7-day lifecycle and could be stale at the time of call.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/license/approximateLicenseCount/product/{applicationKey}")
	@Produces({"application/json"})
	LicenseMetric getApproximateApplicationLicenseCount(@PathParam("applicationKey") String applicationKey) throws ApiException, ProcessingException;

	/**
	 * Get approximate license count
	 *
	 * Returns the approximate number of user accounts across all Jira licenses. Note that this information is cached with a 7-day lifecycle and could be stale at the time of call.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
	 *
	 */
	@GET
	@Path("/license/approximateLicenseCount")
	@Produces({"application/json"})
	LicenseMetric getApproximateLicenseCount() throws ApiException, ProcessingException;

	/**
	 * Get license
	 * <p>
	 * Returns licensing information about the Jira instance.  **[Permissions](#permissions) required:** None.
	 *
	 */
	@GET
	@Path("/instance/license")
	@Produces({"application/json"})
	License getLicense() throws ApiException, ProcessingException;
}
