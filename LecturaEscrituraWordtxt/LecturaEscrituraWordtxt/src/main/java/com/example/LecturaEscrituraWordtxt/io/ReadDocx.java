package com.example.LecturaEscrituraWordtxt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.extractor.POITextExtractor;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class ReadDocx {
	
	public String parseDocx(String path) throws IOException {
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XWPFDocument doc = new XWPFDocument(fis);
		
		POITextExtractor extractor = new XWPFWordExtractor(doc);
		
		String textResult = extractor.getText();
		
		return textResult;
		
	}
}
