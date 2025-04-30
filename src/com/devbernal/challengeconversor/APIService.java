package com.devbernal.challengeconversor;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIService {
    private final String apiKey = "cb055e6446d784bc9c59deba"; //

    public double obtenerTasaCambio(Divisa from, Divisa to) throws Exception {
        String urlStr = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s",
                apiKey, from, to);
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = in.readLine()) != null) {
            response.append(line);
        }
        in.close();

        JSONObject json = new JSONObject(response.toString());
        return json.getDouble("conversion_rate");
    }
}
