package com.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dtos.ClientDto;
import com.springboot.entities.ClientEntity;
import com.springboot.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;

	public void saveClient(ClientDto dto) {
		ClientEntity entity = new ClientEntity();
		entity.setDomain(dto.getDomain());
		entity.setName(dto.getName());
		entity.setSecretKey(dto.getScKey());
		entity.setUrl(dto.getUrl());
		clientRepository.save(entity);
	}

}
