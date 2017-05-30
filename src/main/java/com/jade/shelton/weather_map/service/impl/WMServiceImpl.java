package com.jade.shelton.weather_map.service.impl;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.DirectionsStep;
import com.google.maps.model.Distance;
import com.jade.shelton.weather_map.service.WMService;

@Service
public class WMServiceImpl implements WMService {

	private GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyDuwGItqRqyYIlLiqwPSS6qgbOds0HAPkA")
			.setQueryRateLimit(3);

	public DirectionsResult getDirections(String start, String end)
			throws ApiException, InterruptedException, IOException {
		DirectionsResult result = DirectionsApi.getDirections(context, start, end).await();
		return result;
	}

	public void testingThings() throws ApiException, InterruptedException, IOException, JSONException {
		System.out.println("new one");
		String start = "Portland, OR";
		String end = "Seattle, WA";
		DirectionsResult result = DirectionsApi.getDirections(context, start, end).await();
		// String str = result.toString();
		// System.out.println("string here " + str);

		// parse results to JSON
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String str = ow.writeValueAsString(result);
		// JSONArray tsmresponse = null;
		JsonParser jp = new JsonParser();
		JsonElement obj = jp.parse(str);
		// ArrayList<String> list = new ArrayList<String>();
		// System.out.println("obj" + obj);

		Distance distance = result.routes[0].legs[0].distance;
		// System.out.println("result" +
		// result.routes[0].legs[0].endAddress.toString());

		// System.out.println("heyh ey there " +
		// result.routes[0].legs[0].steps[0].duration.inSeconds);
		System.out.println("Distance is " + distance);

		// figure out the total time - can get it from outside json
		DirectionsStep[] steps = result.routes[0].legs[0].steps;
		Long seconds = 0L;
		for (int i = 0; i < steps.length; i++) {
			seconds = seconds + (steps[i].duration.inSeconds);
		}

		System.out.println("minutes to travel: " + seconds + " in minutes " + seconds / 60);

	}

}
