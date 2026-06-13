package com.Exception_Handling;

public class NullpointerException {

	public static void main(String[] args) {
		// Null pointer Exception
//		String s=null;
//		System.out.println(s.length())

		try {
			String s= null;
			System.out.println(s.length());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Today is an saturday... Let's go home and sleep");
		}
	}
}
