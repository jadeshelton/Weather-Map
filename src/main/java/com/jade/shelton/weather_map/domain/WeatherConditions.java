package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherConditions implements Serializable {

	private static final long serialVersionUID = 8881640767356305071L;

	@JsonProperty("response")
	private ResponseConditions response;

	@JsonProperty("current_observation")
	private CurrentObservationConditions currentObservation;

	private String url = "";

	public WeatherConditions() {

	}

	protected WeatherConditions(String apiKey) {
		url += Weather.BASE_URL + apiKey + "/conditions/q/";
	}

	public String setParamsReturnUrl(String location) {
		url += location + ".json";
		return url;
	}

	public ResponseConditions getResponse() {
		return response;
	}

	public void setResponse(ResponseConditions input) {
		this.response = input;
	}

	public CurrentObservationConditions getCurrentObservation() {
		return currentObservation;
	}

	public void setCurrentObservation(CurrentObservationConditions input) {
		this.currentObservation = input;
	}

}
