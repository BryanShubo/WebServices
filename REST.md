##Restful: REpresentational State Transfer

#####1 Web Services features
```
1) HTTP exchange:
Client <= (data) <= Web Services

2) Protocol:
Client => (Message Format, like JSON, XML, text, protocol like SOAP protocol) => Server

3) Service Definition:
SOAP => WSDL
REST => Basically no definition
```
#####2 REST
```
http://www.twitter.com => html
http://api.twitter.com => XML/JSON

HTTP MEthods:
1) GET/ursers/21     // (idempotent) retrieves a resource from a URL
2) DELETE/users/21   // (idempotent)  removes the resource
3) POST/users        // (non-idempotent) creates a new recore; returns a ID
4) PUT/users/21      // (idempotent) updates a resource; return status code (200 ok)
* idempotent: the methods can be called many times without differnet outcomes.

HTTP Status codes: convey the result of the server's attempt to satisfy the request
Categories:
1**: informational
2**: success
3**: redirection
4**: client error
5**: server error

![http-method](BryanShubo.github.com/WebServices/http-method.jpg)
```

#####3 REST Advantages
```
1) Single interface: four methods (get--read, post--add, put--update, and delete--delete)

2) Easy to access

3) Multiple Data Formats (Interoperable):
XML, JSON, CSV, txt

4) Statelessness:
State will be maintained on client side.

5) Scalability:
Rest Client --> Load Balance(cache)-->(Rest app server 1, server 2, ..., server n)

Load Balance: http request is easy to cache. No matter how many times you run get, post, they won't 
impact the state of the application


When to use REST:
1) Well Defined Contract Exists (documentation, examples)
2) Support Multiple Data Formats
3) Bandwidth and Memory
4) Stateless (application can survive after the server restarts)
5) Caching (improve performance)
6) Existing Logic an be exposed easily
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

```

##### JAX-RS
```
JAX-RS interfaces and annotations(javax.ws.rs.*)

Jersey / RESTEasy both contain JAS-RS and implementations

@Path: annotation for class

@GET: 
```

##### Design and Implementation
```
1) Design
2) Implementation
3) Testing -- Chrome Rest plugin
4) Client (Java and JavaScript)

A. Patient Manager Application
Add / Read / Update / Delete

B.Design steps:
1) Identify the resource
Patient->(OneToMany)Prescription-->(OneToMany)Madicine
PatientService: provide CRUD methods;

2) Create the URIs to access those resources
creating a patient: /patients
reading patient: /patients/{id}
updateing a patient: /patients/{id}
deleting patient: /patients/{id}

You may also design getAll, deleteAll methods

3) Assign the HTTP methods: GET / POST/ PUT/ DELETE

4) Choose the data format
Read Request: /patients/123
Read Response: 
<Patient>
  <id>123</id>
  <name>Bharath</name>
</Patient>

Create Request: 
<Patient>
  <name>Olga</name>
</Patient>
Create Response: 
<Patient>
  <id>124</id>
  <name>Olga</name>
</Patient>

Update Request: 
<Patient>
  <id>124</id>
  <name>Olga-Villa</name>
</Patient>
Update Response: HTTP/1.1 200 OK

Delete Request: /patients/123
Delete Response: HTTP/1.1 200 OK 


```






