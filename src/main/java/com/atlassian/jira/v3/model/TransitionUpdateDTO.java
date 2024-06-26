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

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The transitions of this workflow.
 **/

public class TransitionUpdateDTO extends HashMap<String, Object> {

	/**
	 * The post-functions of the transition.
	 **/

	private List<WorkflowRuleConfiguration> actions = null;


	private ConditionGroupUpdate conditions;

	/**
	 * The custom event ID of the transition.
	 **/

	private String customIssueEventId;

	/**
	 * The description of the transition.
	 **/

	private String description;

	/**
	 * The statuses the transition can start from.
	 **/

	private List<StatusReferenceAndPort> from = null;

	/**
	 * The ID of the transition.
	 **/

	private String id;

	/**
	 * The name of the transition.
	 **/

	private String name;

	/**
	 * The properties of the transition.
	 **/

	private Map<String, String> properties = null;


	private StatusReferenceAndPort to;


	private WorkflowRuleConfiguration transitionScreen;

	/**
	 * The triggers of the transition.
	 **/

	private List<WorkflowTrigger> triggers = null;
	/**
	 * The transition type.
	 **/

	private TypeEnum type;
	/**
	 * The validators of the transition.
	 **/

	private List<WorkflowRuleConfiguration> validators = null;

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
	 * The post-functions of the transition.
	 * @return actions
	 **/
	public List<WorkflowRuleConfiguration> getActions() {
		return actions;
	}

	/**
	 * Set actions
	 **/
	public void setActions(List<WorkflowRuleConfiguration> actions) {
		this.actions = actions;
	}

	public TransitionUpdateDTO actions(List<WorkflowRuleConfiguration> actions) {
		this.actions = actions;
		return this;
	}

	public TransitionUpdateDTO addActionsItem(WorkflowRuleConfiguration actionsItem) {
		if (this.actions == null) {
			this.actions = new ArrayList<>();
		}
		this.actions.add(actionsItem);
		return this;
	}

	/**
	 * Get conditions
	 * @return conditions
	 **/
	public ConditionGroupUpdate getConditions() {
		return conditions;
	}

	/**
	 * Set conditions
	 **/
	public void setConditions(ConditionGroupUpdate conditions) {
		this.conditions = conditions;
	}

	public TransitionUpdateDTO conditions(ConditionGroupUpdate conditions) {
		this.conditions = conditions;
		return this;
	}

	/**
	 * The custom event ID of the transition.
	 * @return customIssueEventId
	 **/
	public String getCustomIssueEventId() {
		return customIssueEventId;
	}

	/**
	 * Set customIssueEventId
	 **/
	public void setCustomIssueEventId(String customIssueEventId) {
		this.customIssueEventId = customIssueEventId;
	}

	public TransitionUpdateDTO customIssueEventId(String customIssueEventId) {
		this.customIssueEventId = customIssueEventId;
		return this;
	}

	/**
	 * The description of the transition.
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	/**
	 * Set description
	 **/
	public void setDescription(String description) {
		this.description = description;
	}

	public TransitionUpdateDTO description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The statuses the transition can start from.
	 * @return from
	 **/
	public List<StatusReferenceAndPort> getFrom() {
		return from;
	}

	/**
	 * Set from
	 **/
	public void setFrom(List<StatusReferenceAndPort> from) {
		this.from = from;
	}

	public TransitionUpdateDTO from(List<StatusReferenceAndPort> from) {
		this.from = from;
		return this;
	}

	public TransitionUpdateDTO addFromItem(StatusReferenceAndPort fromItem) {
		if (this.from == null) {
			this.from = new ArrayList<>();
		}
		this.from.add(fromItem);
		return this;
	}

	/**
	 * The ID of the transition.
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

	public TransitionUpdateDTO id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The name of the transition.
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * Set name
	 **/
	public void setName(String name) {
		this.name = name;
	}

