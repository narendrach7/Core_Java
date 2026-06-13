package com.Strings.in;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class String1 {

	public static void main(String[] args) {
//		String s="ABCDEF";
//		for(int i=0;i<s.length();i++) {
//			String a="";
//			for(int j=i;j<s.length();j++) {
//				a+=s.charAt(j);
//				if(a.length()==4)
//					System.out.println(a);
//			}
//		}
		
		
		
//		for(int i=0;i<s.length();i++) {
//			for(int j=i;j<s.length();j++) {
//				String sub=s.substring(i,j+1);
//				if(sub.length()==4)
//					System.out.println(sub);
//			}
//		}
		
		//Write a program to remove to character in the given string
//		String s1="";
//		for(int i=0;i<s.length();i++) {
//			if(s1.indexOf(s.charAt(i))==-1) {
//				s1+=s.charAt(i);
//			}
//		}
//		System.out.println(s1);
		
//		String s="HIM2N345C@1!340";
//		int sum=0;
//		for(int i=0;i<s.length();i++){
//			if(Character.isDigit(s.charAt(i))){
//				sum+=Character.getNumericValue(s.charAt(i));
//				
//			}
//		}
//		System.out.println(sum);
		
		
		
		// check how many vowels and consonants in string
//		String s="programming";
//		int vowels=0;
//		int consonants=0;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
//				vowels++;
//			}else {
//				consonants++;
//			}
//		}System.out.println("Vowels : "+vowels+"\n"+"Consonants : "+consonants);
		
		
		
		// check wherther the given string palindrome or not
//		String s="madam";
//		String s1="";
//		for(int i=1;i<=s.length();i++) {
//			s1+=s.charAt(s.length()-i);
//		}System.out.println(s.equals(s1)? "palindrome": "not palindrome");
		
		
		
//		 check no of frequency of characters in string
//		String s="Banana";
//		while (s.length() > 0) {
//            char ch = s.charAt(0);
//            int originalLength = s.length();            
//            s = s.replace(Character.toString(ch), "");           
//            int count = originalLength - s.length();
//            System.out.println(ch + ": " + count);
//		}
		
		
		
		// count the words in the given string "java is vast"
//		String s="java is vast";
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			if(ch==' ') {
//				count++;
//			}
//		}System.out.println(count+1);
		
		
		
//		 find the largest word in the given string "java is programming language"
//		String s="java is programming";
//		String[] myArray = s.split(" ");
//		String s1=myArray[0];
//		for(int i=0;i<myArray.length;i++) {
//			if(myArray[i].length()>s1.length()) {
//				s1=myArray[i];
//			}
//		}System.out.println(s1);
		
		
		
		// check the given string is anagram or not
//		String a="silent" ,b="listen";
//		char [] ch1=a.toCharArray();
//		char [] ch2=b.toCharArray();
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		System.out.println(Arrays.equals(ch1, ch2));
		
		
		
//		String s="java,1.2, pyth?on";
//		String regex="[?,.]";
//		String[] arr=s.split(regex);
//		for(String s1: arr) {
//			System.out.println(s1);
//		}
			
			
		
//		int arr[] ={1,6,3,9,2,4,8,7};
//		int target=4;
////		output: [0,2],[1,4],[3,5]
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==target)
//					System.out.println("["+i+","+j+"]");
//			}
//		}
	}

}
