package com.eden.api.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edenstar.model.User;
import com.eden.api.util.Constants;

@Component
public class EmailServiceIImpl implements EmailService {

	private Properties props = new Properties();

	@Autowired
	public EmailServiceIImpl() {
		props.put("mail.smtp.host", Constants.host);
		props.put("mail.smtp.socketFactory.port", Constants.port);
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", Constants.port);

		// additional switches
		props.put("mail.smtp.debug", "true");
		props.put("mail.smtp.socketFactory.fallback", "false");
		props.put("mail.smtp.starttls.enable", "true");
	}

	public void sendEmail(String emailTo, String emailTitle, String messageBody) throws Exception {

		try {
			// get session
			Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(Constants.emailFrom, Constants.password);
				}
			});

			// compose message

			// try {
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
			message.setSubject(emailTitle);
			message.setText(messageBody);

			// Transport.send(message);
			Transport transport = session.getTransport("smtps");
			transport.connect(Constants.host, Integer.valueOf(Constants.port), Constants.emailFrom, Constants.password);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	} //sendEmail

	@Override
	public Boolean emailLostPassword(User u) throws Exception {

		String msg = "Dear " + u.getFirstName() + " " + u.getLastName() + ",\n\n"
				+ "please find your email and password for the Eden Star Booking System listed below. \n\n" + "Username : "
				+ u.getEmailID() + "\n" + "Password : " + u.getPassword() + "\n\n" + "Best Wishes \n"
				+ "Eden Star Admin Team";

		sendEmail(u.getEmailID(), "Eden Star Admin", msg);
		return true;
	}

}
