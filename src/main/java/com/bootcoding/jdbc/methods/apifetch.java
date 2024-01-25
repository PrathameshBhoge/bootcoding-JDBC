package com.bootcoding.jdbc.methods;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class apifetch {
    public static void main(String[] args) {
       
            String apiKey = "political jocks";
            String apiUrl = "https://api.coindesk.com/v1/bpi/currentprice.json"; // Replace with the actual API endpoint

            HttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(apiUrl);
            httpGet.setHeader("Authorization", "Bearer " + apiKey);

            try {
                HttpResponse response = httpClient.execute(httpGet);
                int statusCode = response.getStatusLine().getStatusCode();
                if (statusCode == 200) {
                    String responseBody = EntityUtils.toString(response.getEntity());
                    System.out.println("API Response: " + responseBody);
                } else {
                    System.err.println("API Request failed with status code: " + statusCode);
                }
                
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
}
