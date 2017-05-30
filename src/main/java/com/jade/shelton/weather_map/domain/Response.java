package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

public class Response implements Serializable {

	private static final long serialVersionUID = 4663338150637440528L;

	private Features features;
	private String version;
	private String termsofService;

	public Features getFeatures() {
		return features;
	}

	public void setFeatures(Features input) {
		this.features = input;
	}

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
}