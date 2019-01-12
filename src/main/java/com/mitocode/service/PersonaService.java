package com.mitocode.service;

import java.util.List;
import com.mitocode.model.Persona;

public interface PersonaService {

	List<Persona> leerTodos();
	Persona leerPorId(int id);
	Persona crear(Persona persona);
	Persona modificar(Persona persona);
	void eliminar(int id);
	
}
