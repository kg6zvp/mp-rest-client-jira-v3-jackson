package com.atlassian.jira.v3.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

/**
 * Details of a remote issue link.
 */
public class RemoteIssueLinkRequest extends HashMap<String, Object> {


	private Application application;

	/**
	 * An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: `appId=456&pageId=123`.  Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record's Jira ID.  The maximum length is 255 characters.
	 */
	private String globalId;

	@JsonProperty("object")
	private RemoteObject _object;

	/**
	 * Description of the relationship between the issue and the linked item. If not set, the relationship description \"links to\" is used in Jira.
	 */
	private String relationship;

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

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public RemoteIssueLinkRequest application(Application application) {
		this.application = application;
		return this;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public RemoteIssueLinkRequest globalId(String globalId) {
		this.globalId = globalId;
		return this;
	}

	public RemoteObject getObject() {
		return _object;
	}

	public void setObject(RemoteObject _object) {
		this._object = _object;
	}

	public RemoteIssueLinkRequest _object(RemoteObject _object) {
		this._object = _object;
		return this;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public RemoteIssueLinkRequest relationship(String relationship) {
		this.relationship = relationship;
		return this;
	}

	@Override
	public String toString() {
		String sb = "class RemoteIssueLinkRequest {\n" +
			"    " + toIndentedString(super.toString()) + "\n" +
			"    application: " + toIndentedString(application) + "\n" +
			"    globalId: " + toIndentedString(globalId) + "\n" +
			"    _object: " + toIndentedString(_object) + "\n" +
			"    relationship: " + toIndentedString(relationship) + "\n" +
			"}";
		return sb;
	}
}
