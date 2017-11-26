package pl.mj.sda.javaadv.rest.uslugi;

import java.math.BigDecimal;
import java.util.Collection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/sklep")
public class SklepSerwis implements SklepInterface{
	
	private static Sklep sklep = new Sklep();
	static {
		Produkt domyslny = new Produkt();
		domyslny.setCena(new BigDecimal(15));
		domyslny.setNazwa("Produkt domyslny");
		sklep.dodajProdukt(domyslny );
	}
	
	@GET
	@Path("/produkty")
	public Collection<Produkt> produkty() {
		return sklep.produkty();
	}

	@GET
	@Path("/produkty/{id}")
	public Produkt pokazProdukt(@PathParam("id") int id) {
		return sklep.pokazProdukt(id);
	}

	@POST
	@Path("/produkty")
	public Produkt dodajProdukt(Produkt produkt) {
		return sklep.dodajProdukt(produkt);
	}

	@DELETE
	@Path("/produkty/{id}")
	public void usunProdukt(@PathParam("id") int id) {
		sklep.usunProdukt(id);
	}

	@Override
	public void kupProdukt(String s) {
	}
	@POST
	@Path("/zamowienie")
	public Zamowienie dodajZamowienie() {
		return sklep.stworz();
	}

}
