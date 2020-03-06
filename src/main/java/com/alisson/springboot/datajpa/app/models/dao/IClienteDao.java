package com.alisson.springboot.datajpa.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alisson.springboot.datajpa.app.model.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente,Long> {
	/*Consultas crud agregadas y gestionadas internamente
	 * Maneja la notacion @Component internamente
	 * */
	
	/*Agregar consultas personalizadas
	 * https://docs.spring.io/spring-data/jpa/docs/2.2.5.RELEASE/reference/html/
	 * https://docs.spring.io/spring-data/jpa/docs/2.2.5.RELEASE/reference/html/#jpa.query-methods
	 * */
	
}
