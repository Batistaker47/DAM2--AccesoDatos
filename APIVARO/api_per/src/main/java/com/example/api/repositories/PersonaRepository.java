package com.example.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.models.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
	
}
