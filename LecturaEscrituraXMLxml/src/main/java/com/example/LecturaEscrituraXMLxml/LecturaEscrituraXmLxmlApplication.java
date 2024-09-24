package com.example.LecturaEscrituraXMLxml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import io.ReadFile;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class LecturaEscrituraXmLxmlApplication {

	public static void main(String argv[]) throws ParserConfigurationException, SAXException, IOException {
		String path = "C:\\Users\\Usuario\\Desktop\\GitHub Repos\\DAM2--AccesoDatos\\LecturaEscrituraXMLxml\\src\\main\\resources\\Ex2document.xml";
		ReadFile rf = new ReadFile();
		
		rf.readDocument(rf.parseXMLFile(path));
	}

}
