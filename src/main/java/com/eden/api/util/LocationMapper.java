package com.eden.api.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.edenstar.model.Location;

public class LocationMapper implements RowMapper<Location> {

	@Override
	public Location mapRow(ResultSet rs, int rowNum) throws SQLException {

		Location l = new Location();

		l.setLocationID(rs.getInt("location_id"));
		l.setLocationName(rs.getString("location_name"));

		return l;
	}	
}
