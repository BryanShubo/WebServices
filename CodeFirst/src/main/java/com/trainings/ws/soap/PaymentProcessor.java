package com.trainings.ws.soap;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.trainings.ws.soap.dto.PaymentProcessorRequest;
import com.trainings.ws.soap.dto.PaymentProcessorResponse;

@WebService(serviceName = "PaymentProcessor") // this is required
public interface PaymentProcessor {

	public @WebResult(name = "response") // @WebResult and @WebParam are optional
	PaymentProcessorResponse processPayment(
			@WebParam(name = "PaymentProcessorRequest") PaymentProcessorRequest paymentProcessorRequest);
}
