package com.truper.pruebatecnica.pruebatecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truper.pruebatecnica.pruebatecnica.entity.Producto;
import com.truper.pruebatecnica.pruebatecnica.repository.IProductoDao;

@Service("productoService")
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoDao productoDao;
	@Override
	public List<Producto> listar() {
		return (List<Producto>) productoDao.findAll();
	}
	@Override
	public Producto guardarProducto(Producto producto) {
		
		return productoDao.save(producto);
	}

}
