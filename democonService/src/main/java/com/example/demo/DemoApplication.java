package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		
		//LEVANTA LA APP Y PONE EN AVISO AL CONTROLLER PARA QUE CUANDO LE LLEGUEN PETICIONES, LAS CONTROLE
		
		SpringApplication.run(DemoApplication.class, args);
		
		// PARA SWAGEAR EN GOOGLE
		//http://localhost:8080/swagger-ui/index.html
	}
}