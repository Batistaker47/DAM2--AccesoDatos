package io;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFConverter {

	public String convertDocument(String path) throws IOException { 
		File file = new File(path);
		PDDocument doc1 = Loader.loadPDF(file);
		PDFTextStripper stripper = new PDFTextStripper();
	    String text = stripper.getText(doc1);
	    doc1.close();
		return text;

	}
}
