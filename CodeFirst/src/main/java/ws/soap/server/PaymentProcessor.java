package ws.soap.server;

import ws.soap.server.beans.PaymentProcessorRequest;
import ws.soap.server.beans.PaymentProcessorResponse;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName = "PaymentProcessor") // @WebService is required
public interface PaymentProcessor {

	public @WebResult(name = "response") // @WebResult and @WebParam are optional
    PaymentProcessorResponse processPayment(
			@WebParam(name = "PaymentProcessorRequest") PaymentProcessorRequest paymentProcessorRequest);
}
