package com.jade.shelton.weather_map.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class QpfDay implements Serializable {

	private static final long serialVersionUID = -1397151955820603700L;

	private BigDecimal mm;
	private BigDecimal in;

	public BigDecimal getMm() {
		return mm;
	}

	public void setMm(BigDecimal input) {
		this.mm = input;
	}

	public BigDecimal getIn() {
		return in;
	}

	public void setIn(BigDecimal input) {
		this.in = input;
	}
}
