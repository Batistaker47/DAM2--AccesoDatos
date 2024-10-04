package com.example.LecturaEscrituraXLSXtxt.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import com.example.LecturaEscrituraXLSXtxt.models.Data;

import org.apache.poi.ss.*;


public class ReadXLSX {

	public ArrayList<Data> readFile(String entryPath) throws IOException {
		// We create a new ArrayList, where we will put the objects data whenever we take it from the reader
		ArrayList <Data> dataList = new ArrayList<>();
		
		// Creates a FileInputStream object by opening a connection to an actual file
		FileInputStream fileInputStream = new FileInputStream(entryPath);
		
		// Constructs a XSSFWorkbook object, by buffering the whole stream into memory
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		
		for (Sheet sheet : workbook ) {
			// We iterate through all the rows of the sheet
			for (int rowIndex = 1; rowIndex <= 7; rowIndex++) {
				Row row = sheet.getRow(rowIndex);
				if (row != null) {
					
					String tipoRespuesta = row.getCell(0).getStringCellValue();
					String pregunta = row.getCell(1).getStringCellValue();
					String respuesta = row.getCell(2).getStringCellValue();
					String resultado = row.getCell(3).getStringCellValue();
					
					Data list =  new Data(tipoRespuesta,pregunta,respuesta,resultado);
					dataList.add(list);
				}
			}
		}

		workbook.close();
		fileInputStream.close();
		
		return dataList;
	}

}
