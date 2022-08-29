package com.equisoft.mailservice.sdk.models;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class MessageSchema {

	public static final java.lang.String JSON_PROPERTY_SUBJECT = "subject";
	public static final java.lang.String JSON_PROPERTY_BODY = "body";

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_SUBJECT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String subject;

	@javax.validation.Valid
	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_BODY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private MessageBodySchema body;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		MessageSchema other = (MessageSchema) object;
		return java.util.Objects.equals(subject, other.subject)
				&& java.util.Objects.equals(body, other.body);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(subject, body);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("MessageSchema[")
				.append("subject=").append(subject).append(",")
				.append("body=").append(body)
				.append("]")
				.toString();
	}

	// fluent

	public MessageSchema subject(java.lang.String newSubject) {
		this.subject = newSubject;
		return this;
	}

	public MessageSchema body(MessageBodySchema newBody) {
		this.body = newBody;
		return this;
	}

	// getter/setter

	public java.lang.String getSubject() {
		return subject;
	}

	public void setSubject(java.lang.String newSubject) {
		this.subject = newSubject;
	}

	public MessageBodySchema getBody() {
		return body;
	}

	public void setBody(MessageBodySchema newBody) {
		this.body = newBody;
	}
}
