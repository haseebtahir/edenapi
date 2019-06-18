package com.eden.api.service;

import java.util.List;

import com.edenstar.model.Kiosk;
import com.edenstar.model.Location;
import com.edenstar.model.Rate;
import com.edenstar.model.Zone;
import com.edenstar.model.dash.CreateLocation;

public interface LocationService {

	// find a location service by name
	Location getLocationByName(String locationName) throws Exception;

	// Add a location
	int addLocation(CreateLocation l) throws Exception;

	// Add a zone
	int addZone(CreateLocation l, int i) throws Exception;

	// Add a rate
	int addRate(CreateLocation l, int i) throws Exception;

	// Add a kiosk
	int addKiosk(CreateLocation l, int i) throws Exception;

	// Get location details by id
	Location getLocation(int location_id) throws Exception;

	// get a list of zones according to location_id
	List<Zone> getZone(CreateLocation l) throws Exception;

	// get list of rates for a given location_id
	List<Rate> getRate(CreateLocation l) throws Exception;

	// get all kiosks for a given location_id
	List<Kiosk> getKiosk(CreateLocation l) throws Exception;

	// returns the maxiumum rows or columns for a given location id
	int getMaxRowsOrColumns(int locationID, String rowOrColumm) throws Exception;

} // LocationService
