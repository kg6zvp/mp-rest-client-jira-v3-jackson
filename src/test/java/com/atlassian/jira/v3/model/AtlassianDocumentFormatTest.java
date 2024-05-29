package com.atlassian.jira.v3.model;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AtlassianDocumentFormatTest {
	@Test
	@SneakyThrows
	void shouldDecodeHelloWorldSample() {
		AtlassianDocumentFormat subject = AtlassianDocumentFormat.builder()
			.version(1)
			.type(AtlassianDocumentFormat.ADFContentType.DOC)
			.content(List.of(
				AtlassianDocumentFormat.builder()
					.type(AtlassianDocumentFormat.ADFContentType.TEXT)
					.text("Hello ")
					.build(),
				AtlassianDocumentFormat.builder()
					.type(AtlassianDocumentFormat.ADFContentType.TEXT)
					.text("world")
					.marks(List.of(
						ADFContentMark.builder()
							.type(ADFContentMark.ADFContentMarkType.BOLD)
							.build()
					))
					.build()
			))
			.build();

		assertEquals("Hello world", subject.toPlainText());
	}
}