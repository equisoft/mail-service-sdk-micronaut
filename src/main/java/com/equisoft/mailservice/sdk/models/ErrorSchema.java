package com.equisoft.mailservice.sdk.models;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class ErrorSchema {

	public static final java.lang.String JSON_PROPERTY_CODE = "code";
	public static final java.lang.String JSON_PROPERTY_MESSAGE = "message";

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_CODE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private ErrorCodes code;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MESSAGE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.lang.String message;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ErrorSchema other = (ErrorSchema) object;
		return java.util.Objects.equals(code, other.code)
				&& java.util.Objects.equals(message, other.message);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(code, message);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ErrorSchema[")
				.append("code=").append(code).append(",")
				.append("message=").append(message)
				.append("]")
				.toString();
	}

	// fluent

	public ErrorSchema code(ErrorCodes newCode) {
		this.code = newCode;
		return this;
	}

	public ErrorSchema message(@io.micronaut.core.annotation.Nullable java.lang.String newMessage) {
		this.message = newMessage;
		return this;
	}

	// getter/setter

	public ErrorCodes getCode() {
		return code;
	}

	public void setCode(ErrorCodes newCode) {
		this.code = newCode;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String getMessage() {
		return message;
	}

	public void setMessage(@io.micronaut.core.annotation.Nullable java.lang.String newMessage) {
		this.message = newMessage;
	}
}
