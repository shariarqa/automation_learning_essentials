package com.automation;


import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;

import org.apache.http.impl.client.HttpClients;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;


public class RestCalls {
	String webServiceUrl = "https://reqres.in/api/users";
	CloseableHttpClient httpclient = HttpClients.createDefault();

	@Test
	public void getUrl() throws ClientProtocolException, IOException {
		
	HttpGet myGetRequest = new HttpGet(webServiceUrl);
		
	org.apache.http.HttpResponse myHttpResponse = httpclient.execute(myGetRequest);
	
	int statusCode = myHttpResponse.getStatusLine().getStatusCode(); // Getting the Code
	System.out.println("Status Code ---->>" + statusCode); // printing the status code

	System.out.println(myHttpResponse.getEntity().getContent());
	
	BufferedReader br = new BufferedReader(new InputStreamReader(myHttpResponse.getEntity().getContent()));
	String readLine;

	while (((readLine = br.readLine()) != null)) {

		System.out.println("Response JSON from API --->" + br);
	}

	br.close();
	}

}
