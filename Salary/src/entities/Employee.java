package entities;

public class Employee {

	public String name;
	public double grosssalary;
	public double tax;
	
	public double NetSalary() { 
		return this.grosssalary -= tax;
	}
	
	public void IncreaseSalary(double percentage) { 
		this.grosssalary *= 1+(percentage/100);
	}
	
	public String toString() {
		return name
				+ ", $ "
				+  grosssalary ;
	}
}
