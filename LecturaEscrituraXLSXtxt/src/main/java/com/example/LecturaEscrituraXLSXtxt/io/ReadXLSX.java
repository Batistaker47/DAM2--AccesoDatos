package com.example.LecturaEscrituraXLSXtxt.io;

import java.io.File;
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

	public static ArrayList<Data> readFile(String entryPath) throws IOException {
		
		ArrayList<Data> dataList = new ArrayList<>();
		File file = new File(entryPath);
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Data data = new Data();
		for (Sheet sheet : workbook) {
			data.setHour(entryPath);
			
			
		}
		
		return dataList;

		// Save the output TXT file
		//workbook.save("output.txt");
	}

}
