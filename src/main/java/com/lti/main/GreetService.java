package com.lti.main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class GreetService {
	
	@GET
	@Path("/{user}")
	public String getArea(@PathParam("user") String user) {
		String msg = "Hello "+user+", Welcome to my App";
		return msg;
	}
}
