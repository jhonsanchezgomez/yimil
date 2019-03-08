package com.dockerExample.demo.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dockerExample.demo.dao.INombre;
import com.dockerExample.demo.models.Nombre;

@Service
public class ImplNombreDAO implements INombreDAO{
	
	@Autowired
	private INombre nDAO;

	@Override
	public Nombre get(Long id) {
		Nombre ift = nDAO.findById(id).get();
		return ift;
	}

}
