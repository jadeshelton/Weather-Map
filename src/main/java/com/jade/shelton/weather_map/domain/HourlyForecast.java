package com.jade.shelton.weather_map.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HourlyForecast {

	@JsonProperty("FCTTIME")
	private FCTTIMEHourly fcttime;
	private TempHourly temp;
	private DewpointHourly dewpoint;
	private String condition;
	private String icon;

	@JsonProperty("icon_url")
	private String iconUrl;
	private String fctcode;
	private String sky;
	private WspdHourly wspd;
	private WdirHourly wdir;
	private String wx;
	private String uvi;
	private String humidity;
	private WindchillHourly windchill;
	private HeatindexHourly heatindex;
	private FeelslikeHourly feelslike;
	private QpfHourly qpf;
	private SnowHourly snow;
	private String pop;
	private MslpHourly mslp;

	public FCTTIMEHourly getFCTTIME() {
		return fcttime;
	}

	public void setFCTTIME(FCTTIMEHourly input) {
		this.fcttime = input;
	}

	public TempHourly getTemp() {
		return temp;
	}

	public void setTemp(TempHourly input) {
		this.temp = input;
	}

	public DewpointHourly getDewpoint() {
		return dewpoint;
	}

	public void setDewpoint(DewpointHourly input) {
		this.dewpoint = input;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String input) {
		this.condition = input;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String input) {
		this.icon = input;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String input) {
		this.iconUrl = input;
	}

	public String getFctcode() {
		return fctcode;
	}

	public void setFctcode(String input) {
		this.fctcode = input;
	}

	public String getSky() {
		return sky;
	}

	public void setSky(String input) {
		this.sky = input;
	}

	public WspdHourly getWspd() {
		return wspd;
	}

	public void setWspd(WspdHourly input) {
		this.wspd = input;
	}

	public WdirHourly getWdir() {
		return wdir;
	}

	public void setWdir(WdirHourly input) {
		this.wdir = input;
	}

	public String getWx() {
		return wx;
	}

	public void setWx(String input) {
		this.wx = input;
	}

	public String getUvi() {
		return uvi;
	}

	public void setUvi(String input) {
		this.uvi = input;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String input) {
		this.humidity = input;
	}

	public WindchillHourly getWindchill() {
		return windchill;
	}

	public void setWindchill(WindchillHourly input) {
		this.windchill = input;
	}

	public HeatindexHourly getHeatindex() {
		return heatindex;
	}

	public void setHeatindex(HeatindexHourly input) {
		this.heatindex = input;
	}

	public FeelslikeHourly getFeelslike() {
		return feelslike;
	}

	public void setFeelslike(FeelslikeHourly input) {
		this.feelslike = input;
	}

	public QpfHourly getQpf() {
		return qpf;
	}

	public void setQpf(QpfHourly input) {
		this.qpf = input;
	}

	public SnowHourly getSnow() {
		return snow;
	}

	public void setSnow(SnowHourly input) {
		this.snow = input;
	}

	public String getPop() {
		return pop;
	}

	public void setPop(String input) {
		this.pop = input;
	}

	public MslpHourly getMslp() {
		return mslp;
	}

	public void setMslp(MslpHourly input) {
		this.mslp = input;
	}

}
