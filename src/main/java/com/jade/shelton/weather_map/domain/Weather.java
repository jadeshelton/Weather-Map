package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

import com.jade.shelton.weather_map.resources.EasyApiObject;

public class Weather extends EasyApiObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3797435200745446335L;
	private String apiKey;
	protected static String BASE_URL = "http://api.wunderground.com/api/";

	/**
	 * Create a Weather Underground API object, which will provide factories to
	 * access the API components and services available
	 * 
	 * @param apiKey
	 *            Your API key generated from the Weather Underground website
	 */
	public Weather(String apiKey) {

		this.apiKey = apiKey;

	}

	/**
	 * Instantiates a new conditions object Can be used to retrieve current
	 * conditions in a given location
	 * 
	 * @return WUConditions object for current weather information
	 */
	public WeatherConditions createConditionsObject() {
		return new WeatherConditions(apiKey);
	}

	public WeatherForecast2 createForecastObject() {
		return new WeatherForecast2(apiKey);
	}

	@Override
	public String[] getPossibleRequests() {

		String[] possibleRequests = {

				"alerts", "almanac", "astronomy", "conditions", "currenthurricane", "forecast", "forecast10day",
				"geolookup", "history", "hourly", "hourly10day", "planner", "rawtide", "tide", "webcams", "yesterday"

		};

		return possibleRequests;

	}

}
