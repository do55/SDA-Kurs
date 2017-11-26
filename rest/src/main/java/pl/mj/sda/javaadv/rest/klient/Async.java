package pl.mj.sda.javaadv.rest.klient;

import java.util.concurrent.Future;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;

public class Async {

	public static void main(String[] args) {
		CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
	    final HttpGet zadanie = new HttpGet("http://www.apache.org/");
//	    Future<HttpResponse> future = httpclient.execute(zadanie, null);
//	    HttpResponse response1 = future.get();		
	}
}
