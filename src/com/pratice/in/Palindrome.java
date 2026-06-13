package com.pratice.in;

public class Palindrome {

	public static void main(String[] args) {
		int a=12221;
		String s=Integer.toString(a);
		String s1="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			s1+=c;
		}
		System.out.println((s1.equals(s))? "palindrom":"Not palindrome");

	}

}
