package com.truper.pruebatecnica.pruebatecnica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truper.pruebatecnica.pruebatecnica.entity.Orden;
import com.truper.pruebatecnica.pruebatecnica.repository.IOrdenDao;

@Service("ordenService")
public class OrdenServiceImpl implements IOrdenService {

	@Autowired
	private IOrdenDao ordenDao;
	@Override
	public Orden save(Orden orden) {
		
		return ordenDao.save(orden);
	}

	@Override
	public Orden findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
