package com.jr.crud.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
public class ProductDTO {

	@Id
	private String _id;
	
	private String name;
	private Double precio;
	private LocalDate fecha_expiracion;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public LocalDate getFecha_expiracion() {
		return fecha_expiracion;
	}
	public void setFecha_expiracion(LocalDate fecha_expiracion) {
		this.fecha_expiracion = fecha_expiracion;
	}
	
	
}
