Top Down / WSDL First / Contract First
1 Create the WSDL file
2 Generate the java stubs using tools like wsdl2java (Using cxf-codegen-plugin in pom.xml)
3Implement the web services endpoint
*CustomersOrdersWSImpl
*configure it at cxf-serlet.xml
4 Advantages: 
    i.  Contract with the consume Signed off
    ii. Better Interoperability
    iii.Faster Integration