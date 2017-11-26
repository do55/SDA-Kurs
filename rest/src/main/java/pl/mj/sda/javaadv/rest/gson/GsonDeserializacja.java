package pl.mj.sda.javaadv.rest.gson;

import java.io.IOException;
import java.io.StringReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import pl.mj.sda.javaadv.rest.Samochod;

public class GsonDeserializacja {

	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
		Samochod fiat = gson.fromJson("{\"marka\":\"fiat\",\"iloscDrzwi\":\"4\"}",
				Samochod.class);
		System.out.println(fiat);

		// JsonReader
		String volvo = "{\"brand\" : \"volvo\", \"doors\" : 5}";

		JsonReader jsonReader = new JsonReader(new StringReader(volvo));

		try {
			while (jsonReader.hasNext()) {
				JsonToken nextToken = jsonReader.peek();
				System.out.println(nextToken);
				if (JsonToken.BEGIN_OBJECT.equals(nextToken)) {
					jsonReader.beginObject();
				} else if (JsonToken.NAME.equals(nextToken)) {
					String name = jsonReader.nextName();
					System.out.println(name);
				} else if (JsonToken.STRING.equals(nextToken)) {
					String value = jsonReader.nextString();
					System.out.println(value);
				} else if (JsonToken.NUMBER.equals(nextToken)) {
					long value = jsonReader.nextLong();
					System.out.println(value);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		jsonReader.close();
	}
}
