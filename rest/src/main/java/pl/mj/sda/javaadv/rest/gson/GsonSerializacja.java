package pl.mj.sda.javaadv.rest.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import pl.mj.sda.javaadv.rest.Samochod;

public class GsonSerializacja {

	public static void main(String[] args) {
		// Gson gson = new Gson();
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		builder.serializeNulls();
		Gson gson = builder.create();
		
		Samochod fiat = new Samochod();
		fiat.setMarka("fiat");
		fiat.setIloscDrzwi(4);
		
		System.out.println(gson.toJson(fiat));
	}
}