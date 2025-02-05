package com.example.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "coches")
public class Coche {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	Long id;
	
	private String marca;
	private String modelo;
	private String color;
	
	// @MANYTOONE: ESTABLECE QUE ESTA ENTIDAD TIENE UNA RELACIÓN MUCHOS A UNO CON LA ENTIDAD PERSONA.
	// @JOINCOLUMN(NAME = "PERSONA_ID", NULLABLE = FALSE): INDICA QUE LA CLAVE FORÁNEA (FOREIGN KEY) EN LA BASE DE DATOS SERÁ LA COLUMNA PERSONA_ID, QUE NO PUEDE SER NULA.
	// PRIVATE PERSONA PERSONA;: DEFINE LA RELACIÓN EN EL NIVEL DE LA ENTIDAD DE JAVA, LO QUE SIGNIFICA QUE UN OBJETO DE ESTA CLASE TENDRÁ UNA REFERENCIA A UN OBJETO PERSONA.
	
	 @ManyToOne
     @JoinColumn(name = "persona_id", nullable = false)
     private Persona persona;
	 
	public Coche() {
	}

	public Coche(String marca, String modelo, String color, Persona persona) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.persona = persona;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public Persona getPersona() { return persona; }
	
    public void setPersona(Persona persona) { this.persona = persona; }
}
