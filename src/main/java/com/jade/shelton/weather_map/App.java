package com.jade.shelton.weather_map;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.google.maps.errors.ApiException;
import com.jade.shelton.weather_map.service.WMService;
import com.jade.shelton.weather_map.service.impl.WMServiceImpl;

@ComponentScan(basePackages = { "com.jade.shelton.weather_map" })
@SpringBootApplication
public class App {
	
	@Autowired
	WMService wmServiceImpl;


	public static void main(String[] args) throws ApiException, InterruptedException, IOException, JSONException {
		SpringApplication.run(App.class, args);
		System.out.println("dodo");
		try {
			new WMServiceImpl().testingThings();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
