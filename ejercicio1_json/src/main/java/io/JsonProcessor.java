package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import models.Employee;

public class JsonProcessor {
	
	public void JsonReader() throws ParseException, org.json.simple.parser.ParseException {
		
		// ArrayList para guardar objetos empleado
		ArrayList<Employee> employeeArrayList = new ArrayList<>();
		JSONParser jsonParser = new JSONParser();
		
		try (FileReader reader = new FileReader("employees.json")) {
			// Parseamos el JSON a un objeto
			// El parser analiza la estructura del JSON y lo convierte a un objeto.
			// Este objeto ahora tiene atributos que equivalen a la estructura del json
			// En este caso, el objeto contiene 2 arrays
			Object object = jsonParser.parse(reader);
			
			// Convertimos el objeto a un JSONArray
			// Hacemos esto porque el JSON tiene 2 objetos empleado, que son arrays
			// Lo convertimos a un array para poder iterar sobre el
			JSONArray employeeList = (JSONArray) object;
			
			// Iteramos a traves de cada elemento del JSONArray
			// Employee object contiene el par clave valor
			for (Object employeeObject : employeeList) {
				// Hacemos type casting de cada item en la lista a JSONObject
				// Hacemos esto porque la clase Object no tiene el metodo get
				JSONObject employeeData = (JSONObject) employeeObject;
				
				// Extraemos el objeto "employee"
				JSONObject employee = (JSONObject) employeeData.get("employee");
				
				// Obtenemos los valores para cada clave
				String firstName = (String) employee.get("firstName");
				String lastName = (String) employee.get("lastName");
				String website = (String) employee.get("website");
				
				// Creamos un objeto empleado
				Employee newEmployee = new Employee(firstName, lastName, website);
				employeeArrayList.add(newEmployee);
			}
			
			OutputEmployeeData(employeeArrayList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void OutputEmployeeData(ArrayList<Employee> employeeArrayList) {
		File file = new File("employeeData.txt");
		try {
			FileWriter writer = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(writer);
			
			for (Employee employee : employeeArrayList) {
				pw.print("First Name: " + employee.getFirstName() + " Last Name: " + employee.getLastName() + " Website : " + employee.getWebsite() + "\n");
				System.out.println("Successful data print");
			}
			
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
