package com.truper.pruebatecnica.pruebatecnica.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.truper.pruebatecnica.pruebatecnica.entity.Producto;

public class OrdenModel {

	private Integer id;
	private Date fecha;
	private BigDecimal total;
	private List<Producto> producto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

}
