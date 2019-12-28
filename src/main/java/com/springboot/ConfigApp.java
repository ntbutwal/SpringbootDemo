package com.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.services.EmailService;
import com.springboot.services.NotificationService;
import com.springboot.services.TextServce;

@Configuration
public class ConfigApp {
	@Bean
	public EmailService emailService() {

		return new EmailService();
	}

	@Bean
	public TextServce textServce() {

		return new TextServce();
	}

	@Bean
	public NotificationService notificationService() {
		NotificationService not = new NotificationService();
		not.setEmailService(emailService());
		not.setTextServce(textServce());
		return not;
	}
}
