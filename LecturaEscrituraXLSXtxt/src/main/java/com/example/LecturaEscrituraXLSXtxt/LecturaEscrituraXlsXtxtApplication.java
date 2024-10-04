package com.example.LecturaEscrituraXLSXtxt;


import java.io.IOException;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.LecturaEscrituraXLSXtxt.io.ReadXLSX;
import com.example.LecturaEscrituraXLSXtxt.models.Data;


@SpringBootApplication
public class LecturaEscrituraXlsXtxtApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(LecturaEscrituraXlsXtxtApplication.class, args);
		
		String entryPath = "src/main/resources/proceso.xlsx";
		
		ReadXLSX reader = new ReadXLSX();
		
		ArrayList<Data> dataList = reader.readFile(entryPath);
		
		System.out.println(dataList);
	}

}


