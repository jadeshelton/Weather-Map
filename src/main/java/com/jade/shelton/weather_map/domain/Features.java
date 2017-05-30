package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Features implements Serializable {

	private static final long serialVersionUID = -7392562384641418601L;

	private int forecast;

	public int getForecast() {
		return forecast;
	}

	public void setForecast(int input) {
		this.forecast = input;
	}
}