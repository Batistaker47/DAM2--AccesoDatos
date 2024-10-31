package com.example.Frontal.ApiRest.model;
import jakarta.persistence.*;

@Entity
public class Grado {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 private String tipo;
	 private int alumnos;
	 private String nombre;
	 
	public Grado() {
	}

	public Grado(Long id, String tipo, int alumnos, String nombre) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.alumnos = alumnos;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(int alumnos) {
		this.alumnos = alumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	 
	 
}
