package com.FunctionalInterfaces;

@FunctionalInterface
interface parent{
	void getdata();
}

interface child{
	void getData();
}

public class Problem1 {

	public static void main(String[] args) {
		parent p=new parent() {
			public void getdata() {
				System.out.println("1st one");
			}
		};
		p.getdata();
		
		child ch=new child() {
			@Override
			public void getData() {
				System.out.println("2nd one");
			}
		};
		ch.getData();
	}

}
