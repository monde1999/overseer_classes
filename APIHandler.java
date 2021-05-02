package com.adventurers.overseer.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class APIHandler {
    private static String username = "monching";
    private static String password = "desierto";
    private static String server = "http://192.168.1.10:8000/forecast";

    /*
    private static void authenticate(String url){
        HttpURLConnection c = null;
        try {
            URL u = new URL(url);
            c = (HttpURLConnection) u.openConnection();
            String userpass = username + ":" + password;
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userpass.getBytes()));
            c.setRequestProperty("Authorization", basicAuth);
            c.connect();
            c.disconnect();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    } */

    public static String getServer() {
        return server;
    }

    public static String getJSON(String url, int timeout) {
        HttpURLConnection c = null;
        try {
            URL u = new URL(url);
            c = (HttpURLConnection) u.openConnection();
            c.setRequestMethod("GET");
            c.setRequestProperty("Content-length", "0");
            c.setUseCaches(false);
            c.setAllowUserInteraction(false);
            c.setConnectTimeout(timeout);
            c.setReadTimeout(timeout);
            c.connect();
            int status = c.getResponseCode();
    
            switch (status) {
                case 200:
                case 201:
                    BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        sb.append(line).append("\n");
                    }
                    br.close();
                    return sb.toString();
            }
    
        } catch (MalformedURLException ex) {
            //Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (IOException ex) {
            //Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } finally {
           if (c != null) {
              try {
                  c.disconnect();
              } catch (Exception ex) {
                 //Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                 ex.printStackTrace();
              }
           }
        }
        return null;
    }
}
