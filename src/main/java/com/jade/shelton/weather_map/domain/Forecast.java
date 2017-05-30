package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast implements Serializable {

	private static final long serialVersionUID = -8453528600414493954L;

	private Simpleforecast simpleforecast;
	@JsonProperty("txt_forecast")
	private TxtForecast txtForecast;

	public Simpleforecast getSimpleforecast() {
		return simpleforecast;
	}

	public void setSimpleforecast(Simpleforecast input) {
		this.simpleforecast = input;
	}

	public TxtForecast getTxtForecast() {
		return txtForecast;
	}

	public void setTxtForecast(TxtForecast input) {
		this.txtForecast = input;
	}
}