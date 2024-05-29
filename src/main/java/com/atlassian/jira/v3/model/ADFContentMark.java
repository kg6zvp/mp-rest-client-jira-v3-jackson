package com.atlassian.jira.v3.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.*;

/**
 * modifier, usually of text
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ADFContentMark {
	private ADFContentMarkType type;

	public enum ADFContentMarkType {
		/**
		 * self-explanatory
		 */
		BOLD("strong"),
		/**
		 * Italic, referred to as "em"
		 */
		ITALIC("em");

		@Getter(onMethod_ = @JsonValue)
		private final String json;

		ADFContentMarkType(String json) {
			this.json = json;
		}
	}
}
