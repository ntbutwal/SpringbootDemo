package com.springboot.services;

import org.springframework.beans.factory.annotation.Value;

public class EmailService {
	@Value("${notification.email.message}")
	private String message;

	@Value("${notification.email.from}")
	private String from;

	public void sendEmail(String to) {
		System.out.println("Sending email from the top of the world " + message);
		System.out.println("Sending email from the top of the world from " + from);
		System.out.println("Sending email from the top of the world to " + to);

	}

}
