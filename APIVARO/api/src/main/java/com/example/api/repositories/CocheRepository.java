package com.example.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.models.Coche;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long>{


}
