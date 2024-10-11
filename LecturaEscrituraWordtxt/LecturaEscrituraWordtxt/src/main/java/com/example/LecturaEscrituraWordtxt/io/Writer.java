package com.example.LecturaEscrituraWordtxt.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	public void writeText(String resultText, String path) {
		File file = new File(path);

		try {
			FileWriter escritor = new FileWriter(file, false);
			BufferedWriter pw = new BufferedWriter(escritor);
			
				pw.write(resultText);
			
			pw.close();

		} catch (IOException e) {
			System.out.println("ERROR al intentar escibir en el archivo");
		}
	}
}
