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

import javax.ws.rs.core.Response;

public class ApiException extends Exception {

	private static final long serialVersionUID = 1L;
	private Response response;

	public ApiException() {
		super();
	}

	public ApiException(Response response) {
		super("Api response has status code " + response.getStatus());
		this.response = response;
	}

	public Response getResponse() {
		return this.response;
	}
}
