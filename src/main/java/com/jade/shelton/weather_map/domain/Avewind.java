package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Avewind implements Serializable {

	private static final long serialVersionUID = -1441413331118798809L;

	private int kph;
	private int mph;
	private String dir;
	private int degrees;

	public int getKph() {
		return kph;
	}

	public void setKph(int input) {
		this.kph = input;
	}

	public int getMph() {
		return mph;
	}

	public void setMph(int input) {
		this.mph = input;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String input) {
		this.dir = input;
	}

	public int getDegrees() {
		return degrees;
	}

	public void setDegrees(int input) {
		this.degrees = input;
	}
}
