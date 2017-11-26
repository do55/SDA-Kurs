package pl.mj.sda.javaadv.rest;

import org.glassfish.jersey.server.ResourceConfig;

import pl.mj.sda.javaadv.rest.uslugi.Kalkulator;
import pl.mj.sda.javaadv.rest.uslugi.Serwis;
import pl.mj.sda.javaadv.rest.uslugi.SklepSerwis;

public class Konfiguracja extends ResourceConfig {
	public Konfiguracja() {
		register(Kalkulator.class);
		register(Serwis.class);
		register(SklepSerwis.class);
	}
}
