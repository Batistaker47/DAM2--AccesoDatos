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
		// Ruta clase
		//String path = "D:\\Repos David\\DAM2--AccesoDatos\\LecturaEscrituraXMLxml\\src\\main\\resources\\Ex2document.xml";
		
		// Ruta casa
		String path = "C:\\Users\\Usuario\\Desktop\\GitHub Repos\\DAM2--AccesoDatos\\LecturaEscrituraXMLxml\\src\\main\\resources\\Ex2document.xml";
		ReadFile rf = new ReadFile();
		WriteFile wf = new WriteFile();
		wf.writeText(rf.readDocument(rf.parseXMLFile(path)));
	}

}
