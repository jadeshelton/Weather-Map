package com.jade.shelton.weather_map.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WindchillHourly {

	private String english;
	private String metric;

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String input) {
		this.english = input;
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String input) {
		this.metric = input;
	}

}
