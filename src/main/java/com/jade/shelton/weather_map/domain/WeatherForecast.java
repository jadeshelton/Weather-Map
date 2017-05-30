package com.jade.shelton.weather_map.domain;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class WeatherForecast implements Serializable {

	private static final long serialVersionUID = 5903486572757129273L;

	private Response response;
	private Forecast forecast;

	private String url = "";

	public WeatherForecast() {
	}

	protected WeatherForecast(String apiKey) {
		url += Weather.BASE_URL + apiKey + "/forecast/q/";
	}

	public String setParamsReturnUrl(String location) {
		String encodedUrl = null;
		try {
			encodedUrl = URLEncoder.encode(location, "UTF-8").replace("+", "%20");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		url += encodedUrl + ".json";
		return url;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response input) {
		this.response = input;
	}

	public Forecast getForecast() {
		return forecast;
	}

	public void setForecast(Forecast input) {
		this.forecast = input;
	}


}
