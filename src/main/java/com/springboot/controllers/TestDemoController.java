package com.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestDemoController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showTest() {
		return "test springboot";
	}

}
