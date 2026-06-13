package com.constructor.in;


// copy_constructor

public class student {
	String name;
	int accno;
	double balance;
	

	public student(String name,int accno, double balance) {
		this.name=name;
		this.accno=accno;
		this.balance=balance;
	}
	public student(student s1) {
		this.name=s1.name;
		this.accno=s1.accno;
		this.balance=s1.balance;
	}
	
	 void display() {
		System.out.println("Account Holder name: "+name+"\nAccount number: "+accno+"\nBalance: "+balance);
	}


	public static void main(String[] args) {
		student s=new student("Narendra",5256433,50000);
//		s.display();
//		student s1=s;//reference copy //Changes made in s1 object will affect s object also.
//		s1.name="rakesh";
//		s1.display();;
//		copy constructor
		student s1=new student(s);
		System.out.println("===original account===");
		s.display();  
		System.out.println("====Duplicate account===");
		s1.balance=45000;
		s1.name="Kiran";
		s1.display();
		
	}

}
