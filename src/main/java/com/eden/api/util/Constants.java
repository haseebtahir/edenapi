package com.eden.api.util;

public class Constants {

	public static final String BASE_PATH = "/edenapi";
	
	// login url functions
	public static final String PATH_LOGIN = "/login"; // login url
	public static final String PATH_RESET = "/reset"; // email lost password url
	public static final String PATH_CHANGE_PWORD = "/change"; // change password
	
	// dashboard url functions
	public static final String PATH_DASH = "/dash"; // dash root url
	public static final String PATH_ADD_USER = "/adduser"; // add user url
	public static final String PATH_UPDATE_USER = "/updateuser"; //update user details
	public static final String PATH_GET_USER = "/getuser"; //get a user details
	public static final String PATH_DELETE_USER = "/deleteuser"; //delete a user details
	
	// customer url functions
	public static final String PATH_ADD_CUST = "/addcustomer"; // add customer url
	public static final String PATH_GET_CUST = "/getcustomer"; // get customer details
	public static final String PATH_DELETE_CUST = "/deletecustomer"; // delete customer and all associated entites
	public static final String PATH_UPDATE_CUST = "/updatecustomer"; // update customer details
	public static final String PATH_GETALL_CUST = "/getallcustomers"; // returns all the customers
	
	// company url functions
	public static final String PATH_ADD_COMP = "/addcompany"; // add additional 
	public static final String PATH_DELETE_COMP = "/deletecompany"; // delete company and associated products
	public static final String PATH_GETALL_COMP = "/getallcompanies"; // get all companies
	public static final String PATH_UPDATE_COMP = "/updatecompany"; // update company information
	
	// product url functions
	public static final String PATH_ADD_PROD = "/addproduct"; // add additional product
	public static final String PATH_DELETE_PROD = "/deleteproduct"; //delete a product
	public static final String PATH_GETALL_PROD = "/getproducts"; // gets all the products under a company
	public static final String PATH_UPDATE_PROD = "/updateproduct"; // updates product information
	
	// product photo url function
	public static final String PATH_ADD_PROD_PHOTO = "/addproductphoto"; // adds a product photo to product
	public static final String PATH_DELETE_PROD_PHOTO = "/deleteproductphoto"; // deletes a particular product photo
	public static final String PATH_UPDATE_PROD_PHOTO = "/updateproductphoto"; //update product photo
	public static final String PATH_GET_PROD_PHOTOS = "/getproductphotos"; // get all product photos for a product
	
	// location url function
	public static final String PATH_ADD_LOC = "/addlocation"; // adds a new location;
	public static final String PATH_GET_LOCATION = "/getlocation"; // get location information

	
	public static final String PATH_BOOKING = "/booking";
	public static final String PATH_CONTRACT = "/contract";
	public static final String PATH_REPORT = "/report";
	public static final String PATH_PING = "/ping";

	public static final String INTERNAL_SYSTEM_ERROR = "00000-0";
	public static final String UNAUTHORIZED = "00000-1";
	public static final String INVALID_JSON = "00000-2";
	public static final String REQUIRED_PARAM = "00000-3";
	public static final String SUCCESS = "10000-1";

	public static final String INPUT_PARAM_USERNAME = "username";
	public static final String INPUT_PARAM_PASSWORD = "password";

	// email settings
	public static final String emailFrom = "edenstaremail@gmail.com";
	public static final String password = "solar786";

	// email server settings
	public static final String port = "465";
	public static final String host = "smtp.gmail.com";



	



	



	

	

	

	

	

	

}
