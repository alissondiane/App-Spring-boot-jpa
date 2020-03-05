package com.alisson.springboot.datajpa.app.models.dao;

import java.util.List;

import com.alisson.springboot.datajpa.app.model.entity.Cliente;

public interface IClienteDao {
	public List<Cliente> findAll();
}
