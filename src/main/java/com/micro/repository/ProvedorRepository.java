package com.micro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.micro.entity.Provedor;


public interface ProvedorRepository extends MongoRepository<Provedor, String>{

}
