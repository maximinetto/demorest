package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {

	@Id
	private int id;
	
	@Column(name = "nombre", nullable = false, length = 15)
	private String nombre;
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setId(int id) {
		this.id = id; 
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;		
	}
	
}
