package com.eden.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.api.dao.UserDAO;

@Service("userService")
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public Object login(String _username, String _password) throws Exception {
		
		userDAO.login(_username, _password);
		
		return null;
	}

}
