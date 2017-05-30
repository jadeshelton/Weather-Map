package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ObservationLocationConditions implements Serializable {

	private static final long serialVersionUID = -7751797448250583809L;

	private String full;
	private String city;
	private String state;
	private String country;

	@JsonProperty("country_iso3166")
	private String countryIso3166;
	private String latitude;
	private String longitude;
	private String elevation;

	public String getFull() {
		return full;
	}

	public void setFull(String input) {
		this.full = input;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String input) {
		this.city = input;
	}

	public String getState() {
		return state;
	}

	public void setState(String input) {
		this.state = input;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String input) {
		this.country = input;
	}

	public String getCountryIso3166() {
		return countryIso3166;
	}

	public void setCountryIso3166(String input) {
		this.countryIso3166 = input;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String input) {
		this.latitude = input;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String input) {
		this.longitude = input;
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String input) {
		this.elevation = input;
	}

}
