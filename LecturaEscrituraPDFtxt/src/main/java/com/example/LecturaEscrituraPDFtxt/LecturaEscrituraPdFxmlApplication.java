package com.example.LecturaEscrituraPDFtxt;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.LecturaEscrituraPDFtxt.io.PDFConverter;

@SpringBootApplication
public class LecturaEscrituraPdFxmlApplication {

	public static void main(String[] args) throws IOException {
		
		SpringApplication.run(LecturaEscrituraPdFxmlApplication.class, args);
		
		String pathLectura = "src\\main\\resources\\WhatisLoremIpsum.pdf";
		String pathEscritura = "src\\main\\resources\\GeneratedDoc.txt";
		
		PDFConverter pdfConverter = new PDFConverter();
		
		pdfConverter.parseAndWrittePDF(pathLectura, pathEscritura);
	}

}
