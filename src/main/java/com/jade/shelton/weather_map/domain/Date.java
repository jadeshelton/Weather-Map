package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Date implements Serializable {

	private static final long serialVersionUID = -1735892402267045229L;

	@JsonProperty("tz_short")
	private String tzShort;
	private String pretty;
	private String ampm;
	private int year;
	private String isdst;
	private String weekday;

	@JsonProperty("weekday_short")
	private String weekdayShort;
	private String epoch;
	private int sec;
	private String min;
	private int month;
	private int hour;

	@JsonProperty("monthname_short")
	private String monthnameShort;
	private String monthname;

	@JsonProperty("tz_long")
	private String tzLong;
	private int yday;
	private int day;

	public String getTzShort() {
		return tzShort;
	}

	public void setTzShort(String input) {
		this.tzShort = input;
	}

	public String getPretty() {
		return pretty;
	}

	public void setPretty(String input) {
		this.pretty = input;
	}

	public String getAmpm() {
		return ampm;
	}

	public void setAmpm(String input) {
		this.ampm = input;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int input) {
		this.year = input;
	}

	public String getIsdst() {
		return isdst;
	}

	public void setIsdst(String input) {
		this.isdst = input;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String input) {
		this.weekday = input;
	}

	public String getWeekdayShort() {
		return weekdayShort;
	}

	public void setWeekdayShort(String input) {
		this.weekdayShort = input;
	}

	public String getEpoch() {
		return epoch;
	}

	public void setEpoch(String input) {
		this.epoch = input;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int input) {
		this.sec = input;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String input) {
		this.min = input;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int input) {
		this.month = input;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int input) {
		this.hour = input;
	}

	public String getMonthnameShort() {
		return monthnameShort;
	}

	public void setMonthnameShort(String input) {
		this.monthnameShort = input;
	}

	public String getMonthname() {
		return monthname;
	}

	public void setMonthname(String input) {
		this.monthname = input;
	}

	public String getTzLong() {
		return tzLong;
	}

	public void setTzLong(String input) {
		this.tzLong = input;
	}

	public int getYday() {
		return yday;
	}

	public void setYday(int input) {
		this.yday = input;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int input) {
		this.day = input;
	}
}
