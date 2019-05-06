package br.com.casamagalhaes.panamah.sdk;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PanamahUtil {

	public static String stamp(Date d) {
		return new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-SSS").format(d);
	}

	public static Gson buildGson() {
		return new GsonBuilder().registerTypeAdapter(Date.class, new GsonUTCDateAdapter()).create();
	}

	// https://hc.apache.org/httpcomponents-client-ga/tutorial/html/fluent.html
	public static String send(PanamahConfig config, PanamahLote lote) throws ClientProtocolException, IOException {
		String res = Request.Post(config.getAddr())//
				.bodyString(buildGson().toJson(lote), ContentType.APPLICATION_JSON)//
				.addHeader("x-api-key", config.getApiKey())//
				.execute().returnContent().asString();
		return res;
	}
}
