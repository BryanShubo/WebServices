package ws.soap.server.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentProcessorRequest")
@XmlAccessorType(XmlAccessType.FIELD) // This means framework is going to search annotation on field, not setting method
public class PaymentProcessorRequest {

	@XmlElement(name = "creditCardInfo", required = true)
	private CreditCardInfo creditCardInfo;
	private Double amount;

	public CreditCardInfo getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
