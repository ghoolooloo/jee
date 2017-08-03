package net.yohol.jee.rest;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import javax.servlet.http.HttpServletResponse;


@Path("/hello")
public class HelloWorldEndpoint {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response doGet(@Context HttpServletResponse response) {
		// 这是未被保护的资源，不需要登录，需要显式设置跨域头
		response.setHeader("Access-Control-Allow-Origin", "*");

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		User user = new User();
		user.setUsername("kate");

		return Response.ok(user).build();
	}
}