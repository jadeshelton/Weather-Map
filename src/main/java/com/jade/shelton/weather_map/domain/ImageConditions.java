package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageConditions implements Serializable {

	private static final long serialVersionUID = -4235634170491701494L;
	
	private String url;
	private String title;
	private String link;

	public String getUrl() {
		return url;
	}

	public void setUrl(String input) {
		this.url = input;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String input) {
		this.title = input;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String input) {
		this.link = input;
	}

}
