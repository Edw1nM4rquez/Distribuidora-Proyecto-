package ec.edu.ups.rest;

import ec.edu.ups.ejb.ProductoFacade;
import ec.edu.ups.entidad.Producto;

import javax.ejb.EJB;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/producto/")
public class ProductoRest {
    @EJB
    ProductoFacade productoFacade;

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response message() {
        List<Producto> productos = productoFacade.findAll();
        GenericEntity<List<Producto>> myEntity = new GenericEntity<List<Producto>>(productos) {
        };
        return Response.status(200).entity(myEntity).build();
    }
}