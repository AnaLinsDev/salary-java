package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();

		System.out.print("Name: ");	
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");	
		employee.grosssalary = sc.nextDouble();
		System.out.print("Tax: ");	
		employee.tax = sc.nextInt();
		employee.NetSalary();
		
		System.out.println("Employee: " + employee);
		
		System.out.print("Which percentage to increase salary? ");	
		employee.IncreaseSalary(sc.nextInt());
		
		System.out.println("Updated data: " + employee);
		
		
		
		sc.close();

	}

}
