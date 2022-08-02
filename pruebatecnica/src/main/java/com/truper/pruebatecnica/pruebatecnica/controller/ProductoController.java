package com.truper.pruebatecnica.pruebatecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truper.pruebatecnica.pruebatecnica.entity.Producto;
import com.truper.pruebatecnica.pruebatecnica.service.IOrdenService;
import com.truper.pruebatecnica.pruebatecnica.service.IProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	@Qualifier("productoService")
	private IProductoService productoService;
	
	@Autowired
	@Qualifier("ordenService")
	private IOrdenService ordenService;

	@GetMapping
	public List<Producto> listarProductos() {
		return productoService.listar();
	}

	@PostMapping
	public Producto guardarProducto(@RequestBody Producto producto) {
		producto.setOrden(ordenService.findById(producto.getOrden().getId()));
		return productoService.guardarProducto(producto);
	}
}
