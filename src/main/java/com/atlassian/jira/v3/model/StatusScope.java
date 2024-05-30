package com.atlassian.jira.v3.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The scope of the status.
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class StatusScope {
	private ProjectId project;
	/**
	 * The scope of the status. `GLOBAL` for company-managed projects and `PROJECT` for team-managed projects.
	 */
	private TypeEnum type;

	public enum TypeEnum {
		PROJECT("PROJECT"), GLOBAL("GLOBAL");


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
