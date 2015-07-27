1 Web Service
```
1) Website is for personal consumption.
2) Web service is for app (code) consumption.
Consumer application ==>provider application via SOAP, XML, JSON
Consumer application <==>provider application via http

Interoperability
Loosely Coupled
Extensibility
Mashups

Platform independent
Focussed developer roles
Resusability
Scalability
Cost reduction
Availability
```
**UDDI**: Universal Description, Discovery and Integration a platform-independent, 
Extensible Markup Language (XML)-based registry by which businesses worldwide can list themselves on the 
Internet, and a mechanism to register and locate web service applications.


2 Two Protocols 
```
SOAP (JAX-WS)
XML  HTTP POST

RESTful (JAX-RS): HTTP all methods

Multiple data fomats
```

3 SOA (Service Oriented Architecture) standard
```
what:
Architectureal Principles: services / loosely coupled

who:  W3C / OASIS

service:
```

4 XML 
```
1) Configuration
2) Data Exchange
3) Data and Meta Data

Well formedness

Validation: XML schema is a blue print for XML documentation

Namespace: allows usage of elements from differnet schemas in a single xml document. We use the unique 
namespace to identify elements

<customerName>Bharath</customerName>

<customerName> is MetaData, Bharath is data. This is equivalent to customer.name="Bharath"  
```

5 XSD (XML schema definition): 
```
it is a contractor between provider and consumer.
example: 
1) web.xsd for web.xml the JEE web application descriptor
2) project.xsd for eclipse IDE project

XSD Types:
In-Build Types
```

6 NAMESPACE
```
1) Uniquely Qualify Elements
ex: <amazon:order></amazon:order>

2) Organize types across schemas (like packages in Java)

Instead of using the entire namespace url to refer to a xml element, prefix can be used.
```

7 XML schema example
```
Patient Billing <==> Patient Clinical

Patient Data:
name, age, DOB, Email, gender, phone

```
8 SOAP (Simple Object Access protocal)
```
Specification from w3c. The current version is 1.2

Pros:
* They are platform independent
 HTTP transport independent
 xml dataq independent
 
* Application tailoring /Suctomization
* Legacy Applications are Great
* New Revenue /profit channels
example; Siebel ondemand service
* firewalls like web services


Cons:
* Ambiguous Web Services Standards.
* Performance impact due to Serialization and de-serialization

When to use SOAP?
* Formal Contract is Required --> WSDL
* Non Functional Requirements: security, transaction management
* Reliable Asynchronous processing

Example:
<soap:Envelope>
    <soap:header/>
    <soap:body>
        <soap:creditCard>
            ....
        </soap:creditCard>
    </soap:body>
</soap:Envelope>


Example2:
<soap:body>
    <soap:Fault>
        <soap:code> soap:Server</soap:code>
        <soap:Reason>
            <soap:text> Card Expired</soap:text>
        </soap:Reason>
    </soap:Fault>
</soap:body>

Example 3:
<soap:Header>
    <wsse:Security>
        <wsse:UsernameToken>
            <wsse:Username>
            <wsse:password>
        </wsse:UsernameToken>
    </wsse:Security>
</soap:Header>
```

9 WSDL: web service description  language
```
Elements:
* definitions: is a container for all other elements 
*** types: defining the data types that are used by the web service
*** messages: is equivalent to method parameters in programming and pointing to types. Data exchange between 
              web service and client
*** porttype: WebMethod (one input message and one output message for each operation)
*** binding: how web service accepts request
*** service: WebService class.


Physical
binding/ service

description:	The description element is the root element of the WSDL 2.0 file. All other WSDL elements are 
nested inside this element.

types:	The types element contains a specification of the data types exchanged between the client and the 
web service. By default these data types are described using XML Schema.

interface:	The interface element describes what operations the web service has, and what messages are 
exchanged for each operation (input / output). It also describes possible fault messages.

binding:	The binding element describes how the web service is accessed over the network. Typically the 
binding element binds the web service to the HTTP protocol.

service:	The service element describes where the web service can be accessed on the network. Typically 
the service element contains a URL to the service.

documentation:	The documentation element is optional and may contain a humanly readable description of 
the web service.

import:	The import element is optional and may be used to import XML Schemas or other WSDL files.
```

```xml
<description>

  <types>
  </types>

  <interface>
  </interface>

  <binding>
  </binding>

  <service>
  </service>

</description>

```

9 Two SOAP Web Service Design Approaches
```
I. Top Down / WSDL First / Contract First
1) Create the WSDL file
2) Generate the jave stubs using tools like wsdl2java
3) Implement the web services endpoint
4) Advantages: 
    i.  Contract with the consume Signed off
    ii. Better Interoperability
    iii.Faster Integration
 5) Example:
 WSDL First project management WS (Java) ==> Reporting Application(.Net)


II.  Code First / Bottom Up
1) Write Java Code and annotate
2) Generate the WSDL from the code using java2wsdl
3) Advantages: Legacy Application Integration


Which design to choose?
Contract first except while exposing legacy applications as web services
```

10 JAX-WS API and JAXB
```
* Specification (Engine): CXF / GlassFish

* API: annotation / developers

* Core: 
javax.jws.WebService / 
public class OrderService

javax.jws.WebMethod
Annotation: @WebResult(name="order") Order getOrder (@WebParam(name="orderId")Long orderId)

javax.xml.ws.WebFault
MyException extends Exception

javax.jws.soap.SOAPBinging
document / literal
@SOAPBinding(style=Style.RPC, use=Use.LITERAL)
public interface OrderService

javax.xml.ws.RequestWrapper
javax.xml.ws.ReponseWrapper

* JAXB (current version: 2.2): XML<==>Java Objects
Three tools
1)XML schema --XJC-->java class
2)Java Class --schemagen--> XML schema
3)Java Objects --RUNTIME API-->XML

Runtime API: Marshall / UNMarshall / Annotations


```

10 Apache CXF

```
1) Why CXF
JAX-WS and JAX-RS
SOAP / REST Engine
Serialize and De-Serialize
Publish and Dispatch

2) XML <-> SOAP/REST <-> Java Object <-> WS Endpoint Method

3) Webservice Standards
WS security
WS policy

4) Tools:
wsdl2java
java2wsdl


5) Spring Configuration 

6) Extend and Customize: Interceptptors and Handler

7) Documentation and Samples

```



11  Top Down Case: CustomerOrdersService
```
step 1: WSDL
step 2: Generate Stubs
step 3: Implement the endpoint
step 4: Configure the cf-servlet.xml

```

12 Bottom Up Case: Payment gateway
```
Step 1: Java Interfaces and Classes
Step 2: Annotate The Endpoint and Beans
Step 3: Configure The Endpoint Using Spring
Step 4: Access the WSDL File
```

13 Securing Soap Web Services
```
WS Standards:
Security
Addressing
Policy
MTOM

UT
MTOM
Enc/Dec

Online Shopping Application ==> Banks Payment Gateway Web Service

Where to put security info

soap header / soap body / Whate are element names

WS-Security:
1) Authentication:
         User Name Token Profile
         X 508 Certificates
         SAML: SAML (Security Assertion Markup Language)  / secury single sign on protocol
         
 2) Confidentiality
     Encryption and Decryption
 
 3) Integrity
     XML Signature
     
 MTOM-For exchanging files
     
 WS-Address -Asynchronous Callbacks / redirect to another server
     
 WS-Policy-Assert and mandate certain rules to consume out web services
     
 WS-SecureConversation-Improve Performance while encrypting and decrypting by negotiating a key at the beginning.
     
 WS-SecurityPolicy-Assert WS-Security requirements.
     
```












