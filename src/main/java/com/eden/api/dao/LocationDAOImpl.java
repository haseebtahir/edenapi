package com.eden.api.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.eden.api.util.GridMapper;
import com.eden.api.util.LocationMapper;
import com.edenstar.model.GridCount;
import com.edenstar.model.Kiosk;
import com.edenstar.model.Location;
import com.edenstar.model.Rate;
import com.edenstar.model.Zone;
import com.edenstar.model.dash.CreateLocation;

@Component
public class LocationDAOImpl implements LocationDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public LocationDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Location getLocationByName(String locationName) throws Exception {

		Location r = new Location();
		String query = "SELECT * FROM eden_db.location where location_name ='" + locationName + "'";

		try {

			r = jdbcTemplate.queryForObject(query, new LocationMapper());

		} catch (Exception e) {

		} // try

		return r;
	} // getLocationByName

	@Override
	public int addLocation(CreateLocation l) throws Exception {

		NamedParameterJdbcTemplate namedJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
		final KeyHolder keyHolder = new GeneratedKeyHolder();
		int status = 0;

		final String INSERT_QUERY = "insert into eden_db.location (location_name) values" + " (:location_name)";

		try {

			// Creating map with all required params
			MapSqlParameterSource paramMap = new MapSqlParameterSource();

			paramMap.addValue("location_name", l.getLocationName().toLowerCase());

			status = namedJdbcTemplate.update(INSERT_QUERY, paramMap, keyHolder, new String[] { "location_id" });

			// get the auto generated primary key from the new customer insertion
			Number generatedComID = keyHolder.getKey();
			status = generatedComID.intValue();

			System.out.println("new location ID = " + status);

		} catch (Exception e) {

		} // try

		return status;
	} // addLocation

	@Override
	public int addZone(CreateLocation l, int i) throws Exception {

		NamedParameterJdbcTemplate namedJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
		final KeyHolder keyHolder = new GeneratedKeyHolder();
		int status = 0;

		final String INSERT_QUERY = "insert into eden_db.zone (zone_number, location_id) values"
				+ " (:zone_number, :location_id)";

		try {

			// Creating map with all required params
			MapSqlParameterSource paramMap = new MapSqlParameterSource();

			paramMap.addValue("zone_number", l.getZoneList().get(i).getZoneNumber());
			paramMap.addValue("location_id", l.getLocationID());

			status = namedJdbcTemplate.update(INSERT_QUERY, paramMap, keyHolder, new String[] { "zone_id" });

			// get the auto generated primary key from the new customer insertion
			Number generatedComID = keyHolder.getKey();
			status = generatedComID.intValue();

			System.out.println("new zone ID = " + status);

		} catch (Exception e) {

		} // try

		return status;
	} // addZone

	@Override
	public int addRate(CreateLocation l, int i) throws Exception {

		NamedParameterJdbcTemplate namedJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
		final KeyHolder keyHolder = new GeneratedKeyHolder();
		int status = 0;

		final String INSERT_QUERY = "insert into eden_db.rate (rate_max, rate_min, discount_duration_days, rate_coeff, zone_id) values"
				+ " (:rate_max, :rate_min, :discount_duration_days, :rate_coeff, :zone_id)";

		try {

			// Creating map with all required params
			MapSqlParameterSource paramMap = new MapSqlParameterSource();

			paramMap.addValue("rate_max", l.getRateList().get(i).getRateMax());
			paramMap.addValue("rate_min", l.getRateList().get(i).getRateMin());
			paramMap.addValue("discount_duration_days", l.getRateList().get(i).getDiscountDurationDays());
			paramMap.addValue("rate_coeff", l.getRateList().get(i).getRateCoeff());
			paramMap.addValue("zone_id", l.getRateList().get(i).getZoneID());

			status = namedJdbcTemplate.update(INSERT_QUERY, paramMap, keyHolder, new String[] { "rate_id" });

			// get the auto generated primary key from the new customer insertion
			Number generatedComID = keyHolder.getKey();
			status = generatedComID.intValue();

			System.out.println("new rate ID = " + status);

		} catch (Exception e) {

		} // try

		return status;
	} // addRate

	@Override
	public int addKiosk(CreateLocation l, int i) throws Exception {

		NamedParameterJdbcTemplate namedJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
		final KeyHolder keyHolder = new GeneratedKeyHolder();
		int status = 0;

		final String INSERT_QUERY = "insert into eden_db.kiosk (kiosk_number, grid_location_row, grid_location_column, is_void, is_locked, zone_id) values"
				+ " (:kiosk_number, :grid_location_row, :grid_location_column, :is_void, :is_locked, :zone_id)";

		try {

			// Creating map with all required params
			MapSqlParameterSource paramMap = new MapSqlParameterSource();

			paramMap.addValue("kiosk_number", l.getKioskList().get(i).getKioskNumber());
			paramMap.addValue("grid_location_row", l.getKioskList().get(i).getGridLocationRow());
			paramMap.addValue("grid_location_column", l.getKioskList().get(i).getGridLocationColumn());
			paramMap.addValue("is_void", l.getKioskList().get(i).getIsVoid());
			paramMap.addValue("is_locked", l.getKioskList().get(i).getIsLocked());
			paramMap.addValue("zone_id", l.getKioskList().get(i).getZoneID());

			status = namedJdbcTemplate.update(INSERT_QUERY, paramMap, keyHolder, new String[] { "kiosk_id" });

			// get the auto generated primary key from the new customer insertion
			Number generatedComID = keyHolder.getKey();
			status = generatedComID.intValue();

			System.out.println("new zone ID = " + status);

		} catch (Exception e) {

		} // try

		return status;
	} // addKiosk

	@Override
	public Location getLocation(int location_id) throws Exception {
		
		Location r = new Location();
		String query = "SELECT * FROM eden_db.location where location_id ='" + location_id + "'";

		try {

			r = jdbcTemplate.queryForObject(query, new LocationMapper());

		} catch (Exception e) {

		} // try

		return r;
	} // getLocation

	@Override
	public List<Zone> getZone(CreateLocation l) throws Exception {

		
		String query = "SELECT * FROM eden_db.zone where location_id ='" + l.getLocationID() + "'";
		List<Zone> zoneList = new ArrayList<Zone>();
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();

		try {

			rows = jdbcTemplate.queryForList(query);

			for (Map<String, Object> row : rows) {

				Zone z = new Zone();
				
				z.setZoneID((Integer) (row.get("zone_id")));   
				z.setZoneNumber((Integer) (row.get("zone_number")));   
				z.setLocationID((Integer) (row.get("location_id")));   

				zoneList.add(z);
			}

		} catch (Exception e) {

		} // try

		return zoneList;
	} //getZone

	@Override
	public List<Rate> getRate(CreateLocation l) throws Exception {
		
		String query = "SELECT * FROM eden_db.rate natural join eden_db.zone natural join eden_db.location where location_id ='" + l.getLocationID() + "'";
		List<Rate> rateList = new ArrayList<Rate>();
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();

		try {

			rows = jdbcTemplate.queryForList(query);

			for (Map<String, Object> row : rows) {

				Rate r = new Rate();
				
				r.setRateID((Integer) (row.get("rate_id")));
				r.setRateMax((Double) (row.get("rate_max")));
				r.setRateMin((Double) (row.get("rate_min")));
				r.setDiscountDurationDays((Integer) (row.get("discount_duration_days")));
				r.setRateCoeff((Double) (row.get("rate_coeff")));
				r.setZoneID((Integer) (row.get("zone_id")));

				rateList.add(r);
			}

		} catch (Exception e) {

		} // try

		return rateList;
	} //getRate

	@Override
	public List<Kiosk> getKiosk(CreateLocation l) throws Exception {
		
		String query = "SELECT * FROM eden_db.kiosk natural join eden_db.zone natural join eden_db.location where location_id ='" + l.getLocationID() + "'";
		List<Kiosk> kioskList = new ArrayList<Kiosk>();
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();

		try {

			rows = jdbcTemplate.queryForList(query);

			for (Map<String, Object> row : rows) {

				Kiosk k = new Kiosk();
				
				k.setKioskID((Integer) (row.get("kiosk_id")));
				k.setKioskNumber((Integer) (row.get("kiosk_number")));
				k.setGridLocationRow((Integer) (row.get("grid_location_row")));
				k.setGridLocationColumn((Integer) (row.get("grid_location_column")));
				k.setIsVoid((Integer) (row.get("is_void")));
				k.setIsLocked((Integer) (row.get("is_locked")));
				k.setZoneID((Integer) (row.get("zone_id")));


				kioskList.add(k);
			}

		} catch (Exception e) {

		} // try

		return kioskList;
	} //getKiosk

	@Override
	public int getRowOrColMax(int locationID, String rowOrColumn) {
		GridCount result = new GridCount();
		String grid = "";

		
		if (rowOrColumn.contentEquals("rows")) {
			grid = "grid_location_row";
		} else if (rowOrColumn.contentEquals("columns")) {
			grid = "grid_location_column";
		}

		
		String query = "SELECT max(" + grid + ") as gridMax FROM eden_db.kiosk natural join eden_db.zone natural join eden_db.location where location_id = '" + + locationID + "'";


		try {

			result = jdbcTemplate.queryForObject(query, new GridMapper());
			

		} catch (Exception e) {

		} // try

		System.out.println("result = " + result.getGrid_max() + " and location_id is = " + locationID);
		return result.getGrid_max();
		
	} // get max row or col
	
	
	

} // LocationDAOIMpl
