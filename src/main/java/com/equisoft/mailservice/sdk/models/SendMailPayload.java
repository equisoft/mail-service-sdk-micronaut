package com.equisoft.mailservice.sdk.models;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class SendMailPayload {

	public static final java.lang.String JSON_PROPERTY_TO = "to";
	public static final java.lang.String JSON_PROPERTY_CC = "cc";
	public static final java.lang.String JSON_PROPERTY_BCC = "bcc";
	public static final java.lang.String JSON_PROPERTY_REPLY_TO = "replyTo";
	public static final java.lang.String JSON_PROPERTY_MESSAGE = "message";
	public static final java.lang.String JSON_PROPERTY_HEADERS = "headers";

	@javax.validation.Valid
	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TO)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.List<ContactSchema> to = new java.util.ArrayList<>();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_CC)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.util.List<ContactSchema> cc;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_BCC)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.util.List<ContactSchema> bcc;

	@javax.validation.Valid
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_REPLY_TO)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable ContactSchema replyTo;

	@javax.validation.Valid
	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MESSAGE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private MessageSchema message;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_HEADERS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.util.Map<String, java.lang.String> headers;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		SendMailPayload other = (SendMailPayload) object;
		return java.util.Objects.equals(to, other.to)
				&& java.util.Objects.equals(cc, other.cc)
				&& java.util.Objects.equals(bcc, other.bcc)
				&& java.util.Objects.equals(replyTo, other.replyTo)
				&& java.util.Objects.equals(message, other.message)
				&& java.util.Objects.equals(headers, other.headers);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(to, cc, bcc, replyTo, message, headers);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("SendMailPayload[")
				.append("to=").append(to).append(",")
				.append("cc=").append(cc).append(",")
				.append("bcc=").append(bcc).append(",")
				.append("replyTo=").append(replyTo).append(",")
				.append("message=").append(message).append(",")
				.append("headers=").append(headers)
				.append("]")
				.toString();
	}

	// fluent

	public SendMailPayload to(java.util.List<ContactSchema> newTo) {
		this.to = newTo;
		return this;
	}
	
	public SendMailPayload addToItem(ContactSchema toItem) {
		if (this.to == null) {
			this.to = new java.util.ArrayList<>();
		}
		this.to.add(toItem);
		return this;
	}

	public SendMailPayload removeToItem(ContactSchema toItem) {
		if (this.to != null) {
			this.to.remove(toItem);
		}
		return this;
	}

	public SendMailPayload cc(@io.micronaut.core.annotation.Nullable java.util.List<ContactSchema> newCc) {
		this.cc = newCc;
		return this;
	}
	
	public SendMailPayload addCcItem(ContactSchema ccItem) {
		if (this.cc == null) {
			this.cc = new java.util.ArrayList<>();
		}
		this.cc.add(ccItem);
		return this;
	}

	public SendMailPayload removeCcItem(ContactSchema ccItem) {
		if (this.cc != null) {
			this.cc.remove(ccItem);
		}
		return this;
	}

	public SendMailPayload bcc(@io.micronaut.core.annotation.Nullable java.util.List<ContactSchema> newBcc) {
		this.bcc = newBcc;
		return this;
	}
	
	public SendMailPayload addBccItem(ContactSchema bccItem) {
		if (this.bcc == null) {
			this.bcc = new java.util.ArrayList<>();
		}
		this.bcc.add(bccItem);
		return this;
	}

	public SendMailPayload removeBccItem(ContactSchema bccItem) {
		if (this.bcc != null) {
			this.bcc.remove(bccItem);
		}
		return this;
	}

	public SendMailPayload replyTo(@io.micronaut.core.annotation.Nullable ContactSchema newReplyTo) {
		this.replyTo = newReplyTo;
		return this;
	}

	public SendMailPayload message(MessageSchema newMessage) {
		this.message = newMessage;
		return this;
	}

	public SendMailPayload headers(@io.micronaut.core.annotation.Nullable java.util.Map<String, java.lang.String> newHeaders) {
		this.headers = newHeaders;
		return this;
	}
	
	public SendMailPayload putHeadersItem(java.lang.String key, java.lang.String headersItem) {
		if (this.headers == null) {
			this.headers = new java.util.HashMap<>();
		}
		this.headers.put(key, headersItem);
		return this;
	}

	public SendMailPayload removeHeadersItem(java.lang.String key) {
		if (this.headers != null) {
			this.headers.remove(key);
		}
		return this;
	}

	// getter/setter

	public java.util.List<ContactSchema> getTo() {
		return to;
	}

	public void setTo(java.util.List<ContactSchema> newTo) {
		this.to = newTo;
	}

	public @io.micronaut.core.annotation.Nullable java.util.List<ContactSchema> getCc() {
		return cc;
	}

	public void setCc(@io.micronaut.core.annotation.Nullable java.util.List<ContactSchema> newCc) {
		this.cc = newCc;
	}

	public @io.micronaut.core.annotation.Nullable java.util.List<ContactSchema> getBcc() {
		return bcc;
	}

	public void setBcc(@io.micronaut.core.annotation.Nullable java.util.List<ContactSchema> newBcc) {
		this.bcc = newBcc;
	}

	public @io.micronaut.core.annotation.Nullable ContactSchema getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(@io.micronaut.core.annotation.Nullable ContactSchema newReplyTo) {
		this.replyTo = newReplyTo;
	}

	public MessageSchema getMessage() {
		return message;
	}

	public void setMessage(MessageSchema newMessage) {
		this.message = newMessage;
	}

	public @io.micronaut.core.annotation.Nullable java.util.Map<String, java.lang.String> getHeaders() {
		return headers;
	}

	public void setHeaders(@io.micronaut.core.annotation.Nullable java.util.Map<String, java.lang.String> newHeaders) {
		this.headers = newHeaders;
	}
}
