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

import java.util.ArrayList;
import java.util.List;

/**
 * Details about a notification scheme.
 **/

public class NotificationScheme {

	/**
	 * The description of the notification scheme.
	 **/

	private String description;

	/**
	 * Expand options that include additional notification scheme details in the response.
	 **/

	private String expand;

	/**
	 * The ID of the notification scheme.
	 **/

	private Long id;

	/**
	 * The name of the notification scheme.
	 **/

	private String name;

	/**
	 * The notification events and associated recipients.
	 **/

	private List<NotificationSchemeEvent> notificationSchemeEvents = null;

	/**
	 * The list of project IDs associated with the notification scheme.
	 **/

	private List<Long> projects = null;


	private Scope scope;


	private String self;

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
	 * The description of the notification scheme.
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

	public NotificationScheme description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Expand options that include additional notification scheme details in the response.
	 * @return expand
	 **/
	public String getExpand() {
		return expand;
	}

	/**
	 * Set expand
	 **/
	public void setExpand(String expand) {
		this.expand = expand;
	}

	public NotificationScheme expand(String expand) {
		this.expand = expand;
		return this;
	}

	/**
	 * The ID of the notification scheme.
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

	public NotificationScheme id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The name of the notification scheme.
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

	public NotificationScheme name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The notification events and associated recipients.
	 * @return notificationSchemeEvents
	 **/
	public List<NotificationSchemeEvent> getNotificationSchemeEvents() {
		return notificationSchemeEvents;
	}

	/**
	 * Set notificationSchemeEvents
	 **/
	public void setNotificationSchemeEvents(List<NotificationSchemeEvent> notificationSchemeEvents) {
		this.notificationSchemeEvents = notificationSchemeEvents;
	}

	public NotificationScheme notificationSchemeEvents(List<NotificationSchemeEvent> notificationSchemeEvents) {
		this.notificationSchemeEvents = notificationSchemeEvents;
		return this;
	}

	public NotificationScheme addNotificationSchemeEventsItem(NotificationSchemeEvent notificationSchemeEventsItem) {
		if (this.notificationSchemeEvents == null) {
			this.notificationSchemeEvents = new ArrayList<>();
		}
		this.notificationSchemeEvents.add(notificationSchemeEventsItem);
		return this;
	}

	/**
	 * The list of project IDs associated with the notification scheme.
	 * @return projects
	 **/
	public List<Long> getProjects() {
		return projects;
	}

	/**
	 * Set projects
	 **/
	public void setProjects(List<Long> projects) {
		this.projects = projects;
	}

	public NotificationScheme projects(List<Long> projects) {
		this.projects = projects;
		return this;
	}

	public NotificationScheme addProjectsItem(Long projectsItem) {
		if (this.projects == null) {
			this.projects = new ArrayList<>();
		}
		this.projects.add(projectsItem);
		return this;
	}

	/**
	 * Get scope
	 * @return scope
	 **/
	public Scope getScope() {
		return scope;
	}

	/**
	 * Set scope
	 **/
	public void setScope(Scope scope) {
		this.scope = scope;
	}

	public NotificationScheme scope(Scope scope) {
		this.scope = scope;
		return this;
	}

	/**
	 * Get self
	 * @return self
	 **/
	public String getSelf() {
		return self;
	}

	/**
	 * Set self
	 **/
	public void setSelf(String self) {
		this.self = self;
	}

	public NotificationScheme self(String self) {
		this.self = self;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class NotificationScheme {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    expand: " + toIndentedString(expand) + "\n" +
			"    id: " + toIndentedString(id) + "\n" +
			"    name: " + toIndentedString(name) + "\n" +
			"    notificationSchemeEvents: " + toIndentedString(notificationSchemeEvents) + "\n" +
			"    projects: " + toIndentedString(projects) + "\n" +
			"    scope: " + toIndentedString(scope) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"}";
		return sb;
	}
}
