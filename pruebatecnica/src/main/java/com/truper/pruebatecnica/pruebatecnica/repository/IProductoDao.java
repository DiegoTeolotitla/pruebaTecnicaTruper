package com.truper.pruebatecnica.pruebatecnica.repository;

import org.springframework.data.repository.CrudRepository;

import com.truper.pruebatecnica.pruebatecnica.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Integer>{

}
