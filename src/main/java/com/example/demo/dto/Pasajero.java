package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pasajero {

	
	@Id
	private int id;
	private String nombre;
	
	public Pasajero(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Pasajero() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
