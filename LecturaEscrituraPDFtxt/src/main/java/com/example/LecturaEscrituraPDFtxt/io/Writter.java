package com.example.LecturaEscrituraPDFtxt.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writter {
	
	public void writteText(String text, String exitPath) {
		
		File exitFile = new File(exitPath);
		
		try {
			FileWriter writter = new FileWriter(exitFile, false);
			PrintWriter printWritter = new PrintWriter(writter);
			
			printWritter.println(text);
			printWritter.close();

		} catch (IOException e) {
			System.out.println("ERROR al intentar escibir en el archivo");
		}
	}

}
