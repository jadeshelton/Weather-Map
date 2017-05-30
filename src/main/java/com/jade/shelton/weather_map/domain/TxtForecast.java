package com.jade.shelton.weather_map.domain;

import java.util.List;

public class TxtForecast {

	private String date;
	private List<ForecastDayText> forecastday;

	public String getDate() {
		return date;
	}

	public void setDate(String input) {
		this.date = input;
	}

	public List<ForecastDayText> getForecastday() {
		return forecastday;
	}

	public void setForecastday(List<ForecastDayText> input) {
		this.forecastday = input;
	}
}
