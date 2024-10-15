package com.example.demo.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.example.demo.models.Books;

public class procesoJSON {
	
    private static Books parseBookObject(JSONObject book) 
    {
        String title = (String) book.get("title");    
     //   System.out.println(title);
        String author = (String) book.get("author");  
     //   System.out.println(author);
        String year = (String) book.get("year").toString();    
     //   System.out.println(year);
        Books myBook = new Books(title,author,year);
        return myBook;
    }

public ArrayList<String> JSONParseo(){
	ArrayList<String> salida = new ArrayList();
	
	JSONParser jsonParser = new JSONParser();
    try (FileReader reader = 
 		   new FileReader("src/main/resources/jsonarray.json"))
    {
         Object obj = jsonParser.parse(reader);
         JSONArray bookList = (JSONArray) obj;
//         System.out.println(employeeList);
//         employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
         for ( Object book :bookList) {
        	 salida.add(parseBookObject( (JSONObject) book ).toString());
         }  

     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     } catch (ParseException e) {
         e.printStackTrace();
     }
	return salida;	
}
}
