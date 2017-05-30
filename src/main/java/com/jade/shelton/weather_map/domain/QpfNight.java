package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

public class QpfNight implements Serializable {

	private static final long serialVersionUID = -730066595776913235L;

	private int mm;
	private int in;

	public int getMm() {
		return mm;
	}

	public void setMm(int input) {
		this.mm = input;
	}

	public int getIn() {
		return in;
	}

	public void setIn(int input) {
		this.in = input;
	}
}