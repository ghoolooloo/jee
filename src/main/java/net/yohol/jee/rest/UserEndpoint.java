package net.yohol.jee.rest;

import org.jboss.resteasy.spi.HttpRequest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.keycloak.KeycloakSecurityContext;
import org.keycloak.representations.AccessToken;

@Path("/users")
public class UserEndpoint {
  @Context
  private HttpRequest httpRequest;
  
  @GET
  @Path("/{username}")
  @Produces(MediaType.APPLICATION_JSON)
  public User getUser(@PathParam("username") String username) {
    KeycloakSecurityContext securityContext = (KeycloakSecurityContext) httpRequest.getAttribute(KeycloakSecurityContext.class.getName());
    AccessToken accessToken = securityContext.getToken();
    User user = new User();
    if (username.equals(accessToken.getPreferredUsername())) {
      user.setEmail(accessToken.getEmail());
      user.setName(accessToken.getName());
      user.setSubject(accessToken.getSubject());
      user.setUsername(accessToken.getPreferredUsername());
      user.setRoles(accessToken.getRealmAccess().getRoles());
    }
    return user;
  }

  @POST
	@Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response createUser(User user) {
    System.out.println(user.getUsername() + " ********************************************");
    //return Response.ok().build();
    return Response.status(Response.Status.OK).entity(user).build();
  }
}