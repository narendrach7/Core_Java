package com.inheritance.in;

class Account{
	String name="Narendra";
	long AccountNum=027210100143162L;
	double balance=10000;
	void deposit(int deposit) {
		System.out.println("Deposited am9unt is : "+deposit);
		balance+=deposit;
		System.out.println("Balance available is : "+balance);
	}
	
}

class SavingsAccount extends Account{
	void addInterest() {
		balance+=balance*0.05;
		System.out.println("Balance available after adding interest is: "+balance);
	}
}

class CurrentAccount extends Account{
	void checkoverdraft() {
		System.out.println("overdraft is available now.");	
	}
}


public class Bankmain {

	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount();
		System.out.println("Savings Acccount");
		s.deposit(5000);
		s.addInterest();
		System.out.println("------------------------------");
		CurrentAccount c=new CurrentAccount();
		System.out.println("Current Account");
		c.deposit(8000);
		c.checkoverdraft();
		

	}

}
