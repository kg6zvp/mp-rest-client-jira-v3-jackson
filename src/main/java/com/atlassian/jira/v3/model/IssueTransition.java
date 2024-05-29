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

import java.util.HashMap;
import java.util.Map;

/**
 * Details of an issue transition.
 **/

public class IssueTransition extends HashMap<String, Object> {

	/**
	 * Expand options that include additional transition details in the response.
	 **/

	private String expand;

	/**
	 * Details of the fields associated with the issue transition screen. Use this information to populate `fields` and `update` in a transition request.
	 **/

	private Map<String, FieldMetadata> fields = null;

	/**
	 * Whether there is a screen associated with the issue transition.
	 **/

	private Boolean hasScreen;

	/**
	 * The ID of the issue transition. Required when specifying a transition to undertake.
	 **/

	private String id;

	/**
	 * Whether the transition is available to be performed.
	 **/

	private Boolean isAvailable;

	/**
	 * Whether the issue has to meet criteria before the issue transition is applied.
	 **/

	private Boolean isConditional;

	/**
	 * Whether the issue transition is global, that is, the transition is applied to issues regardless of their status.
	 **/

	private Boolean isGlobal;

	/**
	 * Whether this is the initial issue transition for the workflow.
	 **/

	private Boolean isInitial;


	private Boolean looped;

	/**
	 * The name of the issue transition.
	 **/

	private String name;


	private IssueTransitionTo to;

	public IssueTransition() {
	}


	public IssueTransition(
		String expand,
		Map<String, FieldMetadata> fields,
		Boolean hasScreen,
		Boolean isAvailable,
		Boolean isConditional,
		Boolean isGlobal,
		Boolean isInitial,
		String name
	) {
		this.expand = expand;
		this.fields = fields;
		this.hasScreen = hasScreen;
		this.isAvailable = isAvailable;
		this.isConditional = isConditional;
		this.isGlobal = isGlobal;
		this.isInitial = isInitial;
		this.name = name;
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private static String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	/**
	 * Expand options that include additional transition details in the response.
	 * @return expand
	 **/
	public String getExpand() {
		return expand;
	}

	/**
	 * Details of the fields associated with the issue transition screen. Use this information to populate &#x60;fields&#x60; and &#x60;update&#x60; in a transition request.
	 * @return fields
	 **/
	public Map<String, FieldMetadata> getFields() {
		return fields;
	}

	/**
	 * Whether there is a screen associated with the issue transition.
	 * @return hasScreen
	 **/
	public Boolean getHasScreen() {
		return hasScreen;
	}

	/**
	 * The ID of the issue transition. Required when specifying a transition to undertake.
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	/**
	 * Set id
	 **/
	public void setId(String id) {
		this.id = id;
	}

	public IssueTransition id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Whether the transition is available to be performed.
	 * @return isAvailable
	 **/
	public Boolean getIsAvailable() {
		return isAvailable;
	}

	/**
	 * Whether the issue has to meet criteria before the issue transition is applied.
	 * @return isConditional
	 **/
	public Boolean getIsConditional() {
		return isConditional;
	}

	/**
	 * Whether the issue transition is global, that is, the transition is applied to issues regardless of their status.
	 * @return isGlobal
	 **/
	public Boolean getIsGlobal() {
		return isGlobal;
	}

	/**
	 * Whether this is the initial issue transition for the workflow.
	 * @return isInitial
	 **/
	public Boolean getIsInitial() {
		return isInitial;
	}

	/**
	 * Get looped
	 * @return looped
	 **/
	public Boolean getLooped() {
		return looped;
	}

	/**
	 * Set looped
	 **/
	public void setLooped(Boolean looped) {
		this.looped = looped;
	}

	public IssueTransition looped(Boolean looped) {
		this.looped = looped;
		return this;
	}

	/**
	 * The name of the issue transition.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * Get to
	 * @return to
	 **/
	public IssueTransitionTo getTo() {
		return to;
	}

	/**
	 * Set to
	 **/
	public void setTo(IssueTransitionTo to) {
		this.to = to;
	}

	public IssueTransition to(IssueTransitionTo to) {
		this.to = to;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class IssueTransition {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    expand: " + toIndentedString(expand) + "\n" +
			"    fields: " + toIndentedString(fields) + "\n" +
			"    hasScreen: " + toIndentedString(hasScreen) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    isAvailable: " + toIndentedString(isAvailable) + "\n" +
			"    isConditional: " + toIndentedString(isConditional) + "\n" +
			"    isGlobal: " + toIndentedString(isGlobal) + "\n" +
			"    isInitial: " + toIndentedString(isInitial) + "\n" +
			"    looped: " + toIndentedString(looped) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    to: " + toIndentedString(to) + "\n" +
			"}";
		return sb;
	}
}