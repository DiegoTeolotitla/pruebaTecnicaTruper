package com.truper.pruebatecnica.pruebatecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truper.pruebatecnica.pruebatecnica.entity.Orden;
import com.truper.pruebatecnica.pruebatecnica.entity.Producto;
import com.truper.pruebatecnica.pruebatecnica.entity.Sucursal;
import com.truper.pruebatecnica.pruebatecnica.service.IOrdenService;
import com.truper.pruebatecnica.pruebatecnica.service.IProductoService;
import com.truper.pruebatecnica.pruebatecnica.service.ISucursalService;

@RestController
@RequestMapping("/orden")
public class OrdenController {
	
	@Autowired
	@Qualifier("ordenService")
	private IOrdenService ordenService;
	
	@Autowired
	@Qualifier("sucursalService")
	private ISucursalService sucursalService;
	
	@Autowired
	@Qualifier("productoService")
	private IProductoService productoService;

	@GetMapping("/{id}")
	public List<Orden> listarOrden(){
		return null;
	}
	
	@PostMapping
	public Orden guardarOrden(@RequestBody Orden orden){
		Sucursal sucursal  = sucursalService.findById(orden.getSucursal().getId());
		orden.setSucursal(sucursal);

		for(Producto producto : orden.getProductos()) {
			productoService.guardarProducto(producto);
		}
		orden.setProductos(productoService.listar());
		
		return ordenService.save(orden);
	}
	
	/*@PostMapping
	public Orden guardarOrden(@RequestBody Orden orden){
		Sucursal sucursal  = sucursalService.findById(orden.getSucursal().getId());
		orden.setSucursal(sucursal);

		for(Producto producto : orden.getProductos()) {
			productoService.guardarProducto(producto);
		}
		orden.setProductos(productoService.listar());
		
		return ordenService.save(orden);
	}*/
}
