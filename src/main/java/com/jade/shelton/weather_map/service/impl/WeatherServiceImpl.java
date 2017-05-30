package com.jade.shelton.weather_map.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jade.shelton.weather_map.domain.Weather;
import com.jade.shelton.weather_map.domain.WeatherConditions;
import com.jade.shelton.weather_map.domain.WeatherForecast;
import com.jade.shelton.weather_map.domain.WeatherHourly;
import com.jade.shelton.weather_map.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	public WeatherHourly getHourly(String key, String city) {
		Weather weatherObject = new Weather(key);
		WeatherHourly hourly = weatherObject.createHourlyObject();
		String url = hourly.setParamsReturnUrl(city);
		hourly = downloadHourly(hourly, url);

		return hourly;

	}

	public WeatherConditions getConditions(String key, String city) {
		Weather weatherObject = new Weather(key);
		WeatherConditions conditions = weatherObject.createConditionsObject();
		String url = conditions.setParamsReturnUrl(city);
		conditions = downloadConditions(conditions, url);

		return conditions;
	}

	public WeatherForecast getForecast(String key, String city) {
		Weather weatherObject = new Weather(key);
		WeatherForecast forecast = weatherObject.createForecastObject();
		String url = forecast.setParamsReturnUrl(city);
		forecast = downloadConditions(forecast, url);

		return forecast;

	}

	private WeatherHourly downloadHourly(WeatherHourly hourly, String url) {
		JSONObject result;
		String json = "";
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

		try {
			result = constructJSON(url);
			json = result.toString();
			mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
			hourly = mapper.readValue(json, WeatherHourly.class);

		} catch (Exception e1) {

			e1.printStackTrace();
			System.out.println("There was a problem " + e1);
		}

		return hourly;
	}

	private WeatherConditions downloadConditions(WeatherConditions conditions, String url) {
		JSONObject result;
		String json = "";
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

		try {
			result = constructJSON(url);
			json = result.toString();
			mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
			conditions = mapper.readValue(json, WeatherConditions.class);

		} catch (Exception e1) {

			e1.printStackTrace();
			System.out.println("There was a problem " + e1);
		}

		return conditions;
	}

	private WeatherForecast downloadConditions(WeatherForecast forecast, String url) {
		JSONObject result;
		String json = "";
		try {
			result = constructJSON(url);
			json = result.toString();
			forecast = new ObjectMapper().readValue(json, WeatherForecast.class);

		} catch (Exception e1) {

			e1.printStackTrace();
			System.out.println("There was a problem " + e1);
		}

		return forecast;
	}

	private JSONObject constructJSON(String URL) {

		String content = "";

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
