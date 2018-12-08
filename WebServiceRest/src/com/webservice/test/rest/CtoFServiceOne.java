package com.webservice.test.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ctofService2")
public class CtoFServiceOne {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public String convertCtoF() {
		
		Double fehrenheit;
		Double celsius = 36.6;		
		fehrenheit = ((celsius * 9)/5)+32;
		
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fehrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";

	}
	
	@GET
	@Path("/{orderID}")
	public String returnFormatteStr(@PathParam("orderID") String orderIDVal) {		
		return "New Order ID Received :: "+orderIDVal;
	}

}
