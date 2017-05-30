package com.jade.shelton.weather_map.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FCTTIMEHourly {

	private String hour;

	@JsonProperty("hour_padded")
	private String hourPadded;
	private String min;

	@JsonProperty("min_unpadded")
	private String minUnpadded;
	private String sec;
	private String year;
	private String mon;

	@JsonProperty("mon_padded")
	private String monPadded;

	@JsonProperty("mon_abbrev")
	private String monAbbrev;
	private String mday;

	@JsonProperty("mday_padded")
	private String mdayPadded;
	private String yday;
	private String isdst;
	private String epoch;
	private String pretty;
	private String civil;

	@JsonProperty("month_name")
	private String monthName;

	@JsonProperty("month_name_abbrev")
	private String monthNameAbbrev;

	@JsonProperty("weekday_name")
	private String weekdayName;

	@JsonProperty("weekday_name_night")
	private String weekdayNameNight;

	@JsonProperty("weekday_name_abbrev")
	private String weekdayNameAbbrev;

	@JsonProperty("weekday_name_unlang")
	private String weekdayNameUnlang;

	@JsonProperty("weekday_name_night_unlang")
	private String weekdayNameNightUnlang;
	private String ampm;
	private String tz;
	private String age;

	@JsonProperty("UTCDATE")
	private String uTCDATE;

	public String getHour() {
		return hour;
	}

	public void setHour(String input) {
		this.hour = input;
	}

	public String getHourPadded() {
		return hourPadded;
	}

	public void setHourPadded(String input) {
		this.hourPadded = input;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String input) {
		this.min = input;
	}

	public String getMinUnpadded() {
		return minUnpadded;
	}

	public void setMinUnpadded(String input) {
		this.minUnpadded = input;
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String input) {
		this.sec = input;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String input) {
		this.year = input;
	}

	public String getMon() {
		return mon;
	}

	public void setMon(String input) {
		this.mon = input;
	}

	public String getMonPadded() {
		return monPadded;
	}

	public void setMonPadded(String input) {
		this.monPadded = input;
	}

	public String getMonAbbrev() {
		return monAbbrev;
	}

	public void setMonAbbrev(String input) {
		this.monAbbrev = input;
	}

	public String getMday() {
		return mday;
	}

	public void setMday(String input) {
		this.mday = input;
	}

	public String getMdayPadded() {
		return mdayPadded;
	}

	public void setMdayPadded(String input) {
		this.mdayPadded = input;
	}

	public String getYday() {
		return yday;
	}

	public void setYday(String input) {
		this.yday = input;
	}

	public String getIsdst() {
		return isdst;
	}

	public void setIsdst(String input) {
		this.isdst = input;
	}

	public String getEpoch() {
		return epoch;
	}

	public void setEpoch(String input) {
		this.epoch = input;
	}

	public String getPretty() {
		return pretty;
	}

	public void setPretty(String input) {
		this.pretty = input;
	}

	public String getCivil() {
		return civil;
	}

	public void setCivil(String input) {
		this.civil = input;
	}

	public String getMonthName() {
		return monthName;
	}

	public void setMonthName(String input) {
		this.monthName = input;
	}

	public String getMonthNameAbbrev() {
		return monthNameAbbrev;
	}

	public void setMonthNameAbbrev(String input) {
		this.monthNameAbbrev = input;
	}

	public String getWeekdayName() {
		return weekdayName;
	}

	public void setWeekdayName(String input) {
		this.weekdayName = input;
	}

	public String getWeekdayNameNight() {
		return weekdayNameNight;
	}

	public void setWeekdayNameNight(String input) {
		this.weekdayNameNight = input;
	}

	public String getWeekdayNameAbbrev() {
		return weekdayNameAbbrev;
	}

	public void setWeekdayNameAbbrev(String input) {
		this.weekdayNameAbbrev = input;
	}

	public String getWeekdayNameUnlang() {
		return weekdayNameUnlang;
	}

	public void setWeekdayNameUnlang(String input) {
		this.weekdayNameUnlang = input;
	}

	public String getWeekdayNameNightUnlang() {
		return weekdayNameNightUnlang;
	}

	public void setWeekdayNameNightUnlang(String input) {
		this.weekdayNameNightUnlang = input;
	}

	public String getAmpm() {
		return ampm;
	}

	public void setAmpm(String input) {
		this.ampm = input;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String input) {
		this.tz = input;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String input) {
		this.age = input;
	}

	public String getUTCDATE() {
		return uTCDATE;
	}

	public void setUTCDATE(String input) {
		this.uTCDATE = input;
	}
}
