package pl.mj.sda.javaadv.rest.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import pl.mj.sda.javaadv.rest.Samochod;

public class JacksonDeserializer {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		String mercedesJson = "{ \"marka\" : \"Mercedes\", \"iloscDrzwi\" : 5 }";
		Samochod mercedes = objectMapper.readValue(mercedesJson, Samochod.class);
		System.out.println(mercedes);

		// JsonNode
		String json = "{ \"marka\" : \"Mercedes\", \"iloscDrzwi\" : 5,"
				+ "  \"wlasciciele\" : [\"Jacek\", \"Jan\", \"Dorota\"],"
				+ "  \"innyObiekt\" : { \"pole\" : \"wartosc\" } }";
		JsonNode node = objectMapper.readValue(json, JsonNode.class);

		JsonNode markaNode = node.get("marka");
		String marka = markaNode.asText();
		System.out.println("marka = " + marka);

		JsonNode iloscDrzwiNode = node.get("iloscDrzwi");
		int iloscDrzwi = iloscDrzwiNode.asInt();
		System.out.println("ilosc drzwi = " + iloscDrzwi);

		JsonNode wlasciciele = node.get("wlasciciele");
		JsonNode jsonNode = wlasciciele.get(0);
		String jacek = jsonNode.asText();
		System.out.println("jacek  = " + jacek);

		JsonNode innyObiekt = node.get("innyObiekt");
		JsonNode poleNode = innyObiekt.get("pole");
		String pole = poleNode.asText();
		System.out.println("pole = " + pole);

		// Parser
		json = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

		JsonFactory factory = new JsonFactory();
		JsonParser parser = factory.createParser(json);

		mercedes = new Samochod();
		while (!parser.isClosed()) {
			JsonToken jsonToken = parser.nextToken();
			if (JsonToken.FIELD_NAME.equals(jsonToken)) {
				String nazwaPola = parser.getCurrentName();
				System.out.println(nazwaPola);
				jsonToken = parser.nextToken();
				if ("marka".equals(nazwaPola)) {
					mercedes.setMarka(parser.getValueAsString());
				} else if ("iloscDrzwi".equals(nazwaPola)) {
					mercedes.setIloscDrzwi(parser.getValueAsInt());
				}
			}
		}
	}
}
