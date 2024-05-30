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

package com.atlassian.jira.v3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConnectModules {

	/**
	 * A list of app modules in the same format as the `modules` property in the [app descriptor](<a href="https://developer.atlassian.com/cloud/jira/platform/app-descriptor/">...</a>).
	 */
	@Builder.Default
	private List<Object> modules = new ArrayList<>();

	public ConnectModules modules(List<Object> modules) {
		this.modules = modules;
		return this;
	}

	public ConnectModules addModulesItem(Object modulesItem) {
		if (this.modules == null) {
			this.modules = new ArrayList<>();
		}
		this.modules.add(modulesItem);
		return this;
	}
}
