package com.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import com.example.models.Persona;

public class DOCXReader {
	public ArrayList<Persona> readWordDocument(String path) throws IOException {
		ArrayList<Persona> personas = new ArrayList<>();
		FileInputStream fis = new FileInputStream(path);
		XWPFDocument document = new XWPFDocument(fis);
		
		List<XWPFTable> tables = document.getTables();
		
		for (XWPFTable table : tables) {
			for (XWPFTableRow row : table.getRows()) {
				String id = row.getCell(0).getText();
				String nombre = row.getCell(1).getText();
				String apellido = row.getCell(2).getText();
				String valor = row.getCell(3).getText();
				
				Persona nuevaPersona = new Persona(id, nombre, apellido, valor);
				personas.add(nuevaPersona);
			}
		}
		
		fis.close();
		document.close();
		return personas;
	}
}
