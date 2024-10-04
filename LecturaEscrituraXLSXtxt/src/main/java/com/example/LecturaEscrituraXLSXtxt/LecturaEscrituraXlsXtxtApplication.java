package com.example.LecturaEscrituraXLSXtxt;


import java.io.IOException;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.LecturaEscrituraXLSXtxt.io.ReadXLSX;
import com.example.LecturaEscrituraXLSXtxt.io.Write;
import com.example.LecturaEscrituraXLSXtxt.models.Data;


@SpringBootApplication
public class LecturaEscrituraXlsXtxtApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(LecturaEscrituraXlsXtxtApplication.class, args);
		
		String entryPath = "src/main/resources/sample1.xlsx";
		String exitPath = "src/main/resources/result1.txt";
		
		ReadXLSX reader = new ReadXLSX();
		Write writter = new Write();
		
		ArrayList<Data> dataList = new ArrayList<>();
		
		dataList.addAll(reader.readFile(entryPath));
		
		writter.writeText(dataList, exitPath);
	}

}


