package com.edenstar.model.dash;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;

import com.edenstar.model.Kiosk;
import com.edenstar.model.Location;
import com.edenstar.model.Rate;
import com.edenstar.model.Zone;

public class CreateLocation extends Location {

	private String staff_email_id;
	private int num_max_rows;
	private int num_max_columns;
	
	@Embedded
	private List<Kiosk> kioskList = new ArrayList<Kiosk>();
	
	@Embedded
	private List<Zone> zoneList = new ArrayList<Zone>();

	@Embedded
	private List<Rate> rateList = new ArrayList<Rate>();

	public CreateLocation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateLocation(int locationID, String locationName) {
		super(locationID, locationName);
		// TODO Auto-generated constructor stub
	}

	public CreateLocation(String staff_email_id, int num_max_rows, int num_max_columns, List<Kiosk> kioskList,
			List<Zone> zoneList, List<Rate> rateList) {
		super();
		this.staff_email_id = staff_email_id;
		this.num_max_rows = num_max_rows;
		this.num_max_columns = num_max_columns;
		this.kioskList = kioskList;
		this.zoneList = zoneList;
		this.rateList = rateList;
	}

	public String getStaff_email_id() {
		return staff_email_id;
	}

	public void setStaff_email_id(String staff_email_id) {
		this.staff_email_id = staff_email_id;
	}

	public int getNum_max_rows() {
		return num_max_rows;
	}

	public void setNum_max_rows(int num_max_rows) {
		this.num_max_rows = num_max_rows;
	}

	public int getNum_max_columns() {
		return num_max_columns;
	}

	public void setNum_max_columns(int num_max_columns) {
		this.num_max_columns = num_max_columns;
	}

	public List<Kiosk> getKioskList() {
		return kioskList;
	}

	public void setKioskList(List<Kiosk> kioskList) {
		this.kioskList = kioskList;
	}

	public List<Zone> getZoneList() {
		return zoneList;
	}

	public void setZoneList(List<Zone> zoneList) {
		this.zoneList = zoneList;
	}

	public List<Rate> getRateList() {
		return rateList;
	}

	public void setRateList(List<Rate> rateList) {
		this.rateList = rateList;
	}

} // CreateLocation
