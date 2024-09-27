package com.example.LecturaEscrituraPDFxml;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.LecturaEscrituraPDFxml.io.PDFConverter;
import com.example.LecturaEscrituraPDFxml.io.WriteFile;

@SpringBootApplication
public class LecturaEscrituraPdFxmlApplication {

	public static void main(String[] args) throws IOException {
		
		SpringApplication.run(LecturaEscrituraPdFxmlApplication.class, args);
		
		String pathLectura = "src\\main\\resources\\WhatisLoremIpsum.pdf";
		String pathEscritura = "src\\main\\resources\\GeneratedDoc.txt";
		PDFConverter pdfConverter = new PDFConverter();
		WriteFile writeFile = new WriteFile();
		writeFile.writeText(pdfConverter.convertDocument(pathLectura),pathEscritura);
	}

}
