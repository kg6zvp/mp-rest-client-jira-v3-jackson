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

import com.atlassian.jira.v3.model.EntityProperty;
import com.atlassian.jira.v3.model.OperationMessage;
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
@Path("/rest")
public interface AppPropertiesApi {

	/**
	 * Delete app property
	 * <p>
	 * Deletes an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. Additionally, Forge apps can access Connect app properties (stored against the same &#x60;app.connect.key&#x60;).
	 *
	 */
	@DELETE
	@Path("/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}")
	@Produces({"application/json"})
	void addonPropertiesResourceDeleteAddonPropertyDelete(@PathParam("addonKey") String addonKey, @PathParam("propertyKey") String propertyKey) throws ApiException, ProcessingException;

	/**
	 * Get app properties
	 * <p>
	 * Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. Additionally, Forge apps can access Connect app properties (stored against the same &#x60;app.connect.key&#x60;).
	 *
	 */
	@GET
	@Path("/atlassian-connect/1/addons/{addonKey}/properties")
	@Produces({"application/json"})
	PropertyKeys addonPropertiesResourceGetAddonPropertiesGet(@PathParam("addonKey") String addonKey) throws ApiException, ProcessingException;

	/**
	 * Get app property
	 * <p>
	 * Returns the key and value of an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. Additionally, Forge apps can access Connect app properties (stored against the same &#x60;app.connect.key&#x60;).
	 *
	 */
	@GET
	@Path("/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}")
	@Produces({"application/json"})
	EntityProperty addonPropertiesResourceGetAddonPropertyGet(@PathParam("addonKey") String addonKey, @PathParam("propertyKey") String propertyKey) throws ApiException, ProcessingException;

	/**
	 * Set app property
	 *
	 * Sets the value of an app&#39;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. Additionally, Forge apps can access Connect app properties (stored against the same &#x60;app.connect.key&#x60;).
	 *
	 */
	@PUT
	@Path("/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	OperationMessage addonPropertiesResourcePutAddonPropertyPut(@PathParam("addonKey") String addonKey, @PathParam("propertyKey") String propertyKey, Object body) throws ApiException, ProcessingException;

	/**
	 * Delete app property (Forge)
	 * <p>
	 * Deletes a Forge app&#39;s property.  **[Permissions](#permissions) required:** Only Forge apps can make this request.
	 *
	 */
	@DELETE
	@Path("/forge/1/app/properties/{propertyKey}")
	@Produces({"application/json"})
	void deleteForgeAppProperty(@PathParam("propertyKey") String propertyKey) throws ApiException, ProcessingException;

	/**
	 * Set app property (Forge)
	 *
	 * Sets the value of a Forge app&#39;s property. These values can be retrieved in [Jira expressions](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/) through the &#x60;app&#x60; [context variable](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables).  For other use cases, use the [Storage API](https://developer.atlassian.com/platform/forge/runtime-reference/storage-api/).  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only Forge apps can make this request.
	 *
	 */
	@PUT
	@Path("/forge/1/app/properties/{propertyKey}")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	OperationMessage putForgeAppProperty(@PathParam("propertyKey") String propertyKey, Object body) throws ApiException, ProcessingException;
}
