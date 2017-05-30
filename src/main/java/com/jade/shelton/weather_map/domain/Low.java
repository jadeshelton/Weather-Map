package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

public class Low implements Serializable {

	private static final long serialVersionUID = -7708824026219458117L;

	private String celsius;
	private String fahrenheit;

	public String getCelsius() {
		return celsius;
	}

	public void setCelsius(String input) {
		this.celsius = input;
	}

	public String getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(String input) {
		this.fahrenheit = input;
	}
}