package ru.vmakarenko.rest;


import ru.vmakarenko.dto.CommonResponse;
import ru.vmakarenko.dto.users.AccessAuthDto;
import ru.vmakarenko.dto.users.UserAuthDto;
import ru.vmakarenko.dto.users.UserSignUpDto;
import ru.vmakarenko.services.AuthService;
import ru.vmakarenko.services.UserService;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

/**
 * Created by vmakarenko on 22.04.2015.
 */
@Path("auth")
@Consumes("application/json")
public class AuthResource {
    @Inject
    UserService userService;
    @Inject
    AuthService authService;


    @POST
    @Path("login")
    public Response login(@Context HttpServletRequest request, UserAuthDto userAuthDto) {
        AccessAuthDto responseDto  = authService.login(userAuthDto);
        if (responseDto != null) {
            request.getSession().setAttribute(AccessAuthDto.PARAM_AUTH_ID, responseDto.getId());
            request.getSession().setAttribute(AccessAuthDto.PARAM_AUTH_TOKEN, responseDto.getToken());
            return Response.ok(responseDto).build();
        }else{
            return Response.status(Response.Status.FORBIDDEN).build();
        }
    }

    @POST
    @Path("logout")
    public Response logout() {
        return Response.ok().build();
    }

    @GET
    @Path("isAuthenticated")
    public Response isAuthenticated() {
        return Response.ok().build();
    }

    @GET
    @Path("getRoles")
    public Response getRoles() {
        return Response.ok().build();
    }

    @GET
    @Path("currentRestaurant")
    public Response getCurrentRestaurant(){
        return Response.ok().build();
    }

    @POST
    @Path("signUp")
    public Response signUp(UserSignUpDto dto){
        userService.create(dto);
        return Response.ok(new CommonResponse("OK")).build();
    }

}
