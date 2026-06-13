package com.encapusulation.in;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	
	public void setEmpid(int empid) {
		if(empid>0) {
			this.empid=empid;
		}
		else {
			System.out.println("Invalid empId");
		}
	}
	public int getEmpid() {
		return empid;
	}
	
	public void setname(String name) {
		if(name!=null) {
			this.name=name;
		}
		else {
			System.out.println("Invalid name");
		}
	}
	public String getname() {
		return name;
	}
	
//	Hidden method
	private boolean checksalary(double salary) {
		return salary>=15000;
	}
	
	public void setsalary(double salary) {
		if(checksalary(salary)) {
			this.salary=salary;
		}
		else {
			System.out.println("U only work for that Salary");
		}
	}
	public double getsalary() {
		return salary;
	}
	
	public void display() {
		System.out.println("Employee Id: "+getEmpid());
		System.out.println("Employee Name: "+getname());
		System.out.println("Employee Salary:"+getsalary());
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpid(0);
		emp.setname(null);
		emp.setsalary(50);
		emp.display();

	}

}
