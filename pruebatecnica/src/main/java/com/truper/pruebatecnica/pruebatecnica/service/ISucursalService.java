package com.truper.pruebatecnica.pruebatecnica.service;

import java.util.List;

import com.truper.pruebatecnica.pruebatecnica.entity.Sucursal;

public interface ISucursalService {
	
	public List<Sucursal> listar();
	public Sucursal save(Sucursal sucursal);
	public Sucursal findById(Integer id);

}
