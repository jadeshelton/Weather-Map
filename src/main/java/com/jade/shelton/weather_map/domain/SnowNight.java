package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

public class SnowNight implements Serializable {

	private static final long serialVersionUID = -639408145133925022L;

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