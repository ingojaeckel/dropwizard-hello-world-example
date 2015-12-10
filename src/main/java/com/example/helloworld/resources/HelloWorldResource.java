package com.example.helloworld.resources;

import com.example.helloworld.api.Saying;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    @GET
    public Saying sayHello() {
        return new Saying(0, "Hello World!");
    }
}
