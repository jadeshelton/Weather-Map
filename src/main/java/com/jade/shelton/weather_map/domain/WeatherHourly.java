package com.jade.shelton.weather_map.domain;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherHourly {

	@JsonProperty("response")
	private ResponseHourly response;

	@JsonProperty("hourly_forecast")
	private List<HourlyForecast> hourlyForecast;

	private String url = "";

	WeatherHourly() {
	}

	WeatherHourly(String apiKey) {
		url += Weather.BASE_URL + apiKey + "/hourly/q/";
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

	public ResponseHourly getResponse() {
		return response;
	}

	public void setResponse(ResponseHourly input) {
		this.response = input;
	}

	public List<HourlyForecast> getHourlyForecast() {
		return hourlyForecast;
	}

	public void setHourlyForecast(List<HourlyForecast> input) {
		this.hourlyForecast = input;
	}

}
