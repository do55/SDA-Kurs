package pl.mj.sda.javaadv.rest;

import com.google.gson.annotations.Expose;

public class Samochod {
	private String marka;
	
	//@Expose(serialize = false, deserialize = true)
	private int iloscDrzwi;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getIloscDrzwi() {
		return iloscDrzwi;
	}

	public void setIloscDrzwi(int iloscDrzwi) {
		this.iloscDrzwi = iloscDrzwi;
	}
	
	public String toString(){
		return "Samochod marki " + marka + ", ilosc drzwi " + iloscDrzwi;
	}
}
