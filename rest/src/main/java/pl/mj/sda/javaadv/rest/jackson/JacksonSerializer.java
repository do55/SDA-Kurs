package pl.mj.sda.javaadv.rest.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pl.mj.sda.javaadv.rest.Samochod;

public class JacksonSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();

		Samochod bmw = new Samochod();
		bmw.setMarka("BMW");
		bmw.setIloscDrzwi(4);
		System.out.println(objectMapper.writeValueAsString(bmw));
	}

}
