/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.io.StringWriter;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXB;

/**
 * REST Web Service
 *
 * @author supakew
 */
@Path("Circle")
public class Circle {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Circle
     */
    public Circle() {
    }

    /**
     * Retrieves representation of an instance of service.Circle
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{radius}")
    @Produces("application/xml")
    public String Area(@PathParam("radius") String radius) {
        StringWriter writer = new StringWriter();
        double r = Double.parseDouble(radius);
        JAXB.marshal("Area is "+ (3.14*r*r) +" Round of circle is "+ (2*3.14*r), writer);
        return writer.toString();
    }

    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
