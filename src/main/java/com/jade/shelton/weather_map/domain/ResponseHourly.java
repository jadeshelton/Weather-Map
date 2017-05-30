package com.jade.shelton.weather_map.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseHourly {

	private String version;
	private String termsofService;
	private FeaturesHourly features;

	public String getVersion() {
		return version;
	}

	public void setVersion(String input) {
		this.version = input;
	}

	public String getTermsofService() {
		return termsofService;
	}

	public void setTermsofService(String input) {
		this.termsofService = input;
	}

	public FeaturesHourly getFeatures() {
		return features;
	}

	public void setFeatures(FeaturesHourly input) {
		this.features = input;
	}

}
