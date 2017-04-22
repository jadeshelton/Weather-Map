package com.jade.shelton.weather_map.controller;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsResult;
import com.jade.shelton.weather_map.domain.Greeting;


@RestController
public class Controller {

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

}