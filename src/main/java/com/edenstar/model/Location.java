package com.edenstar.model;

import javax.persistence.Embeddable;

@Embeddable 
public class Location {

	private int locationID;
	private String locationName;
	
	public Location() {
		super();
	}

	public Location(int locationID, String locationName) {
		super();
		this.locationID = locationID;
		this.locationName = locationName;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	

} // Location