package com.example.ejercicio6_doc_processor;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.models.Persona;
import com.example.utils.DOCXReader;
import com.example.utils.DOCXWriter;

@SpringBootApplication
public class Ejercicio6DocProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio6DocProcessorApplication.class, args);
		
		String inputPath = "src/main/resources/Document.docx";
		String outputPath = "src/main/resources/processedText.txt";
		
		DOCXReader reader = new DOCXReader();
		DOCXWriter writer = new DOCXWriter();
		
		try {
			ArrayList<Persona> personasArrayList = new ArrayList<>();
			personasArrayList = reader.readWordDocument(inputPath);
			writer.writeToTxt(outputPath, personasArrayList);
			System.out.println("El procesamiento del documento se ha completado con exito.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
