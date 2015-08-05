###Restful: REpresentational State Transfer

#####1. 
```
http://www.twitter.com => html

http://api.twitter.com => XML/JSON

```

#####2 Web Services features
```
1) HTTP exchange:
Client <= (data) <= Web Services

2) Protocol:
Client => (Message Format, like JSON, XML, text, protocol like SOAP protocol) => Server

3) Service Definition:
SOAP => WSDL
REST => Basically no definition
```

##### The Richardson Maturity Model
```
Is this API fully RESTful?

Level 0: Swamp of POX (Plain Old XML)
One URL
Request Body

Level 1: 
Individual URLs for each resource

Level 2: HTTP Methods
Uses the right HTTP methods, status codes

Level 3: HATEOAS: Resonses have links that the clients can use.

``

##### JAX-RS
```
JAX-RS interfaces and annotations(javax.ws.rs.*)

Jersey / RESTEasy both contain JAS-RS and implementations

@Path: annotation for class

@GET: 
```