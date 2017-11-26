package pl.mj.sda.javaadv.rest.uslugi;

import java.util.Collection;

public interface SklepInterface {

	Collection<Produkt> produkty();

	Produkt pokazProdukt(int id);

	Produkt dodajProdukt(Produkt produkt);

	void usunProdukt(int id);

	void kupProdukt(String s);
}