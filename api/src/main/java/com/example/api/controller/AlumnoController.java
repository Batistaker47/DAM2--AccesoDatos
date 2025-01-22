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

import com.example.api.models.Alumno;

import com.example.api.repositories.AlumnoRepository;

@RestController

public class AlumnoController {

	AlumnoRepository repositorio;

	public AlumnoController(AlumnoRepository repositorio) {

		this.repositorio = repositorio;

	}

	@CrossOrigin("http://127.0.0.1:5500")

	@GetMapping("/api/alumnos")

	public List<Alumno> obtenerAlumnos() {

		return repositorio.findAll();

	}

	@GetMapping("/api/alumno/{id}")

	public ResponseEntity<Alumno> obtenerAlumno(@PathVariable Long id) {

		Optional<Alumno> opt = repositorio.findById(id);

		if (opt.isEmpty()) {

			return ResponseEntity.badRequest().build();

		}

		else {

			return ResponseEntity.ok(opt.get());

		}

	}

	@CrossOrigin("http://127.0.0.1:5500")

	@PostMapping("/api/alumnos")

	public ResponseEntity<Alumno> guardarAlumno(@RequestBody Alumno alumno) {

		if (alumno.getId() != null) {

			return ResponseEntity.badRequest().build();

		}

		repositorio.save(alumno);

		return ResponseEntity.ok(alumno);

	}

	@CrossOrigin("http://127.0.0.1:5500")

	@PutMapping("/api/alumnos")

	public ResponseEntity<Alumno> actualizarAlumno(@RequestBody Alumno alumno) {

		if (alumno.getId() == null || !repositorio.existsById(alumno.getId()))

		{
			return ResponseEntity.badRequest().build();
		}

		repositorio.save(alumno);

		return ResponseEntity.ok(alumno);

	}
	
	@CrossOrigin("http://127.0.0.1:5500")
	@DeleteMapping("/api/alumnos/{id}")
	
	public ResponseEntity<Alumno> borrarAlumno(@PathVariable Long id){
		if (id== null || !repositorio.existsById(id)) {
			return ResponseEntity.badRequest().build();
		}
		repositorio.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}