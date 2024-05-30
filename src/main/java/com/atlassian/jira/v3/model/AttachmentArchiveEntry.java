package com.atlassian.jira.v3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class AttachmentArchiveEntry {
	private String abbreviatedName;
	private Long entryIndex;
	private String mediaType;
	private String name;
	private Long size;
}
