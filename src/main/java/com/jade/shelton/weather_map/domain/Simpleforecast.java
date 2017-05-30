package com.jade.shelton.weather_map.domain;

import java.io.Serializable;
import java.util.List;

public class Simpleforecast implements Serializable {

	private static final long serialVersionUID = -10978839883230253L;

	private List<Forecastday> forecastday;

	public List<Forecastday> getForecastday() {
	  	return forecastday; 
	  }

	public void setForecastday(List<Forecastday> input) {
	  	 this.forecastday = input;
	  }
}