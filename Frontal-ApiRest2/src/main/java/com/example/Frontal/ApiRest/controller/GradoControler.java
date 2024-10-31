package com.example.Frontal.ApiRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Frontal.ApiRest.model.Grado;
import com.example.Frontal.ApiRest.service.GradoService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/grados")
public class GradoControler {
    private final GradoService gradoService;
    
    @Autowired
    public GradoControler(GradoService userService) {
        this.gradoService = userService;
    }

    //Implement the Endpoints

    @GetMapping("/{id}")
    public Grado getUserById(@PathVariable Long id) {
        return gradoService.getGradoById(id);
    }

    @GetMapping
    public List<Grado> getAllGrados() {
        return gradoService.getAllGrados();
    }

    @PostMapping
    public void addUser(@RequestBody Grado grado) {
        gradoService.saveGrado(grado);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody Grado grado) {
        Grado existingGrado = gradoService.getGradoById(id);
        if (existingGrado != null) {
            grado.setId(id); // Ensure the correct ID is set
            gradoService.saveGrado(grado);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteGrado(@PathVariable Long id) {
        gradoService.deleteGrado(id);
    }
}
