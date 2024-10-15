package com.example.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.example.models.Persona;

public class DOCXWriter {
	public void writeToTxt(String path, ArrayList<Persona> personasArrayList) throws IOException {
		File file = new File(path);
		FileWriter fileWriter = new FileWriter(file);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		for (Persona persona : personasArrayList) {
			printWriter.print("ID: " + persona.getPersonaId() + " ");
			printWriter.print("Nombre: " + persona.getNombre() + " ");
			printWriter.print("Nombre: " + persona.getApellido() + " ");
			printWriter.print("Nombre: " + persona.getValor() + "\n");
		}
		
		printWriter.close();
	}
}
