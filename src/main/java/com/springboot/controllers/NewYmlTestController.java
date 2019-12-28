package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dtos.NotificationDto;
import com.springboot.services.NotificationService;

@RestController
@RequestMapping("/notify")
public class NewYmlTestController {
	@Autowired
	private NotificationService notificationService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public String DisplayTest(@RequestBody NotificationDto dto) {
		notificationService.notifyUpdate(dto);
		return "Hello World from top of the world";

	}

}
