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


```
