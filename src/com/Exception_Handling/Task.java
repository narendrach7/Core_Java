package com.Exception_Handling;


class Handling{
	public static void tiMethod(int num) {
		try {
			System.out.println("10000");
			tilMethod(num);
			System.out.println("Coders");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void tilMethod(int num)throws ArithmeticException {
		try {
			if(num==0) {
				throw new ArithmeticException("/ by zero");
			}else if(num==10) {
				throw new ArithmeticException("invalid number");
			}else {
				System.out.println();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Finally");
		}
	}
}

public class Task {
	public static void main(String[] args) {
		Handling h=new Handling();
		h.tilMethod(2);
		
	}

}
