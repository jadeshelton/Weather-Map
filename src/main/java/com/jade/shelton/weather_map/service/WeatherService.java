package com.jade.shelton.weather_map.service;

import com.jade.shelton.weather_map.domain.WeatherConditions;
import com.jade.shelton.weather_map.domain.WeatherForecast;
import com.jade.shelton.weather_map.domain.WeatherHourly;

public interface WeatherService {

	WeatherForecast getForecast(String key, String city);

	WeatherConditions getConditions(String key, String city);

	WeatherHourly getHourly(String key, String city);

}
