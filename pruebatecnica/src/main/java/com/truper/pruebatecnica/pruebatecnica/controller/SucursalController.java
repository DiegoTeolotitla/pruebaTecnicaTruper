package com.truper.pruebatecnica.pruebatecnica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.truper.pruebatecnica.pruebatecnica.entity.Sucursal;
import com.truper.pruebatecnica.pruebatecnica.service.ISucursalService;

@Controller
public class SucursalController {
	
	@Autowired
	@Qualifier("sucursalService")
	private ISucursalService sucursalService;
	
	@GetMapping("/sucursal")
	public String login(Model model) {
		Sucursal sucursal = new Sucursal();
		model.addAttribute("sucursal", sucursal);
		return "sucursal";
	}
	
	@PostMapping("/sucursal/alta")
	public String altaSucursal(Sucursal sucursal, Model model) {
		sucursalService.save(sucursal);
		return "listarsucursal";
	}

}
