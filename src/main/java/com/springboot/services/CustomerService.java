package com.springboot.services;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springboot.dtos.CustomerDto;

@Service
public class CustomerService {

	public CustomerDto getDataFromCustomer(Long id) {
		CustomerDto dto = new CustomerDto();
		dto.setName("kishor");
		dto.setAddress("3025 va Dare Ct");
		dto.setUserid("kishorkc");
		dto.setId(101l);
		 return dto;
	}
	

}
