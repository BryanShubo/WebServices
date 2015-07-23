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
3**: redirection (also meaning success)
4**: client error
5**: server error
```
![alt text](https://github.com/BryanShubo/WebServices/blob/master/images/http-method.jpg "Http Methods")


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

#####4 The Richardson Maturity Model
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

#####5 Design and Implementation
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

#####6 JAX-RS
```
JAX-RS interfaces and annotations(javax.ws.rs.*)

Apache CXF / Jersey / RESTEasy both contain JAS-RS and implementations

**Annotation**
1) URL Mapping:
@Path("users/{username}"): annotation for class

2) HTTP Methods:
@GET: 
@POST:
@PUT:
@DELETE:

3) Data Formats:
@Consumes("test/plain")
@Produces("application/json", "application/xml")

4) Request parameter Values:
@PathParam
@QueryParam
@FormParam

5) Exception Mappers:
@Provider
```

#####7 Rest Error Handling
```
Two types of errors:

Standard Errors:

Application Errors:

javax.ws.rs:
BadRequestException:  400
NotAuthorizedException: 401
ForbiddenException: 403
InternalServiceException: 500
Service UnavailableException: 503 

1) Create BusinessExceptionMapper class (need to add @Provider), implements ExceptionMapper<E>, 
and override toResponse method.

2) Add bean configuration in cxf-servlet.xml file
```

#####8 Rest Client
```
java.net.url

Method 1: Apache HttpClient lib

Method 2: JAX-RS Client API

Async, filters

1. javax.ws.rs.client.*
ClientBuilder
Client
WebTarget
Entity
Invoker.Builder

```

#####9 JAX-RS Injection
```
@PathParam("id") int id --> /Patient/123
@QueryParam
@FormParam
@HeaderParam
@CookieParam
```

#####10 Synchronous and Asynchronous
![alt text](https://github.com/BryanShubo/WebServices/blob/master/images/syn.bmp "Synchronous")

![alt text](https://github.com/BryanShubo/WebServices/blob/master/images/Async.bmp "Asynchronous")

![alt text](https://github.com/BryanShubo/WebServices/blob/master/images/3.bmp "JAX-RS Asynchronous")
```
Provider:
@javax.ws.rs.container.Suspended
javax.ws.rs.container.AsyncResponse


Client:
javax.ws.rs.client.Asyncinvoker
java.util.concurrent.Future
javax.ws.rs.client.InvocationCallback

```

#####11 Security
```
Steps To Configure and Test Basic Security:

1)Open the web.xml under WEB-INF directory of your restws eclipse project.

2)Go to the end of web.xml. Copy the below xml. Paste before the </web-app> in the web.xml.


	<security-constraint>
		<web-resource-collection>
			<web-resource-name>Wildcard * means all the resources in the application require authentication</web-resource-name>
			<url-pattern>/*</url-pattern>
			<http-method>GET</http-method>
			<http-method>POST</http-method>
			<http-method>PUT</http-method>
			<http-method>DELETE</http-method>
		</web-resource-collection>
		<auth-constraint>
			<role-name>tomcat</role-name>
		</auth-constraint>
	</security-constraint>

	<login-config>
		<auth-method>BASIC</auth-method>
	</login-config>
	
3) Open the tomcat-users.xml in eclipse (short cut to search in eclipse ctlr->shift->r)

4) Remove the xml comments around the following section.

  <role rolename="tomcat"/>
  <role rolename="role1"/>
  <user username="tomcat" password="tomcat" roles="tomcat"/>
  <user username="both" password="tomcat" roles="tomcat,role1"/>
  <user username="role1" password="tomcat" roles="role1"/>
  
5) Restart the tomcat server in eclipse

6) Access the patient information using the following URL (BROWSER USES HTTP GET METHOD BY DEFAULT FOR URLS)

http://localhost:8080/restws/services/patientservice/patients/123

Enter “tomcat” for user name and “tomcat” for password when prompted on the basic authentication popup.
```

#####12 OAuth Concepts
```
1) Authentication and Authorization
client <=(username and password)=> provider application

2) Data Access without sharing username and password with every application
Federated Authentication

Delegated Authorization


```



