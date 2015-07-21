###I. Soap Vs Rest
```
1. Http Methods and Coaching
SOAP: HTTP POST OPERATIONS/METHODS
REST: GET/ POST/PUT/DELETE

2. Contract 
SOAP CONTRACT
WSDL: OPRATIONS + DATA

REST CONTRACT (no data contract):
WADL: HTTP Methods +  URLS

3. WS-Standards for non-functional-requirements
WS-Reliable Messaging
WS-Transactions
WS-Security

SOAP is easy to handle above requirements.

REST has to implement above non-functional-requirements.

4. SOAP Overhead
This will casue memory issue for the device, like mobile phone.

SOAP: 
<soap-env>
    <order id=123>
    ...
</soap-env>

REST: <order id=123>

5. Data Formats
SOAP: XML
REST: XML/JSON/TEXT (very easy to integrate with other platforms)

6. Client Creation
SOAP--> WSDL2JAVA
REST--> No matured tools

7. SOAP or REST?
SOAP: 
**If the project requires more non-functional-requirements: Security/Transaction/Reliable Messaging. 
**Strict Contract: soap allows

REST: Scalability/ High performance and Easy Rest / require caching / limited bandwidth

Co-exist and Comliment
```

###II. Questions:
```
1. Which of these are advantages of Web Services?
Interoperability
Loose Coupling
Extensibility


If a XML follows a schema it is called a valid xml

The two types that can be created from inbuilt data types in XML schema are simple and complex

Instead of using the entire namespace url to refer to a xml element prefix can be used

What is the root element of a schema file? xsd:schema

Which of the following ensures the order in which the xml elements should occur? xsd:sequence

Which two schema attributes can be used to control the number of XML element occurrences? minOccurs and maxOccurs

The power of XML comes from its data and meta data

Which two components enable platform in-dependency? HTTp and XML

Web Service Standards address which of the following: Non functional requirements

The current version of SOAP is 1.2

Which SOAP Element will have the request and response message payload? BODY

Which element can be used to communicate errors? FAULT

Which WSDL Element connects the abstract and concrete sections of a WSDL? Binding

The message element in the wsdl is equivalent to method parameters in programming

What is the first step while using Top Down Approach? create a WSDL file


Which JAX-WS Annotation can be used to control the name of the web services request parameters in the wsdl/soap request?
@WebParam

Using JAXB we can
Bind java object to xml
Bind xml to java objects
Generate java stubs from xml schemagen

The process of converting java objects in to XML is called Marshalling

Which component or tool in JAXB can generate java files from schemas? xjc

The entry point in to the JAXB Runtime API is: JAXBContext

Which of the following standards does CXF Implement?? JAX-WS


Which component is responsible for dispatching the web service request to the web service endpoint class? SOAP Engine

Which CXF Maven plugin can be used to generate the java stubs? cxf-codegen-plugin

We can use the same generated stubs to create a web services provider and consumer. True


Which WS-Standard can be used for exchanging files?? MTOM

Which part of the soap message contains the User Name Token Profile XML elements? SOAP Header

MTOM Stands For message transmission and optimization mechanism

The annotation that can be used to bind a uri to a java method is @path

Which JAX-RS class can be used to return back errors? Response

Which JAX-RS exception in the can be thrown with any error status code? WebApplicationException

What can be used to handle Business Exceptions in a generic fashion? Exception Mappers

The process of one application using another application to authenticate a User is called Federated Authentication

Using Delegated Authorization an application will have access to all the user data in an other application. FLASE

Which of these problem areas does OAuth address?
Phishing
Unlimited Access
Revocation of access


While using OAuth, along with the clientId and redirect url which of the following parameter is passed by an application? State


The application exchanges the acess code it receives for which of the following? access token
```
