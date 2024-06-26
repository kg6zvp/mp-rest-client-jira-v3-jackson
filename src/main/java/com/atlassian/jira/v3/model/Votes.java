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

import java.net.URI;
import java.util.List;

/**
 * The details of votes on an issue.
 **/

public class Votes {

	/**
	 * Whether the user making this request has voted on the issue.
	 **/

	private Boolean hasVoted;

	/**
	 * The URL of these issue vote details.
	 **/

	private URI self;

	/**
	 * List of the users who have voted on this issue. An empty list is returned when the calling user doesn't have the *View voters and watchers* project permission.
	 **/

	private List<User> voters = null;

	/**
	 * The number of votes on the issue.
	 **/

	private Long votes;

	public Votes() {
	}


	public Votes(
		Boolean hasVoted,
		URI self,
		List<User> voters,
		Long votes
	) {
		this.hasVoted = hasVoted;
		this.self = self;
		this.voters = voters;
		this.votes = votes;
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
	 * Whether the user making this request has voted on the issue.
	 * @return hasVoted
	 **/
	public Boolean getHasVoted() {
		return hasVoted;
	}

	/**
	 * The URL of these issue vote details.
	 * @return self
	 **/
	public URI getSelf() {
		return self;
	}

	/**
	 * List of the users who have voted on this issue. An empty list is returned when the calling user doesn&#39;t have the *View voters and watchers* project permission.
	 * @return voters
	 **/
	public List<User> getVoters() {
		return voters;
	}

	/**
	 * The number of votes on the issue.
	 * @return votes
	 **/
	public Long getVotes() {
		return votes;
	}

	/**
	 * Create a string representation of this pojo.
	 **/
	@Override
	public String toString() {

		String sb = "class Votes {\n" +
			"    hasVoted: " + toIndentedString(hasVoted) + "\n" +
			"    self: " + toIndentedString(self) + "\n" +
			"    voters: " + toIndentedString(voters) + "\n" +
			"    votes: " + toIndentedString(votes) + "\n" +
			"}";
		return sb;
	}
}
