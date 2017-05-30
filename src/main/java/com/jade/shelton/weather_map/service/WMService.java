package com.jade.shelton.weather_map.service;

import java.io.IOException;

import org.json.JSONException;

import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsResult;

public interface WMService {

	DirectionsResult getDirections(String start, String end) throws ApiException, InterruptedException, IOException;

	void testingThings() throws ApiException, InterruptedException, IOException, JSONException;

}
