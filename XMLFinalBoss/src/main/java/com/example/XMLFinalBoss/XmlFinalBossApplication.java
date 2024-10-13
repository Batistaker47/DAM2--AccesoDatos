package com.example.XMLFinalBoss;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;

import com.example.XMLFinalBoss.io.ReadXML;

@SpringBootApplication
public class XmlFinalBossApplication {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SpringApplication.run(XmlFinalBossApplication.class, args);
		String entryPath = "src/main/resources/xml.xml";
		
		ReadXML rf = new ReadXML();
		rf.readDocument(rf.XMLParser(entryPath));
	}

}
