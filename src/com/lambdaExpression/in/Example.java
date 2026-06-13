package com.lambdaExpression.in;

interface parent{
	void getData(int a);
}

 

public class Example {

	public static void main(String[] args) {
		
//		parent p=new parent() {
//			@Override
//			public void getData() {
//				System.out.println("This is something...");
//			}
//		};
//		p.getData();
		
		// Lambda Expressions
//		parent p1=()->{
//			System.out.println("This is something 2......");
//		};
		
		parent p1=a->System.out.println(a+20);  // if you have single parameter and single statement their is not need of flower bracets and paranthases 
		p1.getData(20);
		
	}

}
