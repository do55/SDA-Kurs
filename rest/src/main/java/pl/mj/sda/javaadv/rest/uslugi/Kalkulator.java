package pl.mj.sda.javaadv.rest.uslugi;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

//Path okresla czesc url pod jakim dostepny jest dany serwis
@Path("/kalkulator")
public class Kalkulator {
	// Get mowi nam ze do zasobu mozna sie dostaz z uzyciem metody HTTP typu GET
	// http://localhost:8888/restowa/kalkulator/czesc
    @GET
    //Okresla dalsza czesc url uzytego do wywolania metody
    @Path("/czesc")
    //Informuje nas o typie zwracanej zawartosci odpowiedzi
    @Produces(MediaType.TEXT_PLAIN)
    //QueryParam mapuje parametr z url na paramter metody
    public String czesc(@QueryParam("imie") String imie){
    	return "czesc " + imie;
    }
    
    //http://localhost:8888/restowa/kalkulator/dodajsciezka/a/b
    @GET
    //Elementy urla sa interpretowane jako parametry o nazwie pierwszy i drugi
    @Path("/dodajsciezka/{pierwszy}/{drugi}")
    @Produces(MediaType.TEXT_PLAIN)
    //Path param mapuje parametry ze sciezki url na paramtery metody
    public String dodajSciezkaGet(@PathParam("pierwszy") String pierwszy, 
    		@PathParam("drugi") String drugi){
    	return pierwszy + drugi;
    }
    
    //Uzycie metody POST
    @POST
    @Path("/dodajsciezka/{pierwszy}/{drugi}")
    @Produces(MediaType.TEXT_PLAIN)
    public String dodajSciezka(@PathParam("pierwszy") String pierwszy,
    		@PathParam("drugi") String drugi){
    	return pierwszy + drugi;
    }

    //Uzycie metody Post z parametrami formularza
    @POST
    @Path("/dodajparametry")
    @Produces(MediaType.TEXT_PLAIN)
    //FormParam mapuje parametry z ciala zadania na parametry metody
    //Z 'Advanced rest client' http://localhost:8888/restowa/kalkulator/dodajparametry
    //'Raw payload' pierwszy=p&drugi=d
    //Dodajemy naglowek w zadaniu Content-Type o wartosci application/x-www-form-urlencoded
    public String dodajParametr(@FormParam("pierwszy") String pierwszy, @FormParam("drugi") String drugi){
    	return pierwszy + drugi;
    }
}
