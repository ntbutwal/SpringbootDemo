package com.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entities.ClientEntity;
@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long>{

}
