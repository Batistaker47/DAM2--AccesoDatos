package com.example.LecturaEscrituraXLSXtxt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.example.LecturaEscrituraXLSXtxt.models.Data;

import org.apache.poi.ss.*;


public class ReadXLSX {

	public ArrayList<Data> readFile(String entryPath) throws IOException {
		
		ArrayList<Data> dataList = new ArrayList<>();
		File file = new File(entryPath);
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workbook.getSheetAt(0);
		
		for (Row row : sheet) {
			
			String hour = row.getCell(0).getStringCellValue();
			String day = row.getCell(1).getStringCellValue();
			String subject = row.getCell(2).getStringCellValue();
			
			Data data = new Data(hour,day,subject);
			dataList.add(data);
		}
		
		workbook.close();
		fileInputStream.close();
		
		return dataList;
	}

}
