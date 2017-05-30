package com.jade.shelton.weather_map.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecastday {
	private Date date;

	@JsonProperty("icon_url")
	private String iconUrl;

	private int period;
	private int maxhumidity;
	private String skyicon;
	private Avewind avewind;
	private String icon;
	private int avehumidity;

	@JsonProperty("snow_allday")
	private SnowAllday snowAllday;

	@JsonProperty("qpf_day")
	private QpfDay qpfDay;
	private Maxwind maxwind;
	private int pop;

	@JsonProperty("qpf_night")
	private QpfNight qpfNight;
	private High high;
	private int minhumidity;
	private Low low;

	@JsonProperty("snow_night")
	private SnowNight snowNight;

	@JsonProperty("snow_day")
	private SnowDay snowDay;
	private String conditions;

	@JsonProperty("qpf_allday")
	private QpfAllday qpfAllday;

	public Date getDate() {
		return date;
	}

	public void setDate(Date input) {
		this.date = input;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String input) {
		this.iconUrl = input;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int input) {
		this.period = input;
	}

	public int getMaxhumidity() {
		return maxhumidity;
	}

	public void setMaxhumidity(int input) {
		this.maxhumidity = input;
	}

	public String getSkyicon() {
		return skyicon;
	}

	public void setSkyicon(String input) {
		this.skyicon = input;
	}

	public Avewind getAvewind() {
		return avewind;
	}

	public void setAvewind(Avewind input) {
		this.avewind = input;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String input) {
		this.icon = input;
	}

	public int getAvehumidity() {
		return avehumidity;
	}

	public void setAvehumidity(int input) {
		this.avehumidity = input;
	}

	public SnowAllday getSnowAllday() {
		return snowAllday;
	}

	public void setSnowAllday(SnowAllday input) {
		this.snowAllday = input;
	}

	public QpfDay getQpfDay() {
		return qpfDay;
	}

	public void setQpfDay(QpfDay input) {
		this.qpfDay = input;
	}

	public Maxwind getMaxwind() {
		return maxwind;
	}

	public void setMaxwind(Maxwind input) {
		this.maxwind = input;
	}

	public int getPop() {
		return pop;
	}

	public void setPop(int input) {
		this.pop = input;
	}

	public QpfNight getQpfNight() {
		return qpfNight;
	}

	public void setQpfNight(QpfNight input) {
		this.qpfNight = input;
	}

	public High getHigh() {
		return high;
	}

	public void setHigh(High input) {
		this.high = input;
	}

	public int getMinhumidity() {
		return minhumidity;
	}

	public void setMinhumidity(int input) {
		this.minhumidity = input;
	}

	public Low getLow() {
		return low;
	}

	public void setLow(Low input) {
		this.low = input;
	}

	public SnowNight getSnowNight() {
		return snowNight;
	}

	public void setSnowNight(SnowNight input) {
		this.snowNight = input;
	}

	public SnowDay getSnowDay() {
		return snowDay;
	}

	public void setSnowDay(SnowDay input) {
		this.snowDay = input;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String input) {
		this.conditions = input;
	}

	public QpfAllday getQpfAllday() {
		return qpfAllday;
	}

	public void setQpfAllday(QpfAllday input) {
		this.qpfAllday = input;
	}
}
