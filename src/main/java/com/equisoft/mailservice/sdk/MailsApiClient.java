package com.equisoft.mailservice.sdk;

import com.equisoft.mailservice.sdk.models.*;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client(id = "mailservice")
public interface MailsApiClient {

	java.lang.String PATH_SEND_MAIL = "/mail/send";

	@io.micronaut.http.annotation.Post("/mail/send")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<Void> sendMail(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			SendMailPayload sendMailPayload);
}
