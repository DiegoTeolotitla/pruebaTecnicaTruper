package com.truper.pruebatecnica.pruebatecnica.repository;

import org.springframework.data.repository.CrudRepository;

import com.truper.pruebatecnica.pruebatecnica.entity.Orden;

public interface IOrdenDao extends CrudRepository<Orden, Integer>{

}
