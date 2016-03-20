package com.binns.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import com.binns.business.StringManipulator;
import com.binns.data.StringData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Component
@Path("/string")
@Api(value = "string operations")
public class StringManipulationEndpoints {
	
	@ApiOperation(value = "Get Untouched String", nickname = "String forward")
	@GET
	@Produces("application/json")
	@Path("forward/{input}")
	public StringData forward(@ApiParam(value = "The input string", required = true) @PathParam("input") final String input) {
		return StringManipulator.forward(input);
	}
	
	@ApiOperation(value = "Get Reversed String", nickname = "String reverse")
	@GET
	@Produces("application/json")
	@Path("reverse/{input}")
	public StringData reverse(@PathParam("input") final String input) {
		return StringManipulator.reverse(input);
	}
	
	@ApiOperation(value = "Get String With Vowels Removed", nickname = "String with removed vowels")
	@POST
	@Produces("application/json")
	@Path("dropVowels/{input}")
	public StringData dropVowels(@PathParam("input") final String input) {
		return StringManipulator.dropVowels(input);
	}

}
