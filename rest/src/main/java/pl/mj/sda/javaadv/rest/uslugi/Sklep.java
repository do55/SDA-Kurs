package pl.mj.sda.javaadv.rest.uslugi;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Sklep implements SklepInterface, ZamowienieInterface {
	
	private int counter;

	private Map<Integer, Produkt> magazyn = new HashMap<Integer, Produkt>();
	private Map<UUID, Zamowienie> zamowienia = new HashMap<>();

	/* (non-Javadoc)
	 * @see pl.mj.sda.javaadv.rest.uslugi.SklepInterface#produkty()
	 */
	@Override
	public Collection<Produkt> produkty() {
		return magazyn.values();
	}

	/* (non-Javadoc)
	 * @see pl.mj.sda.javaadv.rest.uslugi.SklepInterface#pokazProdukt(int)
	 */
	@Override
	public Produkt pokazProdukt(int id) {
		return magazyn.get(id);
	}

	/* (non-Javadoc)
	 * @see pl.mj.sda.javaadv.rest.uslugi.SklepInterface#dodajProdukt(pl.mj.sda.javaadv.rest.uslugi.Produkt)
	 */
	@Override
	public Produkt dodajProdukt(Produkt produkt) {
		produkt.setId(generujId());
		magazyn.put(produkt.getId(), produkt);
		return produkt;
	}

	/* (non-Javadoc)
	 * @see pl.mj.sda.javaadv.rest.uslugi.SklepInterface#usunProdukt(int)
	 */
	@Override
	public void usunProdukt(int id) {
		magazyn.remove(id);
	}

	@Override
	public void kupProdukt(String s) {

	}

	private int generujId() {
		return counter++;
	}

	@Override
	public Zamowienie stworz() {
		Zamowienie nowe = new Zamowienie();
		zamowienia.put(nowe.getId(), nowe);
		return nowe;
	}

	@Override
	public Zamowienie pokazZamowienie(UUID idZamowienia) {
		return null;
	}

	@Override
	public Zamowienie dodajProdukt(UUID idZamowienia, int idProdukt, int ilosc) {
		return null;
	}

	@Override
	public Zamowienie usunProdukt(UUID idZamowienia, int idProdukt, int ilosc) {
		return null;
	}

	@Override
	public void zrealizuj(UUID idZamowienia) {

	}

	@Override
	public void anuluj(UUID idZamowienia) {

	}
}