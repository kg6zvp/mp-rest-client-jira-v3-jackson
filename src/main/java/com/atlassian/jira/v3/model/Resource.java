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

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.File;
import java.net.URI;


public class Resource {


	private String description;

	@JsonProperty("file")
	private File _file;


	private String filename;


	private Object inputStream;


	private Boolean open;


	private Boolean readable;


	private URI uri;


	private String url;

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
	 * Get description
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

	public Resource description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get _file
	 * @return _file
	 **/
	public File getFile() {
		return _file;
	}

	/**
	 * Set _file
	 **/
	public void setFile(File _file) {
		this._file = _file;
	}

	public Resource _file(File _file) {
		this._file = _file;
		return this;
	}

	/**
	 * Get filename
	 * @return filename
	 **/
	public String getFilename() {
		return filename;
	}

	/**
	 * Set filename
	 **/
	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Resource filename(String filename) {
		this.filename = filename;
		return this;
	}

	/**
	 * Get inputStream
	 * @return inputStream
	 **/
	public Object getInputStream() {
		return inputStream;
	}

	/**
	 * Set inputStream
	 **/
	public void setInputStream(Object inputStream) {
		this.inputStream = inputStream;
	}

	public Resource inputStream(Object inputStream) {
		this.inputStream = inputStream;
		return this;
	}

	/**
	 * Get open
	 * @return open
	 **/
	public Boolean getOpen() {
		return open;
	}

	/**
	 * Set open
	 **/
	public void setOpen(Boolean open) {
		this.open = open;
	}

	public Resource open(Boolean open) {
		this.open = open;
		return this;
	}

	/**
	 * Get readable
	 * @return readable
	 **/
	public Boolean getReadable() {
		return readable;
	}

	/**
	 * Set readable
	 **/
	public void setReadable(Boolean readable) {
		this.readable = readable;
	}

	public Resource readable(Boolean readable) {
		this.readable = readable;
		return this;
	}

	/**
	 * Get uri
	 * @return uri
	 **/
	public URI getUri() {
		return uri;
	}

	/**
	 * Set uri
	 **/
	public void setUri(URI uri) {
		this.uri = uri;
	}

	public Resource uri(URI uri) {
		this.uri = uri;
		return this;
	}

	/**
	 * Get url
	 * @return url
	 **/
	public String getUrl() {
		return url;
	}

	/**
	 * Set url
	 **/
	public void setUrl(String url) {
		this.url = url;
	}

	public Resource url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class Resource {\n" +
			"    description: " + toIndentedString(description) + "\n" +
			"    _file: " + toIndentedString(_file) + "\n" +
			"    filename: " + toIndentedString(filename) + "\n" +
			"    inputStream: " + toIndentedString(inputStream) + "\n" +
			"    open: " + toIndentedString(open) + "\n" +
			"    readable: " + toIndentedString(readable) + "\n" +
			"    uri: " + toIndentedString(uri) + "\n" +
			"    url: " + toIndentedString(url) + "\n" +
			"}";
		return sb;
	}
}
