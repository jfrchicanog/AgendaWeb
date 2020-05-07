package es.uma.informatica.sii.agendaee.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import es.uma.informatica.sii.agendaee.entidades.Contacto;
import es.uma.informatica.sii.agendaee.negocio.Negocio;

@Path("/agenda")
public class ServicioREST {
	@EJB
	private Negocio negocio;
	
	@HeaderParam("User-auth")
	private String autorizacion;
	
	@Path("/contactos")
	@GET
	@Produces ({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getContactos() {
		return null;
	}
	
	
	@Path("/contactos")
	@POST
	@Consumes ({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response aniadirContacto(Contacto contacto) {
		return null;
	}
	
	@Path("/contacto/{id}")
	@GET
	@Produces ({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getContacto(@PathParam("id") String cuenta) {
		return null;
	}
	
	@Path("/contacto/{id}")
	@PUT
	@Consumes ({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response modificarContacto(@PathParam("id") String cuenta, Contacto contacto) {
		return null;
	}
	
	@Path("/contacto/{id}")
	@DELETE
	public Response eliminarContacto(@PathParam("id") String cuenta) {
		return null;
	}

}
