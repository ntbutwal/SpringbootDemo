package com.springboot.services;

import com.springboot.dtos.NotificationDto;

public class NotificationService {
	private EmailService emailService;
	private TextServce textServce;

	public void notifyUpdate(NotificationDto dto) {
		if ("TEXT".equals(dto.getType())) {
			textServce.sendText(dto.getTo());
		} else if ("EMAIL".equals(dto.getType())) {
			emailService.sendEmail(dto.getTo());
		}

	}

	public EmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public TextServce getTextServce() {
		return textServce;
	}

	public void setTextServce(TextServce textServce) {
		this.textServce = textServce;
	}

}
