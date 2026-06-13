package com.interfaces_test.in;

public class BankAccount {
	String name;
	long accountnum;
	private double Balance=10000;
	
	public void setName(String name) {
		this.name = name;
	}	

	public String getName() {
		return name;
	}

	public void setAccountnum(long accountnum) {
		this.accountnum = accountnum;
	}
	
	public long getAccountnum() {
		return accountnum;
	}

	public static void main(String[] args) {
		BankAccount B=new BankAccount();
		B.setName("Narendra");
		System.out.println("Name: "+B.name);
		B.setAccountnum(0272101001);
		System.out.println("Account Number: "+B.accountnum);
		System.out.println("Balance: "+B.Balance);
		
	}

}
