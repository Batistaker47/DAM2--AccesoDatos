package com.example.LecturaEscrituraWordtxt;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.LecturaEscrituraWordtxt.io.ReadDocx;
import com.example.LecturaEscrituraWordtxt.io.Writer;

@SpringBootApplication
public class LecturaEscrituraWordtxtApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(LecturaEscrituraWordtxtApplication.class, args);
		String entryPath = "src/main/resources/Doc.docx";
		String exitPath = "src/main/resources/result.txt";
		
		ReadDocx reader = new ReadDocx();
		Writer writer = new Writer();
		
		String text = reader.parseDocx(entryPath);
		writer.writeText(text, exitPath);
	}

}
