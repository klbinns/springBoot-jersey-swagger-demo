package com.binns.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import com.binns.business.StringManipulator;
import com.binns.data.StringData;

@Component
@Path("/string")
public class StringManipulationEndpoints {
	
	@GET
	@Produces("application/json")
	@Path("forward/{input}")
	public StringData forward(@PathParam("input") final String input) {
		return StringManipulator.forward(input);
	}
	
	@GET
	@Produces("application/json")
	@Path("reverse/{input}")
	public StringData reverse(@PathParam("input") final String input) {
		return StringManipulator.reverse(input);
	}
	
	@POST
	@Produces("application/json")
	@Path("dropVowels/{input}")
	public StringData dropVowels(@PathParam("input") final String input) {
		return StringManipulator.dropVowels(input);
	}

}
