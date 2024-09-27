package com.example.LecturaEscrituraXMLtxt;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.example.LecturaEscrituraXMLtxt.io.ReadFile;
import com.example.LecturaEscrituraXMLtxt.io.WriteFile;
import com.example.LecturaEscrituraXMLtxt.models.Employee;

//@SpringBootApplication
public class LecturaEscrituraXmLxmlApplication {

	public static void main(String argv[]) throws ParserConfigurationException, SAXException, IOException {
		
		// OJO! Pasar SIEMPRE LAS RUTAS RELATIVAS Y METERLAS EN EL MAIN PARA QUE EL RESTO NO TOQUEN LAS CLASES
		String pathEscritura = "src\\main\\resources\\GeneratedDoc.txt";
		String pathLectura = "src\\main\\resources\\Ex2document.xml";
		ReadFile readFile = new ReadFile();
		WriteFile writeFile = new WriteFile();
		
		
		Document document = readFile.parseXMLFile(pathLectura);
		ArrayList<Employee> employeeList = readFile.readDocument(document);
		writeFile.writeText(employeeList,pathEscritura);
	}

}
