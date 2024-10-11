package com.example.JSONFinalBoss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JSONFinalBoss.io.JsonReader;

@SpringBootApplication
public class JsonFinalBossApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonFinalBossApplication.class, args);
		
		JsonReader jsr = new JsonReader();
		jsr.JSONReader("src/main/resources/Json.json");
	}

}
