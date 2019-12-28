package com.springboot.services;

import org.springframework.beans.factory.annotation.Value;

public class TextServce {
	@Value("${notification.text.from}")
	private String from;
	@Value("${notification.text.message}")
	private String message;

	public void sendText(String to) {
		System.out.println("Sending text from the top of the world " + message);
		System.out.println("Sending text from the top of the world from " + from);
		System.out.println("Sending text from the top of the world to " + to);

	}

}
