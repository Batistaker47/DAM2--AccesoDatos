package com.example.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.models.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long>{
	
}
