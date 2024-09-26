package com.example.LecturaEscrituraPDFxml;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.PDFConverter;
import io.WriteFile;

@SpringBootApplication
public class LecturaEscrituraPdFxmlApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(LecturaEscrituraPdFxmlApplication.class, args);
		
		String path = "C:\\Users\\Usuario\\Desktop\\GitHub Repos\\DAM2--AccesoDatos\\LecturaEscrituraPDFxml\\src\\main\\resources\\WhatisLoremIpsum.pdf";
		PDFConverter c = new PDFConverter();
		WriteFile wf = new WriteFile();
		try {
			wf.writeText(c.convertDocument(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
