package com.FunctionalInterfaces;
import java.util.function.Consumer;
import java.util.function.Predicate;


class employee{
	private String employeeName;
	private String employeeDesg;
	private double employeeSalary;
	public employee(String EmpName,String EmpDesg,double EmpSal){
		this.employeeName=EmpName;
		this.employeeDesg=EmpDesg;
		this.employeeSalary=EmpSal;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesg() {
		return employeeDesg;
	}
	public void setEmployeeDesg(String employeeDesg) {
		this.employeeDesg = employeeDesg;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double Empsal) {
			this.employeeSalary=Empsal;
	}
	@Override
	public String toString() {
		return "Employee Name: "+employeeName+" Employee Salary: "+employeeSalary;
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		
		Predicate<employee> check=new Predicate<employee>() {
			@Override
			public boolean test(employee emp) {
				return emp.getEmployeeSalary()>10000;
			}
		};
		
		Consumer<employee> con=new Consumer<employee>() {
			@Override
			public void accept(employee emp) {
				emp.setEmployeeSalary(emp.getEmployeeSalary()+(emp.getEmployeeSalary()*0.10));
//				System.out.println(emp.getEmployeeSalary());
			}
		};
		
		employee emp1=new employee("x","y",20000.0);
		employee emp2=new employee("A","B",9000.0);
		employee emp3=new employee("c","d",50000.0);
		
		employee [] e= {emp1,emp2,emp3};
		for(employee i:e) {
			if(check.test(i)) {
//				con.accept(i);
				System.out.println(i);
			}
		}
	}

}
