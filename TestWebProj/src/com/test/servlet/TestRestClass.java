package com.test.servlet;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.test.bean.Hello;
import com.test.bean.TestBean;

@Path("generic")
public class TestRestClass {
    @SuppressWarnings("unused")
    @Context
    private UriInfo context;

    /**
     * Default constructor. 
     */
    public TestRestClass() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Retrieves representation of an instance of TestRestClass
     * @return an instance of String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public TestBean getXml() {
    	TestBean test = new TestBean();
    	test.addVals("456");
    	//test.addVals("789");
    	test.setHello(new Hello());
    	test.addHello(new Hello());
    	test.addHello(new Hello());
        return test;
    }

    /**
     * PUT method for updating or creating an instance of TestRestClass
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putXml(String content) {
    }

}