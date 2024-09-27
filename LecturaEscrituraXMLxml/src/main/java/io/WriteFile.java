package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import models.Employee;

public class WriteFile {

	public void writeText(ArrayList<Employee> resultText, String path) {
		File file = new File(path);

		try {
			FileWriter escritor = new FileWriter(file, false);
			PrintWriter pw = new PrintWriter(escritor);
			
			for (Employee staff : resultText) {
				pw.println("First name: " + staff.getFirstName().toString() + "\n");
				pw.println("Last name: " + staff.getLastName().toString()+ "\n");
				pw.println("Nick name: " + staff.getNickname().toString()+ "\n");
				pw.println("Salary: " + staff.getSalary().toString()+ "\n");
				pw.println("Currency: " + staff.getCurrency().toString()+ "\n");
				pw.print("\n");
			}
			
			pw.close();

		} catch (IOException e) {
			System.out.println("ERROR al intentar escibir en el archivo");
		}
	}

}
