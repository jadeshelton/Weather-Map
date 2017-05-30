package com.jade.shelton.weather_map.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeaturesHourly {

	private int hourly;

	public int getHourly() {
		return hourly;
	}

	public void setHourly(int input) {
		this.hourly = input;
	}

}
