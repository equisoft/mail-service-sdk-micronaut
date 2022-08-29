package com.equisoft.mailservice.sdk.models;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class MessageBodySchema {

	public static final java.lang.String JSON_PROPERTY_TEXT = "text";
	public static final java.lang.String JSON_PROPERTY_HTML = "html";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TEXT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.lang.String text;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_HTML)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.lang.String html;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		MessageBodySchema other = (MessageBodySchema) object;
		return java.util.Objects.equals(text, other.text)
				&& java.util.Objects.equals(html, other.html);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(text, html);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("MessageBodySchema[")
				.append("text=").append(text).append(",")
				.append("html=").append(html)
				.append("]")
				.toString();
	}

	// fluent

	public MessageBodySchema text(@io.micronaut.core.annotation.Nullable java.lang.String newText) {
		this.text = newText;
		return this;
	}

	public MessageBodySchema html(@io.micronaut.core.annotation.Nullable java.lang.String newHtml) {
		this.html = newHtml;
		return this;
	}

	// getter/setter

	public @io.micronaut.core.annotation.Nullable java.lang.String getText() {
		return text;
	}

	public void setText(@io.micronaut.core.annotation.Nullable java.lang.String newText) {
		this.text = newText;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String getHtml() {
		return html;
	}

	public void setHtml(@io.micronaut.core.annotation.Nullable java.lang.String newHtml) {
		this.html = newHtml;
	}
}
