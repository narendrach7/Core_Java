package com.Test.in;

import java.util.Scanner;

	class BankAccount {
	private String accountnum;
	private String name;
	private double balance;
	BankAccount(String accountnum,String name,double balance){
		this.accountnum=accountnum;
		this.name=name;
		this.balance=balance;
	}



	public String getAccountnum() {
		return accountnum;
	}



	public void setAccountnum(String accountnum) {
		this.accountnum = accountnum;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Successfully deposited.Updated Balance: "+balance);
		}
		else {
			System.out.println("Invalid deposit amount!");
		}
	}

	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid withdrawal amount!");
		}
		else if(amount>balance) {
			System.out.println("Insufficient Balance.");
		}
		else {
			balance-=amount;
			System.out.println("Withdrawal successfull.Remaining Balance: "+balance);
		}
	}

}
