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

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Details of a workflow transition.
 **/

public class Transition {

	/**
	 * The description of the transition.
	 **/

	private String description;

	/**
	 * The statuses the transition can start from.
	 **/

	private List<String> from = new ArrayList<>();

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

	private Map<String, Object> properties = null;


	private WorkflowRules rules;


	private TransitionScreenDetails screen;

	/**
	 * The status the transition goes to.
	 **/

	private String to;
	/**
	 * The type of the transition.
	 **/

	private TypeEnum type;

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

	public Transition description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The statuses the transition can start from.
	 * @return from
	 **/
	public List<String> getFrom() {
		return from;
	}

	/**
	 * Set from
	 **/
	public void setFrom(List<String> from) {
		this.from = from;
	}

	public Transition from(List<String> from) {
		this.from = from;
		return this;
	}

	public Transition addFromItem(String fromItem) {
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

	public Transition id(String id) {
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

	public Transition name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The properties of the transition.
	 * @return properties
	 **/
	public Map<String, Object> getProperties() {
		return properties;
	}

	/**
	 * Set properties
	 **/
	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}

	public Transition properties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}

	public Transition putPropertiesItem(String key, Object propertiesItem) {
		if (this.properties == null) {
			this.properties = new HashMap<>();
		}
		this.properties.put(key, propertiesItem);
		return this;
	}

	/**
	 * Get rules
	 * @return rules
	 **/
	public WorkflowRules getRules() {
		return rules;
	}

	/**
	 * Set rules
	 **/
	public void setRules(WorkflowRules rules) {
		this.rules = rules;
	}

	public Transition rules(WorkflowRules rules) {
		this.rules = rules;
		return this;
	}

	/**
	 * Get screen
	 * @return screen
	 **/
	public TransitionScreenDetails getScreen() {
		return screen;
	}

	/**
	 * Set screen
	 **/
	public void setScreen(TransitionScreenDetails screen) {
		this.screen = screen;
	}

	public Transition screen(TransitionScreenDetails screen) {
		this.screen = screen;
		return this;
	}

	/**
	 * The status the transition goes to.
	 * @return to
	 **/
	public String getTo() {
		return to;
	}

	/**
	 * Set to
	 **/
	public void setTo(String to) {
		this.to = to;
	}

	public Transition to(String to) {
		this.to = to;
		return this;
	}

	/**
	 * The type of the transition.
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

	public Transition type(TypeEnum type) {
		this.type = type;
		return this;
	}


	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class Transition {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    from: " + toIndentedString(from) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    properties: " + toIndentedString(properties) + "\n" +
			"    rules: " + toIndentedString(rules) + "\n" +
			"    screen: " + toIndentedString(screen) + "\n" +
			"    to: " + toIndentedString(to) + "\n" +
			"    type: " + toIndentedString(type) + "\n" +
			"}";
		return sb;
	}

	public enum TypeEnum {

		GLOBAL("global"), INITIAL("initial"), DIRECTED("directed");


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
