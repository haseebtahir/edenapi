package com.eden.api.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.eden.api.util.LoginMapper;

@Component
public class UserDAOImpl implements UserDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserDAOImpl(JdbcTemplate _jdbcTemplate) {
		this.jdbcTemplate = _jdbcTemplate;
	}
	
	@Override
	public Object login(String _username, String _password) throws Exception {
		
		Object result = null;
		String query = "";
		
		try {
			result = (Integer) jdbcTemplate.queryForObject(query, new LoginMapper());
			
		} catch (Exception e) {
			
		}
	
		return result;
	}

}
