package com.jade.shelton.weather_map.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WdirHourly {

	private String dir;
	private String degrees;

	public String getDir() {
		return dir;
	}

	public void setDir(String input) {
		this.dir = input;
	}

	public String getDegrees() {
		return degrees;
	}

	public void setDegrees(String input) {
		this.degrees = input;
	}

}
