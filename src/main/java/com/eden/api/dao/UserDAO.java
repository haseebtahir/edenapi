package com.eden.api.dao;

public interface UserDAO {
	
	Object login(String _username, String _password) throws Exception;
}
