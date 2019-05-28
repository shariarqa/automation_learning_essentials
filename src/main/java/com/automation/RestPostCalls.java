package com.automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.http.HttpResponse;

public class RestPostCalls {
	


	
	@Test
	public static void postMe() throws ClientProtocolException, IOException {
		HttpClient httpclient = HttpClients.createDefault();
		
		HttpPost post = new HttpPost("https://reqres.in/api/users");
		
		List<NameValuePair> params = new ArrayList<NameValuePair>(2);
		params.add(new BasicNameValuePair("name", "Joe"));
		params.add(new BasicNameValuePair("job", "IT"));
		
		post.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
		
		//Execute and get the response.
		HttpResponse response = (HttpResponse) httpclient.execute(post);
		HttpEntity entity = ((org.apache.http.HttpResponse) response).getEntity();
		
		if (entity != null) {
		    try (InputStream instream = entity.getContent()) {
		        // do something useful
		    }
		}
	}
	

}
