package com.equisoft.mailservice.sdk.models;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public enum ErrorCodes {

	SERVER_ERROR("SERVER_ERROR"),
	SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE");

	public static final java.lang.String SERVER_ERROR_VALUE = "SERVER_ERROR";
	public static final java.lang.String SERVICE_UNAVAILABLE_VALUE = "SERVICE_UNAVAILABLE";

	private final java.lang.String value;

	private ErrorCodes(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static ErrorCodes toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<ErrorCodes> toOptional(java.lang.String value) {
		return java.util.Arrays
				.stream(values())
				.filter(e -> e.value.equals(value))
				.findAny();
	}

	@com.fasterxml.jackson.annotation.JsonValue
	public java.lang.String getValue() {
		return value;
	}
}
