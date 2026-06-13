package com.Exception_Handling;

// STEP 1 :- creating the custom exception
class ALessThanBException extends Exception{
	public String getMessage() {
		return "a is less than b, so negative values are not allowed";
	}
}

public class custom_Exception {

	public static void main(String[] args) {
		try {
			int a =5;
			int b=10;
			if(a<b) {
				//STEP 2:- Throwing the created custom exception
				throw new ALessThanBException();
			}
			int c=a-b;
			System.out.println(c);
		} catch (ALessThanBException e) {
//				System.out.println(e.getMessage());
				e.printStackTrace();
		}
	}

}
