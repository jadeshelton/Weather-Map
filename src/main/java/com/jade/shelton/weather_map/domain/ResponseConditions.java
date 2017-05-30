package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseConditions implements Serializable {

	private static final long serialVersionUID = -1472049737499973861L;
	
	  private String version; 
	  private String termsofService; 
	  private FeaturesConditions features; 

	  public String getVersion(){
	  	return version; 
	  }
	  public void setVersion(String input){
	  	 this.version = input;
	  }
	  public String getTermsofService(){
	  	return termsofService; 
	  }
	  public void setTermsofService(String input){
	  	 this.termsofService = input;
	  }

	public FeaturesConditions getFeatures() {
	  	return features; 
	  }

	public void setFeatures(FeaturesConditions input) {
	  	 this.features = input;
	  }

}
