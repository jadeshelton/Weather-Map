package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastDayText implements Serializable {

	private static final long serialVersionUID = -4802594207307916131L;


	@JsonProperty("icon_url")
	private String iconUrl;
	private String fcttext;
	private String pop;
	private int period;
	private String icon;
	private String title;

	@JsonProperty("fcttext_metric")
	private String fcttextMetric;

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String input) {
		this.iconUrl = input;
	}

	public String getFcttext() {
		return fcttext;
	}

	public void setFcttext(String input) {
		this.fcttext = input;
	}

	public String getPop() {
		return pop;
	}

	public void setPop(String input) {
		this.pop = input;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int input) {
		this.period = input;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String input) {
		this.icon = input;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String input) {
		this.title = input;
	}

	public String getFcttextMetric() {
		return fcttextMetric;
	}

	public void setFcttextMetric(String input) {
		this.fcttextMetric = input;
	}
}
