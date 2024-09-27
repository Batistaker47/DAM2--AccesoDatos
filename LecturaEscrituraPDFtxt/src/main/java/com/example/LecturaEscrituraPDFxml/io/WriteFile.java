package com.example.LecturaEscrituraPDFxml.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
	public void writeText(String resultText, String path) {
		File file = new File(path);

		try {
			FileWriter writter = new FileWriter(file, false);
			PrintWriter printWritter = new PrintWriter(writter);
				
			printWritter.println(resultText);
			printWritter.close();

		} catch (IOException e) {
			System.out.println("ERROR al intentar escibir en el archivo");
		}
	}
}
