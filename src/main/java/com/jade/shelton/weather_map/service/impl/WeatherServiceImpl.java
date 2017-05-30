package com.jade.shelton.weather_map.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jade.shelton.weather_map.domain.Weather;
import com.jade.shelton.weather_map.domain.WeatherConditions;
import com.jade.shelton.weather_map.domain.WeatherForecast2;
import com.jade.shelton.weather_map.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	public WeatherConditions getConditions(String key, String city) {
		Weather weatherObject = new Weather(key);
		WeatherConditions conditions = weatherObject.createConditionsObject();
		try {
			conditions.setParameters(city).downloadData();
			System.out.println(conditions.getTemperatureF() + "F is the temp in " + city);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conditions;

	}

	/*
	 * public WeatherForecast getForecast(String key, String city) { Weather
	 * weatherObject = new Weather(key); WeatherForecast forecast =
	 * weatherObject.createForecastObject(); try {
	 * forecast.setParameters(city).downloadData();
	 * System.out.println(forecast.getTemperatureF() + "F is the temp in " +
	 * city);
	 * 
	 * } catch (Exception e) { System.out.println(e.getMessage()); } return
	 * forecast;
	 * 
	 * }
	 */

	public WeatherForecast2 getForecast(String key, String city) {
		Weather weatherObject = new Weather(key);
		WeatherForecast2 forecast = weatherObject.createForecastObject();
		// forecast.setParameters(city).downloadDataHere();
		String url = forecast.setParamsReturnUrl(city);
		forecast = downloadDataHere(forecast, url);

		return forecast;

	}

	// TODO: things aren't mapping to my created objects. WHY????
	public WeatherForecast2 downloadDataHere(WeatherForecast2 forecast, String url) {
		JSONObject result;
		String json = "";
		try {
			result = constructJSON(url);
			json = result.toString();
			forecast = new ObjectMapper().readValue(json, WeatherForecast2.class);

		} catch (Exception e1) {

			e1.printStackTrace();
			System.out.println("There was a problem " + e1);
		}

		return forecast;
	}

	public static JSONObject constructJSON(String URL) {

		String content = "";
		URL.replace(" ", "%20");

		try {

			URL Url = new URL(URL);
			URLConnection conn = Url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				content += line + "\n";
			}
			bufferedReader.close();

			return new JSONObject(content);

		} catch (Exception e) {
			System.out.println(content);
			System.out.println("Error occurred: " + e);
			return new JSONObject();
		}

	}

}
