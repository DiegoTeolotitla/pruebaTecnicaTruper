package com.truper.pruebatecnica.pruebatecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truper.pruebatecnica.pruebatecnica.entity.Sucursal;
import com.truper.pruebatecnica.pruebatecnica.repository.ISucursalDao;

@Service("sucursalService")
public class SucursalServiceImpl implements ISucursalService{

	@Autowired
	private ISucursalDao sucursalDao;
	@Override
	public Sucursal save(Sucursal sucursal) {
		
		return sucursalDao.save(sucursal);
		
	}
	@Override
	public List<Sucursal> listar() {
		return (List<Sucursal>) sucursalDao.findAll();
	}
	@Override
	public Sucursal findById(Integer id) {
		// TODO Auto-generated method stub
		return sucursalDao.findById(id).orElse(null);
	}

}
