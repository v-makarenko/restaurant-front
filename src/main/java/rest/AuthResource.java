package rest;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by vmakarenko on 22.04.2015.
 */
@Path("auth")
public class AuthResource {
    @POST
    @Path("login")
    public Response login(){
        return Response.ok().build();
    }
    @POST
    @Path("logout")
    public Response logout(){
        return Response.ok().build();
    }
    @GET
    @Path("isAuthenticated")
    public Response isAuthenticated(){
        return Response.ok().build();
    }
    @GET
    @Path("getRoles")
    public Response getRoles(){
        return Response.ok().build();
    }
}
