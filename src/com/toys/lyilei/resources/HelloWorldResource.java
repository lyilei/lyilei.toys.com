package com.toys.lyilei.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * First RESTFUL Resource
 * User: Peter Liu
 * Email: lyilei@gmail.com
 * Date: 1/26/13 1:04 PM
 */

@Path("/helloworld")
public class HelloWorldResource {

    @GET
    @Produces ("text/plain")
    public String getClichedMessage() {
        return "Hello World";
    }
}
