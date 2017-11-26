package pl.mj.sda.javaadv.rest.uslugi;

import java.math.BigDecimal;

public class Produkt {
	private int id;
	private String nazwa;
	private BigDecimal cena;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public BigDecimal getCena() {
		return cena;
	}

	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Produkt: nazwa=" + nazwa + " id=" + id + " cena=" + cena;
	}
}