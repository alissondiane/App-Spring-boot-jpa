package com.alisson.springboot.datajpa.app.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alisson.springboot.datajpa.app.model.entity.Cliente;
import com.alisson.springboot.datajpa.app.model.entity.Producto;
import com.alisson.springboot.datajpa.app.models.dao.IClienteDao;
import com.alisson.springboot.datajpa.app.models.dao.IProductoDao;
//Permite invocar varios dao en una sola transaccion metodo
@Service
public class ClienteServiceImpl implements IClienteService{
	
	
	@Autowired
	private IProductoDao productoDao;
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findOne(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}


	@Override
	@Transactional(readOnly=true)
	public Page<Cliente> findAll(Pageable pageable) {
		
		return clienteDao.findAll(pageable);
	}

	@Override
	public List<Producto> finByNombre(String term) {
		
		return productoDao.findByNombreLikeIgnoreCase("%"+term+"%");
	}
	
}
