package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping()
	@ResponseBody
	public List<Persona> getAll(){
		return personaService.leerTodos();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Persona getOne(@PathVariable int id)
	{
		return personaService.leerPorId(id);
	}
	
	@PostMapping("/create")
	@ResponseBody
	public Persona create(@RequestBody Persona persona)
	{
		return personaService.crear(persona);
	}
	
	@PutMapping("/modify")
	@ResponseBody
	public Persona modify(@RequestBody Persona persona)
	{
		return personaService.modificar(persona);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		personaService.eliminar(id);
	}
}
