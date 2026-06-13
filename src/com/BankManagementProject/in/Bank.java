package com.BankManagementProject.in;

import java.util.Scanner;

public class Bank {
	String username ="Narendra_chirukuri";
	String firstname="Chirukuri";
	String lastname ="Narendra";
	String ifscCode = "UBIN0802727";
	String accountnumber="027210100143162";
	String mobilenumber="7993284285";
	String pin ="1234";
 double balance = 20000.0;
	
	public void displayAccountDetails() {
		System.out.println("\n---Account Details---");
		System.out.println("UserName: "+username);
		System.out.println("Name: "+firstname+" "+lastname);
		System.out.println("IFSC Code: "+ifscCode);
		System.out.println("Account Number: "+accountnumber);
		System.out.println("Mobile Number: "+mobilenumber);
	}
	public void startSystem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========Welcome to HDFC Bank=========");
		System.out.println("Enter Pin: ");
		String inputpin = sc.next();
		if(inputpin.equals(pin)) {
			System.out.println("Login Successful");
			boolean exit=false;
			
			while (exit==false) {
				System.out.println("\nChoose Options\n1.Blance Enquiry\n2.Withdraw Ammount\n3.Deposit Amount\n4.Change Mobile Number\n5.Change pin\n6.Display Account Details\n7.Exit");
				System.out.println("Enter choice: ");
				int choice =sc.nextInt();
				
				switch(choice){
				case 1:
					System.out.println("Current Balance"+balance);
					break;
				case 2:
					System.out.println("Enter amount to Withdraw: ");
					double withdrawAmount = sc.nextDouble();
					if(withdrawAmount >0 && withdrawAmount <=balance) {
						balance -=withdrawAmount;
						System.out.println("Withdraw Successfull. New Balance: ₹"+balance);
					}
					else {
						System.out.println("Insufficient Balance");
					}
					break;
				case 3:
					System.out.println("Enter amount to Deposit: ");
					double depositAmount = sc.nextDouble();
					balance +=depositAmount;
					System.out.println("Deposit Successfull . New balance: ₹"+balance);
					break;
				case 4:
					System.out.println("Enter Mobile Number: ");
					this.mobilenumber = sc.next();
					System.out.println("Mobile number Updated Successfully to : "+mobilenumber);
					break;
				case 5:
					System.out.println("Enter Current pin: ");
					if(sc.next()==pin) {
						System.out.println("Enter new pin: ");
						this.pin = sc.next();
						System.out.println("Pin updated Successfully");
					}
					else {
						System.out.println("Incorrect Pin.");
					}
				case 6:
					displayAccountDetails();
					break;
				case 7:
					System.out.println("Terminating program. Thank You!");
					exit = true;
					break;
				default: 
					System.out.println("Invalid option. Please try again.");
				}
				
			}
		}
		else {
			System.out.println("Incorrect pin. Access Denied.");
		}
	}
	
	
	public static void main(String[] args) {
		Bank bankaccount = new Bank();
		bankaccount.startSystem();
		
	}
}