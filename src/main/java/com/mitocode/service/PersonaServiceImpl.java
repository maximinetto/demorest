package com.mitocode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.PersonaDAO;
import com.mitocode.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	private PersonaDAO personaDAO;
	
	@Override
	public List<Persona> leerTodos() {
		return personaDAO.findAll();
	}

	@Override
	public Persona leerPorId(int id) {
		return personaDAO.findOne(id);
	}

	@Override
	public Persona crear(Persona persona) {
		return personaDAO.save(persona);
	}

	@Override
	public Persona modificar(Persona persona) {
		return personaDAO.save(persona);
	}

	@Override
	public void eliminar(int id) {
		personaDAO.delete(id);
	}

}
