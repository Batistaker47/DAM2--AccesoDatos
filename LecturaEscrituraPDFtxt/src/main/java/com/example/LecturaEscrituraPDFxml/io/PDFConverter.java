package com.example.LecturaEscrituraPDFxml.io;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFConverter {

	public String convertDocument(String path) throws IOException { 
		File file = new File(path);
		
		// We created a new instance of PDDocument to load the PDF file into the program. 
		
		PDDocument pddDocument = Loader.loadPDF(file);
		
		// Then, we created a new instance of PDFTextStripper and called the .getText() method to extract the text from the PDF.
		//This class will take the pdf document and extract all of the text and ignore the format.
		
		PDFTextStripper pdfStripper = new PDFTextStripper();
		String text = pdfStripper.getText(pddDocument);
		
		//We always need to close the PDDocument when we finish the parse
		pddDocument.close();
	    
	    //We returned the text so we can use it in the writter methods
		return text;

	}
}
