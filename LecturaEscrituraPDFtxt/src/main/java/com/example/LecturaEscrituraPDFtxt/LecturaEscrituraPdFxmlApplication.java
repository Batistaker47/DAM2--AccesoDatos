package com.example.LecturaEscrituraPDFtxt;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.LecturaEscrituraPDFtxt.io.PDFConverter;
import com.example.LecturaEscrituraPDFtxt.io.Writter;
import com.example.LecturaEscrituraPDFtxt.utils.FormateTextTools;

@SpringBootApplication
public class LecturaEscrituraPdFxmlApplication {

	public static void main(String[] args) throws IOException {
		
		SpringApplication.run(LecturaEscrituraPdFxmlApplication.class, args);
		
		// Declare variables with the necesary parameters
		String pathLectura = "src/main/resources/WhatisLoremIpsum.pdf";
		String pathEscritura = "src/main/resources/GeneratedDoc.txt";
		String targetVowel = "[Aa]";
		String finalVowel = "@";
		
		// Initialize the objects we need
		PDFConverter pdfConverter = new PDFConverter();
		Writter writter = new Writter();
		FormateTextTools changeVowels = new FormateTextTools();
		
		// Parse the PDF document to a String text
		String originalText = pdfConverter.parsePDF(pathLectura);
		
		// We proccess the text with the correct method
		String formatedtext = changeVowels.changeVowels(originalText, targetVowel, finalVowel);
		
		// We writte the text in a txt format
		writter.writteText(formatedtext, pathEscritura);
		
		
		
	}

}
