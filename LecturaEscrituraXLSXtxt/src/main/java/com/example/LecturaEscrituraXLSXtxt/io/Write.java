package com.example.LecturaEscrituraXLSXtxt.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.example.LecturaEscrituraXLSXtxt.models.Data;

public class Write {
	
	public void writeText(ArrayList<Data> resultText, String path) {
		File file = new File(path);

		try {
			FileWriter escritor = new FileWriter(file, false);
			BufferedWriter pw = new BufferedWriter(escritor);
			
			for (Data data : resultText) {
				pw.write(data.toString());
			}
			
			pw.close();

		} catch (IOException e) {
			System.out.println("ERROR al intentar escibir en el archivo");
		}
	}
}
