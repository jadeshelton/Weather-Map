package com.jade.shelton.weather_map.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeaturesConditions implements Serializable {

	private static final long serialVersionUID = -345485838292990341L;
	
	  private int conditions; 

	  public int getConditions(){
	  	return conditions; 
	  }
	  public void setConditions(int input){
	  	 this.conditions = input;
	  }
	
	

}
