package pl.mj.sda.javaadv.rest.klient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class KlientGet {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://localhost:8888/restowa/kalkulator/czesc?imie=test");
		CloseableHttpResponse odpowiedz = httpclient.execute(httpGet);
		HttpEntity encja = odpowiedz.getEntity();
		System.out.println(odczytajEncje(encja));
		//EntityUtils.consume(encja);
	}

	public static String odczytajEncje(HttpEntity encja) throws UnsupportedOperationException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(encja.getContent()));
		StringBuffer wynik = new StringBuffer();
		String linia = "";
		while ((linia = rd.readLine()) != null) {
			wynik.append(linia);
		}
		return wynik.toString();
	}
}
