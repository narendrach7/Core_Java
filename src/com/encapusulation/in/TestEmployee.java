package com.encapusulation.in;

class Emp{
	private int id;
	private String name;
	private double salary;
	Emp(int i,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
}

public class TestEmployee {
	public static void main(String[] args) {
		Emp Tp=new Emp(102,"Kiran",20000.0);
		Tp.setId(101);
		Tp.setName("Narendra");
		Tp.setSalary(30000.0);
		System.out.println("Employee Id: "+Tp.getId());
		System.out.println("Employee Name: "+Tp.getName());
		System.out.println("Employee Salary: "+Tp.getSalary());
	}

}
