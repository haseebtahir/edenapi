package com.eden.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.api.dao.LocationDAO;
import com.edenstar.model.Kiosk;
import com.edenstar.model.Location;
import com.edenstar.model.Rate;
import com.edenstar.model.Zone;
import com.edenstar.model.dash.CreateLocation;

@Service("locationService")
public class LocationServiceImpl implements LocationService{
	
	@Autowired
	private LocationDAO locationDAO;

	@Override
	public Location getLocationByName(String locationName) throws Exception {
		// TODO Auto-generated method stub
		return locationDAO.getLocationByName(locationName);
	}

	@Override
	public int addLocation(CreateLocation l) throws Exception {
		// TODO Auto-generated method stub
		return locationDAO.addLocation(l);
	}

	@Override
	public int addZone(CreateLocation l, int i) throws Exception {
		// TODO Auto-generated method stub
		return locationDAO.addZone(l, i);
	}

	@Override
	public int addRate(CreateLocation l, int i) throws Exception {
		// TODO Auto-generated method stub
		return locationDAO.addRate(l, i);
	}

	@Override
	public int addKiosk(CreateLocation l, int i) throws Exception {
		// TODO Auto-generated method stub
		return locationDAO.addKiosk(l,i);
	}

	@Override
	public Location getLocation(int location_id) throws Exception {
		// TODO Auto-generated method stub
		return locationDAO.getLocation(location_id);
	}

	@Override
	public List<Zone> getZone(CreateLocation l) throws Exception {
		// TODO Auto-generated method stub
		return locationDAO.getZone(l);
	}

	@Override
	public List<Rate> getRate(CreateLocation l) throws Exception {
		// TODO Auto-generated method stub
		return locationDAO.getRate(l);
	}

	@Override
	public List<Kiosk> getKiosk(CreateLocation l) throws Exception {
		// TODO Auto-generated method stub
		return locationDAO.getKiosk(l);
	}

	@Override
	public int getMaxRowsOrColumns(int locationID, String rowOrColumn) throws Exception {
		// TODO Auto-generated method stub
		return locationDAO.getRowOrColMax(locationID, rowOrColumn);
	}

} // LocationService
