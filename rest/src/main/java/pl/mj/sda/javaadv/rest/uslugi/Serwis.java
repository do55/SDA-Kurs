package pl.mj.sda.javaadv.rest.uslugi;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pl.mj.sda.javaadv.rest.Samochod;

@Path("/serwis")
public class Serwis {
	
	
    @POST
    @Path("/dodajdrzwi")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response dodajDrzwi(String jsonContent, @Context Request request) throws JsonParseException, JsonMappingException, IOException{
    	ObjectMapper objectMapper = new ObjectMapper();
    	Samochod samochod = objectMapper.readValue(jsonContent, Samochod.class);
    	samochod.setIloscDrzwi(samochod.getIloscDrzwi() + 1);
    	samochod.setMarka(samochod.getMarka());
    	return Response.ok().entity(objectMapper.writeValueAsString(samochod)).build();
    }

}
