package com.example.JSONFinalBoss.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.example.JSONFinalBoss.models.GlossDiv;

public class JsonReader {
	
	public String JSONReader(String path) {
		
		JSONParser jsonParser = new JSONParser();
		
		try (FileReader fileReader = new FileReader(path)) {
			// Parseamos el JSON a un objeto
			// El parser analiza la estructura del JSON y lo convierte a un objeto.
			// Este objeto ahora tiene atributos que equivalen a la estructura del json
			Object object = jsonParser.parse(fileReader);
			
			//Parseamos el objeto a un JSONObject
			JSONObject glossary = (JSONObject) object;
			
			// Rescatamos del JSONObject la clave 'glossary' para poder acceder a sus claves internas
			JSONObject glossaryInfo = (JSONObject) glossary.get("glossary");
			
			// Sacamos sus clave:valor internas a través del get y el objeto
			String glossaryTitle = (String) glossaryInfo.get("title");
			
			// Como una de sus clave:valor es otro JSONObject, lo parseamos a JSONObject
			JSONObject glossaryDivInfo = (JSONObject) glossaryInfo.get("GlossDiv");
			
			// Rescatamos del JSONObject la clave 'title' para poder acceder a sus claves internas
			String glosaryDivTitle = (String) glossaryDivInfo.get("title");
			
			JSONObject glossaryDivListInfo = (JSONObject) glossaryDivInfo.get("GlossList");
			JSONObject glossaryEntryListInfo = (JSONObject) glossaryDivListInfo.get("GlossEntry");
			String glossaryEntryId = (String) glossaryEntryListInfo.get("ID");
			String glossaryEntrySortAs = (String) glossaryEntryListInfo.get("SortAs");
			String glossaryEntryGlossTerm = (String) glossaryEntryListInfo.get("GlossTerm");
			String glossaryEntryAcronym = (String) glossaryEntryListInfo.get("Acronym");
			String glossaryEntryAbbrev = (String) glossaryEntryListInfo.get("Abbrev");
			String glossaryEntryGlossSee = (String) glossaryEntryListInfo.get("GlossSee");
			
			JSONObject glossaryDefInfo = (JSONObject) glossaryEntryListInfo.get("GlossDef");
			String glossaryDefPara = (String) glossaryDefInfo.get("para");
			ArrayList<String> glossaryDefGlossSeeAlso = (ArrayList<String>) glossaryDefInfo.get("GlossSeeAlso");
			
			System.out.println(
					glossaryTitle + "\n" +
					glosaryDivTitle + "\n" +
					glossaryEntryId + "\n" +
					glossaryEntrySortAs + "\n" +
					glossaryEntryGlossTerm + "\n" + 
					glossaryEntryAcronym + "\n" + 
					glossaryEntryAbbrev + "\n" + 
					glossaryDefPara + "\n" + 
					glossaryDefGlossSeeAlso + "\n" +
					glossaryEntryGlossSee);
			
			
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
		String glossaryText = "";
		return glossaryText;
	}
}
