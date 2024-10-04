package com.example.LecturaEscrituraXLSXtxt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import com.example.LecturaEscrituraXLSXtxt.models.Data;

import org.apache.poi.ss.*;


public class ReadXLSX {

	public static ArrayList<Data> readFile(String entryPath) throws IOException {
		// We create a new ArrayList, where we will put the objects data whenever we take it from the reader
		ArrayList<Data> dataList = new ArrayList<>();
		
		// We instance the file withe the entrypath
		File file = new File(entryPath);
		
		// Creates a FileInputStream object by opening a connection to an actual file
		FileInputStream fileInputStream = new FileInputStream(file);
		
		// Constructs a XSSFWorkbook object, by buffering the whole stream into memory
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		
		for (Sheet sheet : workbook ) {
			// We iterate through all the rows of the sheet
			for (Row row : sheet) {
				for (Cell cell : row) {
					LocalDate aa = new LocalDate();
				}
			}
		}


		
		return dataList;

		// Save the output TXT file
		//workbook.save("output.txt");
	}

}
