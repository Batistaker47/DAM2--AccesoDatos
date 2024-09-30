package com.example.LecturaEscrituraPDFtxt.utils;

public class FormateTextTools {

	public String changeVowels(String text, String vowelToChange, String newVowel) {
	String formatedText = "";
	
	formatedText = text.replaceAll(vowelToChange, newVowel);
	
	return formatedText;
}
}
