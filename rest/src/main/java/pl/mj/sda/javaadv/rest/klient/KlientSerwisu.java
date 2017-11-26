package pl.mj.sda.javaadv.rest.klient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import pl.mj.sda.javaadv.rest.Samochod;

public class KlientSerwisu {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		Samochod bmw = new Samochod();
		bmw.setIloscDrzwi(4);
		bmw.setMarka("bmw");

		Gson gson = new GsonBuilder().create();
		String bmwJson = gson.toJson(bmw);

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost("http://localhost:8888/restowa/serwis/dodajdrzwi");
		httpPost.addHeader("Content-Type", "application/json");
		httpPost.addHeader("Accept", "application/json");
		HttpEntity entity = new StringEntity(bmwJson);
		httpPost.setEntity(entity);
		
		CloseableHttpResponse odpowiedz = httpClient.execute(httpPost);
		if(odpowiedz.getStatusLine().getStatusCode() == 200){
			HttpEntity encjaOdpowiedzi = odpowiedz.getEntity();
			String bmwJsonZmodyfikowany = KlientGet.odczytajEncje(encjaOdpowiedzi);
			Samochod zmodyfikowany = gson.fromJson(bmwJsonZmodyfikowany, Samochod.class);
			System.out.println(zmodyfikowany);
		}else{
			System.out.println("Blad: " + odpowiedz.getStatusLine().getStatusCode());
		}
	}
}
