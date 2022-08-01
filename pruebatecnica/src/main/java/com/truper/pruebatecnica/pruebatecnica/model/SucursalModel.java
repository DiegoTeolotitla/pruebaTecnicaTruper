package com.truper.pruebatecnica.pruebatecnica.model;

import java.util.List;

import com.truper.pruebatecnica.pruebatecnica.entity.Orden;

public class SucursalModel {

	private Integer id;
	private String nombre;
	private List<Orden> ordenes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Orden> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(List<Orden> ordenes) {
		this.ordenes = ordenes;
	}

}
