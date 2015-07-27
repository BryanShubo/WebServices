
Sample XML request without security:
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://soap.ws/">
   <soapenv:Header/>
   <soapenv:Body>
      <soap:processPayment>
         <!--Optional:-->
         <PaymentProcessorRequest>
            <creditCardInfo>
               <cardNumber>1234</cardNumber>
               <expirtyDate>2015-01-31T19:32:52+00:00</expirtyDate>
               <firstName>sdfd</firstName>
               <lastName>dfasd</lastName>
               <secCode>sfds</secCode>
               <Address>sdgfsd</Address>
            </creditCardInfo>
            <!--Optional:-->
            <amount>123</amount>
         </PaymentProcessorRequest>
      </soap:processPayment>
   </soapenv:Body>
</soapenv:Envelope>


Authentication:User name Token Profile


SOAPUI Test Message With User Name Token Header:

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://server.soap.ws/">

 <soapenv:Header>
  <wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" soapenv:mustUnderstand="1">
  <wsse:UsernameToken xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
  <wsse:Username xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">Bharath</wsse:Username>
  <wsse:Password xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText">Bharath</wsse:Password>
  </wsse:UsernameToken>
  </wsse:Security>
   </soapenv:Header>

   <soapenv:Body>
      <soap:processPayment>
         <!--Optional:-->
         <PaymentProcessorRequest>
            <creditCardInfo>
               <cardNumber>123</cardNumber>
               <expirtyDate>2002-05-30T09:00:00</expirtyDate>
               <firstName>bharath</firstName>
               <lastName>thippireddy</lastName>
               <secCode>123</secCode>
               <Address>USA</Address>
            </creditCardInfo>
            <!--Optional:-->
            <amount>123</amount>
         </PaymentProcessorRequest>
      </soap:processPayment>
   </soapenv:Body>
</soapenv:Envelope>

