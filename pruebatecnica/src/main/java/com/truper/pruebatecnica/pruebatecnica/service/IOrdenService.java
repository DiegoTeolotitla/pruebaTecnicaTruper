package com.truper.pruebatecnica.pruebatecnica.service;

import com.truper.pruebatecnica.pruebatecnica.entity.Orden;

public interface IOrdenService {
	
	public Orden save(Orden orden);
	public Orden findById(Integer id);

}
