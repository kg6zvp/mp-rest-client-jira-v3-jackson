package com.atlassian.jira.v3.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.*;

import java.util.List;

/**
 * see <a href="https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/">Atlassian Document Format docs</a>
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class AtlassianDocumentFormat {
	ADFContentType type;
	Integer version;

	List<AtlassianDocumentFormat> content;

	String text;

	ADFAttrs attrs;

	/**
	 * modifiers, usually of text
	 */
	List<ADFContentMark> marks;

	public String toString() {
		return this.toPlainText();
	}
	public String toPlainText() {
		return this.toPlainText(0);
	}

	protected String toPlainText(int indentLevel) {
		switch (this.type) {
			case DOC:
			case LIST_ITEM:
				StringBuilder docSb = new StringBuilder();
				if (this.content != null) {
					this.content.stream()
						.map((AtlassianDocumentFormat content) -> content.toPlainText(indentLevel))
						.forEach(docSb::append);
				}
				return docSb.toString();
			case PARAGRAPH:
				StringBuilder paragraphSb = new StringBuilder();
				if (this.content != null) {
					this.content.stream()
						.map(AtlassianDocumentFormat::toPlainText)
						.forEach(paragraphSb::append);
				}
				return paragraphSb
					.append("\n")
					.toString();
			case TEXT:
				return this.getText();
			case HARD_BREAK:
				return "\n";
			case ORDERED_LIST:
				int startAt = 1;
				if (this.getAttrs() != null && this.getAttrs().getOrder() != null) {
					startAt = this.getAttrs().getOrder();
				}
				StringBuilder orderedListSb = new StringBuilder();
				if (this.content != null) {
					for (int i = 0 ; i < this.content.size(); ++i) {
						orderedListSb.append(String.format("%s%d. %s", getIndent(indentLevel+1), startAt + i, this.content.get(i).toPlainText(indentLevel+1)));
					}
				}
				return orderedListSb.toString();
			case BULLETED_LIST:
				StringBuilder bulletedListSb = new StringBuilder();
				if (this.content != null) {
					for (int i = 0 ; i < this.content.size(); ++i) {
						bulletedListSb.append(String.format("%s* %s", getIndent(indentLevel+1), this.content.get(i).toPlainText(indentLevel+1)));
					}
				}
				return bulletedListSb.toString();
			case INLINE_CARD:
				if (this.getAttrs() == null || this.getAttrs().getUrl() == null) return "Error decoding inline card: " + this.getAttrs() != null ? this.getAttrs().toString() : "null";
				return String.format("%s", this.getAttrs().getUrl().toString());
		}
		throw new UnsupportedOperationException("TODO");
	}

	private final String ADF_INDENT = "\t";

	protected String getIndent(int indentLevel) {
		StringBuilder indentSb = new StringBuilder();
		for (int i = 0; i < indentLevel; ++i) {
			indentSb.append(ADF_INDENT);
		}
		return indentSb.toString();
	}

	public enum ADFContentType {
		DOC("doc"),
		PARAGRAPH("paragraph"),
		TEXT("text"),
		HARD_BREAK("hardBreak"),
		ORDERED_LIST("orderedList"),
			LIST_ITEM("listItem"),
		BULLETED_LIST("bulletList"),
		/**
		 * fancy link display for Jira issues
		 */
		INLINE_CARD("inlineCard");

		@Getter(onMethod_ = @JsonValue)
		private final String json;

		ADFContentType(String json) {
			this.json = json;
		}
	}

}
