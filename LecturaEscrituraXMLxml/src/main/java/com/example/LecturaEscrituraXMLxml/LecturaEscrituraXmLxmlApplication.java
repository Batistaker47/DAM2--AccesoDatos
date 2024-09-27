package com.example.LecturaEscrituraXMLxml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import io.ReadFile;
import io.WriteFile;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class LecturaEscrituraXmLxmlApplication {

	public static void main(String argv[]) throws ParserConfigurationException, SAXException, IOException {
		
		// OJO! Pasar SIEMPRE LAS RUTAS RELATIVAS Y METERLAS EN EL MAIN PARA QUE EL RESTO NO TOQUEN LAS CLASES
		String pathEscritura = "src\\main\\resources\\GeneratedDoc.txt";
		String pathLectura = "src\\main\\resources\\Ex2document.xml";
		ReadFile readFile = new ReadFile();
		WriteFile writeFile = new WriteFile();
		
		writeFile.writeText(readFile.readDocument(readFile.parseXMLFile(pathLectura)),pathEscritura);
	}

}
