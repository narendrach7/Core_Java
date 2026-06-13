package com.Test.in;

import java.util.Scanner;

public class ELC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		String accNo=sc.nextLine();
		System.out.println("Enter Account Holder Name: ");
		String Holdername=sc.nextLine();
		System.out.println("Enter Initial Balance: ");
		double initialBal=sc.nextDouble();
		BankAccount account=new BankAccount(accNo,Holdername,initialBal);
		
		System.out.println("Enter amount to deposit: ");
		account.deposit(sc.nextDouble());
		System.out.println("Enter amount to withdraw: ");
		account.withdraw(sc.nextDouble());

	}

}
