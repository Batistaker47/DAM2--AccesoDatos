package com.example.XMLFinalBoss.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.example.XMLFinalBoss.models.InitParam;
import com.example.XMLFinalBoss.models.Servlet;
import com.example.XMLFinalBoss.models.WebApp;

public class ReadXML {

	public Document XMLParser(String path) throws ParserConfigurationException, SAXException, IOException {
		// Creation of a new File object
		File xmlFile = new File(path);
		// The DocumentBuilderFactory method defines a factory API that enables
		// applications to obtain a parser that produces DOM object trees from XML
		// documents.
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();

		// Once we have the instance created, we can parse our xml document to a
		// Document object
		Document doc = docBuilder.parse(xmlFile);

		// Puts all the document information in a descendant order. We must use this
		// method to ensure that the DOM view of a document is the same as if it were
		// saved and re-loaded.
		doc.getDocumentElement().normalize();

		// We return the parsed document
		return doc;
	}

	public ArrayList<WebApp> readDocument(Document doc) {
		ArrayList<WebApp> textInfo = new ArrayList<>();
		
		// BUCLE PARA SACAR LA INFORMACION DE LOS SERVLETS
		NodeList servletNodeList = doc.getElementsByTagName("servlet");
		 for (int i = 0; i < servletNodeList.getLength(); i++) {
			 Node nNode = servletNodeList.item(i);
			 //System.out.println("NOMBRE DEL NODO:   " + nNode.getNodeName());
			 String servletName = "";
			 String servletClass = "";
			 if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				 
				 Element element = (Element) nNode;
				 
				 servletName = element.getElementsByTagName("servlet-name").item(0).getTextContent();
				 servletClass = element.getElementsByTagName("servlet-class").item(0).getTextContent();
				 
				 System.out.println(servletName + "\n" + servletClass + "\n");
				 
			 }
			 
			 
			// BUCLE PARA SACAR LA INFORMACION DE LOS INIT PARAM
			 
			 NodeList initParamList = doc.getElementsByTagName("init-param");
			 for (int j = 0; j < initParamList.getLength(); j++) {
				 Node ipNode = initParamList.item(j);
				 Element ipElement = (Element) ipNode;
				 
				 String paramName = ipElement.getElementsByTagName("param-name").item(0).getTextContent();
				 String paramValue = ipElement.getElementsByTagName("param-value").item(0).getTextContent();
				 System.out.println(paramName + "\n" + paramValue + "\n");
				 
				 Servlet servlet = new Servlet(servletName,servletClass,new InitParam(paramName, paramValue));
			}
		 }
		
		return textInfo;
	}
}
