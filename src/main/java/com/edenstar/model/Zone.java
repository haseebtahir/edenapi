package com.edenstar.model;

import javax.persistence.Embeddable;

@Embeddable
public class Zone {
	
	private int zoneID;
	private int zoneNumber;
	private int locationID;
	
	public Zone() {
		super();
	}

	public Zone(int zoneID, int zoneNumber, int locationID) {
		super();
		this.zoneID = zoneID;
		this.zoneNumber = zoneNumber;
		this.locationID = locationID;
	}

	public int getZoneID() {
		return zoneID;
	}

	public void setZoneID(int zoneID) {
		this.zoneID = zoneID;
	}

	public int getZoneNumber() {
		return zoneNumber;
	}

	public void setZoneNumber(int zoneNumber) {
		this.zoneNumber = zoneNumber;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

} // Zone