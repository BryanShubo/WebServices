# WebServices



CXF Project

Building and running the Project using Maven
---------------------------------------

1) Right CLick on the project in eclipse .Go to the Run As menu item and do 

  Maven clean 
  
2) And then repeat the step 1 and do a
  
  Maven install
 

To Run the application and access the WSDL file:

Right click on the project, go to the Run As Menu Item and select run on the server option.

WSDL URL once the application is up and running on Tomcat:

http://localhost:8080/wsdlfirstws/services/customerOrders?wsdl









Building and running the Project using Maven
---------------------------------------

1) Right CLick on the project in eclipse .Go to the Run As menu item and do

  Maven clean

2) And then repeat the step 1 and do a

  Maven install


To Run the application and access the WSDL file:

Right click on the project, go to the Run As Menu Item and select run on the server option.


WSDL URL once the application is up and running on Tomcat:

http://localhost:8080/javafirstws/services/paymentProcessor?wsdl


SOAPUI Test Message With User Name Token Header:

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://soap.ws.trainings.com/">

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




Building and running the Project using Maven
---------------------------------------

1) Right CLick on the project in eclipse .Go to the Run As menu item and do 

  Maven clean 
  
2) And then repeat the step 1 and do a
  
  Maven install
  

To Run the application:
-------------------------

Right click on the project, go to the Run As Menu Item and select run on the server option.


Accessing the MTOM Service
=================================

WSDL URL:

http://localhost:8080/mtom/services/fileUpload?wsdl