package io;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import models.Employee;

import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
	
	/**
	 * This method can parse a xml file to a generic Document object.
	 * @param recieve the files' path
	 * **/
	public Document parseXMLFile (String path) throws ParserConfigurationException, SAXException, IOException {
		
		// Creation of a new File object
		File xmlFile = new File (path);
		//The DocumentBuilderFactory method defines a factory API that enables applications to obtain a parser that produces DOM object trees from XML documents.
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
		
		//Once we have the instance created, we can parse our xml document to a Document object
		Document doc = docBuilder.parse(xmlFile);
		
		//Puts all the document information in a descendant order. We must use this method to ensure that the DOM view of a document is the same as if it were saved and re-loaded.
		doc.getDocumentElement().normalize();
		
		// We return the parsed document
		return doc;
		
	}
	
	public ArrayList<Employee> readDocument (Document doc) {
		ArrayList<Employee> resultText = new ArrayList<>();
		NodeList nodeList = doc.getElementsByTagName("staff");
	    for (int i = 0; i < nodeList.getLength(); i++) {
	        Node nNode = nodeList.item(i);
	        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	            Element element = (Element) nNode;
	            
	            Element salaryElement = (Element) element.getElementsByTagName("salary").item(0);
	            String currency = salaryElement.getAttribute("currency");
	            
	            String employeeFirstName =  element.getElementsByTagName("firstname").item(0).getTextContent();
	            String employeeLastName = element.getElementsByTagName("lastname").item(0).getTextContent();
	            String employeeNickName = element.getElementsByTagName("nickname").item(0).getTextContent();
	            String employeeSalary = element.getElementsByTagName("salary").item(0).getTextContent();
	            String employeeCurrency = currency;
	            
	            Employee staffEmployee = new Employee (employeeFirstName,employeeLastName,employeeNickName,employeeSalary,employeeCurrency);
	            resultText.add(staffEmployee);
	        }
	    }
		return resultText;
	}
	
	
}
