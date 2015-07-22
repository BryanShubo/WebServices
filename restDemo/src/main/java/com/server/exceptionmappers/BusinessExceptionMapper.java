package com.server.exceptionmappers;

import com.server.exception.SomeBusinessException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


/*
* It is able to handle all exceptions: ExceptionMapper<Exception>
* */
@Provider
public class BusinessExceptionMapper implements ExceptionMapper<SomeBusinessException> {
    @Override
    public Response toResponse(SomeBusinessException exception) {
        StringBuilder response = new StringBuilder("<response>");
        response.append("<status>ERROR</status>");
        response.append("<message>" + exception.getMessage() + "</message>");
        response.append("</response>");

        return Response.serverError().entity(response.toString()).type(MediaType.APPLICATION_XML_TYPE).build();
    }
}
