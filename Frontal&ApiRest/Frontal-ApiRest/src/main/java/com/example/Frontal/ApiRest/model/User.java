package com.example.Frontal.ApiRest.model;
import jakarta.persistence.*;

@Entity
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 private String name;
	 private String city;
	 private String email;
	 private String message;
	 
	public User() {
	}

	public User(Long id, String name, String city, String email, String message) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
		this.message = message;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	 
	 
}
