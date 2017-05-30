package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

public class SnowAllday implements Serializable {

	private static final long serialVersionUID = -6922865980585228680L;

	private int in;
	private int cm;

	public int getIn() {
		return in;
	}

	public void setIn(int input) {
		this.in = input;
	}

	public int getCm() {
		return cm;
	}

	public void setCm(int input) {
		this.cm = input;
	}
}
