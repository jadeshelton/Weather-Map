package com.jade.shelton.weather_map.controller;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.Distance;
import com.jade.shelton.weather_map.domain.Greeting;
import com.jade.shelton.weather_map.domain.WeatherConditions;
import com.jade.shelton.weather_map.service.WeatherService;

@RestController
public class Controller {

	@Autowired
	WeatherService weatherService;

	private final String WAK = "f64431d8707664e0";

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyDuwGItqRqyYIlLiqwPSS6qgbOds0HAPkA")
			.setQueryRateLimit(3);


	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping(value = "/map/start/{start}/end/{end}")
	public DirectionsResult getDirections(@PathVariable String start, @PathVariable String end)
			throws ApiException, InterruptedException, IOException {
		DirectionsResult result = DirectionsApi.getDirections(context, start, end).await();
		return result;
	}

	@RequestMapping(value = "weather+map/start/{start}/end/{end}")
	public String getWAndD(@PathVariable String start, @PathVariable String end)
			throws ApiException, InterruptedException, IOException {
		DirectionsResult result = DirectionsApi.getDirections(context, start, end).await();
		WeatherConditions startCityCon = weatherService.getConditions(WAK, start);
		WeatherConditions endCityCon = weatherService.getConditions(WAK, end);

		Distance distance = result.routes[0].legs[0].distance;

		String startTemp = startCityCon.getTemperatureDesc();
		String endTemp = endCityCon.getTemperatureDesc();

		String info = "It is " + distance + " from " + start + " to " + end + ".  It is " + startTemp + " in " + start
				+ ", and it is " + endTemp + " in " + end + ".  Muthafucka";

		return info;
		// TODO: spaces mess with tempurature.
	}
}