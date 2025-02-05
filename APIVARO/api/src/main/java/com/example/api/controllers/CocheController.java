package com.example.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.models.Coche;
import com.example.api.models.Persona;
import com.example.api.repositories.CocheRepository;
import com.example.api.repositories.PersonaRepository;

@RestController
@RequestMapping("/api/coches")
public class CocheController {
	
	 @Autowired
	 private CocheRepository cocheRepository;

	CocheRepository repositorio;

	CocheController(CocheRepository repositorio) {
		this.repositorio = repositorio;
	}
	
	@Autowired
     private PersonaRepository personaRepository;
	
	@CrossOrigin("http://127.0.0.1:5500")
    @PostMapping
    public ResponseEntity<Coche> createCoche(@RequestBody Coche coche) {
         if (coche.getPersona() == null || coche.getPersona().getPersona_id() == null) {
             return ResponseEntity.badRequest().build();
         }

         Optional<Persona> personaOpt = personaRepository.findById(coche.getPersona().getPersona_id());
         if (personaOpt.isEmpty()) {
             return ResponseEntity.badRequest().build();
         } else {
        	 coche.setPersona(personaOpt.get());
             Coche savedCoche = cocheRepository.save(coche);
             return ResponseEntity.ok(savedCoche);
         }

        
    }
	
	@CrossOrigin("http://127.0.0.1:5500")
	@GetMapping("/api/coches")
	public List<Coche> obtenerCoche() {
		return repositorio.findAll();
	}

	@CrossOrigin("http://127.0.0.1:5500")
	@GetMapping("/api/coche/{id}")
	public ResponseEntity<Coche> obtenerCoche(@PathVariable Long id) {
		Optional<Coche> opt = repositorio.findById(id);
		if (opt.isEmpty()) {
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.ok(opt.get());
		}
	}

	
	@CrossOrigin("http://127.0.0.1:5500")
	@PostMapping("/api/coches")
	public ResponseEntity<Coche> guardarCoche(@RequestBody Coche coche) {
		if (coche.getId() != null) {
			return ResponseEntity.badRequest().build();
		}
		repositorio.save(coche);
		return ResponseEntity.ok(coche);
	}

	@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
	@PutMapping("/api/coches/{id}")
	public ResponseEntity<Coche> actualizarCoche(@RequestBody Coche coche) {
	    if (coche.getId() == null || !repositorio.existsById(coche.getId())) {
	        return ResponseEntity.badRequest().build();
	    }
	    repositorio.save(coche);
	    return ResponseEntity.ok(coche);
	}

	@CrossOrigin("http://127.0.0.1:5500")
	@DeleteMapping("/api/coches/{id}")
	public ResponseEntity<Coche> borrarCoche(@PathVariable Long id) {
		if (id == null || !repositorio.existsById(id)) {
			return ResponseEntity.badRequest().build();
		}
		repositorio.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	public CocheRepository getCocheRepository() {
		return cocheRepository;
	}

	public void setCocheRepository(CocheRepository cocheRepository) {
		this.cocheRepository = cocheRepository;
	}
}
