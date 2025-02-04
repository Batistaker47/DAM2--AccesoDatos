package com.example.api.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.api.models.Persona;

import com.example.api.repositories.PersonaRepository;

@RestController

public class PersonaController {

	PersonaRepository repositorio;

	public PersonaController(PersonaRepository repositorio) {

		this.repositorio = repositorio;

	}

	@CrossOrigin("http://127.0.0.1:5500")

	@GetMapping("/api/personas")

	public List<Persona> obtenerPersonas() {

		return repositorio.findAll();

	}

	@GetMapping("/api/persona/{id}")

	public ResponseEntity<Persona> obtenerPersona(@PathVariable Long id) {

		Optional<Persona> opt = repositorio.findById(id);

		if (opt.isEmpty()) {

			return ResponseEntity.badRequest().build();

		}

		else {

			return ResponseEntity.ok(opt.get());

		}

	}

	@CrossOrigin("http://127.0.0.1:5500")

	@PostMapping("/api/personas")

	public ResponseEntity<Persona> guardarPersona(@RequestBody Persona persona) {

		if (persona.getId() != null) {

			return ResponseEntity.badRequest().build();

		}

		repositorio.save(persona);

		return ResponseEntity.ok(persona);

	}

	@CrossOrigin("http://127.0.0.1:5500")

	@PutMapping("/api/personas")

	public ResponseEntity<Persona> actualizarPersona(@RequestBody Persona persona) {

		if (persona.getId() == null || !repositorio.existsById(persona.getId()))

		{
			return ResponseEntity.badRequest().build();
		}

		repositorio.save(persona);

		return ResponseEntity.ok(persona);

	}
	
	@CrossOrigin("http://127.0.0.1:5500")
	@DeleteMapping("/api/personas/{id}")
	
	public ResponseEntity<Persona> borrarPersona(@PathVariable Long id){
		if (id== null || !repositorio.existsById(id)) {
			return ResponseEntity.badRequest().build();
		}
		repositorio.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}