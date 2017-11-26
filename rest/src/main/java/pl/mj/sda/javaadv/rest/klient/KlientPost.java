package pl.mj.sda.javaadv.rest.klient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class KlientPost {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		//Tworzymy domyslna instancje klienta
		CloseableHttpClient httpclient = HttpClients.createDefault();
		//HttpPost httpPost = new HttpPost("http://localhost:8888/restowa/kalkulator/dodajsciezka/a/b/");
		//Tworzymy zadanie typu POST
		HttpPost httpPost = new HttpPost("http://localhost:8888/restowa/kalkulator/dodajparametry");
		//Okreslamy parametry jakie zostana przekazane w ciele zadania
		List <NameValuePair> nvps = new ArrayList <NameValuePair>();
		nvps.add(new BasicNameValuePair("pierwszy", "vip"));
		nvps.add(new BasicNameValuePair("drugi", "secret"));
		//Wpisujemy parametry do ciala zadania
		httpPost.setEntity(new UrlEncodedFormEntity(nvps));
		//Wywolujemy zadanie
		CloseableHttpResponse odpowiedz = httpclient.execute(httpPost);

		try {
			//Pokaz status
		    System.out.println(odpowiedz.getStatusLine());
		    //Pobierz cialo odpowiedzi
		    HttpEntity encja = odpowiedz.getEntity();
		    //Utworz strumien do czytania ze strumienia encji
			BufferedReader rd = new BufferedReader(
					new InputStreamReader(encja.getContent()));
			//Utworz bufor wynikowy
			StringBuffer wynik = new StringBuffer();
			//Napelniamy bufor
			String linia = "";
			while ((linia = rd.readLine()) != null) {
				wynik.append(linia);
			}
			//Wypisz wynik z bufora
			System.out.println(wynik.toString());
		    //Zakoncz prace z encja
		    EntityUtils.consume(encja);
		} finally {
		    odpowiedz.close();
		}		
	}
}
