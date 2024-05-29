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

import com.atlassian.jira.v3.model.PageBeanString;
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
@Path("/rest/api/3/label")
public interface LabelsApi {

	/**
	 * Get all labels
	 *
	 * Returns a [paginated](#pagination) list of labels.
	 *
	 */
	@GET

	@Produces({"application/json"})
	PageBeanString getAllLabels(@QueryParam("startAt") @DefaultValue("0") Long startAt, @QueryParam("maxResults") @DefaultValue("1000") Integer maxResults) throws ApiException, ProcessingException;
}
