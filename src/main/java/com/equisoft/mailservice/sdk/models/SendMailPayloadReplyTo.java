package com.equisoft.mailservice.sdk.models;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class SendMailPayloadReplyTo {

	public static final java.lang.String JSON_PROPERTY_EMAIL = "email";
	public static final java.lang.String JSON_PROPERTY_NAME = "name";

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_EMAIL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String email;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NAME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.lang.String name;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		SendMailPayloadReplyTo other = (SendMailPayloadReplyTo) object;
		return java.util.Objects.equals(email, other.email)
				&& java.util.Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(email, name);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("SendMailPayloadReplyTo[")
				.append("email=").append(email).append(",")
				.append("name=").append(name)
				.append("]")
				.toString();
	}

	// fluent

	public SendMailPayloadReplyTo email(java.lang.String newEmail) {
		this.email = newEmail;
		return this;
	}

	public SendMailPayloadReplyTo name(@io.micronaut.core.annotation.Nullable java.lang.String newName) {
		this.name = newName;
		return this;
	}

	// getter/setter

	public java.lang.String getEmail() {
		return email;
	}

	public void setEmail(java.lang.String newEmail) {
		this.email = newEmail;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String getName() {
		return name;
	}

	public void setName(@io.micronaut.core.annotation.Nullable java.lang.String newName) {
		this.name = newName;
	}
}
