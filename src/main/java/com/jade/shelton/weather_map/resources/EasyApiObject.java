package com.jade.shelton.weather_map.resources;

public abstract class EasyApiObject {

	/**
	 * Retrieve the list of all requests available in this API
	 * 
	 * @return The list of requests
	 */
	public abstract String[] getPossibleRequests();

	/**
	 * Find out if a request is available
	 * 
	 * @param request
	 *            The request to search for
	 * @return Does the request exist
	 */
	public boolean possibleRequestsContains(String request) {
		for (String possible : getPossibleRequests()) {
			if (possible.equals(request)) {
				return true;
			}
		}
		return false;
	}

}

