package com.MethodsAndLoops;

public class Pratice{
	
	public int empId(int a) {
		return a;
	}
	
	public String empname(String name) {
		return name;
	}
	
	public double salary(double monthlysalary) {
		return monthlysalary;
	} 
	
//	public double totalsalary(double monthlysalary) {
//		double AS=monthlysalary*12;
//		return AS;
//		
//	}
	
	public static void main(String [] args) {
		Pratice obj1=new Pratice();
		System.out.println("EmployeeId: "+obj1.empId(201)+" Name: "+obj1.empname("Hari")+" MonthlySalary: "+obj1.salary(60000.0)+" AnnualSalary: "+obj1.salary(60000)*12);
	}
}
