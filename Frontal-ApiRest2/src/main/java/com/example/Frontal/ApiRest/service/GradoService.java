package com.example.Frontal.ApiRest.service;

import java.util.List;

import com.example.Frontal.ApiRest.model.Grado;

public interface GradoService {
	Grado getGradoById(Long id);
    void saveGrado(Grado product);
    void updateGrado(Grado product);
    void deleteGrado(Long id);
	List<Grado> getAllGrados();
}
