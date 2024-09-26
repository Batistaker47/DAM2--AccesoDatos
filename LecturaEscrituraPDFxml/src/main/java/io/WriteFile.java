package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
	public void writeText(String resultText) {
		File file = new File(
				"C:\\Users\\Usuario\\Desktop\\GitHub Repos\\DAM2--AccesoDatos\\LecturaEscrituraPDFxml\\src\\main\\resources\\GeneratedDoc.xml");

		try {
			FileWriter escritor = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(escritor);
				
			pw.println(resultText);
			pw.close();

		} catch (IOException e) {
			System.out.println("ERROR al intentar escibir en el archivo");
		}
	}
}
