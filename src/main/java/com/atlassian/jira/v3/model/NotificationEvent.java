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

/**
 * Details about a notification event.
 **/

public class NotificationEvent {

	/**
	 * The description of the event.
	 **/

	private String description;

	/**
	 * The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).
	 **/

	private Long id;

	/**
	 * The name of the event.
	 **/

	private String name;


	private NotificationEvent templateEvent;

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
	 * The description of the event.
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

	public NotificationEvent description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).
	 * @return id
	 **/
	public Long getId() {
		return id;
	}

	/**
	 * Set id
	 **/
	public void setId(Long id) {
		this.id = id;
	}

	public NotificationEvent id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The name of the event.
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

	public NotificationEvent name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get templateEvent
	 * @return templateEvent
	 **/
	public NotificationEvent getTemplateEvent() {
		return templateEvent;
	}

	/**
	 * Set templateEvent
	 **/
	public void setTemplateEvent(NotificationEvent templateEvent) {
		this.templateEvent = templateEvent;
	}

	public NotificationEvent templateEvent(NotificationEvent templateEvent) {
		this.templateEvent = templateEvent;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class NotificationEvent {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    templateEvent: " + toIndentedString(templateEvent) + "\n" +
			"}";
		return sb;
	}
}
