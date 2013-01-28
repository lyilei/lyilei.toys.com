package com.toys.lyilei.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

/**
 * User: lyilei
 * Email: lyilei@gmail.com
 * Date: 1/26/13 3:30 PM
 */
@Path("/users/{username}")
public class UserResource {

    @GET
    @Produces("text/plain")
    public String getUser(@Context UriInfo uriInfo) {
        MultivaluedMap<String, String> queryParams = uriInfo.getQueryParameters();
        MultivaluedMap<String, String> pathParams = uriInfo.getPathParameters();

        String userName = pathParams.getFirst("username");
        String id = queryParams.getFirst("id");

        return "Request User is " + userName + " with id is " + id;
    }

    @GET @Path("/address")
    @Produces("application/json")
    public String getAddress(@PathParam("username") String userName) {

        return userName + "'s address is NYC";
    }
}
