package com.dockerExample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.dockerExample.demo.jpa.INombreDAO;
import com.dockerExample.demo.models.Nombre;

@RestController
public class MainController {
	
	
	@Autowired
	INombreDAO nDAO;
	
	@GetMapping("/greeting/{id}")
	public Nombre greeting(@PathVariable(value = "id") Long id) {
			Nombre n = nDAO.get(id);
			return n;
		 
		
	}

}
