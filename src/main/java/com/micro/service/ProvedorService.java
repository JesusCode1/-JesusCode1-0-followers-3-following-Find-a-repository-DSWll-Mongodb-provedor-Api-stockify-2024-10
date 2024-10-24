package com.micro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.entity.Provedor;
import com.micro.repository.ProvedorRepository;

@Service
public class ProvedorService {

	
	@Autowired
	private ProvedorRepository repo;
	
	public List<Provedor> listar (){
		return repo.findAll();
	}
}
