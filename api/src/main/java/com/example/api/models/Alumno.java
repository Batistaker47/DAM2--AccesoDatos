package com.example.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	String name;
	String surname;
	String career;
	
	
	public Alumno() {
		
	}

	public Alumno(String name, String surname, String career) {
		this.name = name;
		this.surname = surname;
		this.career = career;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getCareer() {
		return career;
	}


	public void setCareer(String career) {
		this.career = career;
	}
	
	
	
	
}
