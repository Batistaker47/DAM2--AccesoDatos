package main;

import java.text.ParseException;

import io.JsonProcessor;

public class Main {
	public static void main (String[] args) throws org.json.simple.parser.ParseException {
		JsonProcessor processor = new JsonProcessor();
		try {
			processor.JsonReader();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
