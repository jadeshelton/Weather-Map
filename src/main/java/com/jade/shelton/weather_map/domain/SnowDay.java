package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

public class SnowDay implements Serializable {

	private static final long serialVersionUID = 2499945914631189493L;

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
