package client;

import ws.soap.server.PaymentProcessor;
import ws.soap.server.PaymentProcessorImpl;
import ws.soap.server.beans.CreditCardInfo;
import ws.soap.server.beans.PaymentProcessorRequest;
import ws.soap.server.beans.PaymentProcessorResponse;

import java.util.Date;

/**
 * Created by Shubo on 7/26/2015.
 */
public class ClientTest {
    public static void main(String[] args) {

        CreditCardInfo creditCardInfo = new CreditCardInfo("123", new Date(), "adfa", "dafa", "adfa", "gdada");
        PaymentProcessorRequest paymentProcessorRequest = new PaymentProcessorRequest();
        paymentProcessorRequest.setCreditCardInfo(creditCardInfo);
        paymentProcessorRequest.setAmount(new Double(15000));

        PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
        PaymentProcessorResponse paymentProcessorResponse = paymentProcessor.processPayment(paymentProcessorRequest);
        System.out.println(paymentProcessorResponse.isResult());
    }
}
