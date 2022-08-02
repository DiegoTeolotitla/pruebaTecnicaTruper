package com.truper.pruebatecnica.pruebatecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truper.pruebatecnica.pruebatecnica.entity.Sucursal;
import com.truper.pruebatecnica.pruebatecnica.service.ISucursalService;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {

	@Autowired
	@Qualifier("sucursalService")
	private ISucursalService sucursalService;

	@GetMapping
	public List<Sucursal> login() {

		return sucursalService.listar();
	}

	@PostMapping
	public Sucursal altaSucursal(@RequestBody Sucursal sucursal) {

		return sucursalService.save(sucursal);
	}
	
	@GetMapping("/{id}")
	public List<Sucursal> listarOrdenes(@PathVariable Integer id) {
		
		return sucursalService.listar();
	}

}
