package com.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.entity.Provedor;
import com.micro.service.ProvedorService;

@RestController
@RequestMapping("/provedor")
public class ProvedorController {

	
	@Autowired
	private ProvedorService service;
	
	@GetMapping("/lista")
	public List<Provedor> lista(){
		return service.listar();
	}
}
