package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

public class WeatherForecast2 implements Serializable {

	private static final long serialVersionUID = 5903486572757129273L;

	private Response response;
	private Forecast forecast;

	private String url = "";

	public WeatherForecast2() {

	}

	public WeatherForecast2(String apiKey) {
		// TODO: change this back to protected, from public
		url += Weather.BASE_URL + apiKey + "/forecast/q/";

	}

	public WeatherForecast2 setParameters(String location) {
		url += location + ".json";
		return this;
	}

	public String setParamsReturnUrl(String location) {
		url += location + ".json";
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
