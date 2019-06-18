package com.eden.api.service;

import com.edenstar.model.User;

public interface EmailService {

	// sends an email to the user with their lost password
	Boolean emailLostPassword(User u) throws Exception;

}
