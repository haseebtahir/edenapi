package com.eden.api.service.validation;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.edenstar.model.dash.CreateLocation;

public class LocationValidation {

	public boolean fieldsAreEmpty(CreateLocation l) {

		// check to make sure that the mandatory parameters are not empty
		if (l.getStaff_email_id().contentEquals("") || l.getNum_max_rows() < 1 || l.getNum_max_columns() < 1
				|| l.getRateList().isEmpty() || l.getLocationName().contentEquals("")) {

			return true;

		} // if

		return false;

	} // fieldsAreEmpty

	public boolean isNull(CreateLocation l) {
		// make sure that none of the mandatory fields are null

		if (l.getNum_max_columns() == 0)
			return true;
		if (l.getNum_max_rows() == 0)
			return true;
		if (l.getStaff_email_id() == null)
			return true;
		if (l.getRateList().isEmpty())
			return true;
		if (l.getLocationName() == null)
			return true;

		return false;

	} // isNull
	
	
	public boolean validateRates(CreateLocation l) {
		// makes sure that the rates passed for the zones are within normal values
		int i = 0;
		boolean isValid =  true;
		double rateCoeff = 0.00d;
		
		for (i = 0; i < l.getRateList().size(); i++) {

			if (l.getRateList().get(i).getRateMax() < 0.0
					|| l.getRateList().get(i).getRateMin() > l.getRateList().get(i).getRateMax()
					|| l.getRateList().get(i).getDiscountDurationDays() < 1)
				isValid = false;

		} // for loop
		
		// if all the values in the array are normal (i.e. isValid = true)
		// we should calculate the coefficient here for all the rates
		
		if (isValid) {
			
			for (i = 0; i < l.getRateList().size(); i++) {

				double coeff = (l.getRateList().get(i).getRateMin() - l.getRateList().get(i).getRateMax()) 
						/ l.getRateList().get(i).getDiscountDurationDays();
			
				// round off to 2 decimal places
				rateCoeff = round(coeff, 2);
				
				// set the coefficient 
				l.getRateList().get(i).setRateCoeff(rateCoeff);

			} // for loop
			
		} // set the rate coefficient
		
		return isValid;
		
	} // validateRates
	
	private static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	} // round

} // LocationValidation
