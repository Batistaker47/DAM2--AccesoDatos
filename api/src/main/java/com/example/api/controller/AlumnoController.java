package com.example.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.models.Alumno;
import com.example.api.repositories.AlumnoRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class AlumnoController {
	AlumnoRepository repositorio;
	public AlumnoController(AlumnoRepository repositorio) {
		this.repositorio = repositorio;
	}
	
	@GetMapping("/api/alumnos")
	public List<Alumno> crearAlumnos() {
		return repositorio.findAll ();
	}
	
	@GetMapping("/api/alumnos/{id}")
	public ResponseEntity<Alumno> obtenerAlumno (@PathVariable Long id) {
		Optional<Alumno> opt = repositorio.findById(id);
		
		if(opt.isEmpty()) {
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.ok(opt.get());

		}
	}
	@CrossOrigin("http://127.0.0.1:5500")
	@PostMapping("api/alumnos")
	public ResponseEntity<Alumno> guardarAlumno(@RequestBody Alumno alumno) {
		if (alumno.getId() != null) {
			return ResponseEntity.badRequest().build();
		}
		
		repositorio.save(alumno);
		return ResponseEntity.ok(alumno);
	}
} 
