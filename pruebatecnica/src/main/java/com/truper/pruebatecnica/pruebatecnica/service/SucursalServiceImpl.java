package com.truper.pruebatecnica.pruebatecnica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truper.pruebatecnica.pruebatecnica.entity.Sucursal;
import com.truper.pruebatecnica.pruebatecnica.repository.ISucursalDao;

@Service("sucursalService")
public class SucursalServiceImpl implements ISucursalService{

	@Autowired
	private ISucursalDao sucursalDao;
	@Override
	public void save(Sucursal sucursal) {
		
		sucursalDao.save(sucursal);
		
	}

}
