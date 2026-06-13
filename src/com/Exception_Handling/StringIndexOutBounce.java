package com.Exception_Handling;

public class StringIndexOutBounce {

	public static void main(String[] args) {
		try {
			String s="Rukmini";
			System.out.println(s.length());
			System.out.println(s.charAt(7));
		}catch(Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
