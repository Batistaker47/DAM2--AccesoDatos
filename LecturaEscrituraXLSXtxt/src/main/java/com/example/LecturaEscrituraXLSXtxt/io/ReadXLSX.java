package com.example.LecturaEscrituraXLSXtxt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
<<<<<<< HEAD
import org.apache.poi.xssf.usermodel.XSSFSheet;
=======
import org.apache.poi.ss.usermodel.WorkbookFactory;
>>>>>>> 877ad33c9d512b7b64fc83aae811038dcbb79b38
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import com.example.LecturaEscrituraXLSXtxt.models.Data;

import org.apache.poi.ss.*;


public class ReadXLSX {

<<<<<<< HEAD
	public static ArrayList<Data> readFile(String entryPath) throws IOException {
		// We create a new ArrayList, where we will put the objects data whenever we take it from the reader
=======
	public ArrayList<Data> readFile(String entryPath) throws IOException {
		
>>>>>>> 877ad33c9d512b7b64fc83aae811038dcbb79b38
		ArrayList<Data> dataList = new ArrayList<>();
		
		// We instance the file withe the entrypath
		File file = new File(entryPath);
		
		// Creates a FileInputStream object by opening a connection to an actual file
		FileInputStream fileInputStream = new FileInputStream(file);
<<<<<<< HEAD
		
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
=======
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workbook.getSheetAt(0);
		
		for (Row row : sheet) {
			
			String hour = row.getCell(0).getStringCellValue();
			String day = row.getCell(1).getStringCellValue();
			String subject = row.getCell(2).getStringCellValue();
			
			Data data = new Data(hour,day,subject);
			dataList.add(data);
>>>>>>> 877ad33c9d512b7b64fc83aae811038dcbb79b38
		}


		
		workbook.close();
		fileInputStream.close();
		
		return dataList;
	}

}
