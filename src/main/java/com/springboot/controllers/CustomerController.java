package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dtos.CustomerDto;
import com.springboot.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public CustomerDto sendData(@RequestParam Long id) {
		return customerService.getDataFromCustomer(id);
	}
	
	@RequestMapping(value = "", method=RequestMethod.POST)
	public void getData(@RequestBody CustomerDto dto) {
		System.out.println(dto.toString());
	}

}
