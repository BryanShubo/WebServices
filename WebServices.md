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

REST: High performance and Easy Rest

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




```
