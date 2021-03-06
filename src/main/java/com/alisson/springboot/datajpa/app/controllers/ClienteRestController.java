package com.alisson.springboot.datajpa.app.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alisson.springboot.datajpa.app.model.entity.Factura;
import com.alisson.springboot.datajpa.app.model.service.IClienteService;
import com.alisson.springboot.datajpa.app.view.xml.ClienteList;

//maneja el Controller y ReponseBody annotations
@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping(value = "/listar")
	public ClienteList listar() {
		   return new ClienteList(clienteService.findAll());
	}
	@GetMapping("/ver/{id}")
	public Factura ver(@PathVariable(value="id") Long id) {
		return clienteService.fetchByIdWithClienteWithItemFacturaWithProcucto(id);
	}
}
