package com.example.LecturaEscrituraPDFtxt.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFConverter {

	public void parseAndWrittePDF (String entryPath, String exitPath) throws IOException {
		
		File entryFile = new File(entryPath);
		
		// We created a new instance of PDDocument to load the PDF file into the program. 
		
		PDDocument pddDocument = Loader.loadPDF(entryFile);
		
		// Then, we created a new instance of PDFTextStripper and called the .getText() method to extract the text from the PDF.
		//This class will take the pdf document and extract all of the text and ignore the format.
		
		PDFTextStripper pdfStripper = new PDFTextStripper();
		String text = pdfStripper.getText(pddDocument);
		
		//We always need to close the PDDocument when we finish the parse
		pddDocument.close();
	    
		File exitFile = new File(exitPath);
		
		try {
			FileWriter writter = new FileWriter(exitFile, false);
			PrintWriter printWritter = new PrintWriter(writter);
			
			String formatedText = text.replaceAll("[aA]", "@");
			
			printWritter.println(formatedText);
			printWritter.close();

		} catch (IOException e) {
			System.out.println("ERROR al intentar escibir en el archivo");
		}
	}
	/*public String changeVowels(String text, String charToChange, String newChar) {
		String formatedText = "";
		
		formatedText = text.replaceAll(charToChange, newChar);
		
		return formatedText;
	}*/
}
