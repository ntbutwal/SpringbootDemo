package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dtos.ClientDto;
import com.springboot.services.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientService service;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void saveData(@RequestBody ClientDto dto) {
		service.saveClient(dto);

	}

}
