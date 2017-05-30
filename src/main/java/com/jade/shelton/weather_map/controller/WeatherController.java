package com.jade.shelton.weather_map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jade.shelton.weather_map.domain.WeatherConditions;
import com.jade.shelton.weather_map.domain.WeatherForecast2;
import com.jade.shelton.weather_map.service.WeatherService;

/**
 * http://www.programcreek.com/java-api-examples/index.php?source_dir=EasyAPI-master/src/weatherunderground/WUConditions.java
 * 
 * @author jadeshelton
 *
 */

@RestController
public class WeatherController {

	@Autowired
	WeatherService service;

	private final String ak = "f64431d8707664e0";

	@RequestMapping(value = "/weather/city/{city}")
	public Object getWeatherData(@PathVariable String city) {
		WeatherConditions conditions = service.getConditions(ak, city);
		return conditions;

	}

	@RequestMapping(value = "/forecast/city/{city}")
	public Object getForecastData(@PathVariable String city) {
		WeatherForecast2 forecast = service.getForecast(ak, city);
		return forecast;

	}
}
