package com.alisson.springboot.datajpa.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.alisson.springboot.datajpa.app.model.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura,Long> {

}
