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

package com.atlassian.jira.v3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Details of the statuses being created and their scope.
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusCreateRequest {

	/**
	 * -- GETTER --
	 *  Get scope
	 *
	 *
	 * -- SETTER --
	 *  Set scope
	 @return scope
	 */
	private StatusScope scope;

	/**
	 * Details of the statuses being created.
	 *
	 * -- GETTER --
	 *  Details of the statuses being created.
	 *
	 *
	 * -- SETTER --
	 *  Set statuses
	 @return statuses
	 */
	private List<StatusCreate> statuses = new ArrayList<>();

	public StatusCreateRequest scope(StatusScope scope) {
		this.scope = scope;
		return this;
	}

	public StatusCreateRequest statuses(List<StatusCreate> statuses) {
		this.statuses = statuses;
		return this;
	}

	public StatusCreateRequest addStatusesItem(StatusCreate statusesItem) {
		if (this.statuses == null) {
			this.statuses = new ArrayList<>();
		}
		this.statuses.add(statusesItem);
		return this;
	}
}
