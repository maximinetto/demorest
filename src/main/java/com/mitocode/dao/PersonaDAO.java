package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.model.Persona;

@Repository
public interface PersonaDAO extends JpaRepository<Persona, Integer>{

}
