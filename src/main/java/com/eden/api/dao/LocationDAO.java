package com.eden.api.dao;

import java.util.List;

import com.edenstar.model.Kiosk;
import com.edenstar.model.Location;
import com.edenstar.model.Rate;
import com.edenstar.model.Zone;
import com.edenstar.model.dash.CreateLocation;

public interface LocationDAO {

	// returns a location by name
	Location getLocationByName(String locationName) throws Exception;

	// add a new location
	int addLocation(CreateLocation l) throws Exception;

	// add a new Zone
	int addZone(CreateLocation l, int i) throws Exception;

	// add a Rate
	int addRate(CreateLocation l, int i) throws Exception;

	// add a Kiosk
	int addKiosk(CreateLocation l, int i) throws Exception;

	// get a Location
	Location getLocation(int location_id) throws Exception;

	// get zone list
	List<Zone> getZone(CreateLocation l) throws Exception;

	// get rate list
	List<Rate> getRate(CreateLocation l) throws Exception;

	// get kiosk list
	List<Kiosk> getKiosk(CreateLocation l) throws Exception;
	
	// get max row or col for given location id
	int getRowOrColMax(int locationID, String rowOrColumn);

} // LocationDAO
