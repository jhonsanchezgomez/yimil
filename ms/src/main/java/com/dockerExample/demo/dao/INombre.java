package com.dockerExample.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.dockerExample.demo.models.Nombre;

public interface INombre extends CrudRepository<Nombre, Long>{

}
