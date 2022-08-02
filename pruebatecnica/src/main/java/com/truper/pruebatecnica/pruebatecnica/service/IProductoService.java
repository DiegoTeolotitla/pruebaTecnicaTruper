package com.truper.pruebatecnica.pruebatecnica.service;

import java.util.List;

import com.truper.pruebatecnica.pruebatecnica.entity.Producto;

public interface IProductoService {

	public List<Producto> listar();
	
	public Producto guardarProducto(Producto producto);
	
}
