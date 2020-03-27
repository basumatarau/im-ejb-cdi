package com.basumatarau.training.im.web.resource;

import com.basumatarau.training.im.ejb.HelloEjbLocal;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserResource {

    @Inject
    private HelloEjbLocal helloEjbLocal;

    @GET
    @Path("/hello")
    public Response hello() {
        return Response.ok().entity(helloEjbLocal.getGreetings()).build();
    }

    @GET
    @Path("/stub")
    public Response stub() {
        return Response.ok().entity("greetings!").build();
    }
}