	public TransitionUpdateDTO name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The properties of the transition.
	 * @return properties
	 **/
	public Map<String, String> getProperties() {
		return properties;
	}

	/**
	 * Set properties
	 **/
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public TransitionUpdateDTO properties(Map<String, String> properties) {
		this.properties = properties;
		return this;
	}

	public TransitionUpdateDTO putPropertiesItem(String key, String propertiesItem) {
		if (this.properties == null) {
			this.properties = new HashMap<>();
		}
		this.properties.put(key, propertiesItem);
		return this;
	}

	/**
	 * Get to
	 * @return to
	 **/
	public StatusReferenceAndPort getTo() {
		return to;
	}

	/**
	 * Set to
	 **/
	public void setTo(StatusReferenceAndPort to) {
		this.to = to;
	}

	public TransitionUpdateDTO to(StatusReferenceAndPort to) {
		this.to = to;
		return this;
	}

	/**
	 * Get transitionScreen
	 * @return transitionScreen
	 **/
	public WorkflowRuleConfiguration getTransitionScreen() {
		return transitionScreen;
	}

	/**
	 * Set transitionScreen
	 **/
	public void setTransitionScreen(WorkflowRuleConfiguration transitionScreen) {
		this.transitionScreen = transitionScreen;
	}

	public TransitionUpdateDTO transitionScreen(WorkflowRuleConfiguration transitionScreen) {
		this.transitionScreen = transitionScreen;
		return this;
	}

	/**
	 * The triggers of the transition.
	 * @return triggers
	 **/
	public List<WorkflowTrigger> getTriggers() {
		return triggers;
	}

	/**
	 * Set triggers
	 **/
	public void setTriggers(List<WorkflowTrigger> triggers) {
		this.triggers = triggers;
	}

	public TransitionUpdateDTO triggers(List<WorkflowTrigger> triggers) {
		this.triggers = triggers;
		return this;
	}

	public TransitionUpdateDTO addTriggersItem(WorkflowTrigger triggersItem) {
		if (this.triggers == null) {
			this.triggers = new ArrayList<>();
		}
		this.triggers.add(triggersItem);
		return this;
	}

	/**
	 * The transition type.
	 * @return type
	 **/
	public TypeEnum getType() {
		return type;
	}

	/**
	 * Set type
	 **/
	public void setType(TypeEnum type) {
		this.type = type;
	}

	public TransitionUpdateDTO type(TypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * The validators of the transition.
	 * @return validators
	 **/
	public List<WorkflowRuleConfiguration> getValidators() {
		return validators;
	}

	/**
	 * Set validators
	 **/
	public void setValidators(List<WorkflowRuleConfiguration> validators) {
		this.validators = validators;
	}

	public TransitionUpdateDTO validators(List<WorkflowRuleConfiguration> validators) {
		this.validators = validators;
		return this;
	}

	public TransitionUpdateDTO addValidatorsItem(WorkflowRuleConfiguration validatorsItem) {
		if (this.validators == null) {
			this.validators = new ArrayList<>();
		}
		this.validators.add(validatorsItem);
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {
		String sb = "class TransitionUpdateDTO {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    actions: " + toIndentedString(actions) + "\n" +
			"    conditions: " + toIndentedString(conditions) + "\n" +
			"    customIssueEventId: " + toIndentedString(customIssueEventId) + "\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    from: " + toIndentedString(from) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    properties: " + toIndentedString(properties) + "\n" +
			"    to: " + toIndentedString(to) + "\n" +
			"    transitionScreen: " + toIndentedString(transitionScreen) + "\n" +
			"    triggers: " + toIndentedString(triggers) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"    validators: " + toIndentedString(validators) + "\n" +
			"}";
		return sb;
	}

	public enum TypeEnum {

		INITIAL("INITIAL"), GLOBAL("GLOBAL"), DIRECTED("DIRECTED");


		String value;

		TypeEnum(String v) {
			value = v;
		}

		@JsonValue
		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}
	}
}
