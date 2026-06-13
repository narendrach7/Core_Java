package com.MethodsAndLoops;

public class Employee{
	int id;
	String name;
	double monthlySalary;
	
	
	
	public double calculateAnnualSalary() {
		return monthlySalary*12;
	}
	
	
	public void displayEmployeeDetails() {
		System.out.println("Employee Id: "+id+" Name: "+name+" Monthly salary: "+monthlySalary+" Annual Salary: "+calculateAnnualSalary());
	}
	
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.id=1;
		emp1.name="Hari";
		emp1.monthlySalary=50000.0;
		
		Employee emp2=new Employee();
		emp2.id=2;
		emp2.name="Sravani";
		emp2.monthlySalary=45000.0;
		
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		
	}
}
