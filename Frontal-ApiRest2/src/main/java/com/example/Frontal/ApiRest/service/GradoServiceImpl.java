package com.example.Frontal.ApiRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Frontal.ApiRest.model.Grado;
import com.example.Frontal.ApiRest.repository.GradoRepository;

@Service
public class GradoServiceImpl implements GradoService {
	
    private final GradoRepository gradoRepository;

    @Autowired
    public GradoServiceImpl(GradoRepository gradoRepository) {
        this.gradoRepository = gradoRepository;
    }

	@Override
	public Grado getGradoById(Long id) {
		Optional<Grado> optionalUser = gradoRepository.findById(id);
        return optionalUser.orElse(null);
	}

	@Override
	public void saveGrado(Grado grado) {
		gradoRepository.save(grado);
	}
	
	@Override
	public void updateGrado(Grado grado) {
		gradoRepository.save(grado);	
	}
	
	@Override
	public void deleteGrado(Long id) {
		gradoRepository.deleteById(id);
	}

	public List<Grado> getAllGrados() {
		return gradoRepository.findAll();
	}
}
