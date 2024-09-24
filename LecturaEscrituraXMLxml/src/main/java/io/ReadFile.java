package io;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;

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
	
	public void readDocument (Document doc) {
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		NodeList nodeList = doc.getElementsByTagName("staff");
	    for (int temp = 0; temp < nodeList.getLength(); temp++) {
	        Node nNode = nodeList.item(temp);
	        System.out.println("\nCurrent Element :" + nNode.getNodeName());
	        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	            Element eElement = (Element) nNode;
	            System.out.println("Staff id : "
	                               + eElement.getAttribute("id"));
	            System.out.println("First Name : "
	                               + eElement.getElementsByTagName("firstname")
	                                 .item(0).getTextContent());
	            System.out.println("Last Name : "
	                               + eElement.getElementsByTagName("lastname")
	                                 .item(0).getTextContent());
	            System.out.println("Nick Name : "
	                               + eElement.getElementsByTagName("nickname")
	                                 .item(0).getTextContent());
	            System.out.println("Salary : "
	                               + eElement.getElementsByTagName("salary")
	                                 .item(0).getTextContent());
	        }
	    }
	}
	
	
}
