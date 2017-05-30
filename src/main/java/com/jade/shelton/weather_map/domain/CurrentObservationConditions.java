package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentObservationConditions implements Serializable {

	private static final long serialVersionUID = 823367718406861545L;

	@JsonProperty("image")
	private ImageConditions image;

	@JsonProperty("display_location")
	private DisplayLocationConditions displayLocation;

	@JsonProperty("observation_location")
	private ObservationLocationConditions observationLocation;

	@JsonProperty("estimated")
	private EstimatedConditions estimated;

	@JsonProperty("station_id")
	private String stationId;

	@JsonProperty("observation_time")
	private String observationTime;

	@JsonProperty("observation_time_rfc822")
	private String observationTimeRfc822;

	@JsonProperty("observation_epoch")
	private String observationEpoch;

	@JsonProperty("local_time_rfc822")
	private String localTimeRfc822;

	@JsonProperty("local_epoch")
	private String localEpoch;

	@JsonProperty("local_tz_short")
	private String localTzShort;

	@JsonProperty("local_tz_long")
	private String localTzLong;

	@JsonProperty("local_tz_offset")
	private String localTzOffset;

	private String weather;

	@JsonProperty("temperature_string")
	private String temperatureString;

	@JsonProperty("temp_f")
	private int tempF;

	@JsonProperty("temp_c")
	private int tempC;

	@JsonProperty("relative_humidity")
	private String relativeHumidity;

	@JsonProperty("wind_string")
	private String windString;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("wind_degrees")
	private int windDegrees;

	@JsonProperty("wind_mph")
	private int windMph;

	@JsonProperty("wind_gust_mph")
	private String windGustMph;

	@JsonProperty("wind_kph")
	private int windKph;

	@JsonProperty("wind_gust_kph")
	private String windGustKph;

	@JsonProperty("pressure_mb")
	private String pressureMb;

	@JsonProperty("pressure_in")
	private String pressureIn;

	@JsonProperty("pressure_trend")
	private String pressureTrend;

	@JsonProperty("dewpoint_string")
	private String dewpointString;

	@JsonProperty("dewpoint_f")
	private int dewpointF;

	@JsonProperty("dewpoint_c")
	private int dewpointC;

	@JsonProperty("heat_index_string")
	private String heatIndexString;

	@JsonProperty("heat_index_f")
	private String heatIndexF;

	@JsonProperty("heat_index_c")
	private String heatIndexC;

	@JsonProperty("windchill_string")
	private String windchillString;

	@JsonProperty("windchill_f")
	private String windchillF;

	@JsonProperty("windchill_c")
	private String windchillC;

	@JsonProperty("feelslike_string")
	private String feelslikeString;

	@JsonProperty("feelslike_f")
	private String feelslikeF;

	@JsonProperty("feelslike_c")
	private String feelslikeC;

	@JsonProperty("visibility_mi")
	private String visibilityMi;

	@JsonProperty("visibility_km")
	private String visibilityKm;

	private String solarradiation;

	@JsonProperty("UV")
	private String uV;

	@JsonProperty("precip_1hr_string")
	private String precip1hrString;

	@JsonProperty("precip_1hr_in")
	private String precip1hrIn;

	@JsonProperty("precip_1hr_metric")
	private String precip1hrMetric;

	@JsonProperty("precip_today_string")
	private String precipTodayString;

	@JsonProperty("precip_today_in")
	private String precipTodayIn;

	@JsonProperty("precip_today_metric")
	private String precipTodayMetric;

	private String icon;

	@JsonProperty("icon_url")
	private String iconUrl;

	@JsonProperty("forecast_url")
	private String forecastUrl;

	@JsonProperty("history_url")
	private String historyUrl;

	@JsonProperty("ob_url")
	private String obUrl;

	@JsonProperty("now_cast")
	private String nowcast;

	public ImageConditions getImage() {
		return image;
	}

	public void setImage(ImageConditions input) {
		this.image = input;
	}

	public DisplayLocationConditions getDisplayLocation() {
		return displayLocation;
	}

	public void setDisplayLocation(DisplayLocationConditions input) {
		this.displayLocation = input;
	}

	public ObservationLocationConditions getObservationLocation() {
		return observationLocation;
	}

	public void setObservationLocation(ObservationLocationConditions input) {
		this.observationLocation = input;
	}

	public EstimatedConditions getEstimated() {
		return estimated;
	}

	public void setEstimated(EstimatedConditions input) {
		this.estimated = input;
	}

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String input) {
		this.stationId = input;
	}

	public String getObservationTime() {
		return observationTime;
	}

	public void setObservationTime(String input) {
		this.observationTime = input;
	}

	public String getObservationTimeRfc822() {
		return observationTimeRfc822;
	}

	public void setObservationTimeRfc822(String input) {
		this.observationTimeRfc822 = input;
	}

	public String getObservationEpoch() {
		return observationEpoch;
	}

	public void setObservationEpoch(String input) {
		this.observationEpoch = input;
	}

	public String getLocalTimeRfc822() {
		return localTimeRfc822;
	}

	public void setLocalTimeRfc822(String input) {
		this.localTimeRfc822 = input;
	}

	public String getLocalEpoch() {
		return localEpoch;
	}

	public void setLocalEpoch(String input) {
		this.localEpoch = input;
	}

	public String getLocalTzShort() {
		return localTzShort;
	}

	public void setLocalTzShort(String input) {
		this.localTzShort = input;
	}

	public String getLocalTzLong() {
		return localTzLong;
	}

	public void setLocalTzLong(String input) {
		this.localTzLong = input;
	}

	public String getLocalTzOffset() {
		return localTzOffset;
	}

	public void setLocalTzOffset(String input) {
		this.localTzOffset = input;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String input) {
		this.weather = input;
	}

	public String getTemperatureString() {
		return temperatureString;
	}

	public void setTemperatureString(String input) {
		this.temperatureString = input;
	}

	public int getTempF() {
		return tempF;
	}

	public void setTempF(int input) {
		this.tempF = input;
	}

	public int getTempC() {
		return tempC;
	}

	public void setTempC(int input) {
		this.tempC = input;
	}

	public String getRelativeHumidity() {
		return relativeHumidity;
	}

	public void setRelativeHumidity(String input) {
		this.relativeHumidity = input;
	}

	public String getWindString() {
		return windString;
	}

	public void setWindString(String input) {
		this.windString = input;
	}

	public String getWindDir() {
		return windDir;
	}

	public void setWindDir(String input) {
		this.windDir = input;
	}

	public int getWindDegrees() {
		return windDegrees;
	}

	public void setWindDegrees(int input) {
		this.windDegrees = input;
	}

	public int getWindMph() {
		return windMph;
	}

	public void setWindMph(int input) {
		this.windMph = input;
	}

	public String getWindGustMph() {
		return windGustMph;
	}

	public void setWindGustMph(String input) {
		this.windGustMph = input;
	}

	public int getWindKph() {
		return windKph;
	}

	public void setWindKph(int input) {
		this.windKph = input;
	}

	public String getWindGustKph() {
		return windGustKph;
	}

	public void setWindGustKph(String input) {
		this.windGustKph = input;
	}

	public String getPressureMb() {
		return pressureMb;
	}

	public void setPressureMb(String input) {
		this.pressureMb = input;
	}

	public String getPressureIn() {
		return pressureIn;
	}

	public void setPressureIn(String input) {
		this.pressureIn = input;
	}

	public String getPressureTrend() {
		return pressureTrend;
	}

	public void setPressureTrend(String input) {
		this.pressureTrend = input;
	}

	public String getDewpointString() {
		return dewpointString;
	}

	public void setDewpointString(String input) {
		this.dewpointString = input;
	}

	public int getDewpointF() {
		return dewpointF;
	}

	public void setDewpointF(int input) {
		this.dewpointF = input;
	}

	public int getDewpointC() {
		return dewpointC;
	}

	public void setDewpointC(int input) {
		this.dewpointC = input;
	}

	public String getHeatIndexString() {
		return heatIndexString;
	}

	public void setHeatIndexString(String input) {
		this.heatIndexString = input;
	}

	public String getHeatIndexF() {
		return heatIndexF;
	}

	public void setHeatIndexF(String input) {
		this.heatIndexF = input;
	}

	public String getHeatIndexC() {
		return heatIndexC;
	}

	public void setHeatIndexC(String input) {
		this.heatIndexC = input;
	}

	public String getWindchillString() {
		return windchillString;
	}

	public void setWindchillString(String input) {
		this.windchillString = input;
	}

	public String getWindchillF() {
		return windchillF;
	}

	public void setWindchillF(String input) {
		this.windchillF = input;
	}

	public String getWindchillC() {
		return windchillC;
	}

	public void setWindchillC(String input) {
		this.windchillC = input;
	}

	public String getFeelslikeString() {
		return feelslikeString;
	}

	public void setFeelslikeString(String input) {
		this.feelslikeString = input;
	}

	public String getFeelslikeF() {
		return feelslikeF;
	}

	public void setFeelslikeF(String input) {
		this.feelslikeF = input;
	}

	public String getFeelslikeC() {
		return feelslikeC;
	}

	public void setFeelslikeC(String input) {
		this.feelslikeC = input;
	}

	public String getVisibilityMi() {
		return visibilityMi;
	}

	public void setVisibilityMi(String input) {
		this.visibilityMi = input;
	}

	public String getVisibilityKm() {
		return visibilityKm;
	}

	public void setVisibilityKm(String input) {
		this.visibilityKm = input;
	}

	public String getSolarradiation() {
		return solarradiation;
	}

	public void setSolarradiation(String input) {
		this.solarradiation = input;
	}

	public String getUV() {
		return uV;
	}

	public void setUV(String input) {
		this.uV = input;
	}

	public String getPrecip1hrString() {
		return precip1hrString;
	}

	public void setPrecip1hrString(String input) {
		this.precip1hrString = input;
	}

	public String getPrecip1hrIn() {
		return precip1hrIn;
	}

	public void setPrecip1hrIn(String input) {
		this.precip1hrIn = input;
	}

	public String getPrecip1hrMetric() {
		return precip1hrMetric;
	}

	public void setPrecip1hrMetric(String input) {
		this.precip1hrMetric = input;
	}

	public String getPrecipTodayString() {
		return precipTodayString;
	}

	public void setPrecipTodayString(String input) {
		this.precipTodayString = input;
	}

	public String getPrecipTodayIn() {
		return precipTodayIn;
	}

	public void setPrecipTodayIn(String input) {
		this.precipTodayIn = input;
	}

	public String getPrecipTodayMetric() {
		return precipTodayMetric;
	}

	public void setPrecipTodayMetric(String input) {
		this.precipTodayMetric = input;
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

	public String getForecastUrl() {
		return forecastUrl;
	}

	public void setForecastUrl(String input) {
		this.forecastUrl = input;
	}

	public String getHistoryUrl() {
		return historyUrl;
	}

	public void setHistoryUrl(String input) {
		this.historyUrl = input;
	}

	public String getObUrl() {
		return obUrl;
	}

	public void setObUrl(String input) {
		this.obUrl = input;
	}

	public String getNowcast() {
		return nowcast;
	}

	public void setNowcast(String input) {
		this.nowcast = input;
	}

}
