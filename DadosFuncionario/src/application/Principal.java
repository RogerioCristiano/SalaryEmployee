package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);

		System.out.print("nome: ");
		String nome = sc.next();
		System.out.print("Gross Salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
	Employee employee = new Employee(nome, grossSalary, tax);
	
	employee.netSalary();
	System.out.println(employee.toString());
	
	System.out.println();
	System.out.print("Which percentage to increase salary:");
	double percentage = sc.nextDouble();
	employee.increaseSalary(percentage);
	
	System.out.println();
	System.out.println("update data:");
	System.out.println(employee.toString());
	 	
	 	
	 	
		sc.close();
	}

}
